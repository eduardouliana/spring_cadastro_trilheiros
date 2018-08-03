package br.edu.unoescsmo.cadastrotrilheiro.regras;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.unoescsmo.cadastrotrilheiro.model.Moto;
import br.edu.unoescsmo.cadastrotrilheiro.repository.MotoRepository;

@Service
public class MotoPadrao implements MotoRegra {

	@Autowired
	private MotoRepository motoRepository;

	@Override
	public void salvar(Moto moto) {
		motoRepository.save(moto);		
	}

	@Override
	public void excluir(Moto moto) {
		motoRepository.delete(moto);
	}

	@Override
	public List<Moto> listar() {
		return motoRepository.findAll();
	}

	@Override
	public Moto buscarPorCodigo(Long codigo) {
		return motoRepository.findById(codigo).orElse(new Moto());
	}
}
