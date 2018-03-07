package com.bitcamp.web.service;

import java.util.List;

import com.bitcamp.web.command.Command;
import com.bitcamp.web.domain.PhoneDTO;

public interface PhoneService {

	public void openPhone(Command cmd);
	public List<PhoneDTO> phones();

}
