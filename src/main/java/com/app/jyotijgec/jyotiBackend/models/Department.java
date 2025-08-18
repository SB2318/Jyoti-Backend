package com.app.jyotijgec.jyotiBackend.models;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "department")
public class Department extends BaseEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column(nullable = false, unique = true, length = 100)
	private String name;

	@ManyToMany(mappedBy = "departments")
	private List<Course> courses = new ArrayList<>();

	@OneToMany(mappedBy = "departments", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Alum> alums = new ArrayList<>();

	@OneToMany(mappedBy = "course", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<CommunityAdmin> admins = new ArrayList<>();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Course> getCourses() {
		return courses;
	}

	public void setCourses(List<Course> courses) {
		this.courses = courses;
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