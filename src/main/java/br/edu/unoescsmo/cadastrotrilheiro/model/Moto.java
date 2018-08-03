package br.edu.unoescsmo.cadastrotrilheiro.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;

@Entity // para dizer que é uma entidade (tabela do banco)
public class Moto {

	@Id // chave primária
	@GeneratedValue(strategy = GenerationType.AUTO) // cria um sequence para o campo
	private Long codigo;

	@Column(length = 50, nullable = false)
	@NotEmpty(message="marca deve ser preenchida")
	private String marca;
	
	@Column(length = 100, nullable = false)
	@NotEmpty(message="modelo deve ser preenchido")
	private String modelo;
	
	@Column(length = 15, nullable = false)
	@NotEmpty(message="cilindrada deve ser preenchida")
	private String cilindrada;
	
	@Column(length = 100, nullable = false)
	@NotEmpty(message="cor deve ser preenchida")
	private String cor;
	
	public Moto() {
		
	}
	
	public Moto(Long codigo) {
		this.codigo = codigo;
	}

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(String cilindrada) {
		this.cilindrada = cilindrada;
	}
}
