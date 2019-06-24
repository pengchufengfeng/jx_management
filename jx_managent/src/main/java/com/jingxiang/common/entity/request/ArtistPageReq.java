package com.jingxiang.common.entity.request;

public class ArtistPageReq {


	 /**
     * 页码
     */
    private int pageNum;
    /**
     * 每页条数
     */
    private int pageSize;



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

}
