package com.nt.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.nt.deligate.CrickterDetailsDeligate;
import com.nt.deligate.CrickterDetailsDeligateImpl;
import com.nt.vo.BatsmanInputsVO;
import com.nt.vo.BatsmanProfileVO;

public class BatsmanDetailsControllerServlet extends HttpServlet {
	
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String nickName=null,country=null;
		BatsmanInputsVO ipVO=null;
		CrickterDetailsDeligate deligate=null;
		BatsmanProfileVO profileVO=null;
		RequestDispatcher rd=null;
		//read form data
		nickName=req.getParameter("nickName");
		country=req.getParameter("country");
		//create InputVO class obj having form data
		ipVO=new BatsmanInputsVO();
		ipVO.setNickName(nickName);
		ipVO.setCountry(country);
		//create BusinessDeligate obj
		try{
		deligate=new CrickterDetailsDeligateImpl();
		profileVO=deligate.findCricketerDetails(ipVO);
		}
		catch(IllegalArgumentException  iae){
			rd=req.getRequestDispatcher("error.jsp");
			rd.forward(req,res);
			return;
		}
		//keep results in request scope
		req.setAttribute("profileInfo",profileVO);
		//forward to result page (show_batsman_result.jsp)
		rd=req.getRequestDispatcher("show_batsman_details.jsp");
		rd.forward(req,res);
	}//doGet(-,-)
	
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		  doGet(req,res);
	}//doPost(-,-)

}//class
