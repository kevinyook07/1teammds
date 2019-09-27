package com.cafe24.oneteammds.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.cafe24.oneteammds.vo.Admin;





@Mapper
public interface AdminMapper {

	public List<Admin> getAdminList();
	
	public int addAdmin(Admin admin);
	
	public Admin getAdminById(String a_id);
	
	public int modifyAdmin (Admin admin);
	
	public int delAdmin(String a_id, String a_pw);
	
	public Admin getAdminLogin(Admin admin);
	
	public List<Admin> getAdminSearchList (String sk, String sv);
}
