package com.rajesh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import com.rajesh.dao.FootballerRepo;
import com.rajesh.model.Footballer;

@org.springframework.stereotype.Controller
public class Controller {

	@Autowired
	FootballerRepo footballerRepo;
	
	@RequestMapping("/")
	public String index() {
		//footballerRepo.save(footballer);
		return "index.jsp";
	}
	
	@RequestMapping("/saveFootballer")
	public String saveFootballer(Footballer footballer) {
		footballerRepo.save(footballer);
		return "success.jsp";
	}
}
