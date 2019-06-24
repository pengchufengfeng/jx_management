package com.jingxiang.common.service.impl;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jingxiang.common.dao.UserMapper;
import com.jingxiang.common.entity.User;
import com.jingxiang.common.entity.common.Paging;
import com.jingxiang.common.service.UserService;
import com.jingxiang.common.service.CrudService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@Transactional

public class UserServiceImpl extends CrudService<UserMapper,User> implements UserService {

	@Autowired
    private UserMapper UserMapper;
    @Override
    public List<User> findListUser(User user) {
        return findList(user);
    }

    @Override
    public PageInfo<User> findPageUser(Paging page, User user) {
        PageHelper.startPage(page.getPageNum(), page.getPageSize(), page.getOrderBy());
        List<User> list = findList(user);
        return new PageInfo<>(list);
    }

	@Override
	public User getOneUser(String id) {
		// TODO Auto-generated method stub
		
		return get(id);
	}

	@Override
	public int deleteOneUser(String id) {
		// TODO Auto-generated method stub
		deleteById(id);
		return 0;
	}

	@Override
	public List<User> findAllListUser() {
		// TODO Auto-generated method stub
		return findAllList();
	}

	@Override
	public int saveOneUser(User user) {
		// TODO Auto-generated method stub
		save(user);
		return 0;
	}

	@Override
	public User findbynameandpassword(User user) {
		// TODO Auto-generated method stub
		return UserMapper.findbynameandpassword(user);
	}

	@Override
	public User findRolesBYUser(String id) {
		// TODO Auto-generated method stub
		
		return UserMapper.findRolesBYUser(id);
	}

	@Override
	public User findbyuserName(String userName) {
		// TODO Auto-generated method stub
		return UserMapper.findbyuserName(userName);
	}
    
}
