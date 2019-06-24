package com.jingxiang.common.dao;

import org.apache.ibatis.annotations.Mapper;

import com.jingxiang.common.dao.core.CrudDao;
import com.jingxiang.common.entity.Role;
@Mapper
public interface RoleMapper extends CrudDao<Role>{
   Role findPerByRole(String id);
}
