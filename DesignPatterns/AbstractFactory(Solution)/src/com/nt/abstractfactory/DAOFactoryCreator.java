//DBStudentDAOFactory.java
package com.nt.abstractfactory;

public class DAOFactoryCreator {

	public static DAOFactory buildDAOFactory(String store) {
		// TODO Auto-generated method stub
		DAOFactory daoFactory = null;
		if (store.equals("DB")) {
			daoFactory = new DBDAOFactory();
		}
		if (store.equals("Excel")) {
			daoFactory = new ExcelDAOFactory();
		}
		return daoFactory;
	}

}
