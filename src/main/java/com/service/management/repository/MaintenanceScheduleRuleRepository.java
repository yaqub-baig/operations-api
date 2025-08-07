package com.service.management.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.service.management.entity.MaintenanceScheduleRule;

public interface MaintenanceScheduleRuleRepository extends JpaRepository<MaintenanceScheduleRule, Integer> {
    Optional<MaintenanceScheduleRule> findByMakeAndModelAndIsActiveTrue(String make, String model);
}