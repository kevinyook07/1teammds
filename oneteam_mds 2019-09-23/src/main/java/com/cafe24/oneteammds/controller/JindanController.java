package com.cafe24.oneteammds.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cafe24.oneteammds.service.JindanService;
import com.cafe24.oneteammds.vo.Jindan;
import com.cafe24.oneteammds.vo.Jindanh;

@Controller
public class JindanController {

	@Autowired
	private JindanService jindanService;

	@PostMapping("/jindandbList")
	public String getJindanRegist(Jindan jindan, Model model) {

		jindanService.getJindanRegist(jindan);

		model.addAttribute("jindandbList", jindanService.getJindandbList());

		return "/jindan/jindan/jindandbList";
	}

	// MDS 진료 리스트- 진단내역
	@GetMapping("/jindandbList")
	public String getJindandbList(Model model) {
		List<Jindan> list = jindanService.getJindandbList();

		model.addAttribute("jindandbList", list);
		return "/jindan/jindan/jindandbList";
	}

	@GetMapping("/delJindan")
	public String delJindan(@RequestParam(value = "dbCode") String dbCode, Model model) {
		model.addAttribute("dbCode", dbCode);

		return "jindan/jdelete/delJindan";

	}

	/*
	 * @PostMapping("/delJindan") public String delJindan(@RequestParam(value =
	 * "dbCode") String dbCode,
	 * 
	 * @RequestParam(value = "hospitalId") String hospitalId, @RequestParam(value =
	 * "patientId") String patientId, Model model) { int result =
	 * jindanService.delJindan(dbCode, hospitalId, patientId); if (result == 0) {
	 * model.addAttribute("result", "비밀번호가 일치하지 않습니다..");
	 * model.addAttribute("dbCode", dbCode); return "/jindan/jdelete/delJindan"; }
	 * return "redirect:/jindanList";
	 * 
	 * }
	 */
}
