package com.bitcamp.web.controller;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import com.bitcamp.web.domain.LottoDTO;
import com.bitcamp.web.factory.ContextFactory;
import com.bitcamp.web.service.LottoService;


@Controller
public class UserController {
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	@Autowired ContextFactory contextfactory;
	@Autowired LottoService service;
	@Autowired LottoDTO lotto;
	
	@RequestMapping("/mypage")
	public String myPage() {
		return "public:user/mypage.tiles";
	}
	@RequestMapping("/nav")
	public String nav() {
		return "public:common/nav.tiles";
	}
	@RequestMapping("/burgerking")
	public String burgerking() {
		return "public:burgerking/main.tiles";
	}
	@RequestMapping("/kakao")
	public String kakao() {
		return "public:account/main.tiles";
	}
	@RequestMapping("/bitcamp")
	public String bitcamp() {
		return "public:bitcamp/main.tiles";
	}
	@RequestMapping("/mobile")
	public String mobile() {
		return "public:mobile/main.tiles";
	}
	@RequestMapping("/lotto")
	public String lotto() {
		return "public:lotto/main.tiles";
	}
	@RequestMapping("/lotto/{money}")
	public String lotto(@PathVariable String money, Model model) {
		logger.info("===UserController lotto() Money is {} ===", money);
		lotto.setMoney(money);
		model.addAttribute("lottos", service.createLottos(lotto));
		model.addAttribute("money", money);
		return "public:lotto/result.tiles";
	}
}
