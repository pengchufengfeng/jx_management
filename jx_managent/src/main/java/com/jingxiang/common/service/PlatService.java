package com.jingxiang.common.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.jingxiang.common.entity.Plat;
import com.jingxiang.common.entity.common.Paging;

public interface PlatService {
	
	
	List<Plat> findListPlat(Plat Plat);//列表查询

	PageInfo<Plat> findPagePlat(Paging page, Plat plat);//分页查询
	//获取所有平台
	List<Plat> findAllListPlat();
	//获取平台详情
	Plat  getOnePlat(String id);
	//删除平台
	 int deleteOnePlat(String id);
	//更新平台
	 int updateOnePlat(Plat plat);
	//新增平台
	 int addOnePlat(Plat plat); 

}
