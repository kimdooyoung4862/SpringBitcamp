package com.bitcamp.web.service;

import java.util.List;
import org.springframework.stereotype.Component;
import com.bitcamp.web.command.Command;
import com.bitcamp.web.domain.PhoneDTO;

@Component
public interface PhoneService {

	public void openPhone(Command cmd);
	public List<PhoneDTO> phones();

}
