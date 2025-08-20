package com.app.jyotijgec.jyotiBackend.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// DAO

import com.app.jyotijgec.jyotiBackend.models.Alum;

@Repository
public interface AlumRepository extends JpaRepository<Alum, Long> {

	Optional<Alum> findByEmail(String email);

	Optional<Alum> findByWhatsAppNo(String whatsAppNo);

	List<Alum> findByPassoutYear(Integer passoutYear);

	List<Alum> findByActiveTrue();

	List<Alum> findByActiveFalse();

	List<Alum> findByDepartmentId(Long departmentId);

	List<Alum> findByCourseId(Long courseId);

	List<Alum> findByCompanyIgnoreCase(String company);

	List<Alum> findByCityIgnoreCase(String city);

	List<Alum> findByStateIgnoreCase(String state);

	List<Alum> findByPassoutYearAndDepartmentId(Integer passoutYear, Long departmentId);

	List<Alum> findByCompanyAndJobRole(String company, String jobRole);

	List<Alum> findByNameContainingIgnoreCase(String namePart);

	List<Alum> findByJobRoleContainingIgnoreCase(String jobRolePart);
}
