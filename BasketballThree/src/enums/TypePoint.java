package enums;

public enum TypePoint {
	FREE_SHOT("Tiro Libre", 1), DOUBLE_FIELD_SHOT("Tiro campo doble", 2), TRIPLE_FIELD_SHOT("Tiro campo triple", 3);
	
	private String namePoint;
	private int point;
	
	private TypePoint(String namePoint, int point) {
		this.namePoint = namePoint;
		this.point = point;
	}
	
	public String getTypePoint() {
		return namePoint;
	}
	
	public int getPoint() {
		return point;
	}
}
