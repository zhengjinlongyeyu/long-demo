package com.util;

import java.io.Serializable;


/**
 * 定义公共结果类
 * 
 * @author zkx
 * @date 2019年4月12日
 * @version 1.0
 * @param <T>
 */

public class Result<T> implements Serializable {
	/**
	 * 版本号
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 返回代码
	 */
	private Integer code;
	/**
	 * 返回信息
	 */
	private String msg;
	/**
	 * 返回数据
	 */
	private T data;
	public Integer getCode() {
		return code;
	}
	public void setCode(Integer code) {
		this.code = code;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
