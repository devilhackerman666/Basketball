package exceptions;

public class DocumentNotFoundException extends Exception{
	
	private static final long serialVersionUID = 1L;
	public static final String MESSAGE_NOT_FOUND = "El número de documento no fue encontrado";
	
	public DocumentNotFoundException() {
		super( MESSAGE_NOT_FOUND);
	}
	
	public DocumentNotFoundException(String message) {
		super(message);
	}
}
