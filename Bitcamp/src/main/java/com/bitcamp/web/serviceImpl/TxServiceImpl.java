package com.bitcamp.web.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bitcamp.web.command.Command;
import com.bitcamp.web.domain.TxDTO;
import com.bitcamp.web.mapper.TxMapper;
import com.bitcamp.web.service.TxService;

@Service
public class TxServiceImpl implements TxService{
	@Autowired TxMapper mapper;

	@Override
	public void openPhone(Command cmd) {
		mapper.insertPhone(cmd);
	}

	@Override
	public String createPhoneNum() {
		return "010-"+String.valueOf(
				(int)(Math.random() * 8999 + 1000))+
				"-"+String.valueOf(
					(int)(Math.random() * 8999 + 1000));
	}

	@Override
	public void addTx(Command cmd) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateTx(Command cmd) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteTx(Command cmd) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<TxDTO> list() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TxDTO> selectByName(Command cmd) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TxDTO selectById(Command cmd) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int count() {
		// TODO Auto-generated method stub
		return 0;
	}
}
