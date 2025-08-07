package com.service.management.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.service.management.entity.Referral;

public interface ReferralRepository extends JpaRepository<Referral, Integer> {
	Optional<Referral> findByReferralCode(String code);
}
