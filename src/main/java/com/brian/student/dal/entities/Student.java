package com.brian.student.dal.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="studenttab")
public class Student {
	
	@Id // in the db id is id
	@GeneratedValue(strategy=GenerationType.IDENTITY) // because it is AUTO_INCREMENT in db
	private Long id;
	@Column(name="sname") // because in the db name is sname we need to do this
	private String name;
	@Column(name="scourse")
	private String course;
	@Column(name="sfee")
	private Double fee;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public Double getFee() {
		return fee;
	}

	public void setFee(Double fee) {
		this.fee = fee;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", course=" + course + ", fee=" + fee + "]";
	}
	

}
