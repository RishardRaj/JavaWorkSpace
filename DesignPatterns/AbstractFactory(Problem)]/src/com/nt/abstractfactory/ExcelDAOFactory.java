//ExcelDAOFactory.java
package com.nt.abstractfactory;

public class ExcelDAOFactory {
	public static DAO createDAO(String daoType) {
		DAO dao = null;
		if (daoType.equals("student")) {
			dao = new ExcelStudentDAO();
		} else if (daoType.equals("course")) {
			dao = new ExcelCourseDAO();
		}
		return dao;
	}
}