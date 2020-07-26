/**
 * 
 */
package com.got.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author narendra
 *
 */
@Entity
@Table(name="Battle")
public class BattleEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="Battle_Number")
	private long battleNumber;

	@Column(name="Name")
	private String name;

	@Column(name="Year",nullable = true)
	private int year;

	@Column(name="Battle_type")
	private String battleType;

	@Column(name="Summer")
	private int summer;

	@Column(name="Location",nullable = false)
	private String location;

	@Column(name="Region")
	private String region;

	@Column(name="Note")
	private String note;

	public long getBattleNumber() {
		return battleNumber;
	}

	public void setBattleNumber(long battleNumber) {
		this.battleNumber = battleNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getBattleType() {
		return battleType;
	}

	public void setBattleType(String battleType) {
		this.battleType = battleType;
	}

	public int getSummer() {
		return summer;
	}

	public void setSummer(int summer) {
		this.summer = summer;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}
	
}