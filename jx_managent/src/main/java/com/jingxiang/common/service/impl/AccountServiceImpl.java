package com.jingxiang.common.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jingxiang.common.dao.AccountMapper;
import com.jingxiang.common.entity.Account;
import com.jingxiang.common.entity.common.Paging;
import com.jingxiang.common.service.Accountservice;
import com.jingxiang.common.service.CrudService;
@Service
@Transactional
public class AccountServiceImpl extends CrudService<AccountMapper,Account> implements Accountservice {


	@Autowired
	private AccountMapper accountMapper;
	
	@Override
	public PageInfo<Account> findPageAccount(Paging page, Account account) {
		// TODO Auto-generated method stub
	    PageHelper.startPage(page.getPageNum(), page.getPageSize(), page.getOrderBy());
        List<Account> accountList = findList(account);
        return new PageInfo<>(accountList);
	}

	@Override
	public Account getOneAccount(String id) {
		// TODO Auto-generated method stub
		
		return get(id);
	}

	@Override
	public int deleteOneAccount(String id) {
		// TODO Auto-generated method stub
		deleteById(id);
		return 0;
	}

	@Override
	public int updateOneAccount(Account account) {
		// TODO Auto-generated method stub
		save(account);
		return 0;
	}

	@Override
	public int addOneAccount(Account account) {
		// TODO Auto-generated method stub
		save(account);
		return 0;
	}

	@Override
	public List<Account> findListAccount(Account account) {
		// TODO Auto-generated method stub
		return findList(account);
	}

	@Override
	public int deleteBySaleId(String saleId) {
		// TODO Auto-generated method stub
		accountMapper.deleteBySaleId(saleId);
		return 0;
	}

	public AccountMapper getAccountMapper() {
		return accountMapper;
	}

	public void setAccountMapper(AccountMapper accountMapper) {
		this.accountMapper = accountMapper;
	}

}
