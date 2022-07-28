package com.codingdojo.STravels.controllers;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.codingdojo.STravels.models.Travels;
import com.codingdojo.STravels.services.TravelsService;


@Controller
public class TravelController {
	
	@Autowired
	TravelsService travelsService;
	
	@GetMapping("/travels")
	public String index(@ModelAttribute("travels") Travels travel, Model model) {
	
		
		List<Travels> travels = travelsService.allTravels();
		 System.out.println(travels);
		
		model.addAttribute("travels", travels);
		
		return "index.jsp";
	}
	
	@GetMapping("/view/{travelsId}")
	public String getOne(@ModelAttribute("travels") Travels travel, Model model, @PathVariable("travelsId") Long travelsId) {
		Travels travels = travelsService.findTravels(travelsId);
		
		model.addAttribute("travel", travels);
		
		return "view.jsp";
	}
	
	@GetMapping("/update/{travelsId}")
	public String updateOne(@ModelAttribute("travels") Travels travel, Model model, @PathVariable("travelsId") Long travelsId) {
		Travels travels = travelsService.findTravels(travelsId);
		
		model.addAttribute("travel", travels);
		
		return "edit.jsp";
	}
	
	@GetMapping("/delete/{travelsId}")
    public String destroy(@PathVariable("travelsId") Long travelsId) {
        travelsService.deleteTravels(travelsId);
        return "redirect:/travels";
	}
	
	@PostMapping("/create")
	public String create(
			@RequestParam("expense") String expense,
			@RequestParam("vendor")String vendor,
			@RequestParam("amount")double amount,
			@RequestParam("description")String description) 
	{
		Travels travel = new Travels(expense, vendor, amount, description);
		travelsService.createTravel(travel);
		
		return "redirect:/travels";
	}
	
	@PostMapping("/update/{id}")
	public String update(@ModelAttribute("travels") Travels travel) 
	{
		travelsService.updateTravel(travel);
		return "redirect:/travels";
	}
}
