package ejerciciosStrings;

public class Concat {
	
	public static String concatenarCadenas(String cadena1, String cadena2) {
		
		return cadena1 + cadena2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cadena1 = Utilidades.leerCadena("Introduce una cadena");
		String cadena2 = Utilidades.leerCadena("Introduce otra cadena");
		
		System.out.println(concatenarCadenas(cadena1, cadena2));
	}

}
