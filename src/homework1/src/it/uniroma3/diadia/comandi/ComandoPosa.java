package it.uniroma3.diadia.comandi;

import it.uniroma3.diadia.IO;
import it.uniroma3.diadia.IOConsole;
import it.uniroma3.diadia.Partita;
import it.uniroma3.diadia.ambienti.Stanza;
import it.uniroma3.diadia.attrezzi.Attrezzo;
import it.uniroma3.diadia.giocatore.Borsa;

public class ComandoPosa implements Comando{
	
	private String nomeAttrezzo;
    private String nomeComando= "posa" ;
    public IO io = new IOConsole();
	
	@Override
	public void esegui(Partita partita) {
		Borsa borsaGiacotore=partita.getGiocatore().getBorsa();

		if(borsaGiacotore.isEmpty()) {
			io.mostraMessaggio("La borsa e' vuota\n");
		}


		else {
			Stanza stanzaCorrente = partita.getLabirinto().getStanzaCorrente();
			if(borsaGiacotore.hasAttrezzo(this.nomeAttrezzo)) {		// è piena 
				Attrezzo a =borsaGiacotore.getAttrezzo(this.nomeAttrezzo); // presp 
				if(stanzaCorrente.addAttrezzo(a)) {
					borsaGiacotore.removeAttrezzo(this.nomeAttrezzo);
					io.mostraMessaggio("Attrezzo posato nella stanza!");
					io.mostraMessaggio(" presente "+ this.nomeAttrezzo+ " nella stanza\n");
				}
				else {
					borsaGiacotore.addAttrezzo(a);
					io.mostraMessaggio("la stanza e' piena");
				}

			}

			
		}
		
	}

	@Override
	public void setParametro(String parametro) {
		this.nomeAttrezzo=parametro;
		
	}
	
	public String getParametro() {
		return this.nomeAttrezzo;
		
	}

	@Override
	public String getNome() {
		return this.nomeComando;
	}

}
