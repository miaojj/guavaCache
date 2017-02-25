package com.mjj.controller;

import com.mjj.service.TestService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class TestController {
	
	private static final Logger logger = LoggerFactory.getLogger(TestController.class);
	
	@Autowired
	TestService testService;
	
	@RequestMapping(value = "/testDefault.htm", method = RequestMethod.GET)
    public ModelAndView testDefault(HttpServletRequest request,HttpServletResponse response) throws Exception {
		logger.info("into test");
		String str = testService.defaultCache("mjj");
		return new ModelAndView("index").addObject("test",str);
	}
	@RequestMapping(value = "/testGuavaCache60seconds.htm", method = RequestMethod.GET)
    public ModelAndView testGuavaCache60seconds(HttpServletRequest request,HttpServletResponse response) throws Exception {
		logger.info("into test");
		String str = testService.guavaCache60seconds("mjj");
		return new ModelAndView("index").addObject("test",str);
	}
	@RequestMapping(value = "/testGuavaCache10minutes.htm", method = RequestMethod.GET)
    public ModelAndView testGuavaCache10minutes(HttpServletRequest request,HttpServletResponse response) throws Exception {
		logger.info("into test");
		String str = testService.guavaCache10minutes("mjj");
		return new ModelAndView("index").addObject("test",str);
	}
	@RequestMapping(value = "/testGuavaCache1hour.htm", method = RequestMethod.GET)
    public ModelAndView testGuavaCache1hour(HttpServletRequest request,HttpServletResponse response) throws Exception {
		logger.info("into test");
		String str = testService.guavaCache1hour("mjj");
		return new ModelAndView("index").addObject("test",str);
	}
	@RequestMapping(value = "/testRedisCache60seconds.htm", method = RequestMethod.GET)
    public ModelAndView testRedisCache60seconds(HttpServletRequest request,HttpServletResponse response) throws Exception {
		logger.info("into test");
		String str = testService.redisCache60seconds("mjj");
		return new ModelAndView("index").addObject("test",str);
	}
	@RequestMapping(value = "/testRedisCache10minutes.htm", method = RequestMethod.GET)
    public ModelAndView testRedisCache10minutes(HttpServletRequest request,HttpServletResponse response) throws Exception {
		logger.info("into test");
		String str = testService.redisCache10minutes("mjj");
		return new ModelAndView("index").addObject("test",str);
	}
	@RequestMapping(value = "/testRedisCache1hour.htm", method = RequestMethod.GET)
    public ModelAndView testRedisCache1hour(HttpServletRequest request,HttpServletResponse response) throws Exception {
		logger.info("into test");
		String str = testService.redisCache1hour("mjj");
		return new ModelAndView("index").addObject("test",str);
	}

}
