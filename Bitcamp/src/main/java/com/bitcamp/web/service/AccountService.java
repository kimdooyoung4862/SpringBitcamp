package com.bitcamp.web.service;

import java.util.List;
import org.springframework.stereotype.Component;
import com.bitcamp.web.command.Command;
import com.bitcamp.web.domain.AccountDTO;

@Component
public interface AccountService {

	public void addAccount(Command cmd);
	public void updateAccount(Command cmd);
	public void deleteAccount(Command cmd);
	public List<AccountDTO> list();
	public List<AccountDTO> selectByName(Command cmd);
	public AccountDTO selectById(Command cmd);
	public int count();

}
