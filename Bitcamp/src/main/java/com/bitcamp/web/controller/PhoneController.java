package com.bitcamp.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PhoneController {
	private static final Logger logger = LoggerFactory.getLogger(PhoneController.class);
	
	@RequestMapping("/phone")
	public String phone() {
		return "public:mobile/main.tiles";
	}
	@RequestMapping("/phone/{phone}/{telecom}")
	public String phone(@PathVariable("phone")String phone,@PathVariable("telecom")String telecom) {
		logger.info("PhoneController phone() phone is {} ", phone);
		logger.info("PhoneController telecom() telecom is {} ", telecom);
		return "public:user/mypage.tiles";
	}
}
