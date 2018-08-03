package br.edu.unoescsmo.cadastrotrilheiro.regras;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.unoescsmo.cadastrotrilheiro.model.Trilheiro;
import br.edu.unoescsmo.cadastrotrilheiro.repository.TrilheiroRepository;

@Service
public class TrilheiroPadrao implements TrilheiroRegra {

	@Autowired
	private TrilheiroRepository trilheiroRepository;

	@Override
	public void salvar(Trilheiro trilheiro) {
		trilheiroRepository.save(trilheiro);
	}

	@Override
	public void excluir(Trilheiro trilheiro) {
		trilheiroRepository.delete(trilheiro);
	}

	@Override
	public List<Trilheiro> listar() {
		return trilheiroRepository.findAll();
	}

	@Override
	public Trilheiro buscarPorCodigo(Long codigo) {
		return trilheiroRepository.findById(codigo).orElse(new Trilheiro());
	}

	//@Override
	//public List<Trilheiro> dadosGrid() {
	//	return trilheiroRepository.dadosGrid();
	//}

}
