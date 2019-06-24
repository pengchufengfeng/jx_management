package com.jingxiang.common.entity.request;

public class OperationRequest {


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
	private String platid;
	private String platName;
	private String activityName;
	private String currentActivity;
	private String artistid;
	//产品名称
	private String commodityName;


	public String getArtistid() {
		return artistid;
	}

	public void setArtistid(String artistid) {
		this.artistid = artistid;
	}
	public String getCommodityName() {
		return commodityName;
	}
	public void setCommodityName(String commodityName) {
		this.commodityName = commodityName;
	}
}
