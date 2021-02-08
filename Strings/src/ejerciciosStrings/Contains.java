package ejerciciosStrings;

public class Contains {

	public static boolean compruebaContenido(String cadena1, String cadena2) {
		return cadena1.contains(cadena2);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cadena1 = Utilidades.leerCadena("Introduce una cadena");
		String cadena2 = Utilidades.leerCadena("Introduce otra cadena");
		
		System.out.println(compruebaContenido(cadena1, cadena2));
	}

}
