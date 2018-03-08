package com.bitcamp.web.service;

import java.util.List;
import org.springframework.stereotype.Component;
import com.bitcamp.web.command.Command;
import com.bitcamp.web.domain.FoodDTO;

@Component
public interface FoodService {
	public void addFood(Command cmd);
	public void updateFood(Command cmd);
	public void deleteFood(Command cmd);
	public List<FoodDTO> list();
	public List<FoodDTO> selectByName(Command cmd);
	public FoodDTO selectById(Command cmd);
	public int count();

}
