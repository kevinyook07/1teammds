package com.cafe24.oneteammds.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cafe24.oneteammds.service.JunyumService;
import com.cafe24.oneteammds.vo.Junyum;
import com.cafe24.oneteammds.vo.Junyumh;
import com.cafe24.oneteammds.vo.Yakmul;

@Controller
public class JunyumController {

	@Autowired
	private JunyumService junyumService;

	@PostMapping("/junyumdbList")
	public String getJunyumRegist(Junyum junyum, Model model) {

		junyumService.getJunyumRegist(junyum);

		model.addAttribute("junyumdbList", junyumService.getJunyumdbList());

		return "/junyum/junyum/junyumdbList";
	}

	// MDS 진료 리스트- 진단내역
	@GetMapping("/junyumdbList")
	public String getJunyumdbList(Model model) {
		List<Junyum> list = junyumService.getJunyumdbList();

		model.addAttribute("junyumdbList", list);
		return "/junyum/junyum/junyumdbList";
	}

	@GetMapping("/delJunyum")
	public String delJunyum(@RequestParam(value = "lcidCode") String lcidCode, Model model) {
		model.addAttribute("lcidCode", lcidCode);

		return "junyum/jdelete/delJunyum";
	}

	@PostMapping("/delJunyum")
	public String delJunyum(@RequestParam(value = "lcidCode") String lcidCode,
			@RequestParam(value = "hospitalId") String hospitalId, @RequestParam(value = "patientId") String patientId,
			Model model) {
		int result = junyumService.delJunyum(lcidCode, hospitalId, patientId);
		if (result == 0) {
			model.addAttribute("result", "비밀번호가 일치하지 않습니다.");
			model.addAttribute("lcidCode", lcidCode);
			return "/junyum/jdelete/delJunyum";
		}
		return "redirect:/junyumList";

	}
}
