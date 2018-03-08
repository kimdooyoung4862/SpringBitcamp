/*package com.bitcamp.web.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.bitcamp.web.command.Command;
import com.bitcamp.web.mapper.UserPhoneMapper;
import com.bitcamp.web.service.UserPhoneService;

@Service
public class UserPhoneServiceImpl implements UserPhoneService{
	@Autowired UserPhoneMapper mapper;

	@Override
	public void openPhone(Command cmd) {
		mapper.insertPhone(cmd);
	}

	@Override
	public String createPhoneNum() {
		return "010-"+String.valueOf(
				(int)(Math.random() * 8999 + 1000))+
				"-"+String.valueOf(
					(int)(Math.random() * 8999 + 1000));
	}
}*/
