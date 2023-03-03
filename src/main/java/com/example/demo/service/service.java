package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.example.demo.model.employee;
import com.example.demo.repository.repository;



@Service
public class service {
	@Autowired
	repository Repo;
	
	public List<employee> getDetails(){
		return Repo.findAll();
	}
	public employee saveDetails(employee st) {
		return Repo.save(st); 
	}
	
}
