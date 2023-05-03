package it.uniroma3.diadia.comandi;

import it.uniroma3.diadia.IO;
import it.uniroma3.diadia.IOConsole;
import it.uniroma3.diadia.Partita;

public class ComandoGuarda implements Comando{	
	
	
    public IO io= new IOConsole();
	private String nomeComando = "guarda";

	//stampa le informazioni sulla stanza corrente 
	@Override
	public void esegui(Partita partita) {
		io.mostraMessaggio("Stanza corrente:");
		io.mostraMessaggio(partita.getLabirinto().getStanzaCorrente().getDescrizione());
		io.mostraMessaggio("Borsa:");
		io.mostraMessaggio(partita.getGiocatore().getBorsa().toString());
		io.mostraMessaggio("Lo stato della partita : \n");
		int cfuGiocatore = partita.getGiocatore().getCfu();
		io.mostraMessaggio("I cfu del giocatore sono "+ cfuGiocatore+"\n");
	}

	@Override
	public void setParametro(String parametro) {
		return ;
		
	}

	@Override
	public String getNome() {
		return this.nomeComando ;
	}


}
