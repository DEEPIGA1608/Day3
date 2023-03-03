package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="DAY3")
public class employee {
	@Id
	@Column(name="id")
	private int id;
	@Column(name="employeename")
	private String employeename;
	@Column(name="employeeage")
	private int employeeage;
	@Column(name="salary")
	private long salary;
	public employee() {
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmployeename() {
		return employeename;
	}
	public void setEmployeename(String employeename) {
		this.employeename = employeename;
	}
	public int getEmployeeage() {
		return employeeage;
	}
	public void setEmployeeage(int employeeage) {
		this.employeeage = employeeage;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	public employee(int id, String employeename, int employeeage, long salary) {
		super();
		this.id = id;
		this.employeename = employeename;
		this.employeeage = employeeage;
		this.salary = salary;
	}
	
}
