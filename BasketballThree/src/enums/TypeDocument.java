package enums;

public enum TypeDocument {

	CC("Cédula de Ciudadanía"), IC("Tajeta de Identidad"), FOREING_ID("Cédula de Extranjería"); 
	
	private String typeDocument;
	
	private TypeDocument(String typeDocument) {
		this.typeDocument = typeDocument;
	}
	
	public String getTypeDocument() {
		return typeDocument;
	}
}
