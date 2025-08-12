package com.autoadda.apis.operation.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.autoadda.apis.operation.entity.VehicleFavorite;

public interface VehicleFavoriteRepository extends JpaRepository<VehicleFavorite, Integer> {
	List<VehicleFavorite> findByVehicleOwnerId(Integer ownerId);

	boolean existsByVehicleOwnerIdAndFavoriteVehicleId(Integer ownerId, Integer favoriteId);
}