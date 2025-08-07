package com.service.management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.service.management.entity.AppointmentStatusActivity;

@Repository
public interface AppointmentStatusActivityRepository extends JpaRepository<AppointmentStatusActivity, Integer>{

}
