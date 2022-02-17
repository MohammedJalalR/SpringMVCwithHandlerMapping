package com.jspider.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class HelloController extends AbstractController {

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {

		ModelAndView model = new ModelAndView();

		model.addObject("msg", "Jspider Kolkata");
		model.setViewName("HelloPage");
		return model;
	}

}
