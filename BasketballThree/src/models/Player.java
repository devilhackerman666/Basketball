package models;

import java.time.LocalDate;

import enums.Gender;
import enums.PlayerPosition;
import enums.TypeDocument;

public class Player extends Person {

	private String numberPlayer;
	private float weight;
	private float height;
	private PlayerPosition playerPosition;
	private int points;

	public Player(String numberPlayer, float weight, float height, PlayerPosition playerPosition, String firstName,
			String surname, TypeDocument typeDocument, String documentNumber, LocalDate date, Gender gender, int id) {
		super(firstName, surname, typeDocument, documentNumber, date, gender, id);
		this.numberPlayer = numberPlayer;
		this.weight = weight;
		this.height = height;
		this.playerPosition = playerPosition;
	}

	public String getNumberPlayer() {
		return numberPlayer;
	}
	
	public void setNumberPlayer(String numberPlayer) {
		this.numberPlayer = numberPlayer;
	}
	
	public float getWeight() {
		return weight;
	}
	
	public void setWeight(float weight) {
		this.weight = weight;
	}
	
	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public PlayerPosition getPlayerPosition() {
		return playerPosition;
	}

	public void setPlayerPosition(PlayerPosition playerPosition) {
		this.playerPosition = playerPosition;
	}

	public int getPoints() {
		return points;
	}

	public void setPoints(int points) {
		this.points = points;
	}

	public Object[] toObjectVector() {
		return new Object[] { firstName, surname, gender.getGender(), typeDocument.getTypeDocument(), documentNumber, calculateAge(), numberPlayer, playerPosition.getPosition(), weight, height, id };
	}

}
