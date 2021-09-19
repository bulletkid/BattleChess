package com.manuanand.battlechess;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // This tells Hibernate to make a table out of this class
public class Game {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;

	private Integer playerId1;

	private Integer playerId2;

	private GameStatus status;
	
	private Date date;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getPlayerId1() {
		return playerId1;
	}

	public void setPlayerId1(Integer playerId1) {
		this.playerId1 = playerId1;
	}

	public Integer getPlayerId2() {
		return playerId2;
	}

	public void setPlayerId2(Integer playerId2) {
		this.playerId2 = playerId2;
	}

	public GameStatus getStatus() {
		return status;
	}

	public void setStatus(GameStatus status) {
		this.status = status;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
}
