package exceptions;

public class StackOverFlowException extends Exception{

	private static final long serialVersionUID = 1L;
	public static final String MESSAGE_NOT_FOUND = "Ha excedido el tamaño de la lista";
	
	public StackOverFlowException() {
		super( MESSAGE_NOT_FOUND);
	}
	
	public StackOverFlowException(String message) {
		super(message);
	}
}
