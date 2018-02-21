package com.bitcamp.web.domain;

import lombok.Data;

@Data
public class AccountDTO {
	private String 
		customerNum,accountNum,money,id;

	@Override
	public String toString() {
		return "계좌번호 [고객번호 =" + customerNum + ", 계좌번호 =" + accountNum + ", 잔액 =" + money + ", 아이디 ="
				+ id + "]";
	}
	

	
}
