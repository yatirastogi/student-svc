package com.training.studentservice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity //mandatory to make table, name will be same as class
//@Table(name="STUD") //to change name to stud
public class Student {

	public Student() {	}
	public Student(long studId, String studName, int age, String grade) {
		super();
		this.studId = studId;
		this.studName = studName;
		this.age = age;
		this.grade = grade;
	}

	@Id //to make primary key
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long studId;
	private String studName;
	private int age;
	@Column (name="stud_grade")
	private String grade;
	
	
	
	public String getStudName() {
		return studName;
	}
	public void setStudName(String studName) {
		this.studName = studName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	
}