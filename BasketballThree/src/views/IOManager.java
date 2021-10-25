package views;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

import enums.Gender;
import enums.PlayerPosition;
import enums.TypeArbitrator;
import enums.TypeDocument;
import enums.TypeState;
import exceptions.DateTimeFormatException;
import models.Team;
import staticBurned.SBView;
import utilities.Utilities;

public class IOManager {
	private Scanner console; 
	
	public IOManager() {
		console = new Scanner(System.in);
	}
	
	public void generateHeader() {
		System.out.println(String.format(SBView.FORMAT_TEAM, SBView.HEADERS));
		System.out.println(SBView.FORMAT_HEADER_LINES);
	}
	
	public void showListDatas(ArrayList<Object[]> arrayList) {
		generateHeader();
		for (int i = 0; i < arrayList.size(); i++) {
			System.out.println(String.format( SBView.FORMAT_TEAM, arrayList.get(i)));
			System.out.println(SBView.FORMAT_HEADER_LINES_OVER);
		}
	}
	
	public void showListDatasPlayer(ArrayList<Object[]> arrayList) {
		generateHeader();
		for (int i = 0; i < arrayList.size(); i++) {
			System.out.println(String.format( SBView.FORMAT_PLAYER, arrayList.get(i)));
			System.out.println(SBView.FORMAT_HEADER_LINES_OVER);
		}
	}
	
	public void showListDatasArbitrator(ArrayList<Object[]> arrayList) {
		generateHeader();
		for (int i = 0; i < arrayList.size(); i++) {
			System.out.println(String.format( SBView.FORMAT_ARBITRATOR, arrayList.get(i)));
			System.out.println(SBView.FORMAT_HEADER_LINES_OVER);
		}
	}
	
	public void showInformationTeam(Team teamUnic) {
		generateHeader();
		System.out.println(String.format(SBView.FORMAT_TEAM, teamUnic));
	}
	
	public int showMenu() {
		System.out.println(SBView.MAIN_MENU);
		return Integer.parseInt(console.nextLine());
	}

	public int showMenuTeamInformation() {
		System.out.println(SBView.MAIN_MENU_TEAM);
		return Integer.parseInt(console.nextLine());
	}

	public int showMenuPlayer() {
		System.out.println(SBView.MAIN_MENU_PLAYER);
		return Integer.parseInt(console.nextLine());
	}
	
	public int showMenuArbitrator() {
		System.out.println(SBView.MAIN_MENU_ARBITRATOR);
		return Integer.parseInt(console.nextLine());
	}
	
	public int showMenuModifyTeam() {
		System.out.println(SBView.SUB_MENU_TEAM);
		return Integer.parseInt(console.nextLine());
	}

	public int showMenuModifyPlayer() {
		System.out.println(SBView.SUB_MENU_PLAYER);
		return Integer.parseInt(console.nextLine());
	}
	
	public int showMenuModifyArbitrator() {
		System.out.println(SBView.SUB_MENU_ARBITRATOR);
		return Integer.parseInt(console.nextLine());
	}
	
	public String readName() {
		System.out.println(SBView.NAME);
		return console.nextLine();
	}
	
	public String readSurname() {
		System.out.println(SBView.LAST_NAME);
		return console.nextLine();
	}

	public String readId() {
		System.out.println(SBView.ID);
		return console.nextLine();
	}
	
	public float readWeight() {
		System.out.println(SBView.WEIGHT);
		return Float.parseFloat(console.nextLine());
	}

	public float readHeight() {
		System.out.println(SBView.HEIGHT);
		return Float.parseFloat(console.nextLine());
	}
	
	public LocalDate readDate() {          
		try {
			System.out.println("Escriba su fecha de nacimiento");
			return Utilities.toDate(console.nextLine());
		} catch(DateTimeFormatException e) {
			showMessageDateFormat(e.getMessage());
			return readDate();
		}
	}

	public void showMessageEnd() {
		System.out.println(SBView.MESSAGE_END);
	}
	
	public String readNumberPlayer() {
		System.out.println(SBView.MESSAGE_NUMBER_PLAYER);
		return console.nextLine();
	}

	public void showDocumentNotFound(String message) {
		System.out.println("");
		System.err.println( message );
	}
	
	public Gender getGender() {
		int option = 0;
		System.out.println(SBView.GENDER_TYPE );

		option = Integer.parseInt( console.nextLine() );

		Gender gender = null;
		switch (option) {
		case 1:
			gender = Gender.MALE;
			break;
		case 2:
			gender = Gender.FEMALE;
			break;
		}
		return gender;
	}
	
	public TypeState generateState() {
		int option = 0;
		System.out.println(SBView.STATE_TYPE );

		option = Integer.parseInt( console.nextLine() );

		TypeState gender = null;
		switch (option) {
		case 1:
			gender = TypeState.VIGENT;
			break;
		case 2:
			gender = TypeState.DESCLASSIFIED;
			break;
		}
		return gender;
	}

	public TypeDocument getDocument() {
		int option = 0;
		System.out.println(SBView.MENU_ID_TYPE);

		option = Integer.parseInt( console.nextLine() );

		TypeDocument document = null;

		switch (option) {
		case 1:
			document = TypeDocument.CC;
			break;
		case 2:
			document = TypeDocument.FOREING_ID;
			break;
		case 3:
			document = TypeDocument.IC;
			break;
		}
		return document;
	}
	
	public PlayerPosition givePosition() {
		int option = 0;
		System.out.println(SBView.MENU_ID_TYPE);

		option = Integer.parseInt( console.nextLine() );

		PlayerPosition position = null;

		switch (option) {
		case 1:
			position = PlayerPosition.EAVES;
			break;
		case 2:
			position = PlayerPosition.POST;
			break;
		case 3:
			position = PlayerPosition.SHIPOWNER;
			break;
		}
		return position;
	}
	
	public void showMessageDateFormat(String message) {
		System.err.println(message);
	}

	public TypeArbitrator getTypeArbitrator() {
		int option = 0;
		System.out.println(SBView.ARBITRATOR_TYPE);

		option = Integer.parseInt( console.nextLine() );

		TypeArbitrator arbitrator = null;

		switch (option) {
		case 1:
			arbitrator = TypeArbitrator.BACKGROUND;
			break;
		case 2:
			arbitrator = TypeArbitrator.SIDE;
			break;
		case 3:
			arbitrator = TypeArbitrator.TABLE;
			break;
		}
		return arbitrator;
	}



	
}
