package com.cafe24.oneteammds.hcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cafe24.oneteammds.service.YebangService;
import com.cafe24.oneteammds.vo.Yakmul;
import com.cafe24.oneteammds.vo.Yebang;
import com.cafe24.oneteammds.vo.Yebangh;

@Controller
public class YebanghC_Controller {

	@Autowired
	private YebangService yebanghService;

	// 병원
	@RequestMapping("/yebanghC_List")
	public String getYebangList(Model model) {

		model.addAttribute("yebanghList", yebanghService.getYebanghList());

		return "/yebang/yebangh/yebanghC_List";
	}

	@GetMapping("/yebanghC_Regist")
	public String getYebanghById(@RequestParam(value = "patientId") String patientId, Model model) {

		model.addAttribute("yebangh", yebanghService.getYebanghById(patientId));

		return "yebang/yebangRegist/yebanghC_Regist";
	}

	@PostMapping("/yebanghC_List")
	public String getYebangList(@RequestParam(value = "sk") String sk, @RequestParam(value = "sv") String sv,
			Model model) {
		List<Yebangh> list = yebanghService.getYebangSearchList(sk, sv);
		model.addAttribute("yebanghList", list);

		return "/yebang/yebangh/yebanghC_List";
	}
}
