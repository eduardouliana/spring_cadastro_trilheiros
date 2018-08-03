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

import br.edu.unoescsmo.cadastrotrilheiro.model.Moto;
import br.edu.unoescsmo.cadastrotrilheiro.regras.MotoRegra;

   

@Controller
@RequestMapping("/moto")
public class MotoController {

	@Autowired
	private MotoRegra motoRegra;

	@PostMapping("/salvar")
	public String salvar(@Valid Moto moto, BindingResult erros) {
		if (erros.hasErrors()) {
			return "moto/novo";

		}
		motoRegra.salvar(moto);
		return "redirect:/moto/listar";
	}
	
	@PostMapping("/alterar")
	public String alterar(@Valid Moto moto, BindingResult erros) {
		if (erros.hasErrors()) {
			return "moto/visualizar";

		}
		motoRegra.salvar(moto);
		return "redirect:/moto/listar";
	}

	@GetMapping("/listar")
	public String listar(Model model) {
		// Torna a lista de motos acessível no JSP
		model.addAttribute("motos", motoRegra.listar());
		// caminho + nome do JSP que será renderizado para a tela
		return "moto/lista";
	}

	@GetMapping("/novo")
	public String novo() {
		return "moto/novo";
	}

	@GetMapping("/deletar/{codigo}")
	public String deletar(@PathVariable("codigo") Long codigo) {
		motoRegra.excluir(new Moto(codigo));
		return "redirect:/moto/listar";
	}

	@GetMapping("/visualizar/{codigo}")
	public String visualizar(@PathVariable("codigo") Long codigo, Model model) {
		model.addAttribute("moto", motoRegra.buscarPorCodigo(codigo));
		return "moto/visualizar";
	}

}
