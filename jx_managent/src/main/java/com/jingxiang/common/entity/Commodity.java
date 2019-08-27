package com.jingxiang.common.entity;

import org.springframework.web.multipart.MultipartFile;

import com.jingxiang.common.entity.common.DataEntity;

public class Commodity extends DataEntity {
 
	//商品编号
	private String commodityNum;
	//商品名称
	private String commodityName;
	//分类名称
    private String className;
    //分类编号
    private String classNum;
    //尺寸
    private String commodityScale;
    //艺术家
    private Artist artist;
    //艺术家Id
    private String artistId;
    //艺术家名称
    private String artistName;
  

	//工艺
    private String way;
    //产地
    private String palace;
    //泥土
    private String dust;
    //温度
    private String temput;
    //简介
    private String note;
    //图片
    private String photo;
    //商品库存
    private int commodityStock;
    //商品上架量
    private int commodityShelf;
    
    //商品状态
    private String commodityStatus;
    


	public String getCommodityNum() {
		return commodityNum;
	}




	public void setCommodityNum(String commodityNum) {
		this.commodityNum = commodityNum;
	}




	public String getCommodityName() {
		return commodityName;
	}




	public void setCommodityName(String commodityName) {
		this.commodityName = commodityName;
	}




	public String getClassName() {
		return className;
	}




	public void setClassName(String className) {
		this.className = className;
	}




	public String getCommodityScale() {
		return commodityScale;
	}




	public void setCommodityScale(String commodityScale) {
		this.commodityScale = commodityScale;
	}




	

	public String getWay() {
		return way;
	}




	public void setWay(String way) {
		this.way = way;
	}




	public String getPalace() {
		return palace;
	}




	public void setPalace(String palace) {
		this.palace = palace;
	}




	public String getDust() {
		return dust;
	}




	public void setDust(String dust) {
		this.dust = dust;
	}




	public String getTemput() {
		return temput;
	}




	public void setTemput(String temput) {
		this.temput = temput;
	}




	public String getNote() {
		return note;
	}




	public void setNote(String note) {
		this.note = note;
	}




	


	public String getCommodityStatus() {
		return commodityStatus;
	}




	public void setCommodityStatus(String commodityStatus) {
		this.commodityStatus = commodityStatus;
	}




	public String getPhoto() {
		return photo;
	}




	public void setPhoto(String photo) {
		this.photo = photo;
	}




	public Artist getArtist() {
		return artist;
	}




	public void setArtist(Artist artist) {
		this.artist = artist;
	}




	public String getArtistId() {
		return artistId;
	}




	public void setArtistId(String artistId) {
		this.artistId = artistId;
	}
	
	
	
	
	 public String getArtistName() {
			return artistName;
		}




	public void setArtistName(String artistName) {
		this.artistName = artistName;
	}




	public int getCommodityStock() {
		return commodityStock;
	}




	public void setCommodityStock(int commodityStock) {
		this.commodityStock = commodityStock;
	}




	public int getOmmodityShelf() {
		return commodityShelf;
	}




	public void setOmmodityShelf(int ommodityShelf) {
		this.commodityShelf = ommodityShelf;
	}




	public int getCommodityShelf() {
		return commodityShelf;
	}




	public void setCommodityShelf(int commodityShelf) {
		this.commodityShelf = commodityShelf;
	}




	public String getClassNum() {
		return classNum;
	}




	public void setClassNum(String classNum) {
		this.classNum = classNum;
	}




}
