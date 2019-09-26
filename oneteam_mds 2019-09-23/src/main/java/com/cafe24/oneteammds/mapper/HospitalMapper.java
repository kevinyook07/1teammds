package com.cafe24.oneteammds.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.cafe24.oneteammds.vo.Hospital;

@Mapper
public interface HospitalMapper {
	
	public List<Hospital> getHospitaldbList();

}
