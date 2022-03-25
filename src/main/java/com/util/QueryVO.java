package com.util;

/**
 * 
 * @description  分页查询封装类
 * @author Jeff
 * @date 2022年3月4日
 */
public class QueryVO<T> {
	
    private T object;
    
    private int  currentPage;
    
    private int  showCount;

	public T getObject() {
		return object;
	}

	public void setObject(T object) {
		this.object = object;
	}

	public int getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	public int getShowCount() {
		return showCount;
	}

	public void setShowCount(int showCount) {
		this.showCount = showCount;
	}
    
    
    
   
}
