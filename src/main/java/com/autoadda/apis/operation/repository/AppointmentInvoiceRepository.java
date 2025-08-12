package com.autoadda.apis.operation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.autoadda.apis.operation.entity.AppointmentInvoice;

@Repository
public interface AppointmentInvoiceRepository extends JpaRepository<AppointmentInvoice, Integer>{

	AppointmentInvoice findByAppointmentId(Integer appointmentId);

}
