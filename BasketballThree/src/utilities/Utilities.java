package utilities;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

import exceptions.DateTimeFormatException;

public class Utilities {

public static final String FORMAT_DATE_ES = "dd/M/yyyy";
	
	public static int calculateAge(LocalDate birthDate) {
		LocalDate fechaNac = birthDate;
		LocalDate ahora = LocalDate.now();

		Period period = Period.between(fechaNac, ahora);
		
		return  period.getYears();
	}
	
	public static LocalDate toDate( String stringDate ) throws DateTimeFormatException{
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern( FORMAT_DATE_ES );
		return LocalDate.parse( stringDate, dateTimeFormatter );
	}
	
	public static Object[] concatObjectArrays( Object[] vect1, Object[] vect2 ) {
		Object[] fusionArray = new Object[ vect1.length + vect2.length ];
		for (int i = 0; i < fusionArray.length; i++) {
			if ( i < vect1.length ) 
				fusionArray[i] = vect1[i];			
			else
				fusionArray[i] = vect2[i - vect1.length ];
		}
		return fusionArray;
	}

}
