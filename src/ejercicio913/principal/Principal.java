package ejercicio913.principal;
import ejercicio913.entsal.EntradaSalida;

public class Principal {

	public static void main(String[] args) {
		
		String cadena = EntradaSalida.leerCadena();
		
		EntradaSalida.escribir(cadena);
		
		int numero = EntradaSalida.leerEntero();
		
		String cadenaDeSalida = "" + numero;
		EntradaSalida.escribirSinSalto(cadenaDeSalida);
		
		
		
		
	}

}
