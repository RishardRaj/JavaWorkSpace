package com.nt.service;

import java.sql.SQLException;

public interface BankService {
	public boolean transferMoney(int srcAcno,int destAcno,float amt)throws RuntimeException;

}
