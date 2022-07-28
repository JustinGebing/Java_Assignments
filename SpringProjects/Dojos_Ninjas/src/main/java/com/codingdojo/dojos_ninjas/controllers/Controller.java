package com.codingdojo.dojos_ninjas.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.codingdojo.dojos_ninjas.models.Dojos;
import com.codingdojo.dojos_ninjas.models.Ninjas;
import com.codingdojo.dojos_ninjas.services.DojosService;
import com.codingdojo.dojos_ninjas.services.NinjasService;

@org.springframework.stereotype.Controller

public class Controller {
	@Autowired
	DojosService dojosService;
	
	@Autowired
	NinjasService ninjasService;
	
	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("dojos", dojosService.allDojos());
		return "index.jsp";
	}
	
	@GetMapping("/dojos/new")
	public String newDojo(@ModelAttribute("dojos") Dojos dojos) {
		return "dojos.jsp";
	}
	
	@PostMapping("/teams/new")
	public String createNewDojo(@Valid @ModelAttribute("dojos") Dojos dojos, BindingResult result) {
		if(result.hasErrors()) {
			return "dojos.jsp";
		} else {
			dojosService.createDojos(dojos);
			return "redirect:/";
		}
	}
	
	@GetMapping("/dojos/{id}")
	public String newDojo(@PathVariable("id") Long id, Model model) {
		model.addAttribute("dojos", dojosService.findDojos(id));
		return "dojos_ninjas.jsp";
	}
	
	@GetMapping("/ninjas/new")
	public String createNewNinja(
			Model model,
			@ModelAttribute("ninjas") Ninjas ninjas) {
		model.addAttribute("dojos", dojosService.allDojos());
		return "ninjas.jsp";
	}
			
	@PostMapping("/ninjas/new")
	public String createNewNinja(
			Model model,
			@Valid @ModelAttribute("ninjas") Ninjas ninjas, BindingResult result) {
		if(result.hasErrors()) {
			return "ninjas.jsp";
		} else {
			ninjasService.createNinjas(ninjas);
			return "redirect:/";
		}
	}
	
}
