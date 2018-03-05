package com.bitcamp.web.mapperImpl;


import org.mybatis.spring.SqlSessionTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.bitcamp.web.command.Command;
import com.bitcamp.web.domain.MemberDTO;
import com.bitcamp.web.mapper.MemberMapper;

@Repository
public class MemberMapperImpl implements MemberMapper{
	private static final Logger logger = LoggerFactory.getLogger(MemberMapperImpl.class);
	@Autowired MemberDTO member;
	@Autowired SqlSessionTemplate sqlSession;
	String ns = "com.bitcamp.web.mapperImpl.MemberMapperImpl.";
	
	@Override
	public void insertMember(Command cmd) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public MemberDTO selectMemberById(Command cmd) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MemberDTO login(Command cmd) {
		logger.info("MemberMapperImpl login() ID is {} ",cmd.getMember().getId());
		return sqlSession.selectOne(ns+"login",cmd);
	}

	@Override
	public void deleteMember(Command cmd) {
		// TODO Auto-generated method stub
		
	}

}
