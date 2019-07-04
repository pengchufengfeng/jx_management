package com.jingxiang.common.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.jingxiang.common.entity.common.DataEntity;

import java.util.Date;

public class Operation extends DataEntity {

	
	//平台编号
	private String platid;
	//平台名称
	private String platName;
	//活动名称
	private String activityName;
	//活动进度
	private String currentActivity;
    //艺术家id
	private String artistid;
	//艺术家list
	//private List<String> artistidNameList;
	//艺术家名称
	private String artistName;
	//预计上线时间
	private Date preDate;
	//产品名称
	private String commodityName;
	//备注
	private String note;

	public String getArtistid() {
		return artistid;
	}

	public void setArtistid(String artistid) {
		this.artistid = artistid;
	}

	@JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
	public Date getPreDate() {
		return preDate;
	}

	public void setPreDate(Date preDate) {
		this.preDate = preDate;
	}

	public Operation() {
		// TODO Auto-generated constructor stub
	}

	public String getPlatid() {
		return platid;
	}

	public void setPlatid(String platid) {
		this.platid = platid;
	}

	public String getPlatName() {
		return platName;
	}

	public void setPlatName(String platName) {
		this.platName = platName;
	}

	public String getActivityName() {
		return activityName;
	}

	public void setActivityName(String activityName) {
		this.activityName = activityName;
	}

	public String getCurrentActivity() {
		return currentActivity;
	}

	public void setCurrentActivity(String currentActivity) {
		this.currentActivity = currentActivity;
	}

	public String getArtistName() {
		return artistName;
	}

	public void setArtistName(String artistName) {
		this.artistName = artistName;
	}

	public String getCommodityName() {
		return commodityName;
	}

	public void setCommodityName(String commodityName) {
		this.commodityName = commodityName;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	/*
	 * public List<String> getArtistidNameList() { return artistidNameList; }
	 * 
	 * public void setArtistidNameList(List<String> artistidNameList) {
	 * this.artistidNameList = artistidNameList; }
	 */
}
