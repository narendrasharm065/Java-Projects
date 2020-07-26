/**
 * 
 */
package com.got.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.got.entity.BattleEntity;
import com.got.repository.BattleRepository;

/**
 * @author narendra
 *
 */
@Service
public class BattleService implements IBattleService {
	
	@Autowired
	BattleRepository battleRepository;

	@Override
	public BattleEntity getBattleDetails(long battleNumber) {
		return battleRepository.getBattleDetails(battleNumber);
	}
}
