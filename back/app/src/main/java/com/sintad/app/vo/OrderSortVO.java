package com.sintad.app.vo;
import java.io.Serializable;

public class OrderSortVO {
	private static final long serialVersionUID = -2733944603027834379L;

	private String field;
	private String sort;

	public String getField() {
		return field;
	}

	public void setField(String field) {
		this.field = field;
	}

	public String getSort() {
		return sort;
	}

	public void setSort(String sort) {
		this.sort = sort;
	}
}
