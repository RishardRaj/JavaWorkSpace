package com.nt.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

public class GenerateReportController extends MultiActionController {

	public ModelAndView excelReport(HttpServletRequest req,HttpServletResponse res){
		List list=new ArrayList<String>();
		list.add("raja"); list.add("rani"); list.add("jani");
		list.add("begum"); list.add("william");
		return new ModelAndView("excelView","stList",list);
	}
	
	public ModelAndView pdfReport(HttpServletRequest req,HttpServletResponse res){
		List list=new ArrayList<String>();
		list.add("raja"); list.add("rani"); list.add("jani");
		list.add("begum"); list.add("william");
		return new ModelAndView("pdfView","stList",list);
	}
}//class
