package com.jingxiang.common.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.jingxiang.common.entity.common.DataEntity;

import java.util.Date;

public class ArtistNewPassword{


	private String phone;
	private String password;
	private String newPassword;

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNewPassword() {
		return newPassword;
	}

	public void setNewPassword(String newPassword) {
		this.newPassword = newPassword;
	}
}
