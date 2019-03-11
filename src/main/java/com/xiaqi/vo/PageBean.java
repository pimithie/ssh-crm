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
	private Integer totalPages;
	
	//页面显示多少条记录(前台传)
	private Integer pageSize;
	
	//当前页数(前台传)
	private Integer currentPage;
	
	//当前页数据(dao查询)
	private List<T> list;

	public Long getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

	public Integer getTotalPages() {
		return totalPages;
	}

	public void setTotalPages(Integer totalPages) {
		this.totalPages = totalPages;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}

	public List<T> getList() {
		return list;
	}

	public void setList(List<T> list) {
		this.list = list;
	}

	@Override
	public String toString() {
		return "PageBean [totalCount=" + totalCount + ", totalPages=" + totalPages + ", pageSize=" + pageSize
				+ ", currentPage=" + currentPage + ", list=" + list + "]";
	}

	
}
