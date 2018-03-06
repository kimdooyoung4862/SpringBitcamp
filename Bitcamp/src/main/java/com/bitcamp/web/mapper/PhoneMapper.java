package com.bitcamp.web.mapper;

import org.springframework.stereotype.Service;
import com.bitcamp.web.command.Command;

@Service
public interface PhoneMapper {
	
	public void openPhone(Command cmd);

}
