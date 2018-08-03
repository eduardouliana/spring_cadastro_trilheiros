package br.edu.unoescsmo.cadastrotrilheiro.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotEmpty;

@Entity
public class Trilheiro {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long codigo;

	@Column(length = 70, nullable = false)
	@NotEmpty(message = "nome deve ser preenchido")
	private String nome;

	@NotEmpty(message = "idade deve ser preenchida")
	@Column(length = 15, nullable = false)
	private String idade;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "moto")
	private Moto moto;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "grupo")
	private Grupo grupo;

	public Trilheiro() {

	}

	public Trilheiro(Long codigo) {
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

	public Moto getMoto() {
		return moto;
	}

	public void setMoto(Moto moto) {
		this.moto = moto;
	}

	public Grupo getGrupo() {
		return grupo;
	}

	public void setGrupo(Grupo grupo) {
		this.grupo = grupo;
	}

	public String getIdade() {
		return idade;
	}

	public void setIdade(String idade) {
		this.idade = idade;
	}
}