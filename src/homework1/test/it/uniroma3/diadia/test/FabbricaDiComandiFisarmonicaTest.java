package it.uniroma3.diadia.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import it.uniroma3.diadia.comandi.Comando;
import it.uniroma3.diadia.comandi.FabbricaDiComandiFisarmonica;

class FabbricaDiComandiFisarmonicaTest {

	FabbricaDiComandiFisarmonica fabbrica = new FabbricaDiComandiFisarmonica();
	
	@Test
	void testComandoVai() {
	Comando c = fabbrica.costruisciComando("vai");
	assertEquals("vai", c.getNome());
	}
	
	@Test
	void testComandoGuarda() {
	Comando c = fabbrica.costruisciComando("guarda");
	assertEquals("guarda", c.getNome());
	}
	
	@Test
	void testComandoPrendi() {
	Comando c = fabbrica.costruisciComando("prendi");
	assertEquals("prendi", c.getNome());
	}
	
	@Test
	void testComandoPosa() {
	Comando c = fabbrica.costruisciComando("posa");
	assertEquals("posa", c.getNome());
	}
	
	@Test
	void testComandoNonValido() {
	Comando c = fabbrica.costruisciComando("");
	assertEquals("", c.getNome());
	}
	
	@Test
	void testComandoAiuto() {
	Comando c = fabbrica.costruisciComando("aiuto");
	assertEquals("aiuto", c.getNome());
	}

}
