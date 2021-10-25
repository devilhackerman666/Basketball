package models;

import java.time.LocalDate;

import enums.Gender;
import enums.TypeArbitrator;
import enums.TypeDocument;

public class Arbitrator extends Person{
	

	private TypeArbitrator typeArbitrator;

	public Arbitrator(String firstName, String surname, TypeDocument typeDocument, String documentNumber,
			LocalDate date, Gender gender, int id, TypeArbitrator typeArbitrator) {
		super(firstName, surname, typeDocument, documentNumber, date, gender, id);
		this.typeArbitrator = typeArbitrator;
	}

	public TypeArbitrator getTypeArbitrator() {
		return typeArbitrator;
	}
	
	public void setTypeArbitrator(TypeArbitrator typeArbitrator) {
		this.typeArbitrator = typeArbitrator;
	}
	
	public Object[] toObjectVector() {
		return new Object[] {firstName, surname, typeDocument.getTypeDocument(), documentNumber, calculateAge(), gender.getGender(), typeArbitrator.getTypeArbitror(), id};
	}

	
	
}
