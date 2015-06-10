package com.xtu.web.action;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionSupport;
import com.xtu.web.pojo.Place;
import com.xtu.web.services.PlaceManageService;
@Controller
public class Fab extends ActionSupport{
	private static Logger log = Logger.getLogger(Fab.class);
	@Resource(name="placeManageService")
	private PlaceManageService pms;
	public String exc(){
		Place p = new Place();
		p.setF_place("体育馆");
		p.setP_place("湘大");
//		log.info("fab!!!!!!!!!!!!!");
		pms.add(p);
		return "ok";
	}
}
