package it.uniroma3.diadia.test.stanza;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import it.uniroma3.diadia.ambienti.StanzaMagica;
import it.uniroma3.diadia.attrezzi.Attrezzo;

public class StanzaMagicaTest {
	

	private StanzaMagica s1;
	private Attrezzo s;
	private Attrezzo b;
	
	@Before
	public void setUp() throws Exception {
		s1 = new StanzaMagica("s1");
		s = new Attrezzo("chiae", 13);
		b = new Attrezzo("java", 32);
		
	}

	@After
	public void tearDown() throws Exception {
	}

	
	@Test
	public void AddAttrezzoTest() {
		assertTrue(s1.addAttrezzo(s));
	}
	@Test
	public void modificaAttrezzoTest() {
		assertTrue(s1.addAttrezzo(b));
		assertTrue(s1.addAttrezzo(s));
	}
	
	
	
	
	

}
