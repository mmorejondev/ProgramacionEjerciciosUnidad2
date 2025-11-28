package ejercicio913.entsal;
import java.util.Scanner;

public class EntradaSalida {


	public static void escribir (String s) {
		System.out.println(s);
	}
	
	public static void escribirSinSalto (String s) {
		System.out.print(s);
	}
	public static String leerCadena() {
		String cadena="";
		Scanner teclado = new Scanner (System.in);
		cadena=teclado.nextLine();
		return cadena;
	}
	public static int leerEntero() {
		int numero=0;
		Scanner teclado = new Scanner (System.in);
		numero=teclado.nextInt();
		teclado.nextLine();
		return numero;
	}

	
	
	
}
