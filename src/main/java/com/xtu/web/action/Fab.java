package com.xtu.web.action;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionSupport;
import com.xtu.web.pojo.User;
import com.xtu.web.services.BaseService;
@Controller
public class Fab extends ActionSupport{
	private static Logger log = Logger.getLogger(Fab.class);
	@Resource(name="baseService")
	private BaseService<User> bs;
	public String exc(){
		User u = new User();
		u.setName("2323");
		u.setPwd("123454566");
		bs.add(u);
		log.info("fab!!!!!!!!!!!!!");
		return "ok";
	}
}
