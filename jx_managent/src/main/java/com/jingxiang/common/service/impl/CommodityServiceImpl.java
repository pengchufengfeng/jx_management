package com.jingxiang.common.service.impl;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jingxiang.common.dao.CommodityMapper;
import com.jingxiang.common.entity.Commodity;
import com.jingxiang.common.entity.common.Paging;
import com.jingxiang.common.service.CommodityService;
import com.jingxiang.common.service.CrudService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@Transactional

public class CommodityServiceImpl extends CrudService<CommodityMapper,Commodity> implements CommodityService {

	@Autowired
    private CommodityMapper commodityMapper;
    @Override
    public List<Commodity> findListCommodity(Commodity commodity) {
        return findList(commodity);
        
    }

    @Override
    public PageInfo<Commodity> findPageCommodity(Paging page, Commodity commodity) {
        PageHelper.startPage(page.getPageNum(), page.getPageSize(), page.getOrderBy());
        List<Commodity> list = findList(commodity);
        return new PageInfo<>(list);
    }

	@Override
	public Commodity getOneCommodity(String id) {
		// TODO Auto-generated method stub
		return get(id);
	}

	@Override
	public int deleteOneCommodity(String id ) {
		// TODO Auto-generated method stub
		deleteById(id);
		return 0;
	}

	@Override
	public int updateOneCommodity(Commodity commodity) {
		// TODO Auto-generated method stub
		save(commodity);
		return 0;
	}

	@Override
	public int addOneCommodity(Commodity commodity) {
		// TODO Auto-generated method stub
		save(commodity);
		return 0;
	}

	@Override
	public List<Commodity> findAllListCommodity() {
		// TODO Auto-generated method stub
		return findAllList();
	}

	public CommodityMapper getCommodityMapper() {
		return commodityMapper;
	}

	public void setCommodityMapper(CommodityMapper commodityMapper) {
		this.commodityMapper = commodityMapper;
	}

	@Override
	public String getClassNum(String className) {
		// TODO Auto-generated method stub
		return commodityMapper.getClassNum(className);
	}
    
}
