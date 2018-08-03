package br.edu.unoescsmo.cadastrotrilheiro.regras;

import java.util.List;

import br.edu.unoescsmo.cadastrotrilheiro.model.Moto;

public interface MotoRegra {
	void salvar(Moto moto);

	void excluir(Moto moto);

	List<Moto> listar();

	Moto buscarPorCodigo(Long codigo);
}
