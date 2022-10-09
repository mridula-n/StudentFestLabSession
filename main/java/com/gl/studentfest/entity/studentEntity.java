package com.gl.studentfest.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student")
public class studentEntity {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="studentid")
	private int studentid;
	
	@Column(name ="name")
	private String name ;
	
	@Column(name="department")
	private String department;
	
	@Column(name="country")
	private String country;

	public int getStudentid() {
		return studentid;
	}

	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public studentEntity(String name, String department, String country) {
		super();
		this.name = name;
		this.department = department;
		this.country = country;
	}

 

	public studentEntity() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "studentEntity [studentid=" + studentid + ", name=" + name + ", department=" + department + ", country="
				+ country + "]";
	}
	
	
	
}
