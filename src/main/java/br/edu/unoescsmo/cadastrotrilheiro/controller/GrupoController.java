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

import br.edu.unoescsmo.cadastrotrilheiro.model.Grupo;
import br.edu.unoescsmo.cadastrotrilheiro.regras.GrupoRegra;      

@Controller
@RequestMapping("/grupo")
public class GrupoController {

	@Autowired
	private GrupoRegra grupoRegra;

	@PostMapping("/salvar")
	public String salvar(@Valid Grupo grupo, BindingResult erros) {
		if (erros.hasErrors()) {
			return "grupo/novo";

		}
		grupoRegra.salvar(grupo);
		return "redirect:/grupo/listar";
	}
	
	@PostMapping("/alterar")
	public String alterar(@Valid Grupo grupo, BindingResult erros) {
		if (erros.hasErrors()) {
			return "grupo/visualizar";

		}
		grupoRegra.salvar(grupo);
		return "redirect:/grupo/listar";
	}

	@GetMapping("/listar")
	public String listar(Model model) {
		// Torna a lista de grupo acessível no JSP
		model.addAttribute("grupos", grupoRegra.listar());
		// caminho + nome do JSP que será renderizado para a tela
		return "grupo/lista";
	}

	@GetMapping("/novo")
	public String novo() {
		return "grupo/novo";
	}

	@GetMapping("/deletar/{codigo}")
	public String deletar(@PathVariable("codigo") Long codigo) {
		grupoRegra.excluir(new Grupo(codigo));
		return "redirect:/grupo/listar";
	}

	@GetMapping("/visualizar/{codigo}")
	public String visualizar(@PathVariable("codigo") Long codigo, Model model) {
		model.addAttribute("grupo", grupoRegra.buscarPorCodigo(codigo));
		return "grupo/visualizar";
	}

}
