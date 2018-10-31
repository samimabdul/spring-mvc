package com.cg.springmvcfour.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cg.springmvcfour.dto.Mobile;
import com.cg.springmvcfour.service.MobileService;

@Controller
public class MobileController {
	@Autowired
	MobileService mobileservice;
	@RequestMapping(value="showall",method=RequestMethod.GET)
public ModelAndView getAllDetails()
{
		List<Mobile> mobData=mobileservice.getAllDetails();
		return new ModelAndView("mobileshow", "data", mobData);
}
@RequestMapping(value="parchase",method=RequestMethod.GET)
	public ModelAndView dataDisplay(@RequestParam("mobname") String name)
	{
		return new ModelAndView("parchase", "ename", name);
		
	}
}
