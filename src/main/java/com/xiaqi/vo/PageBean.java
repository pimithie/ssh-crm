package com.xiaqi.vo;

import java.util.List;

/**
 * 封装业务分页数据对象
 * @param <T> 业务数据对象类型
 */
public class PageBean<T> {
	
	//总记录数(dao查询)
	private Long totalCount;
	
	//总页数(计算)
	private int totalPages;
	
	//页面显示多少条记录(前台传)
	private int pageSize;
	
	//当前页数(前台传)
	private int currentPage;
	
	//当前页数据(dao查询)
	private List<T> list;

	
	
	public Long getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

	public int getTotalPages() {
		return totalPages;
	}

	public void setTotalPages(int totalPages) {
		this.totalPages = totalPages;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	public List<T> getList() {
		return list;
	}

	public void setList(List<T> list) {
		this.list = list;
	}
	
}
