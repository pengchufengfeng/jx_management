package com.jingxiang.common.entity;

import com.jingxiang.common.entity.common.DataEntity;

public class Permission extends DataEntity {
	
	private String permissionName;
	private String parentId;
	private String status;
	private String permissionCode;

	public Permission() {
		// TODO Auto-generated constructor stub
	}

	
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}


	public String getPermissionName() {
		return permissionName;
	}


	public void setPermissionName(String permissionName) {
		this.permissionName = permissionName;
	}


	public String getParentId() {
		return parentId;
	}


	public void setParentId(String parentId) {
		this.parentId = parentId;
	}


	public String getPermissionCode() {
		return permissionCode;
	}


	public void setPermissionCode(String permissionCode) {
		this.permissionCode = permissionCode;
	}



}
