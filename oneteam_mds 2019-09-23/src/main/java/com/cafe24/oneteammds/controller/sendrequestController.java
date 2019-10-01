package com.cafe24.oneteammds.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class sendrequestController {

	@GetMapping("sendrequestinsertA")
	public String sendrequestinsertA() {
		
		return "/sendrequest/sendrequestinsertA";
	}
	@GetMapping("sendrequestlistA")
	public String sendrequestlistA() {
		
		return "/sendrequest/sendrequestlistA";
	}
	
	@GetMapping("sendrequestinsertB")
	public String sendrequestinsertB() {
		
		return "/sendrequest/sendrequestinsertB";
	}
	@GetMapping("sendrequestlistB")
	public String sendrequestlistB() {
		
		return "/sendrequest/sendrequestlistB";
	}
	
	@GetMapping("sendrequestinsertC")
	public String sendrequestinsertC() {
		
		return "/sendrequest/sendrequestinsertC";
	}
	@GetMapping("sendrequestlistC")
	public String sendrequestlistC() {
		
		return "/sendrequest/sendrequestlistC";
	}
	
	@GetMapping("epatientsinsertA")
	public String epatientsinsertA() {
		
		return "/sendrequest/epatientsinsertA";
	}
	@GetMapping("epatientslistA")
	public String epatientslistA() {
		
		return "/sendrequest/epatientslistA";
	}
	
	@GetMapping("epatientsinsertB")
	public String epatientsinsertB() {
		
		return "/sendrequest/epatientsinsertB";
	}
	@GetMapping("epatientslistB")
	public String epatientslistB() {
		
		return "/sendrequest/epatientslistB";
	}
	
	@GetMapping("epatientsinsertC")
	public String epatientsinsertC() {
		
		return "/sendrequest/epatientsinsertC";
	}
	@GetMapping("epatientslistC")
	public String epatientslistC() {
		
		return "/sendrequest/epatientslistC";
	}
}
