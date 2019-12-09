package com.jingxiang.common.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.jingxiang.common.entity.Plat;
import com.jingxiang.common.entity.PlatDetail;
import com.jingxiang.common.entity.common.Paging;

public interface PlatDetailService {
	
	//获取平台的所有活动
	List<PlatDetail> findAllActivity(String id);
    //获取平台细节id
	PlatDetail getOnePlatDetail(String id);
	//删除平台
	 int deleteOnePlatDetail(String id);
	//更新平台
	 int updateOnePlatDetail(PlatDetail platDetail);
	//新增平台
	 int addOnePlatDetail(PlatDetail platDetail); 
	//分页查询
	 PageInfo<PlatDetail> findPagePlat(Paging page, PlatDetail platDetail);
	//列表查询
	 List<PlatDetail> findListPlatDetail(PlatDetail platDetail);
}
