package com.bitcamp.web.serviceImpl;

import java.util.List;
import org.springframework.stereotype.Service;
import com.bitcamp.web.command.Command;
import com.bitcamp.web.domain.FoodDTO;
import com.bitcamp.web.service.FoodService;

@Service
public class FoodServiceImpl implements FoodService{

	@Override
	public void addFood(Command cmd) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateFood(Command cmd) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteFood(Command cmd) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<FoodDTO> list() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<FoodDTO> selectByName(Command cmd) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public FoodDTO selectById(Command cmd) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int count() {
		// TODO Auto-generated method stub
		return 0;
	}

}
