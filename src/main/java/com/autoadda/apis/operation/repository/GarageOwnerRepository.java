package com.autoadda.apis.operation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.autoadda.apis.operation.entity.GarageOwner;

@Repository
public interface GarageOwnerRepository extends JpaRepository<GarageOwner, Integer> {

//	List<GarageOwner> findByGarageId(Integer garageId);
}
