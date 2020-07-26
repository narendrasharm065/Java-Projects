package com.got.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.got.entity.BattleEntity;
import com.got.service.IBattleService;
import com.got.service.ILocationService;

@RestController
@RequestMapping("/got")
public class GOTContoller {
	
	@Autowired
	ILocationService iLocationService; 

	@Autowired
	IBattleService iBattleService;

	@GetMapping("/msg")
	public String getHello() {
		return "Welcome to GOT World";
	}
	
	@GetMapping("/list")
	public List<BattleEntity> getListOfPlaces() {
		return iLocationService.getListOfPlaces();
	}

	@GetMapping("/count")
	public int getCountOfPlaces() {
		return iLocationService.getCountOfPlaces();
	}
	
	@GetMapping("/battleDetail/{battleNumber}")
	public BattleEntity getBattleDetail(@PathVariable int battleNumber) {
		return iBattleService.getBattleDetails(battleNumber);
	}
}
