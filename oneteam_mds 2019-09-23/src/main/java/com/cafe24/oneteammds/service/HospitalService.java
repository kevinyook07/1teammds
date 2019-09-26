package com.cafe24.oneteammds.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cafe24.oneteammds.mapper.HospitalMapper;
import com.cafe24.oneteammds.vo.Hospital;

@Service
@Transactional
public class HospitalService {
	
	@Autowired
	private HospitalMapper hospitalMapper;
	
	public List<Hospital> getHospitaldbList(){
		return hospitalMapper.getHospitaldbList();
	}
	

}
