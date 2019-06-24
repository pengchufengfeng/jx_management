package com.jingxiang.common.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jingxiang.common.dao.RoleMapper;
import com.jingxiang.common.entity.Role;
import com.jingxiang.common.service.CrudService;
import com.jingxiang.common.service.RoleService;
@Service
@Transactional

public class RoleServiceImpl  extends CrudService<RoleMapper,Role> implements RoleService {

	@Autowired
    private RoleMapper roleMapper;
	public RoleServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Role findPerByRole(String id) {
		// TODO Auto-generated method stub
		return roleMapper.findPerByRole(id);
	}

}
