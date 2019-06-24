package com.jingxiang.common.controller.plat;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jingxiang.common.entity.Plat;
import com.jingxiang.common.entity.common.Paging;
import com.jingxiang.common.entity.common.ResponseBean;
import com.jingxiang.common.entity.request.PlatPageReq;
import com.jingxiang.common.entity.request.PlatRequest;
import com.jingxiang.common.service.PlatService;

@RestController
@RequestMapping("/plat")
public class PlatController {
    @Autowired
	private PlatService platService;

    @PostMapping("/findList")
	public ResponseBean findListPlat(@RequestBody PlatRequest platRequest,ResponseBean rsp){
		Plat plat = new Plat();//添加自定义查询
		plat.setWayName(platRequest.getWayName());
		return rsp.setSuccess(platService.findListPlat(plat));
	}//列表查询
    @PostMapping("/findAllList")
    public ResponseBean findAllListPlat(ResponseBean rsp){
    	return rsp.setSuccess(platService.findAllListPlat());
    }
    
	@PostMapping("/findPage")
	 public ResponseBean findPagePlat(@RequestBody PlatPageReq platPageReq,ResponseBean rsp){
		Plat plat = new Plat();
		Paging page = new Paging();
		page.setPageNum(platPageReq.getPageNum());
		page.setPageSize(platPageReq.getPageSize());
		return rsp.setSuccess(platService.findPagePlat(page,plat));
	}//分页查询
	
	@PostMapping("/getOne")
	public ResponseBean getOnePlat(@RequestParam("id") String id,ResponseBean rsp){
		return  rsp.setSuccess(platService.getOnePlat(id));
	}
	@PostMapping("/addOne")
	public ResponseBean addPlat(@RequestBody Plat plat,ResponseBean rsp){
		
		return rsp.setSuccess(platService.addOnePlat(plat));
	}
	@PostMapping("/deleteOne")
	public ResponseBean deletePlat(@RequestParam("id") String id,ResponseBean rsp){
		
		return rsp.setSuccess(platService.deleteOnePlat(id));
	}
	@PostMapping("/updateOne")
	public ResponseBean updatePlat(@RequestBody Plat plat,ResponseBean rsp){
		return rsp.setSuccess(platService.updateOnePlat(plat));
	}
	

}

