package it.fiani.sondaggi.entity;

import javax.persistence.Entity;

@Entity

public class Sondaggio {

//	1. In che anno sei nato
//	2. Sei maschio o femmina
//	3. Quanto sei alto (Centimetri)

	private String annoNascita;
	private String sesso;
	private int altezza;

	public Sondaggio(String annoNascita, String sesso, int altezza) {
		super();
		this.annoNascita = annoNascita;
		this.sesso = sesso;
		this.altezza = altezza;
	}

	public String getAnnoNascita() {
		return annoNascita;
	}

	public void setAnnoNascita(String annoNascita) {
		this.annoNascita = annoNascita;
	}

	public String getSesso() {
		return sesso;
	}

	public void setSesso(String sesso) {
		this.sesso = sesso;
	}

	public int getAltezza() {
		return altezza;
	}

	public void setAltezza(int altezza) {
		this.altezza = altezza;
	}

	@Override
	public String toString() {
		return "Sondaggio [annoNascita=" + annoNascita + ", sesso=" + sesso + ", altezza=" + altezza + "]";
	}

}
