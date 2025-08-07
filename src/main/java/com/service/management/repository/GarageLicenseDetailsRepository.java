package com.service.management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.service.management.entity.GarageLicenseDetails;

@Repository
public interface GarageLicenseDetailsRepository extends JpaRepository<GarageLicenseDetails, Integer> {

	GarageLicenseDetails findByGarageId(Integer garageId);

}
