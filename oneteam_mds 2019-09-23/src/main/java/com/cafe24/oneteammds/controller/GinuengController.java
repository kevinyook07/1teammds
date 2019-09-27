package com.cafe24.oneteammds.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cafe24.oneteammds.service.GinuengService;
import com.cafe24.oneteammds.vo.Ginueng;
import com.cafe24.oneteammds.vo.Ginuengh;
import com.cafe24.oneteammds.vo.Yakmul;

@Controller
public class GinuengController {

	@Autowired
	private GinuengService ginuengService;

	// 병원
	@RequestMapping("/ginuenghList")
	public String getGinuengList(Model model) {

		model.addAttribute("ginuenghList", ginuengService.getGinuenghList());

		return "/ginueng/ginuengh/ginuenghList";
	}

	@GetMapping("/ginuengRegist")
	public String getGinuenghById(@RequestParam(value = "patientId") String patientId, Model model) {

		model.addAttribute("ginuengh", ginuengService.getGinuenghById(patientId));

		return "ginueng/ginuengRegist/ginuengRegist";
	}

	// 시스템DB

	@PostMapping("/ginuengdbList")
	public String getGinuengRegist(Ginueng ginueng, Model model) {

		ginuengService.getGinuengRegist(ginueng);

		model.addAttribute("ginuengdbList", ginuengService.getGinuengdbList());

		return "/ginueng/ginueng/ginuengdbList";
	}

	// MDS 진료 리스트- 진단내역
	@GetMapping("/ginuengdbList")
	public String getGinuengdbList(Model model) {
		List<Ginueng> list = ginuengService.getGinuengdbList();

		model.addAttribute("ginuengdbList", list);
		return "/ginueng/ginueng/ginuengdbList";
	}

	@PostMapping("/ginuenghList")
	public String getGinuengList(@RequestParam(value = "sk") String sk, @RequestParam(value = "sv") String sv,
			Model model) {
		List<Ginuengh> list = ginuengService.getGinuengSearchList(sk, sv);
		model.addAttribute("ginuenghList", list);

		return "/ginueng/ginuengh/ginuenghList";
	}

	@GetMapping("/delGinueng")
	public String delGinueng(@RequestParam(value = "ftrCode") String ftrCode, Model model) {
		model.addAttribute("ftrCode", ftrCode);

		return "/ginueng/gdelete/delGinueng";
	}

	@PostMapping("/delGinueng")
	public String delGinueng(@RequestParam(value = "ftrCode") String ftrCode,
			@RequestParam(value = "hospitalId") String hospitalId, @RequestParam(value = "patientId") String patientId,
			Model model) {
		int result = ginuengService.delGinueng(ftrCode, hospitalId, patientId);
		if (result == 0) {
			model.addAttribute("result", "비밀번호가 일치하지 않습니다.");
			model.addAttribute("ftrCode", ftrCode);
			return "/ginueng/gdelete/delGinueng";
		}
		return "redircet:/ginuengList";
	}
}
