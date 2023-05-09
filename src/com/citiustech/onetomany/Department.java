package com.citiustech.onetomany;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Department {
	
	@Id
	private int deptid;
	private String name;
	@OneToMany(mappedBy="dept")
	private Set<Employee> empset;
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Department(int deptid, String name, Set<Employee> empset) {
		super();
		this.deptid = deptid;
		this.name = name;
		this.empset = empset;
	}
	public int getDeptid() {
		return deptid;
	}
	public void setDeptid(int deptid) {
		this.deptid = deptid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Set<Employee> getEmpset() {
		return empset;
	}
	public void setEmpset(Set<Employee> empset) {
		this.empset = empset;
	}
	@Override
	public String toString() {
		return "Department [deptid=" + deptid + ", name=" + name + ", empset=" + empset + "]";
	}
	
	

}
