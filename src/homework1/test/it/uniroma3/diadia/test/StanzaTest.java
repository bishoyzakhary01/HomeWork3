package it.uniroma3.diadia.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import it.uniroma3.diadia.ambienti.Stanza;
import it.uniroma3.diadia.attrezzi.Attrezzo;

public class StanzaTest {

	
	Stanza s;
	Attrezzo r;
	Stanza s2;
	Stanza s3;
	Stanza s4;
	
	
	@Before
	public void setUp() {
		this.s=new Stanza("stanza");
		this.r=new Attrezzo("osso",2);
		this.s2 = new Stanza("stanza 2");
		this.s3 = new Stanza("stanza 3");
		this.s4 = new Stanza("stanza 4");
	
		this.s.addAttrezzo(this.r);
		
	}
	
	@Test
	public void getStanzaAdiacenteEstTest() {
		this.s.impostaStanzaAdiacente("Est", s3);
		assertEquals(s3, this.s.getStanzaAdiacente("Est"));
	}
	
	@Test
	public void getStanzaAdiacenteOvestTest() {
		this.s.impostaStanzaAdiacente("Ovest", s4);
		assertEquals(s4, this.s.getStanzaAdiacente("Ovest"));
	}
	
		
	@Test
	public void getStanzaAdiacenteSudTest() {
		this.s.impostaStanzaAdiacente("Sud", s2);
		assertEquals(s2, this.s.getStanzaAdiacente("Sud"));
	}
	
	
	@Test
	public void getStanzaAdiacentTest() {
	assertNull(s.getStanzaAdiacente("Nord"));
	}
		
	@Test
	public void testAddAttrezzo() {
		assertTrue(s.addAttrezzo(r));
	}
	
	@Test
	public void testHasAttrezzo() {
//		s=new Stanza("stanza");
//		r=new Attrezzo("osso",2);
		assertTrue(s.hasAttrezzo("osso"));
//		assertTrue(true);
	}
	
	@Test
	public void testGetAttrezzo() {
    assertEquals(this.r, this.s.getAttrezzo("osso"));
	}
	
	@Test
	public void testPesoAttrezziStanzaCorrente() {
		s.addAttrezzo(r);
		assertEquals(2, s.getAttrezzo(r.getNome()).getPeso());
	}
	
	@Test 
	public void testRemoveAttrezzo () {
		s.addAttrezzo(r);
		//System.out.println("nella stanza c'e'" + s.getAttrezzi());
		assertTrue(s.removeAttrezzo(r));
	}
	
}
