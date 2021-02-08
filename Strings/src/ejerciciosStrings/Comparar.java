package ejerciciosStrings;

public class Comparar {

	public static String resultadoComparacion(String cadena1, String cadena2) {
		int comparacion = cadena1.compareTo(cadena2);

		if (comparacion == 0) {
			return "Son iguales";
		}else if (comparacion < 0) {
			return (cadena1 + " es menor que " +cadena2);
		}else {
			return (cadena1 + " es mayor que " +cadena2);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String cadena1 = Utilidades.leerCadena("Introduce una cadena");
		String cadena2 = Utilidades.leerCadena("Introduce otra cadena");
		
		System.out.println(resultadoComparacion(cadena1, cadena2));
		
	}

}
