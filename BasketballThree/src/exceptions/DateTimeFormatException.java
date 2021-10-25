package exceptions;

public class DateTimeFormatException extends Exception {
	
	private static final long serialVersionUID = 1L;
	public static final String MESSAGE_NOT_FOUND = "La fecha ingresada no cumple con el formato especificado";
	
	public DateTimeFormatException() {
		super( MESSAGE_NOT_FOUND);
	}
	
	public DateTimeFormatException(String message) {
		super(message);
	}
}


