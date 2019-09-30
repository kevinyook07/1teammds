package com.cafe24.oneteammds.hcontroller;

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
public class GinuenghC_Controller {

	@Autowired
	private GinuengService ginuenghService;

	// 병원
	@RequestMapping("/ginuenghC_List")
	public String getGinuengList(Model model) {

		model.addAttribute("ginuenghList", ginuenghService.getGinuenghList());

		return "/ginueng/ginuengh/ginuenghC_List";
	}

	@GetMapping("/ginuenghC_Regist")
	public String getGinuenghById(@RequestParam(value = "patientId") String patientId, Model model) {

		model.addAttribute("ginuengh", ginuenghService.getGinuenghById(patientId));

		return "ginueng/ginuengRegist/ginuenghC_Regist";
	}

	
	@PostMapping("/ginuenghC_List")
	public String getGinuengList(@RequestParam(value = "sk") String sk, @RequestParam(value = "sv") String sv,
			Model model) {
		List<Ginuengh> list = ginuenghService.getGinuengSearchList(sk, sv);
		model.addAttribute("ginuenghList", list);

		return "/ginueng/ginuengh/ginuenghC_List";
	}

}
