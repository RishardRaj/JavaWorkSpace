//AbstractFactoryTest.java
package com.nt.abstractfactory;

import javax.rmi.CORBA.StubDelegate;

public class AbstractFactoryTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DAOFactory daoFactory = null;
		DAO dao = null;
		daoFactory = DAOFactoryCreator.buildDAOFactory("DB");
		// get DAO
		dao = daoFactory.createDAO("student");
		dao.insert();
		dao = daoFactory.createDAO("course");
		dao.insert();
		daoFactory = DAOFactoryCreator.buildDAOFactory("Excel");
		dao = daoFactory.createDAO("student");
		dao.insert();
		dao = daoFactory.createDAO("course");
		dao.insert();
	}

}
