package it.uniroma3.diadia.test.comandi;



import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import it.uniroma3.diadia.DiaDia;
import it.uniroma3.diadia.IO;
import it.uniroma3.diadia.IOConsole;
import it.uniroma3.diadia.IOSimulator;
import it.uniroma3.diadia.Partita;
import it.uniroma3.diadia.ambienti.Labirinto;
import it.uniroma3.diadia.ambienti.Stanza;
import it.uniroma3.diadia.comandi.Comando;
import it.uniroma3.diadia.comandi.ComandoVai;
import it.uniroma3.diadia.fixture.Fixture;

class ComandoVaiTest {
	private Stanza s1;
	private Stanza s2;
	private Comando vai;
	private Partita p;
	
	List<String> righeDaLeggere;
	
	Labirinto labirinto;
	
	private IO io;

    
    @Before 
    void setUp() {
		io = new IOConsole();
		s1 = new Stanza("aula 1");
		s1 = new Stanza("aula 3");
		vai = new ComandoVai();
		 labirinto = Labirinto.newBuilder()
				.addStanzaIniziale("Atrio")
				.addAttrezzo("martello", 3)
				.addStanzaVincente("Biblioteca")
				.addAdiacenza("Atrio", "Biblioteca", "nord")
				.getLabirinto();
		p = new Partita(labirinto);
		
		righeDaLeggere = new ArrayList<>();
		
    }
    
	

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testVaiNull() {
		p.setStanzaCorrente(s1);
		vai.esegui(p);
		assertEquals(s1, p.getStanzaCorrente());
	}
	@Test
	public void testGetNome() {
		assertEquals("vai", this.vai.getNome());
	}

	
	@Test
	public void testVaiDirezioneInesistente() {
		p.setStanzaCorrente(s1);
		s1.impostaStanzaAdiacente("sud-ovest", s2);
		vai.setParametro("in fondo a destra");
		vai.esegui(p);
		assertNotEquals(s2, p.getStanzaCorrente());
	}

	@Test
	public void testVaiDirezioneEsistente() {
		p.setStanzaCorrente(s2);
        s2.impostaStanzaAdiacente("sud-ovest", s1);
		vai.setParametro("in fondo a destra");
		vai.esegui(p);
		assertEquals(s1 ,p.getStanzaCorrente());
	}
	@Test
	public void testPartitaConComandoVai() {
		righeDaLeggere.add("vai nord");

		IOSimulator io = Fixture.creaSimulazionePartitaEGiocaEasy(righeDaLeggere);
		assertTrue(io.hasNextMessaggio());
		assertEquals("Biblioteca", io.nextMessaggio());
		assertTrue(io.hasNextMessaggio());
		assertEquals("Hai vinto!", io.nextMessaggio());
		
	}
	
}
