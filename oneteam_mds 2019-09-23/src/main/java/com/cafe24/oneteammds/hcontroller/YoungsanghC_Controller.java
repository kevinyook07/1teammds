package com.cafe24.oneteammds.hcontroller;

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
public class YoungsanghC_Controller {

	@Autowired
	private YoungsangService youngsanghService;

	// 병원
	@RequestMapping("/youngsanghC_List")
	public String getYoungsangList(Model model) {

		model.addAttribute("youngsanghList", youngsanghService.getYoungsanghList());

		return "/youngsang/youngsangh/youngsanghC_List";
	}

	@GetMapping("/youngsanghC_Regist")
	public String getYoungsanghById(@RequestParam(value = "patientId") String patientId, Model model) {

		model.addAttribute("youngsangh", youngsanghService.getYoungsanghById(patientId));

		return "youngsang/youngsangRegist/youngsanghC_Regist";
	}

	@PostMapping("/youngsanghC_List")
	public String getYoungsangList(@RequestParam(value = "sk") String sk, @RequestParam(value = "sv") String sv,
			Model model) {
		List<Youngsangh> list = youngsanghService.getYoungsangSearchList(sk, sv);
		model.addAttribute("youngsanghList", list);

		return "/youngsang/youngsangh/youngsanghC_List";
	}
}
