package it.uniroma3.diadia.test;

import static org.junit.jupiter.api.Assertions.*;


//import org.junit.Test;
import org.junit.jupiter.api.*;

import it.uniroma3.diadia.ambienti.Stanza;
import it.uniroma3.diadia.ambienti.StanzaBloccata;
import it.uniroma3.diadia.attrezzi.Attrezzo;

class StanzaBloccataTest {

	Attrezzo attrezzo;
	String direzione_bloccata;
	Stanza stanzaBloccata ;
	Stanza stanzaAdiacente;
	
	
	@BeforeEach
	public void setUp() {
    attrezzo = new Attrezzo("chiave", 3);
	direzione_bloccata = "Nord" ;
	stanzaBloccata = new StanzaBloccata("stanza bloccata", "chiave" , direzione_bloccata);
	stanzaAdiacente = new Stanza("StanzaAdiacente");
	}
	
	@Test
	public void testGetStanzaBloccata() {
	
		this.stanzaBloccata.impostaStanzaAdiacente(direzione_bloccata, stanzaAdiacente);
		assertEquals(this.stanzaBloccata.getNome(), this.stanzaBloccata.getStanzaAdiacente(direzione_bloccata).getNome());
	}
	
	@Test
	public void testGetStanzaAdiacente() {
	this.stanzaBloccata.impostaStanzaAdiacente(direzione_bloccata, stanzaAdiacente);
	this.stanzaBloccata.addAttrezzo(attrezzo);
	assertEquals(this.stanzaAdiacente.getNome(), this.stanzaBloccata.getStanzaAdiacente(direzione_bloccata).getNome());
	}
	
	
	@Test
	public void testGetChiave() {
	this.stanzaBloccata.addAttrezzo(attrezzo);
	assertTrue(this.stanzaBloccata.hasAttrezzo("chiave"));
		
	}

}
