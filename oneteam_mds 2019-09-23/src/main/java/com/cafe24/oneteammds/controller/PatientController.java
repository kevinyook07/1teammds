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

import com.cafe24.oneteammds.service.PatientService;
import com.cafe24.oneteammds.vo.Patient;


@Controller
public class PatientController {
	
	@Autowired PatientService patientService; 
	
	@GetMapping("patientLogin")
	public String patientLogin() {
		return "/login/patientLogin/patientLogin";
	}
	
	@PostMapping("/patientLogin")
	public String patientLogin(Patient patient, HttpSession session, Model model) {
		//입력된 아이디 비밀번호
		System.out.println(patient.toString() + "<--입력된 정보");
		
		Map<String,Object> map = patientService.getPatientLogin(patient);
		String result 		= (String) map.get("result"); 
		Patient loginPatient 	= (Patient) map.get("loginPatient");
		
		//로그인 실패 화면 login
		if(!result.equals("로그인 성공")) {
			model.addAttribute("result", result);
			return "/login/patientLogin/patientLogin";
		}
		session.setAttribute("SID"		, loginPatient.getP_id());
		/* session.setAttribute("SLEVEL" , loginPatient.getPatientId()); */
		session.setAttribute("SNAME"	, loginPatient.getP_name());
		
		//로그인 성공 화면 index
		return "redirect:/";
	}
	
	/*
	 * @GetMapping("/logout") public String logout(HttpSession session) {
	 * session.invalidate(); return "redirect:/"; }
	 */

	
	
	@GetMapping("/patientList")
	public String getPatientList(Model model) {
		List<Patient> list = patientService.getPatientList();
		
		model.addAttribute("patientList", list);
		
		return "/patient/patientList/patientList";
	}
	
	@PostMapping("/patientList")
	public String getPatientList( @RequestParam(value="sk3") String sk3
								,@RequestParam(value="sv3") String sv3
								,Model model) {
		List<Patient> list = patientService.getPatientSearchList(sk3, sv3);
		model.addAttribute("patientList", list);
		
		return "/patient/patientList/patientList";
	}
	
	@GetMapping("/addPatient")
	public String addPatient() {
		return "/patient/addPatient/addPatient";
	}
	
	@PostMapping("/addPatient")
	public String addPatient(Patient patient, Model model) {
		System.out.println(patient);
		Patient patientCheck = patientService.getPatientById(patient.getP_id());
		
		if(patientCheck != null) {
			model.addAttribute("result", "동일한 아이디가 존재합니다.");
			return "/patient/addPatient/addPatient";
		}
		
		patientService.addPatient(patient);
		
		return "redirect:/patientList";
	}
	
	@GetMapping("/modifyPatient")
	public String modifyPatient(@RequestParam(value="patientId")
								String patientId, Model model) {
		System.out.println(patientId + "<--patientId");
		
		model.addAttribute("patient", patientService.getPatientById(patientId));
		
		return "/patient/modifyPatient/modifyPatient";
	}
	
	@PostMapping("/modifyPatient")
	public String modifyPatient(Patient patient) {
		patientService.modifyPatient(patient);
		return "redirect:/patientList";
	}
	
	@GetMapping("/delPatient")
	public String delPatient(@RequestParam(value="patientId")
							String patientId, Model model) {
		model.addAttribute("patientId", patientId);
		
		return "patient/delPatient/delPatient";
	}
	@PostMapping("/delPatient")
	public String delPatient(Patient patient,Model model) {
		
		int result = patientService.deletePatient(patient.getP_id(), 
				patient.getP_pw());
		
		if(result == 0) {
			model.addAttribute("result", "비밀번호가 일치하지 않습니다.");
			model.addAttribute("patientId", patient.getP_id());
			return "patient/delPatient/delPatient";
		}
		
		return "redirect:/patientList";
	
	
}
}
