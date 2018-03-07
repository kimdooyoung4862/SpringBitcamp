package com.bitcamp.web.controller;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import com.bitcamp.web.command.Command;
import com.bitcamp.web.domain.PhoneDTO;
import com.bitcamp.web.factory.ShiftFactory;
import com.bitcamp.web.service.PhoneService;

@SessionAttributes("phone")
@Controller
public class PhoneController {
	private static final Logger logger = LoggerFactory.getLogger(PhoneController.class);
	@Autowired ShiftFactory shift;
	@Autowired PhoneDTO phone;
	@Autowired Command cmd;
	@Autowired PhoneService service;
	
	@RequestMapping("/mobile/main")
	public String phone(Model model) {
		List<PhoneDTO> phones = service.phones();
		model.addAttribute("phones", phones);
		return shift.create("mobile", "main");
	}
	@RequestMapping(value="/mobile/openphone",method=RequestMethod.POST)
	public String openPhone(Model model,@RequestParam("phoneSeq") String phoneSeq, @RequestParam("telecom") String telecom) {
		logger.info("PhoneController phoneSeq() phoneSeq is {} ", phoneSeq);
		logger.info("PhoneController telectom() telectom is {} ", telecom);
		return "";
	}
}
