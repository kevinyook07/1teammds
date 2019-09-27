package com.cafe24.oneteammds.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cafe24.oneteammds.service.HospitalService;
import com.cafe24.oneteammds.vo.Hospital;



@Controller
public class HospitalController {
	
	@Autowired HospitalService hospitalService;
	
	@GetMapping("hospitalLogin")
	public String hospitalLogin() {
		return "/login/hospitalLogin/hospitalLogin";
	}
	
	@PostMapping("/hospitalLogin")
	public String hospitalLogin(Hospital hospital, HttpSession session, Model model) {
		//입력된 아이디 비밀번호
		System.out.println(hospital.toString() + "<--입력된 정보");
		
		Map<String,Object> map = hospitalService.getHospitalLogin(hospital);
		String result 		= (String) map.get("result"); 
		Hospital loginHospital 	= (Hospital) map.get("loginHospital");
		
		//로그인 실패 화면 login
		if(!result.equals("로그인 성공")) {
			model.addAttribute("result", result);
			return "/login/hospitalLogin/hospitalLogin";
		}
		session.setAttribute("SID"		, loginHospital.getH_id());
		session.setAttribute("SLEVEL"	, loginHospital.getH_name());
		/* session.setAttribute("SNAME" , loginHospital.gethName()); */
		
		//로그인 성공 화면 index
		return "redirect:/";
	}
	
	/*
	 * @GetMapping("/logout") public String logout(HttpSession session) {
	 * session.invalidate(); return "redirect:/"; }
	 */

	
	
	@GetMapping("/hospitalList")
	public String getHospitalList(Model model) {
		List<Hospital> list = hospitalService.getHospitalList();
		
		model.addAttribute("hospitalList", list);
		
		return "/hospital/hospitalList/hospitalList";
	}
	
	@PostMapping("/hospitalList")
	public String getHospitalList( @RequestParam(value="sk2") String sk2
								,@RequestParam(value="sv2") String sv2
								,Model model) {
		List<Hospital> list = hospitalService.getHospitalSearchList(sk2, sv2);
		model.addAttribute("hospitalList", list);
		
		return "/hospital/hospitalList/hospitalList";
	}
	
	@GetMapping("/addHospital")
	public String addHospital() {
		return "/hospital/addHospital/addHospital";
	}
	
	@PostMapping("/addHospital")
	public String addHospital(Hospital hospital, Model model) {
		System.out.println(hospital);
		Hospital hospitalCheck = hospitalService.getHospitalById(hospital.getH_id());
		
		if(hospitalCheck != null) {
			model.addAttribute("result", "동일한 아이디가 존재합니다.");
			return "/hospital/addHospital/addHospital";
		}
		
		hospitalService.addHospital(hospital);
		
		return "redirect:/hospitalList";
	}
	
	@GetMapping("/modifyHospital")
	public String modifyHospital(@RequestParam(value="hospitalId")
								String hospitalId, Model model) {
		System.out.println(hospitalId + "<--hospitalId");
		
		model.addAttribute("hospital", hospitalService.getHospitalById(hospitalId));
		
		return "/hospital/modifyHospital/modifyHospital";
	}
	
	@PostMapping("/modifyHospital")
	public String modifyHospital(Hospital hospital) {
		hospitalService.modifyHospital(hospital);
		return "redirect:/hospitalList";
	}
	
	@GetMapping("/delHospital")
	public String delHospital(@RequestParam(value="hospitalId")
							String hospitalId, Model model) {
		model.addAttribute("hospitalId", hospitalId);
		
		return "hospital/delHospital/delHospital";
	}
	@PostMapping("/delHospital")
	public String delHospital(Hospital hospital,Model model) {
		
		int result = hospitalService.deleteHospital(hospital.getH_id(), 
				hospital.getH_pw());
		
		if(result == 0) {
			model.addAttribute("result", "비밀번호가 일치하지 않습니다.");
			model.addAttribute("hospitalId", hospital.getH_id());
			return "hospital/delHospital/delHospital";
		}
		
		return "redirect:/hospitalList";
	}
}


