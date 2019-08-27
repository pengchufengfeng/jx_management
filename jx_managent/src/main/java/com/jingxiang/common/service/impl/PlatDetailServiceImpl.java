package com.jingxiang.common.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jingxiang.common.dao.PlatDetailMapper;
import com.jingxiang.common.dao.PlatMapper;
import com.jingxiang.common.entity.Plat;
import com.jingxiang.common.entity.PlatDetail;
import com.jingxiang.common.service.CrudService;
import com.jingxiang.common.service.PlatDetailService;
import com.jingxiang.common.service.PlatService;

@Service
@Transactional
public class PlatDetailServiceImpl extends CrudService<PlatDetailMapper,PlatDetail> implements PlatDetailService  {
  
	@Autowired
    private PlatDetailMapper platDetailMapper;

	@Override
	public List<PlatDetail> findAllActivity(String id) {
		// TODO Auto-generated method stub
		return  platDetailMapper.findAllActivity(id);
	}
	
	
}
