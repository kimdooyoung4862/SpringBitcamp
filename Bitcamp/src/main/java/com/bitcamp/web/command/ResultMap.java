package com.bitcamp.web.command;

import java.util.List;
import com.bitcamp.web.domain.AccountDTO;
import com.bitcamp.web.domain.AttendDTO;
import com.bitcamp.web.domain.FoodDTO;
import com.bitcamp.web.domain.LottoDTO;
import com.bitcamp.web.domain.MemberDTO;
import com.bitcamp.web.domain.PhoneDTO;
import lombok.Data;

@Data
public class ResultMap {
	protected MemberDTO member;
	protected AccountDTO account;
	protected AttendDTO attend;
	protected LottoDTO lotto;
	protected FoodDTO food;
	protected PhoneDTO mobile;
	protected List<MemberDTO> members;
	protected List<AccountDTO> accounts;
	protected List<AttendDTO> attends;
	protected List<LottoDTO> lottos;
	protected List<FoodDTO> foods;
	protected List<PhoneDTO> mobiles;
	protected boolean success;
	protected int count;
}
