package com.jingxiang.common.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.jingxiang.common.dao.core.CrudDao;
import com.jingxiang.common.entity.PlatDetail;
@Mapper
public interface PlatDetailMapper  extends CrudDao<PlatDetail>{

	
	List<PlatDetail> findAllActivity(String id);
	String getIdByNameandStyle(String platName ,String activityName);
}
