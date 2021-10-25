package models;

import java.time.LocalDate;

import enums.Gender;
import enums.TypeDocument;
import exceptions.DocumentNotFoundException;

public interface OperatorsLigueInterface {
	
	public void add(Person person);
	public Person search(String documentNumber) throws DocumentNotFoundException;
	public void delete(String documentNumber) throws DocumentNotFoundException;
	public void replace(int pos, Person person);
	public void editTypeDocument(String documentNumber, TypeDocument newDocumentType);
	public void editDocumentNumber(String documentNumber, String newNumberDocument);
	public void editFirstName(String documentNumber, String name);
	public void editSurname(String documentNumber, String surname);
	public void editGender(String documentNumber, Gender genderChange);
	public void editBirthdate(String documentNumber, LocalDate birthdate);
}
