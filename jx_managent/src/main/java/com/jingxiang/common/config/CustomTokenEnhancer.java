package com.jingxiang.common.config;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.security.oauth2.common.DefaultOAuth2AccessToken;
import org.springframework.security.oauth2.common.OAuth2AccessToken;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.security.oauth2.provider.token.TokenEnhancer;

import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.jingxiang.common.entity.User;
import com.jingxiang.common.service.UserService;

public class CustomTokenEnhancer implements TokenEnhancer{
	private com.jingxiang.common.service.UserService userService;
	
	
	public CustomTokenEnhancer(UserService userService) {
		super();
		this.userService = userService;
	}


	@Override
	public OAuth2AccessToken enhance(OAuth2AccessToken accessToken, OAuth2Authentication authentication) {
			
		   User u = userService.findbyuserName(authentication.getName());
		  Map<String, Object> map=new HashMap<>();
		  map.put("id", u.getId());
		  map.put("username", u.getUserName());
			map.put("resource",JSON.toJSONString(authentication.getAuthorities()));
		
		 ((DefaultOAuth2AccessToken) accessToken).setAdditionalInformation(map);
		return accessToken;
	}


	

}
