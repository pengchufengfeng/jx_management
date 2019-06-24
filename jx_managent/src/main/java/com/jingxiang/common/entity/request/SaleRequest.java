package com.jingxiang.common.entity.request;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class SaleRequest {
    private String commodityName;
    
    private String commodityNum;

    private String wayName;

    private String SortName;
    
    private String saleWay;
    //开始时间
    private Date startDate;
    
    //结束时间
    private Date endDate;

    private String artistId;

    public String getArtistId() {
        return artistId;
    }
    
    public String getSortName() {
        return SortName;
    }

    public void setSortName(String sortName) {
        SortName = sortName;
    }

    public String getWayName() {
        return wayName;
    }

    public void setWayName(String wayName) {
        this.wayName = wayName;
    }

    public String getCommodityName() {
        return commodityName;
    }

    public void setCommodityName(String commodityName) {
        this.commodityName = commodityName;
    }

	public String getSaleWay() {
		return saleWay;
	}

	public void setSaleWay(String saleWay) {
		this.saleWay = saleWay;
	}
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm",timezone = "GMT+8")
	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm",timezone = "GMT+8")
	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getCommodityNum() {
		return commodityNum;
	}

	public void setCommodityNum(String commodityNum) {
		this.commodityNum = commodityNum;
	}

	
}
