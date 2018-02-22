package com.bitcamp.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bitcamp.web.factory.ContextFactory;

import lombok.experimental.Wither;

@Controller
public class AuthController {
	@RequestMapping("/login")
	public String login() {
		return "user/login";
	}
	
}
