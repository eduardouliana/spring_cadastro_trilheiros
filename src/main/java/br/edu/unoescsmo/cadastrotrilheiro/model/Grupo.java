package br.edu.unoescsmo.cadastrotrilheiro.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;

@Entity
public class Grupo {
	@Id // chave primária
	@GeneratedValue(strategy = GenerationType.AUTO) // cria um sequence para o campo
	private Long codigo;

	@Column(length = 150, nullable = false)
	@NotEmpty(message = "nome deve ser preenchido")
	private String nome;

	@Column(length = 150, nullable = false)
	@NotEmpty(message = "cidade deve ser preenchida")
	private String cidade;
	
	@Column(length = 15, nullable = false)
	@NotEmpty(message = "integrantes deve ser preenchida")
	private String integrantes;
	

	public Grupo() {

	}

	public Grupo(Long codigo) {
		this.codigo = codigo;
	}

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getIntegrantes() {
		return integrantes;
	}

	public void setIntegrantes(String integrantes) {
		this.integrantes = integrantes;
	}
}
