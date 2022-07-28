package com.codingdojo.SaveTravels.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.codingdojo.SaveTravels.models.Travels;
import com.codingodjo.SafeTravels.services.TravelsService;

@Controller
public class TravelController {

	@Autowired
	TravelsService travelsService;
	
	@GetMapping("/travels/{travelid}")
	public String index(Model model, @PathVariable("travekId") Long travelId) {
		Travels travel = travelsService.findTravels(travelId);
		
		ArrayList<Travels> travels = (ArrayList<Travels>) travelsService.allTravels();
		
		model.addAttribute("expense", travel);
		model.addAttribute("expenses", travels);
		model.addAttribute("vendor", travel);
		model.addAttribute("vendors", travels);
		model.addAttribute("amount", travel);
		model.addAttribute("amounts", travels);
		model.addAttribute("description", travel);
		model.addAttribute("descriptions", travels);
		
		return "index.jsp";
	}
}
