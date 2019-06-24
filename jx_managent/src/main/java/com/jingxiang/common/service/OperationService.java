package com.jingxiang.common.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.jingxiang.common.entity.Operation;
import com.jingxiang.common.entity.common.Paging;

public interface OperationService  {

	List<Operation> findListOperation(Operation operation);//列表查询

	PageInfo<Operation> findPageOperation(Paging page, Operation operation);//分页查询
	//获取所有运营进度
	List<Operation> findAllListOperation();
	//获取运营进度详情
	Operation  getOneOperation(String id);
	//删除运营进度
	 int deleteOneOperation(String id);
	//更新运营进度
	 int updateOneOperation(Operation operation);
	//新增运营进度
	 int addOneOperation(Operation operation); 
}
