package com.autoadda.apis.operation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.autoadda.apis.operation.entity.FutureAppointment;
import com.autoadda.apis.operation.util.Status;

public interface FutureAppointmentRepository extends JpaRepository<FutureAppointment, Integer> {
	boolean existsByVehicleIdAndServiceTypeAndStatus(Integer vehicleId, String serviceType, Status status);
}