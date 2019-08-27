package com.jingxiang.common.controller.platDetail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jingxiang.common.entity.common.ResponseBean;
import com.jingxiang.common.service.PlatDetailService;


@RestController
@RequestMapping("/platDetail")
public class PlatDetailController {
	
	 @Autowired
     private PlatDetailService platDetailService;
	 @PostMapping("/findAllActivity")
	 public ResponseBean findAllActivity(@RequestParam("platId") String id,ResponseBean rsp){
			
			return rsp.setSuccess(platDetailService.findAllActivity(id));
	}

}
