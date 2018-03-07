package com.bitcamp.web.service;

import org.springframework.stereotype.Component;
import com.bitcamp.web.command.Command;

@Component
public interface UserService {
	public void openPhone(Command cmd);
	public String createPhoneNum();
}
