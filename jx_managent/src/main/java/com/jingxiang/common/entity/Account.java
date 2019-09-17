package com.jingxiang.common.entity;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.jingxiang.common.entity.common.DataEntity;

public class Account extends DataEntity{
	
	private String saleId;
	//销售平台结算价
	private double saleFinalPrice;
	//匠人结算价
	private double artistFinalPrice;
	//总结算额
	private double finalPrice;
	//折扣
	private double discount;
	//改价金额
	private double changePrice;
	//优惠金额
	private double reductPrice;
	//备注
	private  String note;
	//结算时间
	
	private Date countDate;
	
	//商品名称
	private String commodityName;
	//匠人名称
	private String artistName;
	//匠人服务率
	private String artistRate;
	
	//平台服务率
	private  String platRate;
	//销售额
	private double salePrice;
	//商品退款额
	private Double saleBackPrice;
	//商品实际销售额
	private Double saleFactPrice;
	//销售数量
	private double commodityAmount;
	//销售平台
	private String platName;
	//销售类型
	private String saleStyle;
	//销售单价
	private double prePrice;
	
	public String getSaleId() {
		return saleId;
	}
	public void setSaleId(String saleId) {
		this.saleId = saleId;
	}
	
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public double getArtistFinalPrice() {
		return artistFinalPrice;
	}
	public void setArtistFinalPrice(double artistFinalPrice) {
		this.artistFinalPrice = artistFinalPrice;
	}
	public double getFinalPrice() {
		return finalPrice;
	}
	public void setFinalPrice(double finalPrice) {
		this.finalPrice = finalPrice;
	}
	public double getSaleFinalPrice() {
		return saleFinalPrice;
	}
	public void setSaleFinalPrice(double saleFinalPrice) {
		this.saleFinalPrice = saleFinalPrice;
	}
	@JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
	public Date getCountDate() {
		return countDate;
	}
	public void setCountDate(Date countDate) {
		this.countDate = countDate;
	}
	public String getCommodityName() {
		return commodityName;
	}
	public void setCommodityName(String commodityName) {
		this.commodityName = commodityName;
	}
	public String getArtistName() {
		return artistName;
	}
	public void setArtistName(String artistName) {
		this.artistName = artistName;
	}
	public String getArtistRate() {
		return artistRate;
	}
	public void setArtistRate(String artistRate) {
		this.artistRate = artistRate;
	}
	public String getPlatRate() {
		return platRate;
	}
	public void setPlatRate(String platRate) {
		this.platRate = platRate;
	}
	public String getSaleStyle() {
		return saleStyle;
	}
	public void setSaleStyle(String saleStyle) {
		this.saleStyle = saleStyle;
	}
	public String getPlatName() {
		return platName;
	}
	public void setPlatName(String platName) {
		this.platName = platName;
	}
	public double getCommodityAmount() {
		return commodityAmount;
	}
	public void setCommodityAmount(double commodityAmount) {
		this.commodityAmount = commodityAmount;
	}
	public double getSalePrice() {
		return salePrice;
	}
	public void setSalePrice(double salePrice) {
		this.salePrice = salePrice;
	}
	public double getPrePrice() {
		return prePrice;
	}
	public void setPrePrice(double prePrice) {
		this.prePrice = prePrice;
	}
	public double getReductPrice() {
		return reductPrice;
	}
	public void setReductPrice(double reductPrice) {
		this.reductPrice = reductPrice;
	}
	public double getChangePrice() {
		return changePrice;
	}
	public void setChangePrice(double changePrice) {
		this.changePrice = changePrice;
	}
	public Double getSaleBackPrice() {
		return saleBackPrice;
	}
	public void setSaleBackPrice(Double saleBackPrice) {
		this.saleBackPrice = saleBackPrice;
	}
	public Double getSaleFactPrice() {
		return saleFactPrice;
	}
	public void setSaleFactPrice(Double saleFactPrice) {
		this.saleFactPrice = saleFactPrice;
	}

	
	

}
