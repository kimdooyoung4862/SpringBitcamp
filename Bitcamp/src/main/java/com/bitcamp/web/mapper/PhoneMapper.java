package com.bitcamp.web.mapper;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import com.bitcamp.web.domain.PhoneDTO;

@Component
@Service
public interface PhoneMapper {

	public List<PhoneDTO> list();


}
