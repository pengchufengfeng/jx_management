package com.jingxiang.common.dao;

import org.apache.ibatis.annotations.Mapper;

import com.jingxiang.common.dao.core.CrudDao;
import com.jingxiang.common.entity.Plat;
@Mapper
public interface PlatMapper extends CrudDao<Plat> {

}
