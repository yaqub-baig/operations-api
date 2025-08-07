/**
 * 
 */
package com.service.management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.service.management.entity.Model;

@Repository
public interface ModelRepository extends JpaRepository<Model, Integer> {
}
