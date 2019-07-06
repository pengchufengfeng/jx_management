package com.jingxiang.common.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configurers.ResourceServerSecurityConfigurer;

/**
 * 
 * */
@Configuration
@EnableResourceServer
public class ResourceServerConfiguation  extends ResourceServerConfigurerAdapter{
		@Value("${security.jwt.key:123456}")
		private String jwtSigningkey;
	@Override 
	public void configure(HttpSecurity http) throws Exception {
		http.httpBasic().disable();
	}
	
	@Override
	public void configure(ResourceServerSecurityConfigurer resources) throws Exception {
	}
}
