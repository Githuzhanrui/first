package com.jk.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jk.model.User;
import com.jk.service.TestService;

@Controller
@RequestMapping("user")
public class UserCon {
	@Autowired
	TestService testService;
	
	@RequestMapping("selList")
	public void selList(){
		List<User> playStr = testService.playStr("zhangsna");
		System.out.println(playStr);
	}
	//展示
	@RequestMapping("queryUser1")
	@ResponseBody
	public Object  queryUser1(int start,int pageSize,User user){
	 Map<String,Object>	map= testService.queryUser1(start,pageSize,user);
		return map;
	}
	

}
