package com.cafe24.oneteammds.hcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cafe24.oneteammds.service.DrinkingService;
import com.cafe24.oneteammds.vo.Drinking;
import com.cafe24.oneteammds.vo.Drinkingh;
import com.cafe24.oneteammds.vo.Yakmul;

@Controller
public class DrinkinghA_Controller {

	@Autowired
	private DrinkingService drinkinghService;

	// 병원
	@RequestMapping("/drinkinghA_List")
	public String getDrinkingList(Model model) {

		model.addAttribute("drinkinghList", drinkinghService.getDrinkinghList());

		return "/drinking/drinkingh/drinkinghA_List";
	}

	@GetMapping("/drinkinghA_Regist")
	public String getDrinkinghById(@RequestParam(value = "patientId") String patientId, Model model) {

		model.addAttribute("drinkingh", drinkinghService.getDrinkinghById(patientId));

		return "drinking/drinkingRegist/drinkinghA_Regist";
	}

	
	@PostMapping("drinkinghA_List")
	public String getDrinkingList(@RequestParam(value = "sk") String sk, @RequestParam(value = "sv") String sv,
			Model model) {
		List<Drinkingh> list = drinkinghService.getDrinkingSearchList(sk, sv);
		model.addAttribute("drinkinghList", list);

		return "/drinking/drinkingh/drinkinghA_List";

	}	
}
