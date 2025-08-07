package com.service.management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.service.management.entity.AuthenticationDetails;

@Repository
public interface AuthenticationDetailsRepository extends JpaRepository<AuthenticationDetails, Integer>{

	AuthenticationDetails findByUserName(String username);

}
