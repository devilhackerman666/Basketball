package staticBurned;
import enums.*;

public class SBView {

	public static final String FORMAT_TEAM = "|%1$-10s |%2$-17s | %3$-16s| %4$-12s|";
	public static final String FORMAT_PLAYER = "|%1$-10s |%2$-17s | %3$-16s| %4$-12s| %5$-12s| %6$-12s| %7$-12s|";
	public static final String FORMAT_ARBITRATOR = "|%1$-10s |%2$-17s | %3$-16s| %4$-12s|";
	public static final Object[] HEADERS = { " EQUIPO ", " IDENTIFICACION ", " ESTADO ", "CODIGO"};
	public static final String NAME = "Ingrese nombre: ";
	public static final String LAST_NAME = "Ingrese apellido: ";
	public static final String ID = "Ingrese la identificacion: ";
	public static final String ID_TYPE = "Elija el tipo de identificacion: ";
	public static final String WEIGHT = "Ingrese Peso: ";
	public static final String HEIGHT = "Ingrese Altura";
	public static final String MAIN_MENU = 
	          " ______________________________________" +
	   '\n' + "|              BIENVENIDO              |" +
	   '\n' + "|-----CHAMPION'S LIGUE BASKETBALL------|" +
	   '\n' + "|======================================|" + '\n'
			+ "|1. Ingresar Equipo                    |" + '\n' 
			+ "|2. Consultar informacion              |" + '\n'
			+ "|3. Buscar Informacion de Un Equipo    |" + '\n' 
			+ "|4. Eliminar Equipo                    |" + '\n' 
			+ "|5. Modificar Informacion Del Equipo   |" + '\n'
			+ "|6. Desclasificar Equipo               |" + '\n'
			+ "|7. Resultados                         |" + '\n'
			+ "|8. Salir                              |" + '\n'
			+ "|______________________________________|";
	public static final String MAIN_MENU_TEAM = 
	          " ______________________________________" +
	   '\n' + "|                                      |" +
	   '\n' + "|--------------  EQUIPO  --------------|" +
	   '\n' + "|======================================|" + '\n'
			+ "|1. Ingresar información del Equipo    |" + '\n' 
			+ "|2. Mostrar Información                |" + '\n'
			+ "|3. Buscar Informacion de Un Equipo    |" + '\n' 
			+ "|4. Modificar Informacion Del Equipo   |" + '\n' 
			+ "|5. Eliminar Equipo                    |" + '\n'
			+ "|6. Regresar al menu principal         |" + '\n'
			+ "|______________________________________|";
	public static final String MAIN_MENU_PLAYER = 
	          " ______________________________________" +
	   '\n' + "|                                      |" +
	   '\n' + "|-------------  JUGADOR  --------------|" +
	   '\n' + "|======================================|" + '\n'
			+ "|1. Ingresar Jugador                   |" + '\n' 
			+ "|2. Mostrar Información                |" + '\n'
			+ "|3. Buscar Informacion de Un Jugador   |" + '\n' 
			+ "|4. Modificar Información              |" + '\n' 
			+ "|5. Eliminar Jugador                    |" + '\n'
			+ "|6. Regresar al menu principal         |" + '\n'
			+ "|______________________________________|";
	public static final String MAIN_MENU_ARBITRATOR = 
	          " ______________________________________" +
	   '\n' + "|                                      |" +
	   '\n' + "|-------------  ARBITRO  --------------|" +
	   '\n' + "|======================================|" + '\n'
			+ "|1. Ingresar Arbitro                   |" + '\n' 
			+ "|2. Mostrar Información                |" + '\n'
			+ "|3. Buscar Informacion de Un Arbitro   |" + '\n' 
			+ "|4. Modificar Información              |" + '\n' 
			+ "|5. Eliminar Arbitro                   |" + '\n'
			+ "|6. Regresar al menu principal         |" + '\n'
			+ "|______________________________________|";
	
	public static final String FORMAT_HEADER_LINES = "_______________________________________________________\n";
	public static final String FORMAT_HEADER_LINES_OVER = "-----------------------------------------------------";
	public static final String MESSAGE_IMC_EXCEPTION_ONE = "Ingrese un valor valido";
	public static final String MESSAGE_IMC_EXCEPTION_TWO = "Este Usuario No Existe!";
	public static final String MESSAGE_IMC_EXCEPTION_THREE = "Los valores tienen que ser distintos a los existentes";
	public static final String MESSAGE_MATRIX_INFORMATION = "Este Lugar se encuentra vacio!";
	public static final String MESSAGE_END = "Hasta Luego!";
	public static final String AGE = "Digite la Edad";
	public static final String CATEGORIES = "Elija la Categoria ";
	public static final String POSITION = "Elija La posicion del Jugador";
	public static final String GENDER = "Elija el Genero";
	public static final String DOCUMENT = "Elija el tipo de documento";
	public static final String DOCUMENT_NUMBER = "Digite el ducumento";
	public static final String MESSAGE_NUMBER_PLAYER = "Digite Numero del Jugador";
	public static final String MESSAGE_GOODBYE = 
					 '\n'+ "!!!!!!!!!!!!!!!!!"  +
					 '\n'+ "-- HASTA LUEGO --" +
			         '\n'+ "¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡";

	public static final String SUB_MENU_TEAM = '\n' 
			+ "._________________________________________." + '\n'
			+ "|                                         |  " + '\n'
			+ "|=========== MODIFICAR EQUIPO ============|" + '\n'
			+ "|_________________________________________|" + '\n'
			+ "|                                         |" + '\n'
			+ "| Elija la opción que desa modificar      |" + '\n'
			+ "|_________________________________________|" + '\n'
			+ "|                                         |" + '\n'
			+ "| 1. Nombre                               |" + '\n'
			+ "| 2. Identidad                            |" + '\n'
			+ "| 3. Menu Principal                       |" + '\n'
			+ "|_________________________________________|";
	
	public static final String SUB_MENU_PLAYER = '\n' 
			+ "._________________________________________." + '\n'
			+ "|                                         |  " + '\n'
			+ "|=========== MODIFICAR JUGADOR============|" + '\n'
			+ "|_________________________________________|" + '\n'
			+ "|                                         |" + '\n'
			+ "| Elija la opción que desa modificar      |" + '\n'
			+ "|_________________________________________|" + '\n'
			+ "|                                         |" + '\n'
			+ "| 1.  Nombre                              |" + '\n'
			+ "| 2.  Apellido                            |"+ '\n'
			+ "| 3.  Numero dorsal                       |" + '\n'
			+ "| 4.  Tipo de Identidad                   |" + '\n'
			+ "| 5.  Numero de identficación             |" + '\n'
			+ "| 6.  Fecha                               |" + '\n'
			+ "| 7.  Genero                              |" + '\n'
			+ "| 8.  Altura                              |" + '\n'
			+ "| 9.  Peso                                |" + '\n'
			+ "| 10. Tipo de jugador                     |" + '\n'
			+ "| 11. Regresar al Menu anterior           |" + '\n'
			+ "|_________________________________________|";
	
	public static final String SUB_MENU_ARBITRATOR = '\n' 
			+ "._________________________________________." + '\n'
			+ "|                                         |  " + '\n'
			+ "|========== MODIFICAR ARBITRO ============|" + '\n'
			+ "|_________________________________________|" + '\n'
			+ "|                                         |" + '\n'
			+ "| Elija la opción que desa modificar      |" + '\n'
			+ "|_________________________________________|" + '\n'
			+ "|                                         |" + '\n'
			+ "| 1. Nombre                               |" + '\n'
			+ "| 2. Apellido                             |"+ '\n'
			+ "| 3. Tipo de Identidad                    |" + '\n'
			+ "| 4. Numero de identficación              |" + '\n'
			+ "| 5. Fecha                                |" + '\n'
			+ "| 6. Genero                               |" + '\n'
			+ "| 7. Tipo De Arbitro                      |" + '\n'
			+ "| 8. Regresar al Menu anterior            |" + '\n'
			+ "|_________________________________________|";
	public static final String MENU_ID_TYPE = 
			"\n" + "Elija una opcion: " + 
			'\n' + "1." + TypeDocument.CC.getTypeDocument() +
			'\n' + "2." + TypeDocument.IC.getTypeDocument() +
			'\n' + "3." + TypeDocument.FOREING_ID.getTypeDocument();
			
	public static final String GENDER_TYPE = 
			"\n" + "Elija una opcion: " + 
			'\n' + "1." + Gender.MALE.getGender() + 
			'\n' + "2." + Gender.FEMALE.getGender();
	
	public static final String STATE_TYPE = 
			"\n" + "Elija una opcion: " + 
			'\n' + "1." + TypeState.VIGENT.getState() + 
			'\n' + "2." + TypeState.DESCLASSIFIED.getState();
	
	public static final String MENU_POSITION_TYPE = 
			"\n" + "Elija una opcion: " + 
			'\n' + "1." + PlayerPosition.EAVES.getPosition() +
			'\n' + "2." + PlayerPosition.POST.getPosition() +
			'\n' + "3." + PlayerPosition.SHIPOWNER.getPosition();
	
	public static final String ARBITRATOR_TYPE = 
			"\n" + "Elija una opcion: " + 
			'\n' + "1." + TypeArbitrator.BACKGROUND.getTypeArbitror() + 
			'\n' + "2." + TypeArbitrator.SIDE.getTypeArbitror() +
			'\n' + "3." + TypeArbitrator.TABLE.getTypeArbitror();
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
