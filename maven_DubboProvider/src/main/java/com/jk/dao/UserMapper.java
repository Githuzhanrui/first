package com.jk.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.jk.model.User;

public interface UserMapper {

	
	List<User> playStr();

	long queryInfoCount(User user);

	List<User> queryInfoPage(@Param("start") int start, @Param("pageSize") int pageSize, @Param("user") User user);
}
