package com.got.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.got.entity.BattleEntity;

@Repository
public interface LocationRepository extends JpaRepository<BattleEntity, Long> {
	
	@Query("SELECT location, region FROM BattleEntity b")
	public List<BattleEntity> getListOfLocationAndRegion();

	@Query("SELECT count(b) FROM BattleEntity b")
	public int getCountOfPlaces();
}
