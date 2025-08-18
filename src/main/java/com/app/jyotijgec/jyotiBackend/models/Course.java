package com.app.jyotijgec.jyotiBackend.models;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "course")
public class Course extends BaseEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column(nullable = false, unique = true, length = 100)
	private String name;

	@ManyToMany
	@JoinTable(name = "course_department", joinColumns = @JoinColumn(name = "course_id"), inverseJoinColumns = @JoinColumn(name = "department_id"))
	private List<Department> departments = new ArrayList<>();

	@OneToMany(mappedBy = "course", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Alum> alums = new ArrayList<>();

	@OneToMany(mappedBy = "course", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<CommunityAdmin> admins = new ArrayList<>();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Department> getDepartments() {
		return departments;
	}

	public void setDepartments(List<Department> departments) {
		this.departments = departments;
	}

	public List<Alum> getAlums() {
		return alums;
	}

	public void setAlums(List<Alum> alums) {
		this.alums = alums;
	}

	public List<CommunityAdmin> getAdmins() {
		return admins;
	}

	public void setAdmins(List<CommunityAdmin> admins) {
		this.admins = admins;
	}
}