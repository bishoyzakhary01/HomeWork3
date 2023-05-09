package it.uniroma3.diadia.comandi;

import it.uniroma3.diadia.IO;

import it.uniroma3.diadia.Partita;

public  class ComandoAiuto implements Comando {

	static final public String[] elencoComandi = {"vai", "aiuto","prendi" ,"posa","fine", "guarda"};
	private IO io ;
	private final static String nomeComando = "aiuto";
	@Override
	public void esegui(Partita partita) {
		// TODO Auto-generated method stub
		
			for(int i=0; i< elencoComandi.length; i++) 
				io.mostraMessaggio(elencoComandi[i]+" ");
			io.mostraMessaggio("");
			
		}

	
	@Override
	public void setParametro(String parametro) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public String getNome() {
		// TODO Auto-generated method stub
		return nomeComando ;
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