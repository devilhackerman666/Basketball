package models;

import java.time.LocalDate;

import enums.Gender;
import enums.TypeDocument;
import utilities.Utilities;

public abstract class Person {
	

	protected String firstName;
	protected String surname; 
	protected TypeDocument typeDocument;
	protected String documentNumber; 
	protected LocalDate birthdate; 
	protected Gender gender;
	protected int id;
	
	public Person(String firstName, String lastName, TypeDocument typeDocument, String documentNumber, LocalDate bithdate,
			Gender gender, int id) {
		this.firstName = firstName;
		this.surname = lastName;
		this.typeDocument = typeDocument;
		this.documentNumber = documentNumber;
		this.birthdate = bithdate;
		this.gender = gender;
		this.id = id;
	}
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return surname;
	}

	public void setLastName(String lastName) {
		this.surname = lastName;
	}

	public TypeDocument getTypeDocument() {
		return typeDocument;
	}

	public void setTypeDocument(TypeDocument typeDocument) {
		this.typeDocument = typeDocument;
	}

	public String getDocumentNumber() {
		return documentNumber;
	}

	public void setDocumentNumber(String documentNumber) {
		this.documentNumber = documentNumber;
	}

	public LocalDate getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(LocalDate birthdate) {
		this.birthdate = birthdate;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public short calculateAge() {
		int age = Utilities.calculateAge(this.birthdate);
		return (short) age;
	}
	
	public abstract Object[] toObjectVector();
}
