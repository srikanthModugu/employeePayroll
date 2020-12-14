package com.autoplant.empr.model;

public class EmplyoeeDO {

	
	private String name;
	private String gender;
	private String imagePath;
	private int salary;
	private String startDate;
	private String notes;
	private String department;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getImagePath() {
		return imagePath;
	}

	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "EmplyoeeDO [name=" + name + ", gender=" + gender + ", imagePath=" + imagePath + ", salary=" + salary
				+ ", startDate=" + startDate + ", notes=" + notes + ", department=" + department + "]";
	}
	
	
}
