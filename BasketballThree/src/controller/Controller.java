package controller;

import java.time.LocalDate;
import staticBurned.SBController;
import enums.*;
import exceptions.DocumentNotFoundException;
import models.*;
import views.IOManager;

public class Controller {

	private ChampionLigueBasketball champion;
	private IOManager ioManager;

	public Controller() {
		champion = new ChampionLigueBasketball();
		ioManager = new IOManager();
		createdTeamsPlayers();
		run();
	}

	private void run() {
		int option = SBController.ZERO;
		while (option <= SBController.EIGHT) {
			option = ioManager.showMenu();
			switch (option) {
			case SBController.ONE:
				menuTeamInformation();
				break;
			case SBController.TWO:
				menuPlayerInformation();
				break;
			case SBController.THREE:
				menuArbitratorInformation();
				break;
			case SBController.FOUR:

				break;
			case SBController.FIVE:

				break;
			case SBController.SIX:

				break;
			case SBController.SEVEN:

				break;
			case SBController.EIGHT:
				ioManager.showMessageEnd();
				System.exit(SBController.ZERO);
				break;
			}
		}
	}

	public void menuTeamInformation() {
		int option = SBController.ZERO;
		while (option <= SBController.EIGHT) {
			option = ioManager.showMenuTeamInformation();
			switch (option) {
			case SBController.ONE:
				manageAddTeam();
				break;
			case SBController.TWO:
				showInformatioMatrix();
				break;
			case SBController.THREE:
				searchTeam();
				break;
			case SBController.FOUR:
				modifyTeam();
				break;
			case SBController.FIVE:
				deleteTeam();
				break;
			case SBController.SIX:
				break;
			}
		}
	}

	private void manageAddTeam() {
		champion.addTeam(ChampionLigueBasketball.createTeam(ioManager.readName(), ioManager.readId(),
				ioManager.generateState()));
	}

	private void showInformatioMatrix() {
		ioManager.showListDatas(champion.toMatrixVector());
	}

	private void searchTeam() {
		Team teamUnic;
		try {
			teamUnic = champion.searchTeam(ioManager.readId());
			ioManager.showInformationTeam(teamUnic);
		} catch (DocumentNotFoundException exception) {
			ioManager.showDocumentNotFound(exception.getMessage());
		}
	}

	private void modifyTeam() {
		int option = SBController.ZERO;
		while (option <= SBController.THREE) {
			option = ioManager.showMenuModifyTeam();
			switch (option) {
			case SBController.ONE:
				champion.editIdentificationTeam(ioManager.readId(), ioManager.readId());
				break;
			case SBController.TWO:
				champion.editNameTeam(ioManager.readId(), ioManager.readName());
				break;
			case SBController.THREE:
				break;
			}
		}
	}

	private void deleteTeam() {
		try {
			champion.deleteTeam(ioManager.readId());
		} catch (DocumentNotFoundException exception) {
			ioManager.showDocumentNotFound(exception.getMessage());
		}
	}

	private void menuPlayerInformation() {
		int option = SBController.ZERO;
		while (option <= SBController.FOUR) {
			option = ioManager.showMenuPlayer();
			switch (option) {
			case SBController.ONE:
				manageAddPlayer();
				break;
			case SBController.TWO:
				showInformatioMatrixPlayer();
				break;
			case SBController.THREE:
				searchPlayer();
				break;
			case SBController.FOUR:
				modifyPlayerInformation();
				break;
			case SBController.FIVE:
				deletePlayer();
				break;
			case SBController.SIX:
				break;
			}
		}
	}

	private void manageAddPlayer() {
		try {
			champion.addPlayer(ioManager.readId(),
					Team.createPlayers(ioManager.readNumberPlayer(), ioManager.readWeight(), ioManager.readHeight(),
							ioManager.givePosition(), ioManager.readName(), ioManager.readSurname(),
							ioManager.getDocument(), ioManager.readId(), ioManager.readDate(), ioManager.getGender()));
		} catch (DocumentNotFoundException exception) {
			ioManager.showDocumentNotFound(exception.getMessage());
		}
	}

	private void showInformatioMatrixPlayer() {
		ioManager.showListDatas(champion.toMatrixVector());
	}

	public void searchPlayer() {

	}

	public void deletePlayer() {

	}

	private void modifyPlayerInformation() {
		int option = SBController.ZERO;
		while (option <= SBController.ELEVEN) {
			option = ioManager.showMenuModifyPlayer();
			switch (option) {
			case SBController.ONE:
//				name
				break;
			case SBController.TWO:
//				surname
				break;
			case SBController.THREE:
//	numero dorsal
				break;
			case SBController.FOUR:
//				tipo de identidad
				break;
			case SBController.FIVE:
//				numero de identidad
				break;
			case SBController.SIX:
//				FECHA
				break;
			case SBController.SEVEN:
//				GENERO
				break;
			case SBController.EIGHT:
//				altura
				break;
			case SBController.NINE:
//				peso
				break;
			case SBController.TEN:
//				TIPO DE ARBITRO
				break;
			case SBController.ELEVEN:
				break;
			}

		}
	}

	private void menuArbitratorInformation() {
		int option = SBController.ZERO;
		while (option <= SBController.FOUR) {
			option = ioManager.showMenuArbitrator();
			switch (option) {
			case SBController.ONE:
				manageAddArbitrator();
				break;
			case SBController.TWO:
				showInformatioMatrixArbitrator();
				break;
			case SBController.THREE:

				break;
			case SBController.FOUR:
				modifyArbitrator();
				break;
			case SBController.FIVE:

				break;
			case SBController.SIX:
				break;
			}
		}
	}

	private void manageAddArbitrator() {
		champion.add(ChampionLigueBasketball.createArbitrator(ioManager.readName(), ioManager.readSurname(),
				ioManager.getDocument(), ioManager.readId(), ioManager.readDate(), ioManager.getGender(),
				ioManager.getTypeArbitrator()));
	}

	public void showInformatioMatrixArbitrator() {
		ioManager.showListDatasArbitrator(champion.toMatrixVector());
	}

	public void searchArbitrator() {
		try {
			champion.search(ioManager.readId());
		} catch (DocumentNotFoundException e) {
			e.printStackTrace();
		}
	}

	private void modifyArbitrator() {
		int option = SBController.ZERO;
		while (option <= SBController.EIGHT) {
			option = ioManager.showMenuModifyArbitrator();
			switch (option) {
			case SBController.ONE:
				champion.editFirstName(ioManager.readId(), ioManager.readName());
				break;
			case SBController.TWO:
				champion.editSurname(ioManager.readId(), ioManager.readSurname());
				break;
			case SBController.THREE:
				champion.editDocumentNumber(ioManager.readId(), ioManager.readId());
				break;
			case SBController.FOUR:
				champion.editTypeDocument(ioManager.readId(), ioManager.getDocument());
				break;
			case SBController.FIVE:
				champion.editBirthdate(ioManager.readId(), ioManager.readDate());
				break;
			case SBController.SIX:
				champion.editGender(ioManager.readId(), ioManager.getGender());
				break;
			case SBController.SEVEN:
				champion.editTypeArbitrator(ioManager.readId(), ioManager.getTypeArbitrator());
				break;
			case SBController.EIGHT:
				break;
			}
		}
	}

	private void createdTeamsPlayers() {
		try {
			champion.addTeam(champion.createTeam("Leon", "123455", TypeState.VIGENT));

			champion.addPlayer("Leon", Team.createPlayers("10", 15.5f, 1.50f, PlayerPosition.POST, "David", "Pardo",
					TypeDocument.CC, "789", LocalDate.of(04, 04, 2000), Gender.MALE));

			champion.addTeam(champion.createTeam("Sahar", "765434", TypeState.DESCLASSIFIED));
			champion.addPlayer("Sahar", Team.createPlayers("10", 15.5f, 1.50f, PlayerPosition.POST, "Camila", "Pardo",
					TypeDocument.CC, "456", LocalDate.of(14, 04, 2000), Gender.FEMALE));
			champion.addPlayer("Sahar", Team.createPlayers("10", 15.5f, 1.50f, PlayerPosition.POST, "Didier", "Sanchez",
					TypeDocument.CC, "123", LocalDate.of(14, 04, 2000), Gender.MALE));

			champion.addTeam(champion.createTeam("Shaina", "0098", TypeState.VIGENT));

		} catch (DocumentNotFoundException exception) {
			ioManager.showDocumentNotFound(exception.getMessage());
		}
	}

}
