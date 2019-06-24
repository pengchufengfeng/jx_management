package com.jingxiang.common.entity;

import javax.persistence.Table;

import com.jingxiang.common.entity.common.DataEntity;
@Table(name = "sys_user_role")
public class UserRole extends DataEntity {

	
	private String userId;
	private String roleId;
	public UserRole() {
		// TODO Auto-generated constructor stub
	}
	public String getRoleId() {
		return roleId;
	}
	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
