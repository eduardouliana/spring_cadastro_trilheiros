package br.edu.unoescsmo.cadastrotrilheiro.regras;

import java.util.List;

import br.edu.unoescsmo.cadastrotrilheiro.model.Trilheiro;

public interface TrilheiroRegra {
	void salvar(Trilheiro trilheiro);

	void excluir(Trilheiro trilheiro);

	List<Trilheiro> listar();
	
	Trilheiro buscarPorCodigo(Long codigo);
	
	//List<Trilheiro> dadosGrid();
}
