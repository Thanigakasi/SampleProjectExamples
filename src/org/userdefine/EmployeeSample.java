package org.userdefine;

public class EmployeeSample {
	
	private int Empid;
	private String Name;
	private long Phone;
	private float salary;
	
	public EmployeeSample(int empid, String name, long phone) {
		
		Empid = empid;
		Name = name;
		Phone = phone;
		
	}
	
	public int getEmpid() {
		return Empid;
	}
	public void setEmpid(int empid) {
		Empid = empid;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public long getPhone() {
		return Phone;
	}
	public void setPhone(long phone) {
		Phone = phone;
	}
	

	
}
