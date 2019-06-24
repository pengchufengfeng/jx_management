package com.jingxiang.common.service;

import com.github.pagehelper.PageInfo;
import com.jingxiang.common.entity.Artist;
import com.jingxiang.common.entity.ArtistNewPassword;
import com.jingxiang.common.entity.common.Paging;

import java.util.List;

public interface ArtistService {


	List<Artist> findListArtist(Artist artist);//列表查询

	PageInfo<Artist> findPageArtist(Paging page, Artist artist);//分页查询
	//获取所有匠人
	List<Artist> findAllListArtist();
	//获取匠人详情
	Artist  getOneArtist(String id);
	//删除匠人
	 int deleteOneArtist(String id);
	//更新匠人
	 int updateOneArtist(Artist artist);
	//新增匠人
	 int addOneArtist(Artist artist);

	 //验证登录
	String login(Artist artist);

	//更新密码
	String updatePassword(ArtistNewPassword artistNewPassword);

}
