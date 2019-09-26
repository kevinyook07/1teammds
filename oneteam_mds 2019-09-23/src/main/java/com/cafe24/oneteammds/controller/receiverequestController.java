package com.cafe24.oneteammds.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class receiverequestController {

	@GetMapping("/receiverequestlist")
	public String receiverequestlist() {
		return "receiverequest/receiverequestlist";
	}
	
	@GetMapping("/epatientrlist")
	public String epatientrlist() {
		return "receiverequest/epatientrlist";
	
    }
}
