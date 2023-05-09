package com.citiustech.onetoone;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity

public class Address {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int addid;
	private String city;
	private String state;
	private String country;
	@OneToOne(targetEntity=Employee.class,mappedBy="address")
	private Employee emp;
	@Override
	public String toString() {
		return "Address [addid=" + addid + ", city=" + city + ", state=" + state + ", country=" + country + ", emp="
				+ emp + "]";
	}
	public int getAddid() {
		return addid;
	}
	public void setAddid(int addid) {
		this.addid = addid;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public Employee getEmp() {
		return emp;
	}
	public void setEmp(Employee emp) {
		this.emp = emp;
	}
	public Address(int addid, String city, String state, String country, Employee emp) {
		super();
		this.addid = addid;
		this.city = city;
		this.state = state;
		this.country = country;
		this.emp = emp;
	}
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
}
