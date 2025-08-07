package com.service.management.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.service.management.entity.FutureAppointment;
import com.service.management.util.Status;

public interface FutureAppointmentRepository extends JpaRepository<FutureAppointment, Integer> {
	boolean existsByVehicleIdAndServiceTypeAndStatus(Integer vehicleId, String serviceType, Status status);
}