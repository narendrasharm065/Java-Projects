package com.got.service;

import java.util.List;

import com.got.entity.BattleEntity;

public interface ILocationService {

	public List<BattleEntity> getListOfPlaces();

	public int getCountOfPlaces();
}
