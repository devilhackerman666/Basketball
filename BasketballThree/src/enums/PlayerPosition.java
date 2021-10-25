package enums;

public enum PlayerPosition {
	
	EAVES("Alero"), POST ("Posta"), SHIPOWNER("Armador");
	
	private String position;
	
	private PlayerPosition(String position) {
		this.position = position;
	}
	
	public String getPosition() {
		return position;
	}
}

