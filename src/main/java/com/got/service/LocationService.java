package com.got.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.got.entity.BattleEntity;
import com.got.repository.LocationRepository;

@Service
public class LocationService implements ILocationService {

	@Autowired
	LocationRepository locationRepository;

	@Override
	public List<BattleEntity> getListOfPlaces() {
		return locationRepository.getListOfLocationAndRegion();
	}

	@Override
	public int getCountOfPlaces() {
		return locationRepository.getCountOfPlaces();
	}
}
