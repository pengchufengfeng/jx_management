package com.jingxiang.common.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.jingxiang.common.entity.common.DataEntity;

import java.util.Date;

public class Sale extends DataEntity {
	
	
	
	//商品id
	private String commodityId;
	//商品名称
	private String commodityName;
	//商品编号
	private String commodityNum;
	//商品销售量
	private int commodityAmount;
	//销售平台
	private String saleWay;
	//商品销售价
	private Double salePrice;
	//商品结算价
	private Double finalPrice;
	//商品单价
	private Double prePrice;
	//销售日期
	private Date saleDate;
	//结算类型
	private String saleStyle;
    //商品类别
	private String className;
	//商品图片
	private String photo;
	//平台名称
	private String wayName;
	//查找开始时间
    private Date startDate;
    //结束时间
    private Date endDate;
    private String artistId;
    private String artistName;

	public String getArtistId() {
		return artistId;
	}

	public void setArtistId(String artistId) {
		this.artistId = artistId;
	}

	public String getWayName() {
		return wayName;
	}

	public void setWayName(String wayName) {
		this.wayName = wayName;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public Sale() {
		// TODO Auto-generated constructor stub
	}





	





	public String getCommodityId() {
		return commodityId;
	}





	public void setCommodityId(String commodityId) {
		this.commodityId = commodityId;
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





	public Double getSalePrice() {
		return salePrice;
	}





	public void setSalePrice(Double salePrice) {
		this.salePrice = salePrice;
	}


	public Double getFinalPrice() {
		return finalPrice;
	}

	public void setFinalPrice(Double finalPrice) {
		this.finalPrice = finalPrice;
	}

	public Double getPrePrice() {
		return prePrice;
	}





	public void setPrePrice(Double prePrice) {
		this.prePrice = prePrice;
	}




	@JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
	public Date getSaleDate() {
		return saleDate;
	}



	public void setSaleDate(Date saleDate) {
		this.saleDate = saleDate;
	}





	public String getSaleStyle() {
		return saleStyle;
	}





	public void setSaleStyle(String saleStyle) {
		this.saleStyle = saleStyle;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public int getCommodityAmount() {
		return commodityAmount;
	}

	public void setCommodityAmount(int commodityAmount) {
		this.commodityAmount = commodityAmount;
	}

	public String getCommodityNum() {
		return commodityNum;
	}

	public void setCommodityNum(String commodityNum) {
		this.commodityNum = commodityNum;
	}

	public String getArtistName() {
		return artistName;
	}

	public void setArtistName(String artistName) {
		this.artistName = artistName;
	}

}
