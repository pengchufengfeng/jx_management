package com.jingxiang.common.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.jingxiang.common.entity.Account;
import com.jingxiang.common.entity.Artist;
import com.jingxiang.common.entity.common.Paging;

public interface Accountservice {
	
	List<Account> findListAccount(Account account);//列表查询

	PageInfo<Account> findPageAccount(Paging page, Account account);//分页查询
	//获取结算详情
	Account  getOneAccount(String id);
	//删除结算
	int deleteOneAccount(String id);
	//更新结算
    int updateOneAccount(Account account);
	//新增结算
	int addOneAccount(Account account);
	//根据销售记录删除
	int deleteBySaleId(String saleId);
}
