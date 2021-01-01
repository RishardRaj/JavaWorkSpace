//ClientApp.java
package com.nt.abstractfactory;

public class ClientApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DAO dao = null;
		dao = DBDAOFactory.createDAO("student");
		dao.insert();
		dao = ExcelDAOFactory.createDAO("student");
		dao.insert();
		dao = DBDAOFactory.createDAO("course");
		dao.insert();
		dao = ExcelDAOFactory.createDAO("course");
		dao.insert();
		System.out.println("Factory Class Should Create Objects of Same Class");
	}

}
