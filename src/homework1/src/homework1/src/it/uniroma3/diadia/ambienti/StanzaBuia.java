package it.uniroma3.diadia.ambienti;



public class StanzaBuia  extends Stanza{
	private  String attrezzoLucente;
	public StanzaBuia(String nome, String attrezzoLucente) {
		super(nome);
		this.attrezzoLucente=attrezzoLucente;
	}
	
@Override
	public String getDescrizione() {
		String buio=new String();

	    buio="qui c'e' un buio pesto";
		if(!this.hasAttrezzo(attrezzoLucente)) {
		   return buio;
		}
		String no_buio=new String();
	    no_buio="qui non c'e' un buio pesto";
		return no_buio;
}
	
}

	