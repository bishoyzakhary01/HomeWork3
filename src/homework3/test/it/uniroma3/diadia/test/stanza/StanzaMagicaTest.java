package it.uniroma3.diadia.test.stanza;


import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import it.uniroma3.diadia.ambienti.StanzaMagica;
import it.uniroma3.diadia.attrezzi.Attrezzo;

public class StanzaMagicaTest {

	private StanzaMagica s1;
	private Attrezzo b;
	private Attrezzo s;
	
	
	@Before
	public void setUp() throws Exception {
		s1 = new StanzaMagica("s1");
		b = new Attrezzo("calcio", 22);
		s = new Attrezzo("chiave", 12);
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAddAttrezzo() {
		assertTrue(s1.addAttrezzo(b));
		assertTrue(s1.addAttrezzo(s));
	}


	@Test
	public void testModificaAttrezzo() {
		assertTrue(s1.addAttrezzo(b));
		assertTrue(s1.addAttrezzo(s));
	}
}
