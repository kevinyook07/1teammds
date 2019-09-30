package com.cafe24.oneteammds.hcontroller;

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
public class ByungrihB_Controller {

	@Autowired
	private ByungriService byungrihService;

	// 병원
	@RequestMapping("/byungrihB_List")
	public String getByungriList(Model model) {

		model.addAttribute("byungriList", byungrihService.getByungrihList());

		return "/byungri/byungrih/byungrihB_List";
	}

	@GetMapping("/byungrihB_Regist")
	public String getByungrihById(@RequestParam(value = "patientId") String patientId, Model model) {

		model.addAttribute("byungrih", byungrihService.getByungrihById(patientId));

		return "byungri/byungriRegist/byungrihB_Regist";
	}
	
	@PostMapping("/byungrihB_List")
	public String getByungriList(@RequestParam(value = "sk") String sk, @RequestParam(value = "sv") String sv,
			Model model) {
		List<Byungrih> list = byungrihService.getByungriSearchList(sk, sv);
		model.addAttribute("byungriList", list);

		return "/byungri/byungrih/byungrihB_List";
	}
}
