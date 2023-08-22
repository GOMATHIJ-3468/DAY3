package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.EmployeeService;
import com.example.demo.model.Employee;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeService eesr;
	@PostMapping("addemployee")
	public Employee add(@RequestBody Employee ss) {
		return eesr.saveinfo(ss);
	}
	
	
	@GetMapping("showdetails")
	public List<Employee>show(){
		return eesr.showinfo();
	}
	
}
