package com.springrest.springrest.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Student {
	private String Name;
	private String Dept;
	private int rollNumber;
	private long StudentId;
	private String Address;

	
	
	public Student(String name, String dept, int rollNumber, long StudentId, String address) {
		super();
		this.Name = name;
		this.Dept = dept;
		this.rollNumber = rollNumber;
		this.StudentId = StudentId;
		this.Address = address;
		
		
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getDept() {
		return Dept;
	}

	public void setDept(String dept) {
		Dept = dept;
	}

	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public long getStudentId() {
		return StudentId;
	}

	public void setStudentId( long StudentId) {
		this.StudentId = StudentId;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	/**
	 *
	 */
	@Override
	public String toString() {
		return "Student [Name=" + Name + ", Dept=" + Dept + ", rollNumber=" + rollNumber + ", StudentId=" + StudentId + ", Address="
				+ Address + "]";
	}

	
}
