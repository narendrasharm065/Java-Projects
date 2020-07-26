/**
 * 
 */
package com.got.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.got.entity.BattleEntity;

/**
 * @author narendra
 *
 */
@Repository
public interface BattleRepository extends JpaRepository<BattleEntity, Long> {

	@Query("SELECT b FROM BattleEntity b WHERE battleNumber=?1")
	public BattleEntity getBattleDetails(long battleNumber);
}
