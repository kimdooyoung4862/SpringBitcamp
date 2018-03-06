package com.bitcamp.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import com.bitcamp.web.command.Command;
import com.bitcamp.web.domain.LottoDTO;
import com.bitcamp.web.domain.MemberDTO;
import com.bitcamp.web.factory.ContextFactory;
import com.bitcamp.web.mapper.MemberMapper;
import com.bitcamp.web.service.LottoService;
import com.bitcamp.web.service.MemberService;

@SessionAttributes("user")
@Controller
public class UserController {
	private static final Logger logger = LoggerFactory.getLogger(UserController.class);
	@Autowired ContextFactory contextfactory;
	@Autowired LottoService service;
	@Autowired LottoDTO lotto;
	@Autowired MemberService mService;
	@Autowired MemberMapper mapService;
	@Autowired MemberDTO member;
	@Autowired Command cmd;
	
	@RequestMapping("/login/{userid}/{password}")
	public String login(Model model,
			@PathVariable("userid")String userid,
			@PathVariable("password")String password
			) {
		logger.info("UserController login() ID is {} ", userid);
		logger.info("UserController login() PASS is {} ", password);
		member.setId(userid);
		member.setPass(password);
		cmd.setMember(member);
		String path = "public:user/login.tiles";
		if(mService.exist(cmd)) {
			model.addAttribute("user", mService.findMemberById(cmd));
			path = "public:user/mypage.tiles";
		}
		return path;
	}
	@RequestMapping("/logout")
	public String logout(SessionStatus status) {
		status.setComplete();
		logger.info("[컨드롤러 : 로그아웃]");
		return "public:user/login.tiles";
	}
	@RequestMapping("/nav")
	public String nav() {
		return "public:common/nav.tiles";
	}
	@RequestMapping("/mypage")
	public String mypage() {
		return "public:user/mypage.tiles";
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
