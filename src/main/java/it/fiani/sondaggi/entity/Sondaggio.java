package it.fiani.sondaggi.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class Sondaggio {

//	1. In che anno sei nato
//	2. Sei maschio o femmina
//	3. Quanto sei alto (Centimetri)

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // annotazioni obbligatorie per la primarikey
	Long id;

	private String annoNascita;
	private String sesso;
	private int altezza;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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
		return "Sondaggio [id=" + id + ", annoNascita=" + annoNascita + ", sesso=" + sesso + ", altezza=" + altezza
				+ "]";
	}

}