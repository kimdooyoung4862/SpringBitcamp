package com.bitcamp.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bitcamp.web.factory.ContextFactory;

@Controller
public class UserController {
	
	@Autowired ContextFactory contextfactory;
	
	@RequestMapping("/mypage")
	public String myPage(Model model) {
		model.addAttribute("context",contextfactory.create());
		model.addAttribute("js",contextfactory.path("js"));
		return "user/mypage";
	}
	@RequestMapping("/nav")
	public String nav(Model model) {
		model.addAttribute("context",contextfactory.create());
		model.addAttribute("js",contextfactory.path("js"));
		return "common/nav";
	}

}
