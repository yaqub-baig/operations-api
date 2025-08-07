package com.service.management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.service.management.entity.JobCardStatusActivity;

@Repository
public interface JobcardStatusActivityRepository extends JpaRepository<JobCardStatusActivity, Integer>{

	

}
