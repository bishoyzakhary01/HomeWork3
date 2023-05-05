package it.uniroma3.diadia.ambienti;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import it.uniroma3.diadia.attrezzi.Attrezzo;

public class StanzaProtected {
		
		static final public int NUMERO_MASSIMO_DIREZIONI = 4;
		static final public int NUMERO_MASSIMO_ATTREZZI = 10;
		
		protected String nome;
		protected Map<String, Attrezzo> attrezzi;
		protected int numeroAttrezzi;

		protected Map<String, StanzaProtected> direzioni;
		protected int numeroStanzeAdiacenti;
	    
	    /**
	     * Crea una stanza. Non ci sono stanze adiacenti, non ci sono attrezzi.
	     * @param nome il nome della stanza
	     */
	    public StanzaProtected(String nome) {
	        this.nome = nome;
	        this.numeroStanzeAdiacenti = 0;
	        this.numeroAttrezzi = 0;
	        this.direzioni = new HashMap<>();
	     
	        this.attrezzi =   new HashMap<>();
	    }

	    /**
	     * Imposta una stanza adiacente.
	     *
	     * @param direzione direzione in cui sara' posta la stanza adiacente.
	     * @param stanza stanza adiacente nella direzione indicata dal primo parametro.
	     */
	    public void impostaStanzaAdiacente(String direzione, StanzaProtected stanza) {
	        boolean aggiornato = false;
	    	if(direzioni.containsKey(direzioni)) {
	    		this.direzioni.put(direzione,stanza);
				aggiornato = true;
	    	}
	    	if(!aggiornato) {
	    		if (this.numeroStanzeAdiacenti < NUMERO_MASSIMO_DIREZIONI) {
					this.direzioni.put(direzione,stanza);
					this.numeroStanzeAdiacenti++;
				}
	    	}
	    }

	    /**
	     * Restituisce la stanza adiacente nella direzione specificata
	     * @param direzione
	     */
		public List<StanzaProtected> getStanzeAdiacenti() {
			return (List<StanzaProtected>) direzioni.values();
		}
	    public void setStanzeAdiacenti(Map<String, StanzaProtected> stanzeAdiacenti) {
			this.direzioni= stanzeAdiacenti;
		}
	    /**
	     * Restituisce la nome della stanza.
	     * @return il nome della stanza
	     */
	    public String getNome() {
	        return this.nome;
	    }

	    /**
	     * Restituisce la descrizione della stanza.
	     * @return la descrizione della stanza
	     */
	    public String getDescrizione() {
	        return this.toString();
	    }

	    /**
	     * Restituisce la collezione di attrezzi presenti nella stanza.
	     * @return la collezione di attrezzi nella stanza.
	     */
	    public Attrezzo[] getAttrezzi() {
	        return this.attrezzi;
	    }

	    /**
	     * Mette un attrezzo nella stanza.
	     * @param attrezzo l'attrezzo da mettere nella stanza.
	     * @return true se riesce ad aggiungere l'attrezzo, false atrimenti.
	     */
	    public boolean addAttrezzo(Attrezzo attrezzo) {
	        if (this.numeroAttrezzi < NUMERO_MASSIMO_ATTREZZI) {
	        	this.attrezzi[numeroAttrezzi] = attrezzo;
	        	this.numeroAttrezzi++;
	        	return true;
	        }
	        else {
	        	return false;
	        }
	    }

	   /**
		* Restituisce una rappresentazione stringa di questa stanza,
		* stampadone la descrizione, le uscite e gli eventuali attrezzi contenuti
		* @return la rappresentazione stringa
		*/
	    public String toString() {
	    	StringBuilder risultato = new StringBuilder();
	    	risultato.append(this.nome);
	    	risultato.append("\nUscite: ");
	    	for (String direzione : this.direzioni)
	    		if (direzione!=null)
	    			risultato.append(" " + direzione);
	    	risultato.append("\nAttrezzi nella stanza: ");
	    	for (Attrezzo attrezzo : this.attrezzi) {
	    		if(attrezzo!=null)
	    		risultato.append(attrezzo.toString()+" ");
	    	}
	    	return risultato.toString();
	    }

	    /**
		* Controlla se un attrezzo esiste nella stanza (uguaglianza sul nome).
		* @return true se l'attrezzo esiste nella stanza, false altrimenti.
		*/
		public boolean hasAttrezzo(String nomeAttrezzo) {
			
			return this.attrezzi.containsKey(nomeAttrezzo);
		}

		/**
	     * Restituisce l'attrezzo nomeAttrezzo se presente nella stanza.
		 * @param nomeAttrezzo
		 * @return l'attrezzo presente nella stanza.
	     * 		   null se l'attrezzo non e' presente.
		 */
		public Attrezzo getAttrezzo(String nomeAttrezzo) {
			Attrezzo attrezzoCercato;
			attrezzoCercato = null;
			if (this.attrezzi.containsKey(nomeAttrezzo))
				attrezzoCercato = this.attrezzi.get(nomeAttrezzo);
			return attrezzoCercato;	
		}

		/**
		 * Rimuove un attrezzo dalla stanza (ricerca in base al nome).
		 * @param nomeAttrezzo
		 * @return true se l'attrezzo e' stato rimosso, false altrimenti
		 */
		public boolean removeAttrezzo(Attrezzo attrezzo) {
			if(attrezzo!=null){
				this.attrezzi.remove(attrezzo.getNome(), attrezzo);

				return true;
			}
			else
				return false;
		}


		public Set<String> getDirezioni() {

			return direzioni.keySet();
		}


	}


