package it.uniroma3.diadia.giocatore;

import java.util.ArrayList;
import java.util.List;


import it.uniroma3.diadia.attrezzi.Attrezzo;

public class Borsa {
	public final static int DEFAULT_PESO_MAX_BORSA = 10;
	private List<Attrezzo> attrezzi; //nome attrezzo e attrezzo stesso ;
	private int pesoMax;
	public Borsa() {
		this(DEFAULT_PESO_MAX_BORSA);
	}
	public Borsa(int pesoMax) {
		this.pesoMax = pesoMax;
		this.attrezzi = new ArrayList<>();
	}
	public boolean addAttrezzo(Attrezzo attrezzo) {
		if(attrezzo!=null)
		if (this.getPeso() + attrezzo.getPeso() > this.getPesoMax())
			return false;
		this.attrezzi.add(attrezzo);
		return true;
	}
	public int getPesoMax() {
		return pesoMax;
	}
	
	public Attrezzo getAttrezzo(String nomeAttrezzo) {
		Attrezzo attrezzoCercato;
		attrezzoCercato = null;
		for (Attrezzo attrezzo : this.attrezzi) {
			if(attrezzo!=null)
			if (attrezzo.getNome().equals(nomeAttrezzo))
			attrezzoCercato = attrezzo;
				
		}
		return attrezzoCercato;	
	}
	
	public int getPeso() {
		int peso = 0;
		if(this.attrezzi.isEmpty())
			return peso;
		else {
		
		for (int i= 0; i<this.attrezzi.size(); i++)
			if(this.attrezzi.get(i)!=null)
			peso += this.attrezzi.get(i).getPeso();
		}
		return peso;
	}
	
	public boolean isEmpty() {
		return this.attrezzi.isEmpty();
	}
	
	public boolean hasAttrezzo(String nomeAttrezzo) {
		return this.getAttrezzo(nomeAttrezzo)!=null;
	}
	public Attrezzo removeAttrezzo(String nomeAttrezzo) {
		Attrezzo a = null;

	// --->  TODO (implementare questo metodo) <---
		if(nomeAttrezzo!=null) {
			int i=0;
	for (Attrezzo att:this.attrezzi) {
		if(att!=null) {
			if(att.getNome().equals(nomeAttrezzo)) {
				a=att;
				this.attrezzi.remove(i);
			}
		}
		i++;
	}
}
return a;
}
public String toString() {
		StringBuilder s = new StringBuilder();
		if (!this.isEmpty()) {
			s.append("Contenuto borsa ("+this.getPeso()+"kg/"+this.getPesoMax()+"kg): ");
			for (int i=0; i<this.attrezzi.size(); i++)
				if(this.attrezzi.get(i)!=null) 
				s.append(this.attrezzi.get(i).toString()+" ");
		}
		else
			s.append("Borsa vuota");
		return s.toString();
	}

}