package com.jingxiang.common.service.impl;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jingxiang.common.dao.RoleMapper;
import com.jingxiang.common.dao.UserMapper;
import com.jingxiang.common.entity.Role;
import com.jingxiang.common.entity.User;
import com.jingxiang.common.entity.common.Paging;
import com.jingxiang.common.service.UserService;
import com.jingxiang.common.service.CrudService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashSet;
import java.util.List;
import java.util.Set;


@Service
@Transactional

public class UserServiceImpl extends CrudService<UserMapper,User> implements UserService {

	@Autowired
    private UserMapper UserMapper;
	@Autowired
	private RoleMapper roleMapper;
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
		
		return UserMapper.findRolesBYUser(id);
	}

	@Override
	public User findbyuserName(String userName) {
		return UserMapper.findbyuserName(userName);
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = UserMapper.findbyuserName(username);
		if(user==null) {
			throw new UsernameNotFoundException(username);
		}
		User findRolesBYUser = UserMapper.findRolesBYUser(user.getId());
		List<Role> roleList = findRolesBYUser.getRoleList();
				Set<GrantedAuthority> authorities=new HashSet<>();
				authorities.addAll(roleList);
				for(Role r:roleList) {
					Role role = roleMapper.findPerByRole(r.getId());
					authorities.addAll(role.getPermissionList());
				}
		return new org.springframework.security.core.userdetails.User(username, user.getPassword(), authorities);
	}

}
