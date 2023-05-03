package it.uniroma3.diadia.test;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

import it.uniroma3.diadia.comandi.ComandoPosa;


class ComandoPosaTest {

	ComandoPosa posa = new ComandoPosa();
	String parametro = "parametro";
	String nomeComando = "posa";

	@Test
	public void testGetNome() {
		assertEquals(nomeComando, this.posa.getNome());
	}

	@Test
	public void testGetParametro() {
	this.posa.setParametro(this.parametro);
	assertEquals("parametro", this.posa.getParametro());
	
	}
}
