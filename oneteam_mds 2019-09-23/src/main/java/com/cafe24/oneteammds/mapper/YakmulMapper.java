package com.cafe24.oneteammds.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.cafe24.oneteammds.vo.Yakmul;
import com.cafe24.oneteammds.vo.Yakmulh;



@Mapper
public interface YakmulMapper {

	// 병원
		public List<Yakmulh> getYakmulhList();
		
		public Yakmulh getYakmulhById(String patientId);
		  
		public int getYakmulRegist(Yakmul yakmul);
		
		// 시스템DB 
		public List<Yakmul> getYakmuldbList();
		
}
