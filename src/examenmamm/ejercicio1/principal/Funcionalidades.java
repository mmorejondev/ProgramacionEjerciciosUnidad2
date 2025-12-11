package examenmamm.ejercicio1.principal;

import java.util.Scanner;

public class Funcionalidades {

	public static int mostrarMenu() {

		Scanner teclado = new Scanner (System.in);
		System.out.println("Introduzca la opción: ");
		System.out.println("1. Ver libros"); 
		System.out.println("2. Prestar libro"); 
		System.out.println("3. Devolver libro"); 
		System.out.println("4. Mostrar libros prestados"); 
		System.out.println("5. Terminar");
		int opcion = teclado.nextInt();
		
		
		while (opcion < 1 || opcion > 5) {
		
			System.out.println("ERROR. OPCION NO VALIDA.");
			System.out.println("Introduzca la opción: ");
			System.out.println("1. Ver libros"); 
			System.out.println("2. Prestar libro"); 
			System.out.println("3. Devolver libro"); 
			System.out.println("4. Mostrar libros prestados"); 
			System.out.println("5. Terminar");
			opcion = teclado.nextInt();
			
		}
		
		return opcion;
    	  
      }
	
	public static void mostrarLibros(String[] titulos, boolean[] prestados) {
		for (int i=0;i<titulos.length;i++) {
			if (prestados[i]==true)
				System.out.println(i + " - " + titulos[i] + " - " + " Prestado ");
			else
				System.out.println(i + " - " + titulos[i] + " - " + " Disponible");
		}
		
	}
	public static int pedirIndice() {
		Scanner teclado = new Scanner (System.in);
		System.out.println("Introduzca indice: ");
		int indice = teclado.nextInt();
		while (indice < 0 || indice > 5) {
			System.out.println("INDICE INVALIDO.");
			System.out.println("Introduzca indice: ");
			indice = teclado.nextInt();
				
		}
		return indice;
		
		
		
	}
	static boolean prestarLibro(boolean[] prestados, int indice) {
		boolean prestamoCorrecto=false;
		
		if (prestados[indice]==false) {
			prestados[indice]=true;
			prestamoCorrecto=true;
		}
		return prestamoCorrecto;
	}

	public static boolean devolverLibro(boolean[] prestamos, int indiceLibro) {
		boolean devolucionCorrecta=false;
		
		if (prestamos[indiceLibro]==true) {
			prestamos[indiceLibro]=false;
			devolucionCorrecta=true;
		}
		return devolucionCorrecta;
		
		
	}

	public static int contarPrestados(boolean[] prestamos) {
		int contador=0;
		for (int i=0;i<prestamos.length;i++) {
			if (prestamos[i]==true) {
				contador++;
			}
		}
		return contador;
	}
	
	
	

}