package enums;

public enum TypeDocument {

	CC("C�dula de Ciudadan�a"), IC("Tajeta de Identidad"), FOREING_ID("C�dula de Extranjer�a"); 
	
	private String typeDocument;
	
	private TypeDocument(String typeDocument) {
		this.typeDocument = typeDocument;
	}
	
	public String getTypeDocument() {
		return typeDocument;
	}
}
