package br.edu.unoescsmo.cadastrotrilheiro.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.edu.unoescsmo.cadastrotrilheiro.model.Moto;
import br.edu.unoescsmo.cadastrotrilheiro.model.Trilheiro;

public interface TrilheiroRepository extends JpaRepository<Trilheiro, Long> {

	//@Query("select t from Trilheiro t left join fetch t.moto left join fetch t.grupo")
	//List<Trilheiro> dadosGrid();
}
