package com.nt.dao;

import java.util.List;

import com.nt.bo.StudentBO;

public interface StudentDAO {
 public  List<StudentBO>  getStudentByAddrs(String addrs);
}
