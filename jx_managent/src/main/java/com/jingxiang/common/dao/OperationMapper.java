package com.jingxiang.common.dao;

import org.apache.ibatis.annotations.Mapper;

import com.jingxiang.common.dao.core.CrudDao;
import com.jingxiang.common.entity.Operation;
@Mapper
public interface OperationMapper extends CrudDao<Operation> {
	
	

}
