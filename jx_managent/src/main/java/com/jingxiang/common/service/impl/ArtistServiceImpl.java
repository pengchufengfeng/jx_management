package com.jingxiang.common.service.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jingxiang.common.dao.ArtistMapper;
import com.jingxiang.common.entity.Artist;
import com.jingxiang.common.entity.ArtistNewPassword;
import com.jingxiang.common.entity.common.Paging;
import com.jingxiang.common.service.ArtistService;
import com.jingxiang.common.service.CrudService;


@Service
@Transactional

public class ArtistServiceImpl extends CrudService<ArtistMapper,Artist> implements ArtistService {

	@Autowired
    private ArtistMapper artistMapper;
    @Override
    public List<Artist> findListArtist(Artist artist) {
        return findList(artist);
    }

    @Override
    public PageInfo<Artist> findPageArtist(Paging page, Artist artist) {
        PageHelper.startPage(page.getPageNum(), page.getPageSize(), page.getOrderBy());
        List<Artist> list = findList(artist);
        return new PageInfo<>(list);
    }

	@Override
	public Artist getOneArtist(String id) {
		// TODO Auto-generated method stub
		return get(id);

	}

	@Override
	public int deleteOneArtist(String id) {
		// TODO Auto-generated method stub
		deleteById(id);
		return 0;
	}

	@Override
	public int updateOneArtist(Artist artist) {
		// TODO Auto-generated method stub
		save(artist);
		return 0;
	}

	@Override
	public int addOneArtist(Artist artist) {
		// TODO Auto-generated method stub
		save(artist);
		return 0;
	}

	@Override
	public String login(Artist artist) {
    	Artist temp = new Artist();
    	temp.setPhone(artist.getPhone());
    	List<Artist> list = findList(temp);
    	if (list.isEmpty()){
    		return "账号不存在";
		}else {
    		Artist a = list.get(0);
    		if (a.getPassword().equals(artist.getPassword())){
    			return a.getId();
			}else {
    			return "密码错误";
			}
		}
	}

    @Override
    public String updatePassword(ArtistNewPassword artistNewPassword) {
		String phone = artistNewPassword.getPhone();
		String password = artistNewPassword.getPassword();
		String newPassword = artistNewPassword.getNewPassword();
		if (phone==null){
			return "账号为空";
		}else if(password==null){
			return "密码为空";
		}else if (newPassword==null){
			return "新密码为空";
		}else{
			Artist temp = new Artist();
			temp.setPhone(phone);
			temp.setPassword(password);
			List<Artist> artists = findList(temp);
			if (artists.size()==0){
				return "账号或旧密码错误";
			}else {
				Artist artist = artists.get(0);
				//重置密码
				Artist updateArtist = new Artist();
				updateArtist.setId(artist.getId());
				updateArtist.setPassword(newPassword);
				save(updateArtist);
				return "success";
			}
		}

    }

    @Override
	public List<Artist> findAllListArtist() {
		// TODO Auto-generated method stub
		return findAllList();
	}
    
}
