package com.jingxiang.common.service;

import java.util.List;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.github.pagehelper.PageInfo;
import com.jingxiang.common.entity.User;
import com.jingxiang.common.entity.common.Paging;

public interface UserService extends UserDetailsService{
	
	List<User> findListUser(User User);//列表查询

	PageInfo<User> findPageUser(Paging page, User user);//分页查询
	//获取所有用户
	List<User> findAllListUser();
	//获取用户详情
	User  getOneUser(String id);
	//删除用户
	 int deleteOneUser(String id);
	//保存用户
	 int saveOneUser(User user);
	 //登录
	 User findbynameandpassword(User user);
	 //获取角色列表
	 User findRolesBYUser(String id);
	 //根据姓名获取用户信息
	 User findbyuserName(String userName);
	 

}
