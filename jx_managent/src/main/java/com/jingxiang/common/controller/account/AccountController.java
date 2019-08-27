package com.jingxiang.common.controller.account;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageInfo;
import com.jingxiang.common.entity.Account;
import com.jingxiang.common.entity.common.Paging;
import com.jingxiang.common.entity.common.ResponseBean;
import com.jingxiang.common.entity.request.AccountPageReq;
import com.jingxiang.common.entity.request.AccountRequest;
import com.jingxiang.common.service.Accountservice;

@RestController
@RequestMapping("/account")
public class AccountController {

	
	@Autowired
	private Accountservice accountService;
	 @PostMapping("/findListByJx")
	   	public ResponseBean findListArtistByJx(ResponseBean rsp){
	   		Account account = new Account();//添加自定义查询
	   		return rsp.setSuccess(accountService.findListAccount(account));
	   	}//列表查询
	 
	
	@PostMapping("/findPage")
		ResponseBean findPageArtist(@RequestBody AccountPageReq accountPageReq,ResponseBean rsp){
		Account account = new Account();
		Paging page = new Paging();
		page.setPageNum(accountPageReq.getPageNum());
		page.setPageSize(accountPageReq.getPageSize());
		return rsp.setSuccess(accountService.findPageAccount(page, account));
		}//分页查询
	
	@PostMapping("/addOne")
	public ResponseBean addAccount(@RequestBody Account account,ResponseBean rsp){
		
		return rsp.setSuccess(accountService.addOneAccount(account));
	}
	@PostMapping("/deleteOne")
	public ResponseBean deleteAccount(@RequestParam("id") String id,ResponseBean rsp){
		
		return rsp.setSuccess(accountService.deleteOneAccount(id));
	}
	@PostMapping("/updateOne")
	public ResponseBean updateAccount(@RequestBody Account account,ResponseBean rsp){
		return rsp.setSuccess(accountService.addOneAccount(account));
	}
	@PostMapping("/getOne")
	public ResponseBean updateAccount(@RequestParam("id") String id,ResponseBean rsp){
		return rsp.setSuccess(accountService.getOneAccount(id));
	}
	
}
