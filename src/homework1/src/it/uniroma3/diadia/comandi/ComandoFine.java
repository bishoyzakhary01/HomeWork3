package it.uniroma3.diadia.comandi;

import it.uniroma3.diadia.IO;
import it.uniroma3.diadia.IOConsole;
import it.uniroma3.diadia.Partita;

public class ComandoFine implements Comando {
	
	private String nomeComando = "fine";
	public IO io = new IOConsole();

	@Override
	public void esegui(Partita partita) {
		io.mostraMessaggio("Grazie di aver giocato!");  
		
	}

	//non ritorna nulla
	@Override
	public void setParametro(String parametro) {
		return;
		
	}

	@Override
	public String getNome() {
		return this.nomeComando;
	}

}
