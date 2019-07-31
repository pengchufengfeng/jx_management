package com.jingxiang.common.entity;

import com.jingxiang.common.entity.common.DataEntity;

public class PlatDetail  extends DataEntity{
	
	//平台id
	private String platId;
	private String platName;
	private String activityName;
	private Double platRate;
	public String getPlatId() {
		return platId;
	}
	public void setPlatId(String platId) {
		this.platId = platId;
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
	public Double getPlatRate() {
		return platRate;
	}
	public void setPlatRate(Double platRate) {
		this.platRate = platRate;
	}

}
