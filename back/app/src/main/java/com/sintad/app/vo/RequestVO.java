package com.sintad.app.vo;

import java.io.Serializable;
import java.util.List;
import com.sintad.app.vo.OrderSortVO;

public class RequestVO implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private List<FilterVO> filters;

	private OrderSortVO order;

	public RequestVO() {
	}

	public RequestVO(List<FilterVO> filters) {
		this.filters = filters;
	}

	public List<FilterVO> getFilters() {
		return filters;
	}

	public void setFilters(List<FilterVO> filters) {
		this.filters = filters;
	}

	public OrderSortVO getOrder() {
		return order;
	}

	public void setOrder(OrderSortVO order) {
		this.order = order;
	}


}
