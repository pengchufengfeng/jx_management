package com.jingxiang.common.controller.platDetail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jingxiang.common.entity.Plat;
import com.jingxiang.common.entity.PlatDetail;
import com.jingxiang.common.entity.common.Paging;
import com.jingxiang.common.entity.common.ResponseBean;
import com.jingxiang.common.entity.request.PlatDetailPageReq;
import com.jingxiang.common.entity.request.PlatDetailRequest;
import com.jingxiang.common.entity.request.PlatPageReq;
import com.jingxiang.common.entity.request.PlatRequest;
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
	 @PostMapping("/getOne")
		public ResponseBean getOnePlat(@RequestParam("id") String id,ResponseBean rsp){
			return  rsp.setSuccess(platDetailService.getOnePlatDetail(id));
		}
		@PostMapping("/addOne")
		public ResponseBean addPlat(@RequestBody PlatDetail platDetail,ResponseBean rsp){
			
			return rsp.setSuccess(platDetailService.addOnePlatDetail(platDetail));
		}
		@PostMapping("/deleteOne")
		public ResponseBean deletePlat(@RequestParam("id") String id,ResponseBean rsp){
			
			return rsp.setSuccess(platDetailService.deleteOnePlatDetail(id));
		}
		@PostMapping("/updateOne")
		public ResponseBean updatePlat(@RequestBody PlatDetail platDetail,ResponseBean rsp){
			return rsp.setSuccess(platDetailService.updateOnePlatDetail(platDetail));
		}
		//分页查询
		@PostMapping("/findPage")
		 public ResponseBean findPagePlat(@RequestBody PlatDetailPageReq platDetailPageReq,ResponseBean rsp){
			PlatDetail platDetail = new PlatDetail();
			Paging page = new Paging();
			page.setPageNum(platDetailPageReq.getPageNum());
			page.setPageSize(platDetailPageReq.getPageSize());
			return rsp.setSuccess(platDetailService.findPagePlat(page,platDetail));
		}
		@PostMapping("/findList")
		public ResponseBean findListPlat(@RequestBody PlatDetailRequest platDetailRequest,ResponseBean rsp){
			PlatDetail platDetail = new PlatDetail();//添加自定义查询
			platDetail.setPlatName(platDetailRequest.getPlatName());
			return rsp.setSuccess(platDetailService.findListPlatDetail(platDetail));
		}
		
		

}
