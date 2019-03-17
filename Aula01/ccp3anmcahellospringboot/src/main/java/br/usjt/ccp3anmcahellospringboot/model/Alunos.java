package br.usjt.ccp3anmcahellospringboot.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Alunos implements Serializable {
	
	@Id
	@GeneratedValue
	private Long id;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getMediaNotas() {
		return mediaNotas;
	}

	public void setMediaNotas(double mediaNotas) {
		this.mediaNotas = mediaNotas;
	}

	private String nome;
	
	private double mediaNotas;
	

}
