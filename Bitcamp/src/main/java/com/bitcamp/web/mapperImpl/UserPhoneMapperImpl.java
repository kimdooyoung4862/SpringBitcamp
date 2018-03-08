/*package com.bitcamp.web.mapperImpl;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bitcamp.web.command.Command;
import com.bitcamp.web.mapper.UserPhoneMapper;

@Repository
public class UserPhoneMapperImpl implements UserPhoneMapper{
	@Autowired SqlSessionTemplate sqlSession;
	
	@Override
	public void insertPhone(Command cmd) {
		sqlSession.insert("insertPhone",cmd);
	}
}*/
