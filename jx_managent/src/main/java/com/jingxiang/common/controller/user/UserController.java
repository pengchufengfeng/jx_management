package com.jingxiang.common.controller.user;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jingxiang.common.entity.Role;
import com.jingxiang.common.entity.User;
import com.jingxiang.common.entity.common.Paging;
import com.jingxiang.common.entity.common.ResponseBean;
import com.jingxiang.common.entity.request.UserPageReq;
import com.jingxiang.common.entity.request.UserRequest;
import com.jingxiang.common.service.UserService;

@RestController
@RequestMapping("/User")
public class UserController {
    @Autowired
	private UserService userService;
    
   
    @PostMapping("/findList")
    //多字段查询
	public ResponseBean findListUser(@RequestBody UserRequest UserRequest,ResponseBean rsp){
		User user = new User();//添加自定义查询
		user.setUserName(UserRequest.getUserName());
		return rsp.setSuccess(userService.findListUser(user));
	}
    
	@PostMapping("/findPage")
	public ResponseBean findPageUser(@RequestBody UserPageReq UserPageReq,ResponseBean rsp){
		User user = new User();
		Paging page = new Paging();
		page.setPageNum(UserPageReq.getPageNum());
		page.setPageSize(UserPageReq.getPageSize());
		return rsp.setSuccess(userService.findPageUser(page,user));
	}//分页查询
	
	@PostMapping("/getOne")
	public ResponseBean getOneUser(@RequestParam("id") String id,ResponseBean rsp){
		return rsp.setSuccess(userService.getOneUser(id));
	}
	@PostMapping("/updateOne")
	public ResponseBean updateUser(@RequestBody User User,ResponseBean rsp){
		return rsp.setSuccess(userService.saveOneUser(User));
	}
	@PostMapping("/addOne")
	public ResponseBean addUser(@RequestBody User User,ResponseBean rsp){
		return rsp.setSuccess(userService.saveOneUser(User));
	}
	
	@PostMapping("/deleteOne")
	public ResponseBean deleteUser(@RequestParam("id") String id,ResponseBean rsp){
		
		return rsp.setSuccess(userService.deleteOneUser(id));
	}
	 @PostMapping("/login")
	 public ResponseBean login( @RequestBody UserRequest  userRequest,ResponseBean responsebean,HttpSession session){
		 
		User user=new User();
		user.setUserName(userRequest.getUserName());
		user.setPassword(userRequest.getPassword());
		User find=userService.findbynameandpassword(user);
		
		if(find==null){
			responsebean.setError("用户名或者密码错误");
		}else{
			
			session.setAttribute("userId", user.getId());
			session.setAttribute("root", user.getRoot());
			responsebean.setSuccess("登陆成功");
		}
		return responsebean;
		
	 }
	 @PostMapping("/getRolesByUser")
	 public List<Role> getRolesByUser(@RequestParam("id") String id){
		 
		 List<Role> roleList = null;
		 User user=userService.findRolesBYUser(id);
		 roleList = user.getRoleList();
		 return roleList;
		 
	 }
	 
}

