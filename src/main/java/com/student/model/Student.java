package com.student.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "student")
public class Student 
{

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // for auto creation roll nos.
	private int rollNo;
	
	private String stud_name;
	private float stud_percentage;
	private String stud_branch;
	
	
	public Student() {
		super();
	}
	
	
	public Student(String stud_name, float stud_percentage, String stud_branch) {
		super();
		this.stud_name = stud_name;
		this.stud_percentage = stud_percentage;
		this.stud_branch = stud_branch;
	}


	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getStud_name() {
		return stud_name;
	}
	public void setStud_name(String stud_name) {
		this.stud_name = stud_name;
	}
	public float getStud_percentage() {
		return stud_percentage;
	}
	public void setStud_percentage(float stud_percentage) {
		this.stud_percentage = stud_percentage;
	}
	public String getStud_branch() {
		return stud_branch;
	}
	public void setStud_branch(String stud_branch) {
		this.stud_branch = stud_branch;
	}
	
	
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", stud_name=" + stud_name + ", stud_percentage=" + stud_percentage
				+ ", stud_branch=" + stud_branch + "]";
	}
	
	
}
