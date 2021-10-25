package models;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import exceptions.StackOverFlowException;

public class Game {
	private int idTeamOne;
	private int idTeamTwo;
	private List<Integer> arbitratorList;
	private List<Annotation> annotationsList;

	
	public Game(int idTeamOne, int idTeamTwo) {
		this.idTeamOne = idTeamOne;
		this.idTeamTwo = idTeamTwo;
		arbitratorList = new ArrayList<>();
		annotationsList = new ArrayList<>();		
	}
	
	public int getIdTeamOne() {
		return idTeamOne;
	}

	public void setIdTeamOne(int idTeamOne) {
		this.idTeamOne = idTeamOne;
	}

	public int getIdTeamTwo() {
		return idTeamTwo;
	}

	public void setIdTeamTwo(int idTeamTwo) {
		this.idTeamTwo = idTeamTwo;
	}

	public void addAnnotation (int idTeam, Annotation annotation) {
		for (int i = 0; i < annotationsList.size(); i++) {
			if(annotationsList.get(i).getIdTeam() == idTeam) {
				annotationsList.add(annotation);
			}
		}
	}
	
	public int calculateTotalPointTeam(int idTeam) {
		int point = 0;
		for (int i = 0; i < annotationsList.size(); i++) {
			if(annotationsList.get(i).getIdTeam() == idTeam) {
				point += annotationsList.get(i).getTypePoint().getPoint();
			}
		}
		return point;
	}
	
	public int calculateTotalPointPlayer(int idPlayer) {
		int point = 0; 
		for (int i = 0; i < annotationsList.size(); i++) {
			if(annotationsList.get(i).getIdPlayer() == idPlayer) {
				point += annotationsList.get(i).getTypePoint().getPoint();
			}
		}
		return point;
	}
	
//	public int asignArbitrator() {
//		Random rnd = new Random();
//		int index = rnd.nextInt(arbitratorList.size());
//		int arbitrator = arbitratorList.get(index);
//		return arbitrator;
//	}
	
	public List<Integer> asignArbitrators() throws StackOverFlowException{
		List<Integer> arbitratorListAux = new ArrayList<>(5);
		Random rnd = new Random();
		if(arbitratorListAux.size() > 5) {
			throw new StackOverFlowException();
		}
			for (int i = 0; i < arbitratorListAux.size(); i++) {
				int index = rnd.nextInt(arbitratorList.size());
				int arbitrator = arbitratorList.get(index);
				arbitratorListAux.add( arbitrator );
			}
		return arbitratorListAux;
	}
}
