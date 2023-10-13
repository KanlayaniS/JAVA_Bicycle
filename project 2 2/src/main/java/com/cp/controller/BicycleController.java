package com.cp.controller;

import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.cp.bicycleService.BicycleService;
import com.cp.bicycleService.MyBicycleListService;
import com.cp.entity.Bicycle;
import com.cp.entity.MyBicycleList;

@Controller
public class BicycleController {
	

	@Autowired
	private BicycleService service;
	
	@Autowired
	private MyBicycleListService myBiService;
	
	@GetMapping("/home")
	public String home() {
		// GetMapping 
		return "home";
	}
	@GetMapping("/bicycle_register")
	public String BicycleRegister() {
		// GetMapping ไปที่ href 
		//
		// return ไปที่ไฟล์ html 
		return "BicycleRegister";
	}
	@GetMapping("/avaiable_bicycles")
	public ModelAndView getAllBicycle() {
		// GetMapping ไปที่ href  เวลาค้นหาในggใส่ตัวนี้นะ
		// getAllBicycle
		// return ไปที่ไฟล์ html 
		//return " bicycleList";
		// List จากคลาส Bicycle  
		List<Bicycle> list = service.getAllBicycle();
		//ModelAndView m = new ModelAndView();
		//m.setViewName("bicycleList");
		//m.addObject("bicycle", list);
		// bicycleList => html
		// bicycle => อยู่ใน html 
		return new ModelAndView("bicycleList", "bicycle", list);
	}
	
	//Post Mapping เพื่อ handle
	
	@PostMapping("/save")
	public String addBicycle(@ModelAttribute Bicycle b) {
		
		//import model ด้วยนะ
		service.save(b);
		return "redirect:/avaiable_bicycles";
		
	}
	
	@GetMapping("/my_bicycles")
	public String getMyBicycles(Model model) {
		// getAllMyBicycles มาจาก method ของ MyBicycleListService
		List<MyBicycleList> list = myBiService.getAllMyBicycles();
		model.addAttribute("bicycle",list);
		// return path ไปที่ html
		return "myBicycles";
		
	}
	
	@RequestMapping("/mylist/{id}")
	public String getMyList(@PathVariable("id") int id) {	
		//Add
		Bicycle b = service.getBiById(id);
		MyBicycleList mb = new MyBicycleList(b.getId(), b.getName(),b.getOwner(), b.getPrice());
		//save from 
		myBiService.saveMyBicycles(mb);
		return "redirect:/my_bicycles";
		
		//get or post , post
	}
	
	@RequestMapping("/editBicycle/{id}")
	public String editBicycle(@PathVariable("id") int id, Model model) {
		// path editbicycle มีที่ bicycleList
		Bicycle b = service.getBiById(id);
		model.addAttribute("bicycle",b);
		// return to html 
		return "bicycleEdit";
	}
	
	@RequestMapping("/deleteBicycle/{id}")
	public String deleteBicycle(@PathVariable("id")int id) {
		// path deletebicycle มีที่ bicycleList
		service.deleteById(id);
		return "redirect:/avaiable_bicycles";
	}
	
	

	

}

