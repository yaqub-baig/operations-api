/**
 * 
 */
package com.service.management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.service.management.entity.VehicleType;


@Repository
public interface VehicleTypeRepository extends JpaRepository<VehicleType, Integer> {
} 
