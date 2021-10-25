package enums;

public enum TypeState {

	VIGENT("Clasificado"), DESCLASSIFIED("Desclasificado");
	
	private String state;
	
	private TypeState(String state) {
		this.state = state;
	}
	
	public String getState() {
		return state;
	}
}
