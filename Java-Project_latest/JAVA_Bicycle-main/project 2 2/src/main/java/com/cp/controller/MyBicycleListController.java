package com.cp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cp.bicycleService.MyBicycleListService;

@Controller
public class MyBicycleListController {
	
	@Autowired
	private MyBicycleListService service;
	
	
	@RequestMapping("/deleteMyList/{id}")
	public String deleteMyList(@PathVariable("id") int id){
		
		service.deleteById(id);
		// เช่น แบบว่า เราลบพวกข้อมูลจักรยานจบแล้วก็ไปท่ี่หน้ารวมว่า เหลืออยู่เท่าไหร่ 
		// return to redirect ตาม path 
		return "redirect:/my_bicycles";
		
	}

}
