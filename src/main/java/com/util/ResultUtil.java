package com.util;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.constant.Constant;

/**
 * 结果工具类
 * 
 * @author zkx
 * @date 2019年4月12日
 * @version 1.0
 */
public class ResultUtil {
	/**
	 * 成功时返回
	 * 
	 * @param msg
	 * @param obj
	 * @return
	 */
	
	/**
     * 返回成功结果
     * @param data
     * @return
     */
	 public static Result<Object> successPage(Object obj){
		 Result<Object> result = new Result<Object>();
		  Map<String, Object> res = new HashMap<>();
		  
		  if (obj instanceof Collection) {
			  result.setData(((List<?>)obj));
		    } else if (obj instanceof Page) {
		    	 Map<String, Object> ress = new HashMap<>();
		    	Page<?> pa = (Page<?>)obj;
		    	ress.put("List", pa.getRecords());
		    	ress.put("pageNum", pa.getPages());
		    	ress.put("showCount",pa.getSize() );
		    	ress.put("totalResult",Long.valueOf(pa.getTotal()));
		    	ress.put("currentPage", pa.getCurrent());
		    	result.setData(ress);
		    } 
	     
	    	result.setCode(Constant.SUCCESS_CODE);
			result.setMsg("成功");
	        return result; 
	  
	 }
	public static Result<Object> success(String msg, Object obj) {
		Result<Object> result = new Result<Object>();
		result.setCode(Constant.SUCCESS_CODE);
		result.setMsg(msg);
		result.setData(obj);
		return result;
	}

	/**
	 * 成功时返回，不需要返回数据
	 * 
	 * @param msg
	 * @return
	 */
	public static Result<Object> success(String msg) {
		return success(msg, null);
	}

	/**
	 * 失败时返回
	 * 
	 * @param code
	 * @param msg
	 * @return
	 */
	public static Result<Object> error(Integer code, String msg) {
		Result<Object> result = new Result<Object>();
		result.setCode(code);
		result.setMsg(msg);
		return result;
	}
}
