package com.cafe24.oneteammds.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cafe24.oneteammds.service.YoungsangService;
import com.cafe24.oneteammds.vo.Yakmul;
import com.cafe24.oneteammds.vo.Youngsang;
import com.cafe24.oneteammds.vo.Youngsangh;

@Controller
public class YoungsangController {

	@Autowired
	private YoungsangService youngsangService;

	// 병원
	@RequestMapping("/youngsanghList")
	public String getYoungsangList(Model model) {

		model.addAttribute("youngsanghList", youngsangService.getYoungsanghList());

		return "/youngsang/youngsangh/youngsanghList";
	}

	@GetMapping("/youngsangRegist")
	public String getYoungsanghById(@RequestParam(value = "patientId") String patientId, Model model) {

		model.addAttribute("youngsangh", youngsangService.getYoungsanghById(patientId));

		return "youngsang/youngsangRegist/youngsangRegist";
	}

	// 시스템DB

	@PostMapping("/youngsangdbList")
	public String getYoungsangRegist(Youngsang youngsang, Model model) {

		youngsangService.getYoungsangRegist(youngsang);

		model.addAttribute("youngsangdbList", youngsangService.getYoungsangdbList());

		return "/youngsang/youngsang/youngsangdbList";
	}

	// MDS 진료 리스트- 진단내역
	@GetMapping("/youngsangdbList")
	public String getYoungsangdbList(Model model) {
		List<Youngsang> list = youngsangService.getYoungsangdbList();

		model.addAttribute("youngsangdbList", list);
		return "/youngsang/youngsang/youngsangdbList";
	}

	@PostMapping("/youngsanghList")
	public String getYoungsangList(@RequestParam(value = "sk") String sk, @RequestParam(value = "sv") String sv,
			Model model) {
		List<Youngsangh> list = youngsangService.getYoungsangSearchList(sk, sv);
		model.addAttribute("youngsanghList", list);

		return "/youngsang/youngsangh/youngsanghList";
	}

	@GetMapping("/delYoungsang")
	public String delYoungsang(@RequestParam(value = "itrCode") String itrCode, Model model) {
		model.addAttribute("itrCode", itrCode);

		return "youngsang/ydelete/delYoungsang";
	}

	@PostMapping("/delYoungsang")
	public String delYoungsang(@RequestParam(value = "itrCode") String itrCode,
			@RequestParam(value = "hospitalId") String hospitalId, @RequestParam(value = "patientId") String patientId,
			Model model) {
		int result = youngsangService.delYoungsang(itrCode, hospitalId, patientId);
		if (result == 0) {
			model.addAttribute("result", "비밀번호가 일치하지 않습니다..");
			model.addAttribute("itrCode", itrCode);
			return "/youngsang/ydelete/delYoungsang";
		}
		return "redirect:/youngsangList";

	}
}
