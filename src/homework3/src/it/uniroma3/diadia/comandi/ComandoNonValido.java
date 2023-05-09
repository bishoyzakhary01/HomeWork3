package it.uniroma3.diadia.comandi;

import it.uniroma3.diadia.IO;

import it.uniroma3.diadia.Partita;

public class ComandoNonValido implements Comando {

	public ComandoNonValido(IO io) {
		super();
		this.io = io;
	}

	private String nomeComando = "";
	public IO io;

	@Override
	public void esegui(Partita partita) {
		io.mostraMessaggio("Comando inesistente!! Inserire comando valido \n");
		
	}

	@Override
	public void setParametro(String parametro) {
		return ;
		
	}

	@Override
	public String getNome() {
		return this.nomeComando;
	}

	@Override
	public void setIo(IO io) {
		// TODO Auto-generated method stub
		this.io=io;
	}

	@Override
	public String getParametro() {
		// TODO Auto-generated method stub
		return null;
	}

	

}
