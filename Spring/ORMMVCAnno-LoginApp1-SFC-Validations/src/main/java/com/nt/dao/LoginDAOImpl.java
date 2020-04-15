package com.nt.dao;

import java.util.List;

import javax.annotation.Resource;
import javax.inject.Named;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.orm.hibernate5.HibernateCallback;
import org.springframework.orm.hibernate5.HibernateTemplate;

import com.nt.bo.UserHLO;

@Named
public class LoginDAOImpl implements LoginDAO {
	//private static final String AUTHENTICATE_QUERY="SELECT COUNT(*) FROM UserHLO WHERE UNAME=:un AND PWD=:pass";
	@Resource
	private HibernateTemplate ht;

	@Override
	public long validate(UserHLO bo) {
	 long count=0;
	 List<?> list=null;
	 list=ht.findByNamedQueryAndNamedParam("AUTH_QUERY",new String[]{"un","pass"},new String[]{bo.getUname(),bo.getPwd()});
	 
	 count=(long)list.get(0);
	/* //bulkupdate
	 int cnt=ht.bulkUpdate("delete from UserHLO where uname=?","raja");
	 System.out.println("records effected:"+cnt);
	 return count;*/
	 
	 int cnt=ht.execute(new MyHBCallback());
	 System.out.println("no.of records that are effected"+cnt);
	return count;
	}//vlaidate(-)
	
	private class MyHBCallback implements HibernateCallback<Integer>{

		@Override
		public Integer doInHibernate(Session ses) throws HibernateException {
			Transaction tx=null;
			Query query=null;
			int cnt=0;
			query=ses.createQuery("delete from UserHLO where uname=:un");
			query.setString("un", "king");
			try{
				tx=ses.beginTransaction();
				 cnt=query.executeUpdate();
				tx.commit();
				System.out.println("no.of records that are effeced"+cnt);
			}//try
			catch(Exception e){
				tx.rollback();
			}
			
			return cnt;
		}
		
		
	}
}//class
