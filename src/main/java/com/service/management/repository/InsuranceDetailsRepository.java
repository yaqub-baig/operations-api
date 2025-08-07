/**
 * 
 */
package com.service.management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.service.management.entity.InsuranceDetails;

@Repository
public interface InsuranceDetailsRepository extends JpaRepository<InsuranceDetails, Integer> {}
