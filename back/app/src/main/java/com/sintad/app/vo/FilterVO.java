package com.sintad.app.vo;

public class FilterVO {
	private String entityName;
	private String field;
	private String value;
	private String operator;
	
	public FilterVO() {
	}
	
	public FilterVO(String field, String value, String operator) {
		super();
		this.field = field;
		this.value = value;
		this.operator = operator;
	}
	

	public FilterVO(String entityName, String field, String value, String operator) {
		super();
		this.entityName= entityName;
		this.field = field;
		this.value = value;
		this.operator = operator;
	}
	
	public FilterVO(String field, String value) {
		super();
		this.field = field;
		this.value = value;
		this.operator = "=";
	}
	
	public String getField() {
		return field;
	}
	public void setField(String field) {
		this.field = field;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public String getOperator() {
		return operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}

	public String getEntityName() {
		return entityName;
	}

	public void setEntityName(String entityName) {
		this.entityName = entityName;
	}

}
