package com.nt.jdbc;

import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

public class EmpsCount {
	private static final String  GET_EMP_RECORDS_COUNT="SELECT COUNT(*) FROM  EMP";
	public static void main(String[] args) {
          InputStream is=null;		
          Properties props=null;
          Connection con=null;
          PreparedStatement ps=null;
          ResultSet rs=null;
          int count=0;
		try{
		  //locate propeties file
			is=new FileInputStream("src/com/nt/commons/DBDetails.properties");
			//load the content of properties file to Properties collection
			props=new Properties();
			props.load(is);
			//write jdbc code
			 Class.forName(props.getProperty("jdbc.driver"));
			 con=DriverManager.getConnection(props.getProperty("jdbc.url"),props.getProperty("jdbc.user"),props.getProperty("jdbc.pwd"));
             ps=con.prepareStatement(GET_EMP_RECORDS_COUNT);
             rs=ps.executeQuery();
             if(rs.next())
                count=rs.getInt(1);
             System.out.println("Records count:::"+count);
		}//try
		catch(SQLException se){
			se.printStackTrace();
		}
		catch(ClassNotFoundException cnf){
			cnf.printStackTrace();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		finally{
			try{
				if(rs!=null)
					rs.close();
		      }
			catch(SQLException se){
				se.printStackTrace();
			}
			try{
				if(ps!=null)
					ps.close();
		      }
			catch(SQLException se){
				se.printStackTrace();
			}
			try{
				if(con!=null)
					con.close();
		      }
			catch(SQLException se){
				se.printStackTrace();
			}
		}//finally
	}//main
}//class
