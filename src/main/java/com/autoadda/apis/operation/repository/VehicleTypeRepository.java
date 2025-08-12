/**
 * 
 */
package com.autoadda.apis.operation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.autoadda.apis.operation.entity.VehicleType;


@Repository
public interface VehicleTypeRepository extends JpaRepository<VehicleType, Integer> {
} 
