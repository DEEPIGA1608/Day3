package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.employee;
import com.example.demo.service.service;



@RestController
public class Apicontroller {
	@Autowired
	service Service;
	@PostMapping("/add")
	public employee addInfo(@RequestBody employee st) {
		return Service.saveDetails(st);
	}
	@GetMapping("Display")
	public List<employee> fetchDetails(){
		return Service.getDetails();
	}
	
	
	

}
