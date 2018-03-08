package com.bitcamp.web.service;

import java.util.List;
import org.springframework.stereotype.Component;
import com.bitcamp.web.command.Command;
import com.bitcamp.web.domain.BoardDTO;

@Component
public interface BoardService {
	public void addBoard(Command cmd);
	public void updateBoard(Command cmd);
	public void deleteBoard(Command cmd);
	public List<BoardDTO> list();
	public List<BoardDTO> selectByName(Command cmd);
	public BoardDTO selectById(Command cmd);
	public int count();

}
