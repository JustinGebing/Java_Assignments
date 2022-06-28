package com.codingdojo.daikichi;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@RestController
//@RequestMapping("/daikichi")
@Controller
public class HomeController {
//
//	@RequestMapping("")
//	public String welcome() {
//		return "Welcome!";
//	}
//	
//	@RequestMapping("/today")
//	public String today() {
//		return "Today you will find luck in all your endeavors!";
//	}
//	
//	@RequestMapping("/tomorrow")
//	public String tomorrow() {
//		return "Tomorrow, an opportunity will arise, so be sure to be open to new ideas!";
//	}
//	
//	
//	@RequestMapping("/travel/{location}")
//	public String travel( @PathVariable("location") String location)  {
//		return "Congratulations! You will soon travel to " + location + "!";
//	}
//	
//	@RequestMapping("/lotto/{offer}")
//	public String lotto(@PathVariable("offer") int offer) {
//		if(offer  %  2 == 0) {
//			return "You will take a grand journey in the near future, but be wary of  tempting offers";
//		}
//		else  {
//			return "You have enjoyed the fruits of your labor but now is a great time to spend with family and friends.";
//		}
//	}
	
	public class FruitController {
		@RequestMapping("/")
		public String index() {
			return "demo.jsp";
		}
	}
	
	
}
	
