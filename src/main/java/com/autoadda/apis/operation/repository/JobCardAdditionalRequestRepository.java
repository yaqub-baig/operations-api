package com.autoadda.apis.operation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.autoadda.apis.operation.entity.JobCardAdditionalRequest;

@Repository
public interface JobCardAdditionalRequestRepository extends JpaRepository<JobCardAdditionalRequest, Integer>{


}
