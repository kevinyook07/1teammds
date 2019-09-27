package com.cafe24.oneteammds.controller;

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
public class DrinkingController {

	@Autowired
	private DrinkingService drinkingService;

	// 병원
	@RequestMapping("/drinkinghList")
	public String getDrinkingList(Model model) {

		model.addAttribute("drinkinghList", drinkingService.getDrinkinghList());

		return "/drinking/drinkingh/drinkinghList";
	}

	@GetMapping("/drinkingRegist")
	public String getDrinkinghById(@RequestParam(value = "patientId") String patientId, Model model) {

		model.addAttribute("drinkingh", drinkingService.getDrinkinghById(patientId));

		return "drinking/drinkingRegist/drinkingRegist";
	}

	// 시스템DB

	@PostMapping("/drinkingdbList")
	public String getDrinkingRegist(Drinking drinking, Model model) {

		drinkingService.getDrinkingRegist(drinking);

		model.addAttribute("drinkingdbList", drinkingService.getDrinkingdbList());

		return "/drinking/drinking/drinkingdbList";
	}

	// MDS 진료 리스트- 진단내역
	@GetMapping("/drinkingdbList")
	public String getDrinkingdbList(Model model) {
		List<Drinking> list = drinkingService.getDrinkingdbList();

		model.addAttribute("drinkingdbList", list);
		return "/drinking/drinking/drinkingdbList";
	}

	@PostMapping("drinkinghList")
	public String getDrinkingList(@RequestParam(value = "sk") String sk, @RequestParam(value = "sv") String sv,
			Model model) {
		List<Drinkingh> list = drinkingService.getDrinkingSearchList(sk, sv);
		model.addAttribute("drinkinghList", list);

		return "/drinking/drinkingh/drinkinghList";

	}

	@GetMapping("/delDrinking")
	public String delDrinking(@RequestParam(value = "dcCode") String dcCode, Model model) {
		model.addAttribute("dcCode", dcCode);

		return "drinking/ddelete/delDrinking";
	}

	@PostMapping("/delDrinking")
	public String delDrinking(@RequestParam(value = "dcCode") String dcCode,
			@RequestParam(value = "hospitalId") String hospitalId, @RequestParam(value = "patientId") String patientId,
			Model model) {
		int result = drinkingService.delDrinking(dcCode, hospitalId, patientId);
		if (result == 0) {
			model.addAttribute("result", "비밀번호가 일치하지 않습니다..");
			model.addAttribute("dcCode", dcCode);
			return "/drinking/ddelete/delDrinking";
		}
		return "redirect:/drinkingList";
	}
}
