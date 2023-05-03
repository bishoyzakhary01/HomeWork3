package it.uniroma3.diadia.test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import it.uniroma3.diadia.Partita;
import it.uniroma3.diadia.ambienti.Labirinto;
import it.uniroma3.diadia.ambienti.Stanza;
import it.uniroma3.diadia.giocatore.Giocatore;

public class PartitaTest {

	Partita p =new Partita();
	Stanza  s =new Stanza("Biblioteca");
	Labirinto l = new Labirinto();
	Giocatore g= new Giocatore();
	
	@Before
	public void setUp() {
	g.setCfu(0);
	p.setGiocatore(g);
		
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
