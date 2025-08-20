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
@Table(name = "member")
public class Member extends BaseEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "name", length = 150, nullable = false)
	private String fullName;

	@Column(name = "email", unique = true, nullable = false)
	private String email;

	@Column(name = "whatsappNo", nullable = false)
	private String whatsappNo;

	@Column(nullable = false, length = 15, unique = true)
	private String phoneNo;

	@Column(name = "graduationYear", nullable = false)
	private Integer graduationYear;

	public Integer getCurrentYear() {
		return currentYear;
	}

	public void setCurrentYear(Integer currentYear) {
		this.currentYear = currentYear;
	}

	public long getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(long rollNumber) {
		this.rollNumber = rollNumber;
	}

	@Column(name = "currentYear", nullable = false)
	private Integer currentYear;

	@Column(name = "roll_number", unique = true, nullable = false, length = 50)
	private long rollNumber;

	@OneToOne
	@JoinColumn(name = "document_id")
	private Document idProof;

	public Long getId() {
		return id;
	}

	public boolean isActive() {
		return active;
	}

	public Department getDepartment() {
		return department;
	}

	public Course getCourse() {
		return course;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	@Column(name = "active", nullable = false)
	private boolean active = false;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "department_id")
	private Department department;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "course_id")
	private Course course;

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getWhatsappNo() {
		return whatsappNo;
	}

	public void setWhatsappNo(String whatsappNo) {
		this.whatsappNo = whatsappNo;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public Integer getGraduationYear() {
		return graduationYear;
	}

	public void setGraduationYear(Integer graduationYear) {
		this.graduationYear = graduationYear;
	}

	public Document getIdProof() {
		return idProof;
	}

	public void setIdProof(Document idProof) {
		this.idProof = idProof;
	}

}