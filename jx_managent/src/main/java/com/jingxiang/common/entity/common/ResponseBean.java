package com.jingxiang.common.entity.common;



public   class ResponseBean {
	private static int NOPWOER=3;
	private static int NOLOGIN=2;
	private static int SUCCESS =1;
	private static int ERROR = 0;
    private int  code;
	private Object data;
	private String msg="success";
	
	public Object getData() {
		return data;
	}
	protected void setData(Object data) {
		this.data = data;
	}
	/**
	 * 成功返回信息
	 * **/
	public ResponseBean setSuccess(Object data){
		setCode(SUCCESS);
		this.data=data;
		
		return this;
	}
	/**
	 * 失败返回信息
	 * **/
	public ResponseBean setError(String msg){
		setCode(ERROR);
		setMsg(msg);
		return this;
	}
	/**
	 * 未登录返回信息
	 * **/
	public ResponseBean setNoLogin(String msg){
		setCode(NOLOGIN);
		setMsg(msg);
		return this;
	}
	/**
	 * 无权限返回信息
	 * **/
	public ResponseBean setNoPower(String msg){
		setCode(NOPWOER);
		setMsg(msg);
		return this;
	}
	public int getCode() {
		return code;
	}
	protected void setCode(int code) {
		this.code = code;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	
}
