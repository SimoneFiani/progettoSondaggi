package it.fiani.sondaggi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/sondaggi")

public class ControllerSondaggi {

	@GetMapping("/")
	public String indexSondaggi() {
		return "index-sondaggi";
	}

	@GetMapping("/new")
	public String formSondaggio() {
		return "form-sondaggi";
	}

	@PostMapping("/")
	public String creaSondaggio() {
		return "redirect:/sondaggi";
	}

	@GetMapping("/{id}")
	public String dettagliSondaggio() {
		return null;
	}

}
