package com.jingxiang.common.entity;

import java.util.List;

import com.jingxiang.common.entity.common.DataEntity;


public class User extends DataEntity {
    private String userName;
    private String password;
    private String root;
    private List<Role> roleList;// 一个用户具有多个角色

    
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRoot() {
		return root;
	}
	public void setRoot(String root) {
		this.root = root;
	}
	public List<Role> getRoleList() {
		return roleList;
	}
	public void setRoleList(List<Role> roleList) {
		this.roleList = roleList;
	}
   
    
}
