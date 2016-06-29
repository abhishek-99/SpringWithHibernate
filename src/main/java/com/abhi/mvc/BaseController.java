package com.abhi.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BaseController {
@RequestMapping(value="/")
public ModelAndView mainpage()
{
	System.out.println("controller");
	return new ModelAndView("home");
}
@RequestMapping(value="/index")
public ModelAndView indexpage()
{
	System.out.println("inside index");
	return new ModelAndView("home");
}
}
