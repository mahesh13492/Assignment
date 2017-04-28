package com.ByName;

public class Department {
	
	private String departmentName;
	private Employee employee;
	private Category category;
	
//	public Department(Employee employee,Category category )
//    {
//           this.employee=employee;
//           this.category=category;
//    }
	
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	
	public void show(){
		System.out.println("Department Name :" + departmentName);
		System.out.println("Employee NAme :" + employee.getEmpName());
		System.out.println("Employee NAme :" + employee.getEmpAdd());
		System.out.println("Category Name" + category.getCatName());
	}
}
