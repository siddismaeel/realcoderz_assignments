package com.real;

public class Department {

	private int departmentId;
	private String departmentName;
	private String departmentHead;
	private String departmentDescription;
	public Department(int departmentId, String departmentName, String departmentHead, String departmentDescription) {
		super();
		this.departmentId = departmentId;
		this.departmentName = departmentName;
		this.departmentHead = departmentHead;
		this.departmentDescription = departmentDescription;
	}
	public int getDepartmentId() {
		return departmentId;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public String getDepartmentHead() {
		return departmentHead;
	}
	public String getDepartmentDescription() {
		return departmentDescription;
	}
	
	
}
