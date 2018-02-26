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
		return "public:user/mypage.tiles";
	}
	@RequestMapping("/nav")
	public String nav(Model model) {
		return "public:common/nav.tiles";
	}
	@RequestMapping("/burgerking")
	public String burgerking(Model model) {
		return "public:burgerking/main.tiles";
	}
	@RequestMapping("/kakao")
	public String kakao(Model model) {
		return "public:account/main.tiles";
	}
	@RequestMapping("/bitcamp")
	public String bitcamp(Model model) {
		return "public:bitcamp/main.tiles";
	}
	@RequestMapping("/mobile")
	public String mobile(Model model) {
		return "public:mobile/main.tiles";
	}
	@RequestMapping("/lotto")
	public String lotto(Model model) {
		return "public:lotto/main.tiles";
	}
}
