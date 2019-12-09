package com.jingxiang.common.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jingxiang.common.dao.PlatDetailMapper;
import com.jingxiang.common.dao.PlatMapper;
import com.jingxiang.common.entity.Plat;
import com.jingxiang.common.entity.PlatDetail;
import com.jingxiang.common.entity.common.Paging;
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

	@Override
	public PlatDetail getOnePlatDetail(String id) {
		// TODO Auto-generated method stub
		return get(id);
	}

	@Override
	public int deleteOnePlatDetail(String id) {
		// TODO Auto-generated method stub
		deleteById(id);
		return 0;
	}

	@Override
	public int updateOnePlatDetail(PlatDetail platDetail) {
		// TODO Auto-generated method stub
		save(platDetail);
		return 0;
	}

	@Override
	public int addOnePlatDetail(PlatDetail platDetail) {
		// TODO Auto-generated method stub
		save(platDetail);
		return 0;
	}

	@Override
	public PageInfo<PlatDetail> findPagePlat(Paging page, PlatDetail platDetail) {
		// TODO Auto-generated method stub
		PageHelper.startPage(page.getPageNum(), page.getPageSize(), page.getOrderBy());
        List<PlatDetail> list = findList(platDetail);
        return new PageInfo<>(list);
	}

	
	@Override
	public List<PlatDetail> findListPlatDetail(PlatDetail platDetail) {
		// TODO Auto-generated method stub
		return findList(platDetail);
	}
	
	
}
