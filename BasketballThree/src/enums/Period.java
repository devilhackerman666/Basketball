package enums;

public enum Period {
	
	ONE("Primero"), TWO("Segundo"), THREE("Tercero"), FOUR("Cuarto");

	private String period;

	private Period(String period) {
		this.period = period;
	}

	public String getPeriod() {
		return period;
	}
	
}
