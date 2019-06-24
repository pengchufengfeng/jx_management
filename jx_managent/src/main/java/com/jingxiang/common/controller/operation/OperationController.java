package com.jingxiang.common.controller.operation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageInfo;
import com.jingxiang.common.entity.Operation;
import com.jingxiang.common.entity.common.Paging;
import com.jingxiang.common.entity.common.ResponseBean;
import com.jingxiang.common.entity.request.OperationPageReq;
import com.jingxiang.common.entity.request.OperationRequest;
import com.jingxiang.common.service.OperationService;

@RestController
@RequestMapping("/operation")
public class OperationController {
    @Autowired
	private OperationService operationService;

    @PostMapping("/findList")
	public List<Operation> findListoperation(@RequestBody OperationRequest operationRequest){
		Operation operation = new Operation();//添加自定义查询
		operation.setActivityName(operationRequest.getActivityName());
		operation.setPlatName(operationRequest.getPlatName());
		operation.setCurrentActivity(operationRequest.getCurrentActivity());
		operation.setPlatid(operationRequest.getPlatid());
		operation.setArtistid(operationRequest.getArtistid());
		return operationService.findListOperation(operation);
	}//列表查询
    
    
    @PostMapping("/findListByJx")
	public ResponseBean findListoperationByJx(@RequestBody OperationRequest operationRequest,ResponseBean rsp){
		Operation operation = new Operation();//添加自定义查询
		operation.setActivityName(operationRequest.getActivityName());
		operation.setPlatName(operationRequest.getPlatName());
		operation.setCurrentActivity(operationRequest.getCurrentActivity());
		operation.setPlatid(operationRequest.getPlatid());
		operation.setArtistid(operationRequest.getArtistid());
		return rsp.setSuccess(operationService.findListOperation(operation));
	}//列表查询  
    
    
    @PostMapping("/findAllList")
    public ResponseBean findAllListoperation(ResponseBean rsp){
    	return rsp.setSuccess(operationService.findAllListOperation());
    }

	@PostMapping("/findPage")
	PageInfo<Operation> findPageoperation(@RequestBody OperationPageReq operationPageReq){
		Operation operation = new Operation();
		operation.setArtistid(operationPageReq.getArtistid());
		Paging page = new Paging();
		page.setPageNum(operationPageReq.getPageNum());
		page.setPageSize(operationPageReq.getPageSize());
		return operationService.findPageOperation(page,operation);
	}//分页查询
	

	@PostMapping("/findPageByJx")
	public ResponseBean findPageoperationByJx(@RequestBody OperationPageReq operationPageReq,ResponseBean rsp){
		Operation operation = new Operation();
		operation.setArtistid(operationPageReq.getArtistid());
		Paging page = new Paging();
		page.setPageNum(operationPageReq.getPageNum());
		page.setPageSize(operationPageReq.getPageSize());
		return rsp.setSuccess(operationService.findPageOperation(page,operation));
	}//
	
	@PostMapping("/getOne")
	public ResponseBean getOneoperation(@RequestParam("id") String id,ResponseBean rsp){
		return rsp.setSuccess(operationService.getOneOperation(id));
	}
	
	@PostMapping("/addOne")
	public ResponseBean addoperation(@RequestBody Operation operation,ResponseBean rsp){
		
		return rsp.setSuccess(operationService.addOneOperation(operation));
	}
	@PostMapping("/deleteOne")
	public ResponseBean deleteoperation(@RequestParam("id")String id,ResponseBean rsp){
		
		return rsp.setSuccess(operationService.deleteOneOperation(id));
	}
	@PostMapping("/updateOne")
	public ResponseBean updateoperation(@RequestBody Operation operation,ResponseBean rsp){
		return rsp.setSuccess(operationService.updateOneOperation(operation));
	}
	

}
