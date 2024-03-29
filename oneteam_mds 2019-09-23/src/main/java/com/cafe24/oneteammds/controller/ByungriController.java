package com.cafe24.oneteammds.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cafe24.oneteammds.service.ByungriService;
import com.cafe24.oneteammds.vo.Byungri;
import com.cafe24.oneteammds.vo.Byungrih;
import com.cafe24.oneteammds.vo.Yakmul;

@Controller
public class ByungriController {

	@Autowired
	private ByungriService byungriService;

	@PostMapping("/byungridbList")
	public String getByungriRegist(Byungri byungri, Model model) {

		byungriService.getByungriRegist(byungri);

		model.addAttribute("byungridbList", byungriService.getByungridbList());

		return "/byungri/byungri/byungridbList";
	}

	// MDS 진료 리스트- 진단내역
	@GetMapping("/byungridbList")
	public String getbyungridbList(Model model) {
		List<Byungri> list = byungriService.getByungridbList();

		model.addAttribute("byungridbList", list);
		return "/byungri/byungri/byungridbList";
	}
	@GetMapping("/delByungri")
	public String delByungri(@RequestParam(value = "ptrCode") String ptrCode, Model model) {
		model.addAttribute("ptrCode", ptrCode);

		return "/byungri/bdelete/delByungri";
	}

	@PostMapping("/delByungri")
	public String delByungri(@RequestParam(value = "ptrCode") String ptrCode,
			@RequestParam(value = "hospitalId") String hospitalId, @RequestParam(value = "patientId") String patientId,
			Model model) {
		int result = byungriService.delByungri(ptrCode, hospitalId, patientId);
		if (result == 0) {
			model.addAttribute("result", "비밀번호가 일치하지 않습니다.");
			model.addAttribute("ptrCode", ptrCode);
			return "/Byungri/bdelete/delByungri";
		}
		return "redirect:/byungriList";
	}

}
