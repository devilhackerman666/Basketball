package enums;

public enum TypeArbitrator {
	SIDE("Lateral"), BACKGROUND("Fondo"), TABLE("Mesa"); 
	
	private String typeArbitrator;
	
	private TypeArbitrator(String typeArbitrator) {
		this.typeArbitrator = typeArbitrator;
	}
	
	public String getTypeArbitror() {
		return typeArbitrator;
	}
	
}
