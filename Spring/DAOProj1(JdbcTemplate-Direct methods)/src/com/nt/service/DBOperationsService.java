package com.nt.service;

import java.util.List;
import java.util.Map;

public interface DBOperationsService {
	public   String registerEmp(int no,String name,String desg,int salary);
	public  int  getSalary(int no);
	public  String hikeEmpSalary(int no,float percentage);
	public  Map<String,Object> getEmpDetails(int no);
	public List<Map<String, Object>> getEmpDetailsByDesg(String desg);
   public  String  fireEmp(int no);

}
