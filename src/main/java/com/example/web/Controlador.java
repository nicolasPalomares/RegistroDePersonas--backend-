package com.example.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.domain.Persona;
import com.example.service.iService;
import jakarta.validation.Valid;

@Controller
public class Controlador {
	
	@Autowired
	private iService<Persona> personaService;
	
	@GetMapping("/")
	public String indexRedirect(Model model, @AuthenticationPrincipal User user) {
		model.addAttribute("persona", new Persona());
		return "index";
	}
	
	@PostMapping("/buscarPersona")
	public String buscarPersona(Model model, @RequestParam("dni") String dni) {
		Persona persona = personaService.findByDni(dni);
		if(persona != null) {
			model.addAttribute("persona", persona);
			return "resultadoDeBusqueda";
		}
		else {
			return "buscarPersona";
		}
	}
	
	@GetMapping("/agregarPersona")
	public String agregarPersona(Persona persona, Model model) {
		return "actualizarPersona";
	}
	
	@GetMapping("/editarPersona")
	public String editarPersona(Persona persona, Model model) {
		persona = personaService.findEntity(persona);
		model.addAttribute("persona", persona);
		return "actualizarPersona";
	}
	
	@PostMapping("/guardarPersona")
	public String guardarPersona(@Valid Persona persona, Model model, Errors errors) {
		if(errors.hasErrors()) {
			return "actualizarPersona";
		}
		personaService.saveEntity(persona);
		return "redirect:/";
	}
	
	@GetMapping("/borrarPersona")
	public String borrarPersona(Persona persona, Model model) {
		personaService.deleteEntity(persona);
		return "redirect:/";
	}

}
