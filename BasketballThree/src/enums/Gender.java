package enums;

public enum Gender {
	
	FEMALE("Femenino"), MALE("Masculino");
	
	private String gender;
	
	private Gender(String gender) {
		this.gender = gender;
	}
	
	public String getGender() {
		return gender;
	}
}
