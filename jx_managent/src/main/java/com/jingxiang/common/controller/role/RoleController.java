package com.jingxiang.common.controller.role;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jingxiang.common.entity.Permission;
import com.jingxiang.common.entity.Role;
import com.jingxiang.common.service.RoleService;

@RestController
@RequestMapping("/role")
public class RoleController {
	@Autowired
	private RoleService roleService;
	public RoleController() {
		// TODO Auto-generated constructor stub
	}
	@PostMapping("/getPermissionList")
	public List<Permission> getPermissionList(@RequestParam("id") String id){
		List<Permission> permissionList = null;
		Role role = roleService.findPerByRole(id);
		permissionList = role.getPermissionList();
		return permissionList;
		
	}

}
