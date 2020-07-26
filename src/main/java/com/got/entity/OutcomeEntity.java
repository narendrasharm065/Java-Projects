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
@Table(name="Outcome")
public class OutcomeEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="Outcome_ID")
	private long outcomeId;
	
	@ManyToOne
	@JoinColumn(name = "battle_number", referencedColumnName = "battle_number")
	@JsonIgnore
	private BattleEntity BattleEntity;
	
	@Column(name="Attacker_Outcome")
	private String attacekrOutcome;
	
	@Column(name="Major_Death")
	private String majorDeath;
	
	@Column(name="Major_Capture")
	private String majorCapture;

	public long getOutcomeId() {
		return outcomeId;
	}

	public void setOutcomeId(long outcomeId) {
		this.outcomeId = outcomeId;
	}

	public BattleEntity getBattleEntity() {
		return BattleEntity;
	}

	public void setBattleEntity(BattleEntity battleEntity) {
		BattleEntity = battleEntity;
	}

	public String getAttacekrOutcome() {
		return attacekrOutcome;
	}

	public void setAttacekrOutcome(String attacekrOutcome) {
		this.attacekrOutcome = attacekrOutcome;
	}

	public String getMajorDeath() {
		return majorDeath;
	}

	public void setMajorDeath(String majorDeath) {
		this.majorDeath = majorDeath;
	}

	public String getMajorCapture() {
		return majorCapture;
	}

	public void setMajorCapture(String majorCapture) {
		this.majorCapture = majorCapture;
	}

}
