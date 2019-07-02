package com.jingxiang.common.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerEndpointsConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerSecurityConfigurer;
import org.springframework.security.oauth2.provider.token.DefaultTokenServices;
import org.springframework.security.oauth2.provider.token.TokenEnhancer;
import org.springframework.security.oauth2.provider.token.TokenEnhancerChain;
import org.springframework.security.oauth2.provider.token.TokenStore;
import org.springframework.security.oauth2.provider.token.store.JwtAccessTokenConverter;
import org.springframework.security.oauth2.provider.token.store.JwtTokenStore;

import com.jingxiang.common.service.UserService;



@Configuration
@EnableAuthorizationServer
public class AuthenticationServerConfiguration extends AuthorizationServerConfigurerAdapter {

	 	@Autowired
	    private AuthenticationManager authenticationManager;
	    @Autowired
	    PasswordEncoder passwordEncoder;
	    @Autowired
	    UserService userservice;
		@Value("${security.jwt.key:123456}")
		private String jwtSigningkey;
	    @Override
	    public void configure(AuthorizationServerSecurityConfigurer security)
	            throws Exception {
	       // security.passwordEncoder(passwordEncoder).and().authorizeRequests().anyRequest().permitAll();
	    }

	   @Override
	    public void configure(AuthorizationServerEndpointsConfigurer endpoints)
	            throws Exception {
		   TokenEnhancerChain tokenEnhancerChain = new TokenEnhancerChain();
	        tokenEnhancerChain.setTokenEnhancers(Arrays.asList(this.JwtAccessTokenConverter(),tokenEnhancer()));
	        endpoints
	                .authenticationManager(authenticationManager)
	                .tokenStore(tokenStore()).tokenEnhancer(tokenEnhancerChain);
	        ;
	    }

	    @Override
	    public void configure(ClientDetailsServiceConfigurer clients)
	            throws Exception {
	        clients.inMemory().withClient("edp")
	        .scopes("all").secret("edp").
	        authorizedGrantTypes("password", "authorization_code", "refresh_token");
	    }
	    @Bean
		public TokenStore tokenStore() {
			return new JwtTokenStore(JwtAccessTokenConverter());
			
		}
		
		/**
		 * 
		 * 采用对称加密jwt
		 * */
		@Bean
		public JwtAccessTokenConverter JwtAccessTokenConverter() {
			JwtAccessTokenConverter converter=new JwtAccessTokenConverter();
			converter.setSigningKey(jwtSigningkey);
			return converter;
			
			
		}
		@Bean
		@Primary
		public DefaultTokenServices tokenService() {
			DefaultTokenServices tokenService=new DefaultTokenServices();
			tokenService.setTokenStore(tokenStore());
			tokenService.setSupportRefreshToken(true);
			return tokenService;
		}
		 @Bean
		    public TokenEnhancer tokenEnhancer() {
		    	return new CustomTokenEnhancer(userservice);
		    	
		    }
	    }

