package com.nt.service;

public interface AccountService {
	public boolean transferMoney(int srcAcno,int destAcno,int amount)throws RuntimeException;

}
