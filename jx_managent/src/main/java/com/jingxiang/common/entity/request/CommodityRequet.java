package com.jingxiang.common.entity.request;

public class CommodityRequet {
	//商品名称
		private String commodityName;
		private String artistName;
		//分类
	    private String className;
	    //商品状态
	    private String commodityStatus;
	    //艺术家id
	    private String artistId;
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
		public String getClassName() {
			return className;
		}
		public void setClassName(String className) {
			this.className = className;
		}
		public String getCommodityStatus() {
			return commodityStatus;
		}
		public void setCommodityStatus(String commodityStatus) {
			this.commodityStatus = commodityStatus;
		}
		public String getArtistId() {
			return artistId;
		}
		public void setArtistId(String artistId) {
			this.artistId = artistId;
		}
}
