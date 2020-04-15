package com.nt.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.inject.Named;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.nt.bo.SearchBO;
import com.nt.bo.SearchResultBO;

@Named("searchDAO")
public class EmpSearchDAOImpl implements EmpSearchDAO {
 private static final String SEARCH_EMP_DETAILS="SELECT EMPNO,ENAME,JOB,SAL,MGR,DEPTNO FROM EMP WHERE (EMPNO  IS NOT NULL and EMPNO=?) or(ENAME IS NOT NULL AND ENAME LIKE ?) OR (JOB IS NOT NULL AND JOB LIKE ?) OR (SAL IS NOT NULL AND SAL=?) ORDER BY JOB";
  @Resource
 private JdbcTemplate jt;
 


@Override
public List<SearchResultBO> search(SearchBO bo) {
	List<SearchResultBO> listRBO=null;
	listRBO=jt.query(SEARCH_EMP_DETAILS, 
			         new EmpExtractor(),
			         bo.getNo(),bo.getName()+"%",bo.getJob()+"%",bo.getSalary());
	return listRBO;
 }

 private static final class EmpExtractor implements ResultSetExtractor<List<SearchResultBO>>{

  @Override
  public List<SearchResultBO> extractData(ResultSet rs) throws SQLException, DataAccessException {
		SearchResultBO rbo=null;
		List<SearchResultBO> listRBO=null;
		
	//copy records of ResultSet to List Collection as SearchResultBO objs
		listRBO=new ArrayList<SearchResultBO>();
		while(rs.next()){
			rbo=new SearchResultBO();
			rbo.setNo(rs.getInt(1));
			rbo.setName(rs.getString(2));
			rbo.setJob(rs.getString(3));
			rbo.setSalary(rs.getInt(4));
			rbo.setMgmrno(rs.getInt(5));
			rbo.setDeptno(rs.getInt(6));
			listRBO.add(rbo);
		}//while
		return listRBO;
	}//extractData
 }//inner class
}//outer class
