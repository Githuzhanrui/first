package com.jk.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.dubbo.config.annotation.Service;
import com.jk.dao.UserMapper;
import com.jk.model.User;

@Service
public class TestServiceImpl implements TestService {

	@Autowired
	UserMapper userMapper;
	
	public List<User> playStr(String str) {
		// TODO Auto-generated method stub
		return userMapper.playStr();
	}
//展示
	@Override
	public Map<String, Object> queryUser1(int start, int pageSize, User user) {
		// TODO Auto-generated method stub
		//总条数
		long toble=userMapper.queryInfoCount(user);
		//查询当前每页条数
		List<User> stus = userMapper.queryInfoPage(start,pageSize,user);
		Map<String,Object> map = new HashMap<>();
		map.put("toble", toble);
		map.put("rows", stus);
		return map;
	}


}
