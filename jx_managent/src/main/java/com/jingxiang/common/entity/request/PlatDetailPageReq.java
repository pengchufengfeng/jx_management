package com.jingxiang.common.entity.request;

public class PlatDetailPageReq {

	
	 /**
     * 页码
     */
    private int pageNum;
    /**
     * 每页条数
     */
    private int pageSize;
  //平台id
  	private String platId;
  	//平台名称
  	private String platName;
  	//活动名称
  	private String activityName;
  	//平台服务费率
  	private Double platRate;
    
	public PlatDetailPageReq() {
		// TODO Auto-generated constructor stub
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getPageNum() {
		return pageNum;
	}

	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}

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
