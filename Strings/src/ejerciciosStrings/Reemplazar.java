package ejerciciosStrings;

public class Reemplazar {

	public static String sustituye(String cadena1) {
		return cadena1.replace('a', 'o');
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cadena1 = Utilidades.leerCadena("Introduce una cadena");
		
		System.out.println(sustituye(cadena1));
	}

}
