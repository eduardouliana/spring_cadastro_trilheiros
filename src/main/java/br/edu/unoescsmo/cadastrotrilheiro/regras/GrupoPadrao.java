package br.edu.unoescsmo.cadastrotrilheiro.regras;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.unoescsmo.cadastrotrilheiro.model.Grupo;
import br.edu.unoescsmo.cadastrotrilheiro.repository.GrupoRepository;

@Service
public class GrupoPadrao implements GrupoRegra {

	@Autowired
	private GrupoRepository grupoRepository;

	@Override
	public void salvar(Grupo grupo) {
		grupoRepository.save(grupo);
	}

	@Override
	public void excluir(Grupo grupo) {
		grupoRepository.delete(grupo);
	}

	@Override
	public List<Grupo> listar() {
		return grupoRepository.findAll();
	}

	@Override
	public Grupo buscarPorCodigo(Long codigo) {
		return grupoRepository.findById(codigo).orElse(new Grupo());
	}

}
