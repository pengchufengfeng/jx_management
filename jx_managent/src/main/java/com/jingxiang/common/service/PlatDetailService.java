package com.jingxiang.common.service;

import java.util.List;

import com.jingxiang.common.entity.PlatDetail;

public interface PlatDetailService {
	
	//获取平台的所有活动
	List<PlatDetail> findAllActivity(String id);
    //获取平台细节id
	//String getIdByNameandStyle()
}
