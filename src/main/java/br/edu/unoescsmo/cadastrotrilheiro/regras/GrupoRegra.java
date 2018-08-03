package br.edu.unoescsmo.cadastrotrilheiro.regras;

import java.util.List;

import br.edu.unoescsmo.cadastrotrilheiro.model.Grupo;

public interface GrupoRegra {
	
	void salvar(Grupo grupo);

	void excluir(Grupo grupo);

	List<Grupo> listar();
	
	Grupo buscarPorCodigo(Long codigo);
}
