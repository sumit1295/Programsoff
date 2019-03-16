package com.capgemini.dev.jpa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="Employe_Table")
public class Employee 
{
	@Id
	@Column
private int eid;
	@Column
private String ename;
	@Column
private double salary;
	@Column
	private String loc;
	public String getloc() 
	{
	return loc;	
	}
	public void setLoc(String loc)
	{
		this.loc=loc;
	}
public int getEid() {
	return eid;
}
public void setEid(int eid) {
	this.eid = eid;
}

public String getEname() {
	return ename;
}

public void setEname(String ename) {
	this.ename = ename;
}

public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
@Override
public String toString() {
	return "Employee [eid=" + eid + ", name=" + ename + ", salary=" + salary + "]";
}
}


