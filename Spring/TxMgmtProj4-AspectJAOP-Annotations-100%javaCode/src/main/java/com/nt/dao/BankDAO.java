package com.nt.dao;

public interface BankDAO {
		public int withdraw(int srcAcno,float amt);
		public int deposite(int destAcno,float amt);
}
