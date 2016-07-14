package com.flp.ems.domain;

public class Department {
	private String Department_id;
	private String Description;
	private String Name;
	
	public String getDepartment_id() {
		return Department_id;
	}
	public void setDepartment_id(String department_id) {
		Department_id = department_id;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	@Override
	public String toString() {
		return "Department [Department_id=" + Department_id + ", Description=" + Description + ", Name=" + Name + "]";
	}
}
