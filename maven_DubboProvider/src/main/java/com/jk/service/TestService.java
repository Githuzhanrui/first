package com.jk.service;

import java.util.List;
import java.util.Map;

import com.jk.model.User;

public interface TestService {

	List<User> playStr(String str);
	
	
	Map<String, Object> queryUser1(int start, int pageSize, User user);
}
