package it.fiani.sondaggi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import it.fiani.sondaggi.entity.Sondaggio;
import it.fiani.sondaggi.service.SondaggiService;

@Controller
@RequestMapping("/sondaggi")

public class SondaggiController {
	@Autowired
	SondaggiService sondaggiService;

	@GetMapping("/")
	public String indexSondaggi() {
		return "index-sondaggi";
	}

	@GetMapping("/new")
	public String formSondaggio() {
		return "form-sondaggi";
	}

	@PostMapping("/")
	public String creaSondaggio(Sondaggio sondaggio) {
		return "redirect:/sondaggi";
	}

	@GetMapping("/{id}")
	public String dettagliSondaggio(@PathVariable long id) {
		return null;
	}

}
