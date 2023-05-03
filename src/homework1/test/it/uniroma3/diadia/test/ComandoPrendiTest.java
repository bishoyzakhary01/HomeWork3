package it.uniroma3.diadia.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import it.uniroma3.diadia.comandi.ComandoPrendi;

class ComandoPrendiTest {

	ComandoPrendi prendi = new ComandoPrendi();
	String parametro = "parametro";
	String nomeComando = "prendi";

	@Test
	public void testGetNome() {
		assertEquals(nomeComando, this.prendi.getNome());
	}

	@Test
	public void testGetParametro() {
	this.prendi.setParametro(this.parametro);
	assertEquals("parametro", this.prendi.getParametro());
	
	}

}
