package it.uniroma3.diadia.test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import it.uniroma3.diadia.Partita;
import it.uniroma3.diadia.ambienti.Labirinto;

import it.uniroma3.diadia.ambienti.Stanza;
import it.uniroma3.diadia.attrezzi.LabirintoBuilder;


public class PartitaTest {


	Labirinto labirinto;
	Partita p;
	Stanza s;
	
	@Before
	public void setUp() {
		labirinto = new LabirintoBuilder()
				.addStanzaIniziale("Atrio")
				.addAttrezzo("martello", 3)
				.addStanzaVincente("Biblioteca")
				.addAdiacenza("Atrio", "Biblioteca", "nord")
				.getLabirinto();
		 p = new Partita(labirinto);
		 s = new Stanza("Stanza");
		
	}
	
	@Test
	public void testFinita() {
		assertTrue(p.isFinita());
	}
	
	@Test
	public void vintaTest() {
		
		assertFalse(p.vinta());
	}
	
}
