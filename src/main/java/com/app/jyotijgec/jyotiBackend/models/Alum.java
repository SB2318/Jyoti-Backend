package com.app.jyotijgec.jyotiBackend.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "alum") // Alumni Association
public class Alum extends BaseEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column(nullable = false, length = 100)
	private String name;

	@Column(nullable = false, unique = true, length = 150)
	private String email;

	@Column(nullable = true, unique = true, length = 150)
	private String phoneNo;

	@Column(nullable = false, unique = true, length = 150)
	private String whatsAppNo;

	@Column(nullable = false)
	private int passoutYear;

	@Column(nullable = false, length = 1000)
	private String jobRole;

	@Column(nullable = true, length = 1000)
	private String company;

	@Column(nullable = true, length = 1000)
	private String addresss;

	@Column(nullable = true, length = 1000)
	private String country;

	@Column(nullable = true, length = 1000)
	private String state;

	@Column(nullable = true, length = 1000)
	private String city;

	@OneToOne
	@JoinColumn(name = "document_id")
	private Document document;

	@Column(nullable = false)
	private boolean active = false;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "department_id")
	private Department department;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getWhatsAppNo() {
		return whatsAppNo;
	}

	public void setWhatsAppNo(String whatsAppNo) {
		this.whatsAppNo = whatsAppNo;
	}

	public int getPassoutYear() {
		return passoutYear;
	}

	public void setPassoutYear(int passoutYear) {
		this.passoutYear = passoutYear;
	}

	public String getJobRole() {
		return jobRole;
	}

	public void setJobRole(String jobRole) {
		this.jobRole = jobRole;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getAddresss() {
		return addresss;
	}

	public void setAddresss(String addresss) {
		this.addresss = addresss;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Document getDocument() {
		return document;
	}

	public void setDocument(Document document) {
		this.document = document;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "course_id")
	private Course course;

}