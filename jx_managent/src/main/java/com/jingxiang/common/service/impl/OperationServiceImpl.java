package com.jingxiang.common.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jingxiang.common.dao.OperationMapper;
import com.jingxiang.common.entity.Operation;
import com.jingxiang.common.entity.Plat;
import com.jingxiang.common.entity.common.Paging;
import com.jingxiang.common.service.CrudService;
import com.jingxiang.common.service.OperationService;
@Service
@Transactional
public class OperationServiceImpl extends CrudService<OperationMapper,Operation> implements OperationService  {

	public OperationServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Operation> findListOperation(Operation operation) {
		// TODO Auto-generated method stub
		
		return findList(operation);
	}

	@Override
	public PageInfo<Operation> findPageOperation(Paging page, Operation operation) {
		// TODO Auto-generated method stub
		 PageHelper.startPage(page.getPageNum(), page.getPageSize(), page.getOrderBy());
	        List<Operation> list = findList(operation);
	        return new PageInfo<>(list);
	}

	@Override
	public List<Operation> findAllListOperation() {
		// TODO Auto-generated method stub
		return findAllList();
	}

	@Override
	public Operation getOneOperation(String id) {
		// TODO Auto-generated method stub
		return get(id);
	}

	@Override
	public int deleteOneOperation(String id) {
		// TODO Auto-generated method stub
		deleteById(id);
		return 0;
	}

	@Override
	public int updateOneOperation(Operation operation) {
		// TODO Auto-generated method stub
		save(operation);
		return 0;
	}

	@Override
	public int addOneOperation(Operation operation) {
		// TODO Auto-generated method stub
		save(operation);
		return 0;
	}

}
