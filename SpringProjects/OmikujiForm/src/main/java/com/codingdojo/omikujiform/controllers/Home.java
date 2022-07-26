package com.codingdojo.omikujiform.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/omikuji")
public class Home {
    
	@RequestMapping("")
    public String index() {
        return "index.jsp";
    }
    @RequestMapping("/show")
    public String login(
        @RequestParam(value = "num") Integer num,
        @RequestParam(value = "city") String city,
        @RequestParam(value = "person") String person,
        @RequestParam(value = "prof") String prof,
        @RequestParam(value = "thing") String thing,
        @RequestParam(value = "nice") String nice,
        HttpSession session
    ) {
        session.setAttribute("num", num);
        session.setAttribute("city", city);
        session.setAttribute("person", person);
        session.setAttribute("prof", prof);
        session.setAttribute("thing", thing);
        session.setAttribute("nice", nice);
        return "show.jsp";
    }
}
