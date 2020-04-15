package com.nt.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import com.nt.command.UserCmd;

public class PerformOperationsController extends MultiActionController {

	public ModelAndView insert(HttpServletRequest req, HttpServletResponse res, UserCmd cmd) {

		return new ModelAndView("user", "operation", "insert opeartion");
	}

	public ModelAndView update(HttpServletRequest req, HttpServletResponse res, UserCmd cmd) {

		return new ModelAndView("user", "operation", "update opeartion");
	}

	public ModelAndView delete(HttpServletRequest req, HttpServletResponse res, UserCmd cmd) {

		return new ModelAndView("user", "operation", "delete opeartion");
	}
	
	public ModelAndView invalid(HttpServletRequest req, HttpServletResponse res, UserCmd cmd) {
		return new ModelAndView("user", "operation", "invalid opeartion");
	}
 }
