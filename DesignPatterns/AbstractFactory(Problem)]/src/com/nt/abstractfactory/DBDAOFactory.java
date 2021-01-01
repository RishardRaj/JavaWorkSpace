//DBDAOFactory.java
package com.nt.abstractfactory;

public class DBDAOFactory {
	public static DAO createDAO(String daoType) {
		DAO dao = null;
		if (daoType.equals("student")) {
			dao = new DBStudentDAO();
		} else if (daoType.equals("course")) {
			dao = new DBCourseDAO();
		}
		return dao;
	}
}