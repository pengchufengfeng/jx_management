package com.jingxiang.common.config;

import java.util.List;

import org.springframework.context.annotation.Configuration;
import org.springframework.core.MethodParameter;
import org.springframework.web.bind.support.WebDataBinderFactory;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.ModelAndViewContainer;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.jingxiang.common.entity.common.ResponseBean;




/**
 * Created by pcf on 2017/6/11.
 */
@Configuration
public class webAppConfig extends WebMvcConfigurerAdapter {
  
  @Override
	public void addArgumentResolvers(List<HandlerMethodArgumentResolver> argumentResolvers) {
	  
        argumentResolvers.add(new ResponseBeanArgumentResolver());
    }

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {

		// 文件磁盘图片url 映射
		// 配置server虚拟路径，handler为前台访问的目录，locations为files相对应的本地路径
		registry.addResourceHandler("/image/commodityPhoto/**").addResourceLocations("file:/www/jingxiang/commodityPhoto/temp/");
		registry.addResourceHandler("/image/artistPhoto/**").addResourceLocations("file:/www/jingxiang/artistPhoto/temp/");
		registry.addResourceHandler("/wechat/**").addResourceLocations("file:/www/jingxiang/wechatShow/");
		//registry.addResourceHandler("/image/artistPhoto/**").addResourceLocations("file:/www/jingxiang/artistPhoto");
		//registry.addResourceHandler("/image/commodityPhoto/**").addResourceLocations("file:D:/test/commodityPhoto/temp/");
	}


  
  
}
	
class ResponseBeanArgumentResolver  implements HandlerMethodArgumentResolver  {

	@Override
	public boolean supportsParameter(MethodParameter parameter) {
		
		return parameter.getParameterType().equals(ResponseBean.class);
	}

	@Override
	public Object resolveArgument(MethodParameter parameter, ModelAndViewContainer mavContainer,
			NativeWebRequest webRequest, WebDataBinderFactory binderFactory) throws Exception {
		
			return new ResponseBean();
		
	}

	
	
	
}

