package com.bitcamp.web.mapper;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import com.bitcamp.web.command.Command;
import com.bitcamp.web.domain.PhoneDTO;

@Component
@Service
public interface PhoneMapper {
	
	public void openPhone(Command cmd);
	public List<PhoneDTO> list();

}
