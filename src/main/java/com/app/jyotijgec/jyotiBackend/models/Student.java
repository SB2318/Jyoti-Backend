package com.app.jyotijgec.jyotiBackend.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Index;
import jakarta.persistence.Table;

@Entity
@Table(name = "student", indexes = { @Index(name = "idx_student_email", columnList = "email"),
		@Index(name = "idx_student_school", columnList = "school") })
public class Student extends BaseEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(nullable = false, length = 100)
	private String name;

	@Column(nullable = false, unique = true, length = 15)
	private String phoneNo;

	@Column(nullable = true, unique = true, length = 150)
	private String email;

	@Column(name = "class_name", nullable = false, length = 50)
	private String className;

	@Column(nullable = false, length = 150)
	private String school;

	@Column(name = "father_name", nullable = true, length = 100)
	private String fatherName;

	@Column(name = "mother_name", nullable = true, length = 100)
	private String motherName;

	@Column(name = "earning_members", nullable = true)
	private Integer noOfEarningMembers;

	@Column(name = "monthly_income", nullable = true)
	private Double monthlyIncome;

	@Column(name = "yearly_income", nullable = true)
	private Double yearlyIncome;

	@Column(name = "family_members", nullable = true)
	private Integer noOfFamilyMembers;

	@Column(name = "student_members", nullable = true)
	private Integer noOfStudentsInFamily;

	@Column(name = "children_need_education", nullable = true)
	private Integer noOfChildrenNeedEducation;

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

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public String getMotherName() {
		return motherName;
	}

	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}

	public Integer getNoOfEarningMembers() {
		return noOfEarningMembers;
	}

	public void setNoOfEarningMembers(Integer noOfEarningMembers) {
		this.noOfEarningMembers = noOfEarningMembers;
	}

	public Double getMonthlyIncome() {
		return monthlyIncome;
	}

	public void setMonthlyIncome(Double monthlyIncome) {
		this.monthlyIncome = monthlyIncome;
	}

	public Double getYearlyIncome() {
		return yearlyIncome;
	}

	public void setYearlyIncome(Double yearlyIncome) {
		this.yearlyIncome = yearlyIncome;
	}

	public Integer getNoOfFamilyMembers() {
		return noOfFamilyMembers;
	}

	public void setNoOfFamilyMembers(Integer noOfFamilyMembers) {
		this.noOfFamilyMembers = noOfFamilyMembers;
	}

	public Integer getNoOfStudentsInFamily() {
		return noOfStudentsInFamily;
	}

	public void setNoOfStudentsInFamily(Integer noOfStudentsInFamily) {
		this.noOfStudentsInFamily = noOfStudentsInFamily;
	}

	public Integer getNoOfChildrenNeedEducation() {
		return noOfChildrenNeedEducation;
	}

	public void setNoOfChildrenNeedEducation(Integer noOfChildrenNeedEducation) {
		this.noOfChildrenNeedEducation = noOfChildrenNeedEducation;
	}

}
