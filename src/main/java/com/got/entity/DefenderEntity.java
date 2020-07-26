/**
 * 
 */
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

/**
 * @author admin
 *
 */

@Entity
@Table(name="Defender")
public class DefenderEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="Defender_ID")
	private long defenderId;
	
	@ManyToOne
	@JoinColumn(name = "battle_number", referencedColumnName = "battle_number")
	@JsonIgnore
	private BattleEntity BattleEntity;
	
	@Column(name="Defender_King")
	private String defenderKing;
	
	@Column(name="Defender_1")
	private String defender1;
	
	@Column(name="Defender_2")
	private String defender2;
	
	@Column(name="Defender_3")
	private String defender3;
	
	@Column(name="Defender_4")
	private String defender4;

	@Column(name="Defender_Size")
	private long defenderSize;
	
	@Column(name="Defender_Commander")
	private String defenderCommander;

	public long getDefenderId() {
		return defenderId;
	}

	public void setDefenderId(long defenderId) {
		this.defenderId = defenderId;
	}

	public BattleEntity getBattleEntity() {
		return BattleEntity;
	}

	public void setBattleEntity(BattleEntity battleEntity) {
		BattleEntity = battleEntity;
	}

	public String getDefenderKing() {
		return defenderKing;
	}

	public void setDefenderKing(String defenderKing) {
		this.defenderKing = defenderKing;
	}

	public String getDefender1() {
		return defender1;
	}

	public void setDefender1(String defender1) {
		this.defender1 = defender1;
	}

	public String getDefender2() {
		return defender2;
	}

	public void setDefender2(String defender2) {
		this.defender2 = defender2;
	}

	public String getDefender3() {
		return defender3;
	}

	public void setDefender3(String defender3) {
		this.defender3 = defender3;
	}

	public String getDefender4() {
		return defender4;
	}

	public void setDefender4(String defender4) {
		this.defender4 = defender4;
	}

	public long getDefenderSize() {
		return defenderSize;
	}

	public void setDefenderSize(long defenderSize) {
		this.defenderSize = defenderSize;
	}

	public String getDefenderCommander() {
		return defenderCommander;
	}

	public void setDefenderCommander(String defenderCommander) {
		this.defenderCommander = defenderCommander;
	}

}
