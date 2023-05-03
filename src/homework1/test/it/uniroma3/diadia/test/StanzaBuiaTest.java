package it.uniroma3.diadia.test;



import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


import org.junit.jupiter.api.Test;

import it.uniroma3.diadia.ambienti.Stanza;
import it.uniroma3.diadia.ambienti.StanzaBuia;
import it.uniroma3.diadia.attrezzi.Attrezzo;

class StanzaBuiaTest {
	
	Stanza stanza1= new StanzaBuia("stanza buia", "lanterna");;
	Attrezzo lanterna= new Attrezzo("lanterna", 5);;
	Attrezzo osso= new Attrezzo("osso", 5);;
	
	
	@Test
	public void testHasAttrezzoLucente() {
		this.stanza1.addAttrezzo(lanterna);
		assertTrue(this.stanza1.hasAttrezzo("lanterna"));
	}
	
	@Test
	public void testNotHasAttrezzoLucente() {
		this.stanza1.addAttrezzo(osso);
		assertTrue(this.stanza1.hasAttrezzo("osso"));
	}
	
	@Test
	void testGetDescrizioneBuio() {
		assertEquals("qui c'e' un buio pesto",this.stanza1.getDescrizione());
	}

}
