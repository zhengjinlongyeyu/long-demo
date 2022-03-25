package com.constant;



/**
 * 
 * @description  常量类
 * @author Jeff
 * @date 2022年3月4日
 */
public class Constant {
	// 成功code
	public static final Integer SUCCESS_CODE = 200;
	public static final String SUCCESS_MSG = "操作成功";
	// 异常code
	public static final Integer ERROR_CODE = 10000;
	public static final Integer WARN_CODE = 500;
	public static final Integer WARN_CODES = 600;
	public static final String ERROR_MSG = "FAILED";
	public static final Integer PARAMETER_NULL = Integer.valueOf(10001);
	public static final Integer PARAMETER_ERROR = Integer.valueOf(10002);
	public static final Integer PARAMETER_INVALID = Integer.valueOf(10003);
	public static final Integer REQUEST_ERROR = Integer.valueOf(10004);
	public static final Integer DATABASE_ERROR = Integer.valueOf(10005);
	public static final String PARAMS_ERROR_CODE_NAME = "参数错误";


	/**
	 * AJAX返回使用常量： message
	 */
	public static final String RETURN_DATA_MESSAGE = "message";
	
	/**
	 * 通用数据默认状态 -- AJAX返回成功
	 */
	public static final String RETURN_DATA_SUCCESS = "success";

	/**
	 * 通用数据默认状态 -- AJAX返回失败
	 */
	public static final String RETURN_DATA_ERROR = "error";
}
