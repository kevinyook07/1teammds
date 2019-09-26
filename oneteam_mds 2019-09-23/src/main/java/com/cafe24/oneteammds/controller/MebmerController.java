package com.cafe24.oneteammds.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MebmerController {

	
	@GetMapping("/hospitalinsert")
	public String hospitalinsert() {
		return "/hospital/hospitalinsert";
	}
	@GetMapping("/hospitallist")
	public String hospitallist() {
		return "/hospital/hospitallist";
	}
	@GetMapping("/patientinsert")
	public String patientinsert() {
		return "/patient/patientinsert";
	}
	@GetMapping("/patientlist")
	public String patientlist() {
		return "/patient/patientlist";
	}
	@GetMapping("/login")
	public String login(HttpSession session, HttpServletRequest request) {
		
		return "/login/login";
	}
}