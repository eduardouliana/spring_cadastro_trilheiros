package br.edu.unoescsmo.cadastrotrilheiro.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.edu.unoescsmo.cadastrotrilheiro.model.Trilheiro;
import br.edu.unoescsmo.cadastrotrilheiro.regras.GrupoRegra;
import br.edu.unoescsmo.cadastrotrilheiro.regras.MotoRegra;
import br.edu.unoescsmo.cadastrotrilheiro.regras.TrilheiroRegra;      

@Controller
@RequestMapping("/trilheiro")
public class TrilheiroController {

	@Autowired
	private TrilheiroRegra trilheiroRegra;
	
	@Autowired
	private MotoRegra motoRegra;
	
	@Autowired
	private GrupoRegra grupoRegra;

	@PostMapping("/salvar")
	public String salvar(@Valid Trilheiro trilheiro, BindingResult erros) {
		if (erros.hasErrors()) {
			return "trilheiro/novo";

		}
		trilheiroRegra.salvar(trilheiro);
		return "redirect:/trilheiro/listar";
	}
	
	@PostMapping("/alterar")
	public String alterar(@Valid Trilheiro trilheiro, BindingResult erros) {
		if (erros.hasErrors()) {
			return "trilheiro/visualizar";

		}
		trilheiroRegra.salvar(trilheiro);
		return "redirect:/trilheiro/listar";
	}

	@GetMapping("/listar")
	public String listar(Model model) {
		// Torna a lista de trilheiro acessível no JSP
		model.addAttribute("trilheiros", trilheiroRegra.listar());
		// caminho + nome do JSP que será renderizado para a tela
		return "trilheiro/lista";
	}

	@GetMapping("/novo")
	public String novo(Model model) {
		model.addAttribute("motos", motoRegra.listar());
		model.addAttribute("grupos", grupoRegra.listar());
		return "trilheiro/novo";
	}
	
	@GetMapping("/deletar/{codigo}")
	public String deletar(@PathVariable("codigo") Long codigo) {
		trilheiroRegra.excluir(new Trilheiro(codigo));
		return "redirect:/trilheiro/listar";
	}

	@GetMapping("/visualizar/{codigo}")
	public String visualizar(@PathVariable("codigo") Long codigo, Model model) {
		model.addAttribute("trilheiro", trilheiroRegra.buscarPorCodigo(codigo));
		model.addAttribute("motos", motoRegra.listar());
		model.addAttribute("grupos", grupoRegra.listar());
		return "trilheiro/visualizar";
	}

}
