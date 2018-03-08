/*package com.bitcamp.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import com.bitcamp.web.command.Command;
import com.bitcamp.web.domain.MemberDTO;
import com.bitcamp.web.domain.UserPhoneDTO;
import com.bitcamp.web.factory.ShiftFactory;
import com.bitcamp.web.service.UserPhoneService;

@SessionAttributes("user")
@Controller
public class UserPhoneController {
	private static final Logger logger = LoggerFactory.getLogger(PhoneController.class);
	@Autowired ShiftFactory shift;
	@Autowired UserPhoneDTO uPhone;
	@Autowired UserPhoneService service;
	@Autowired Command cmd;
	
	@RequestMapping(value="/mobile/openphone",method=RequestMethod.POST)
	public String openPhone(Model model,@RequestParam("phoneSeq") String phoneSeq, @RequestParam("telecom") String telecom, @ModelAttribute("user") MemberDTO member) {
		logger.info("PhoneController phoneSeq() phoneSeq is {} ", phoneSeq);
		logger.info("PhoneController telecom() telecom is {} ", telecom);
		uPhone.setPhoneId(member.getId()+phoneSeq);
		uPhone.setTelecom(telecom);
		uPhone.setPhoneSeq(phoneSeq);
		uPhone.setMemberId(member.getId());
		uPhone.setPhoneNum(service.createPhoneNum());
		System.out.println("핸드폰 번호 : "+uPhone.getPhoneNum());
		System.out.println("핸드폰 아이디 : "+uPhone.getPhoneId());
		System.out.println("통신사 : "+uPhone.getTelecom());
		System.out.println("핸드폰 시퀀스 : "+uPhone.getPhoneSeq());
		System.out.println("멤버ID : "+uPhone.getMemberId());
		cmd.setUserphone(uPhone);
		service.openPhone(cmd);
		return shift.create("user", "mypage");
	}
}*/
