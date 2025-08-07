package com.service.management.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.service.management.entity.VehicleFavorite;

public interface VehicleFavoriteRepository extends JpaRepository<VehicleFavorite, Integer> {
	List<VehicleFavorite> findByVehicleOwnerId(Integer ownerId);

	boolean existsByVehicleOwnerIdAndFavoriteVehicleId(Integer ownerId, Integer favoriteId);
}