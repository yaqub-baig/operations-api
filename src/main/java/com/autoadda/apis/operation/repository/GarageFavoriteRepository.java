package com.autoadda.apis.operation.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.autoadda.apis.operation.entity.GarageFavorite;

public interface GarageFavoriteRepository extends JpaRepository<GarageFavorite, Integer> {
	List<GarageFavorite> findByGarageOwnerId(Integer garageOwnerId);

	boolean existsByGarageOwnerIdAndFavoriteGarageId(Integer ownerId, Integer favoriteId);
}