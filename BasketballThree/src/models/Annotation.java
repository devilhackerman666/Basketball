package models;

import enums.Period;
import enums.TypePoint;

public class Annotation {
	private String idAnnotation; 
	private TypePoint typePoint;
	private int idPlayer;
	private int idTeam;
	private Period period;
	
	public Annotation(String idAnnotation, TypePoint typePoint, int idPlayer, int idTeam, Period period) {
		this.idAnnotation = idAnnotation;
		this.typePoint = typePoint;
		this.idPlayer = idPlayer;
		this.idTeam = idTeam;
		this.period = period;
	}
	
	public String getIdAnnotation() {
		return idAnnotation;
	}

	public void setIdAnnotation(String idAnnotation) {
		this.idAnnotation = idAnnotation;
	}

	public TypePoint getTypePoint() {
		return typePoint;
	}

	public void setTypePoint(TypePoint typePoint) {
		this.typePoint = typePoint;
	}

	public int getIdPlayer() {
		return idPlayer;
	}

	public void setIdPlayer(int idPlayer) {
		this.idPlayer = idPlayer;
	}

	public int getIdTeam() {
		return idTeam;
	}

	public void setIdTeam(int idTeam) {
		this.idTeam = idTeam;
	}

	public Period getPeriod() {
		return period;
	}

	public void setPeriod(Period period) {
		this.period = period;
	}

	public Object[] toObjectVector() {
		return new Object[] {idAnnotation, typePoint.getTypePoint(), idPlayer, idTeam, period.getPeriod()};
	}
	
}
