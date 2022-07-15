package com.spring.mvc.dataTransfer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.mvc.dataTransfer.dao.DataTransferDao;

@Controller
public class DaoToMapper {
	
//	private DataTransferDao temp = new DataTransferDao();
	
	@Autowired
	private DataTransferDao dataTransferDao;

	// 예시 1) 단일 데이터 전송
	@RequestMapping(value = "/getInfo", method=RequestMethod.GET)
	public String getInfo() {
		
		dataTransferDao.memberInfo("user7");
		
		return "home";
	}
	
	// 예시 2) DTO 전송
	
	// 예시 3) Map 전송
	
}
