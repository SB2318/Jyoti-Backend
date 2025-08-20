package com.app.jyotijgec.jyotiBackend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.jyotijgec.jyotiBackend.models.CommunityAdmin;

@Repository
public interface AdminRepository extends JpaRepository<CommunityAdmin, Long> {

	// TO BE COntinue

}