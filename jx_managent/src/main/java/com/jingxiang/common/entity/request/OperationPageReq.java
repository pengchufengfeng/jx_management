package com.jingxiang.common.entity.request;

public class OperationPageReq {
	 /**
     * 页码
     */
    private int pageNum;
    /**
     * 每页条数
     */
    private int pageSize;
    /**
     * 排序字段
     */
    private String artistid;


    public String getArtistid() {
        return artistid;
    }

    public void setArtistid(String artistid) {
        this.artistid = artistid;
    }
  

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

   
	public OperationPageReq() {
		// TODO Auto-generated constructor stub
	}

}
