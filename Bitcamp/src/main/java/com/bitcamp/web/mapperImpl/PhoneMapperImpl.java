package com.bitcamp.web.mapperImpl;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bitcamp.web.command.Command;
import com.bitcamp.web.domain.PhoneDTO;
import com.bitcamp.web.mapper.PhoneMapper;

@Repository
public class PhoneMapperImpl implements PhoneMapper{
	@Autowired SqlSessionTemplate sqlSession;
	String ns = "com.bitcamp.web.mapperImpl.PhoneMapperImpl.";
	
	@Override
	public void openPhone(Command cmd) {
		
	}
	@Override
	public List<PhoneDTO> list() {
		return sqlSession.selectList(ns+"list");
	}
}
