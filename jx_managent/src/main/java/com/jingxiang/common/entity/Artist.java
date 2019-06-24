package com.jingxiang.common.entity;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.jingxiang.common.entity.common.DataEntity;

public class Artist extends DataEntity{
	//姓名
	private String artistName;
	//简介
	private String info;
	//领域
	private String area;
	//头衔
	private String title;
	//合作内容
	private String colContent;
	//合作时间
	private Date colDate;
	//相关证书
	private String relCetri;
    //授权图片
	private String authPhoto;
	//身份证正面
	private String idz;
	//身份证反面
	private String idf;
	//商品类别
	private  String commodityClass;

	private String openId;

	private String sessionKey;

	private String phone;
	private String password;

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

	public String getCommodityClass() {
		return commodityClass;
	}

	public void setCommodityClass(String commodityClass) {
		this.commodityClass = commodityClass;
	}

	public String getOpenId() {
		return openId;
	}

	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getSessionKey() {
		return sessionKey;
	}

	public void setSessionKey(String sessionKey) {
		this.sessionKey = sessionKey;
	}

	public String getArtistName() {
		return artistName;
	}

	public void setArtistName(String artistName) {
		this.artistName = artistName;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm",timezone = "GMT+8")
	public Date getColDate() {
		return colDate;
	}

	public void setColDate(Date colDate) {
		this.colDate = colDate;
	}

	public String getRelCetri() {
		return relCetri;
	}

	public void setRelCetri(String relCetri) {
		this.relCetri = relCetri;
	}

	public String getAuthPhoto() {
		return authPhoto;
	}

	public void setAuthPhoto(String authPhoto) {
		this.authPhoto = authPhoto;
	}

	public String getIdz() {
		return idz;
	}

	public void setIdz(String idz) {
		this.idz = idz;
	}

	public String getIdf() {
		return idf;
	}

	public void setIdf(String idf) {
		this.idf = idf;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getColContent() {
		return colContent;
	}

	public void setColContent(String colContent) {
		this.colContent = colContent;
	}



}
