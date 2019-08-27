package com.jingxiang.common.dao;

import org.apache.ibatis.annotations.Mapper;

import com.jingxiang.common.dao.core.CrudDao;
import com.jingxiang.common.entity.Account;

@Mapper
public interface AccountMapper extends CrudDao<Account> {

	
	int deleteBySaleId(String saleId);
}
