/**
 * 
 */
package com.service.management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.service.management.entity.VehicleRegistration;

@Repository
public interface VehicleRegistrationDetailsRepository extends JpaRepository<VehicleRegistration, Integer> {}
