package com.jingxiang.common.service.impl;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jingxiang.common.dao.PlatMapper;
import com.jingxiang.common.entity.Plat;
import com.jingxiang.common.entity.common.Paging;
import com.jingxiang.common.service.PlatService;
import com.jingxiang.common.service.CrudService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@Transactional

public class PlatServiceImpl extends CrudService<PlatMapper,Plat> implements PlatService {

	@Autowired
    private PlatMapper platMapper;
    @Override
    public List<Plat> findListPlat(Plat plat) {
        return findList(plat);
    }

    @Override
    public PageInfo<Plat> findPagePlat(Paging page, Plat plat) {
        PageHelper.startPage(page.getPageNum(), page.getPageSize(), page.getOrderBy());
        List<Plat> list = findList(plat);
        return new PageInfo<>(list);
    }

	@Override
	public Plat getOnePlat(String id) {
		// TODO Auto-generated method stub
		return get(id);
	}

	@Override
	public int deleteOnePlat(String id ) {
		// TODO Auto-generated method stub
		deleteById(id);
		return 0;
	}

	@Override
	public int updateOnePlat(Plat plat) {
		// TODO Auto-generated method stub
		save(plat);
		return 0;
	}

	@Override
	public int addOnePlat(Plat plat) {
		// TODO Auto-generated method stub
		save(plat);
		return 0;
	}

	@Override
	public List<Plat> findAllListPlat() {
		// TODO Auto-generated method stub
		return findAllList();
	}
    
}
