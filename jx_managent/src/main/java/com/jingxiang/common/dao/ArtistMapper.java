package com.jingxiang.common.dao;

import com.jingxiang.common.dao.core.CrudDao;
import com.jingxiang.common.entity.Artist;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ArtistMapper extends CrudDao<Artist> {

}
