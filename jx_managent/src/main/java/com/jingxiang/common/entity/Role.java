package com.jingxiang.common.entity;

import java.util.List;

import javax.persistence.Table;

import org.springframework.security.core.GrantedAuthority;

import com.jingxiang.common.entity.common.DataEntity;

@Table(name = "sys_role")
public class Role extends DataEntity implements GrantedAuthority{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String roleName;
	private String roleCode;
	private List<Permission> permissionList;

	public Role() {
		// TODO Auto-generated constructor stub
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getRoleCode() {
		return roleCode;
	}

	public void setRoleCode(String roleCode) {
		this.roleCode = roleCode;
	}

	public List<Permission> getPermissionList() {
		return permissionList;
	}

	public void setPermissionList(List<Permission> permissionList) {
		this.permissionList = permissionList;
	}

	@Override
	public String getAuthority() {
		
		return this.getRoleCode();
	}

}
