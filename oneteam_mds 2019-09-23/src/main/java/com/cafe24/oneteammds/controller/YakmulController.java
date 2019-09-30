package com.cafe24.oneteammds.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cafe24.oneteammds.service.YakmulService;
import com.cafe24.oneteammds.vo.Jindan;
import com.cafe24.oneteammds.vo.Yakmul;
import com.cafe24.oneteammds.vo.Yakmulh;

@Controller
public class YakmulController {

	@Autowired
	private YakmulService yakmulService;

	@PostMapping("/yakmuldbList")
	public String getYakmulRegist(Yakmul yakmul, Model model) {

		yakmulService.getYakmulRegist(yakmul);

		model.addAttribute("yakmuldbList", yakmulService.getYakmuldbList());

		return "/yakmul/yakmul/yakmuldbList";
	}

	// MDS 진료 리스트- 진단내역
	@GetMapping("/yakmuldbList")
	public String getYakmuldbList(Model model) {
		List<Yakmul> list = yakmulService.getYakmuldbList();

		model.addAttribute("yakmuldbList", list);
		return "/yakmul/yakmul/yakmuldbList";
	}

	@GetMapping("/delYakmul")
	public String delYakmul(@RequestParam(value = "mbCode") String mbCode, Model model) {
		model.addAttribute("mbCode", mbCode);

		return "/yakmul/ydelete/delYakmul";
	}

	@PostMapping("/delYakmul")
	public String delYakmul(@RequestParam(value = "mbCode") String mbCode,
			@RequestParam(value = "hospitalId") String hospitalId, @RequestParam(value = "patientId") String patientId,
			Model model) {
		int result = yakmulService.delYakmul(mbCode, hospitalId, patientId);
		if (result == 0) {
			model.addAttribute("result", "비밀번호가 일치하지 않습니다.");
			model.addAttribute("mbCode", mbCode);
			return "/yakmul/ydelete/delYakmul";
		}
		return "redirect:/yakmulList";
	}
}
