package com.got.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="Attacker")
public class AttackerEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="Attacker_ID")
	private long attackerId;
	
	@ManyToOne
	@JoinColumn(name = "battle_number", referencedColumnName = "battle_number")
	@JsonIgnore
	private BattleEntity BattleEntity;
	
	@Column(name="Attacker_King")
	private String attackerKing;
	
	@Column(name="Attacker_1")
	private String attacker1;
	
	@Column(name="Attacker_2")
	private String attacker2;
	
	@Column(name="Attacker_3")
	private String attacker3;
	
	@Column(name="Attacker_4")
	private String attacker4;

	@Column(name="Attacker_Size")
	private long attackerSize;
	
	@Column(name="Attacker_Commander")
	private String attackerCommander;

	public long getAttackerId() {
		return attackerId;
	}

	public void setAttackerId(long attackerId) {
		this.attackerId = attackerId;
	}

	public BattleEntity getBattleEntity() {
		return BattleEntity;
	}

	public void setBattleEntity(BattleEntity battleEntity) {
		BattleEntity = battleEntity;
	}

	public String getAttackerKing() {
		return attackerKing;
	}

	public void setAttackerKing(String attackerKing) {
		this.attackerKing = attackerKing;
	}

	public String getAttacker1() {
		return attacker1;
	}

	public void setAttacker1(String attacker1) {
		this.attacker1 = attacker1;
	}

	public String getAttacker2() {
		return attacker2;
	}

	public void setAttacker2(String attacker2) {
		this.attacker2 = attacker2;
	}

	public String getAttacker3() {
		return attacker3;
	}

	public void setAttacker3(String attacker3) {
		this.attacker3 = attacker3;
	}

	public String getAttacker4() {
		return attacker4;
	}

	public void setAttacker4(String attacker4) {
		this.attacker4 = attacker4;
	}

	public long getAttackerSize() {
		return attackerSize;
	}

	public void setAttackerSize(long attackerSize) {
		this.attackerSize = attackerSize;
	}

	public String getAttackerCommander() {
		return attackerCommander;
	}

	public void setAttackerCommander(String attackerCommander) {
		this.attackerCommander = attackerCommander;
	}
	
	
}
