package com.cafe24.oneteammds.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class sendrequestController {

	@GetMapping("sendrequestinsert")
	public String sendrequestinsert() {
		
		return "/sendrequest/sendrequestinsert";
	}
	@GetMapping("sendrequestlist")
	public String sendrequestlist() {
		
		return "/sendrequest/sendrequestlist";
	}
	@GetMapping("epatientsinsert")
	public String epatientsinsert() {
		
		return "/sendrequest/epatientsinsert";
	}
	@GetMapping("epatientslist")
	public String epatientslist() {
		
		return "/sendrequest/epatientslist";
	}
}
