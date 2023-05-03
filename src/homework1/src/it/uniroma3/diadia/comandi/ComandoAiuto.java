package it.uniroma3.diadia.comandi;

import it.uniroma3.diadia.IO;
import it.uniroma3.diadia.IOConsole;
import it.uniroma3.diadia.Partita;

public class ComandoAiuto implements Comando {

	static final private String[] elencoComandi = {"vai", "aiuto","prendi" ,"posa","fine", "guarda"};
	
	public IO io = new IOConsole();
	private String nomeComando = "aiuto";
	
	@Override
	public void esegui(Partita partita) {
		for(int i=0; i< elencoComandi.length; i++) 
			io.mostraMessaggio(elencoComandi[i]+" ");
		io.mostraMessaggio("");
		
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
