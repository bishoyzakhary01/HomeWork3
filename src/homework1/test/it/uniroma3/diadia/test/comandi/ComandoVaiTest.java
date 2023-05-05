package it.uniroma3.diadia.test.comandi;


import static org.junit.Assert.assertEquals;


import org.junit.Before;
import org.junit.jupiter.api.Test;

import it.uniroma3.diadia.IO;
import it.uniroma3.diadia.IOConsole;
import it.uniroma3.diadia.Partita;
import it.uniroma3.diadia.ambienti.Labirinto;
import it.uniroma3.diadia.ambienti.Stanza;
import it.uniroma3.diadia.comandi.ComandoVai;
class ComandoVaiTest {
   
	IO io= new IOConsole();
	ComandoVai vai= new ComandoVai();
	Partita partitaTest = new Partita();
    Stanza stanza= new Stanza("Stanza");
    Labirinto labirinto = new Labirinto();
    Stanza stanzaAdiacente = new Stanza("stanza adiacente");
    
    
    @Before 
    void setUp() {
    	
    }
    
	

	@Test
	public void testGetParametro() {
		this.vai.setParametro("Nord");
		assertEquals("Nord", this.vai.getParametro());
	}
	
	@Test
	public void testGetNome() {
		assertEquals("vai", this.vai.getNome());
	}
	
	@Test
	public void testEsegui() {
		vai.setParametro("sud");
		vai.esegui(partitaTest);
		assertEquals("vai", this.vai.getNome());
	}

}
