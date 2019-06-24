package com.jingxiang.common.controller.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import com.jingxiang.common.entity.User;
import com.jingxiang.common.entity.bean.ResponseBean;
import com.jingxiang.common.entity.request.UserRequest;
import com.jingxiang.common.expection.UnauthorizedException;
import com.jingxiang.common.service.UserService;
import com.jingxiang.common.util.JWTUtil;

@RestController
public class LoginController {
	
	@Autowired
	private UserService userService;
	public LoginController() {
		// TODO Auto-generated constructor stub
	}

	@GetMapping("/")
	public String index() {
		return "index";
	}
	@PostMapping("/login")
    public ResponseBean login(@RequestBody UserRequest userRequest)  {
        User user = userService.findbyuserName(userRequest.getUserName());
        if (user.getPassword().equals(userRequest.getPassword())) {
            return new ResponseBean(200, "Login success", JWTUtil.sign(userRequest.getUserName(), userRequest.getPassword()));
        } else {
            throw new UnauthorizedException();
        }
    }
	
	@RequestMapping(path = "/401")
    @ResponseStatus(HttpStatus.UNAUTHORIZED)
    public ResponseBean unauthorized() {
        return new ResponseBean(401, "Unauthorized", null);
    }

	

}
