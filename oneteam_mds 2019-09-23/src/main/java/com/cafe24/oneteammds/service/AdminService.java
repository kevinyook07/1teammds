package com.cafe24.oneteammds.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cafe24.oneteammds.mapper.AdminMapper;
import com.cafe24.oneteammds.vo.Admin;



@Service
@Transactional
public class AdminService {

	@Autowired
	private AdminMapper adminMapper;
	
	public Map<String, Object> getAdminLogin(Admin admin) {
		
		String result = "";
		
		Map<String, Object> map = new HashMap<String,Object>();
		
		Admin adminCheck = adminMapper.getAdminLogin(admin);
		
		if(adminCheck == null) {
			Admin adminIdCheck = adminMapper.getAdminById(
					admin.getA_id());
			if(adminIdCheck == null) {
				result = "등록된 아이디의 정보가 없습니다.";
			}else {
				result = "비밀번호가 일치하지 않습니다.";
			}

		}else {
			result = "로그인 성공";
			map.put("loginAdmin", adminCheck);
		}
		
		map.put("result", result);
		
		return map;
	}
	
	public List<Admin> getAdminList(){
		List<Admin> list = adminMapper.getAdminList();
		return list;
	}
	
	public List<Admin> getAdminSearchList(String sk, String sv){
		List<Admin> list = adminMapper.getAdminSearchList(sk, sv);
		
		return list;
	}
	
	public int addAdmin(Admin admin) {
		int result = adminMapper.addAdmin(admin);
		return result;
	}
	
	public Admin getAdminById(String a_id) {
		
		return adminMapper.getAdminById(a_id);
	}
	
	public int modifyAdmin(Admin admin) {
		return adminMapper.modifyAdmin(admin);
	}
	
	public int deleteAdmin(String a_id, String a_pw) {
		return adminMapper.delAdmin(a_id, a_pw);
	}
	
}
