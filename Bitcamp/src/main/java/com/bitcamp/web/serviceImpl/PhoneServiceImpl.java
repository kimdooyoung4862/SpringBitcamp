package com.bitcamp.web.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import com.bitcamp.web.command.Command;
import com.bitcamp.web.domain.PhoneDTO;
import com.bitcamp.web.mapper.PhoneMapper;
import com.bitcamp.web.service.PhoneService;

@Service
public class PhoneServiceImpl implements PhoneService{
	@Autowired PhoneMapper mapper;
	
	@Override
	public void openPhone(Command cmd) {
	}
	@Override
	public List<PhoneDTO> phones() {
		return mapper.list();
	}
}
