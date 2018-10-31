package com.cg.springmvctwo.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.naming.Binding;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.BindingResultUtils;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.cg.springmvctwo.dto.Mobile;
import com.cg.springmvctwo.service.MobileService;

@Controller
public class MobileController {
	@Autowired
	MobileService mobileservice;
	@RequestMapping(value="/home")
	public String getAllMobile(@ModelAttribute("my") Mobile mob, 
			Map<String,Object> model) {
		
		List<String> myList=new ArrayList<>();
		myList.add("Android");
		myList.add("iPhone");
		myList.add("Windows");
		
		model.put("catg", myList);
		return "AddMobile";
	}
	
	@RequestMapping(value="adddata",method=RequestMethod.POST)
	public String addMobileData(@Valid@ModelAttribute("my") Mobile mobile,/*@Valid Mobile mobValidation,*/
			BindingResult result,Map<String,Object> model) {
		if(result.hasErrors())
		{
			
			
			List<String> myList=new ArrayList<>();
			myList.add("Android");
			myList.add("iPhone");
			myList.add("Windows");
			
			model.put("catg", myList);
			return "AddMobile";
		}
		else{
			
		
		mobileservice.addMobile(mobile);
		//System.out.println(mobile.getMobId()+" "+mobile.getMobName()+" "+mobile.getMobPrice()+" "+mobile.getMobCategory()+" "+mobile.getMobOnline());
		
	}
		return "success";
		}
	@RequestMapping(value="showall",method=RequestMethod.GET)
	public ModelAndView showAllData()// as it is returning both page model and data(view)
	{
		List<Mobile> allMobile=mobileservice.showAllmobile();
		return new ModelAndView("mobileshow", "data", allMobile);//mobile show is for jsp page name ,data for key of jsp/model name,object name all mobile
	} 
	@RequestMapping(value="searchmobile",method=RequestMethod.GET)
	public String searchData(@ModelAttribute("yy") Mobile mob)
	{
	
		return "searchmobile";
		
	}
	@RequestMapping(value="mobilesearch",method=RequestMethod.POST)
	public ModelAndView dataSearch(@ModelAttribute("yy") Mobile mob) {
		Mobile mobSearch=mobileservice.searchMobile(mob.getMobId());
		return new ModelAndView("showsearch","temp",mobSearch);
		
	}
	@RequestMapping(value="delete",method=RequestMethod.GET)
	public String deleteMobile(@ModelAttribute("dt") Mobile m)
	{
		return "delete";
		
	}
	@RequestMapping(value="mobiledelete", method=RequestMethod.POST)
	public String mobileDelete(@ModelAttribute("dt") Mobile m)
	{
		mobileservice.deleteMobile(m.getMobId());
		return "deletesuccess";
		
	}
}
