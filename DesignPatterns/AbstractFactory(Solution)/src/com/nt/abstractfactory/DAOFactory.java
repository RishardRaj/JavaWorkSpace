//DAOFactory.java
package com.nt.abstractfactory;

public interface DAOFactory {
	public DAO createDAO(String daoType);
}
