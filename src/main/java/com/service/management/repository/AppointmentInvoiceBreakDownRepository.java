package com.service.management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.service.management.entity.AppointmentInvoiceBreakDown;

@Repository
public interface AppointmentInvoiceBreakDownRepository extends JpaRepository<AppointmentInvoiceBreakDown, Integer>{

}
