package ejercicio912;

import java.util.Random;

public class OpArrays {

	/*
	 * void imprimirArray(int [] array): Recibe un array y muestra el contenido del array con el formato [ elemento1 ] [ elemento2 ] … [elementoN]
void insertarAleatorios(int [] array, int minimo, int maximo): Recibe un array de enteros inicializado con 10 posiciones y lo rellena con números aleatorios entre minimo y maximo.
Recibe un array de enteros y un elemento a buscar. Devuelve true si el elemento está presente en el array, de lo contrario, devuelve false.
int calcularMaximo(int[] array): Recibe un array de enteros y devuelve el valor máximo.
int calcularMinimo(int[] array): Recibe un array de enteros y devuelve el valor mínimo.
Recibe un array de enteros y lo ordena de forma ascendente.
double calcularMedia(int[] array): Recibe un array de enteros y devuelve la media de los elementos.
int calcularModa(int[] array): Recibe un array de enteros y devuelve la moda, es decir, el valor que más veces se repite.
*/
	
	public static void imprimirArray(int [] array) {
		for (int i=0;i<array.length;i++) {
			System.out.print("["+array[i]+"]");
		}
	}
	public static void insertarAleatorios(int [] array, int minimo, int maximo) {
		Random generador = new Random();
		
		for (int i=0;i<array.length;i++) {
			array[i] = generador.nextInt(minimo, maximo);
		}
	}
	
	public static boolean buscarElemento(int[] array, int elemento) {
		boolean encontrado=false;
		for (int i=0;i<array.length;i++) {
			if (array[i] == elemento) {
				encontrado=true;
			} 
		}
		return encontrado;
	} 
	public static int calcularMinimo(int[] array) {
		int minimo=array[0];
		for (int i=0;i<array.length;i++) {
			if (array[i] < minimo) {
				minimo=array[i];
			} 
		}

		return minimo;
		
	}
	public static int calcularMaximo(int[] array) {
		int maximo=array[0];
		for (int i=0;i<array.length;i++) {
			if (array[i] > maximo) {
				maximo=array[i];
			} 
		}

		return maximo;
		
	}
	/*Este método es un método auxiliar que usamos para ordenar un array.
	 * El método obtiene el mínimo del array, pero modifica el array para ser utilizado 
	 * ya modificado en sucesivas llamadas desde el método ordenarArray*/
	public static int buscarMinimo(int[] array) {
		int minimo=Integer.MAX_VALUE;
		int posicionMinimo=-1;
		for (int i=0;i<array.length;i++) {
			if (array[i] < minimo) {
				minimo=array[i];
				posicionMinimo=i;
			} 
		}
		array[posicionMinimo]=Integer.MAX_VALUE;

		return minimo;
		
	}
	
	public static void ordenarArray(int[] array) {
		
		int [] ordenado = new int [array.length];
		for (int i=0;i<ordenado.length;i++) {
			ordenado[i]=buscarMinimo(array);
		}
		/*Dado que cuando estamos calculando el mínimo
		 * estamos modificando el array, volcamos sobre el array
		 * pasado como parámetro los datos del array ordenado*/
		for (int i=0;i<array.length;i++) {
			array[i]=ordenado[i];
		}
			
	}
	
	public static float calcularMedia(int [] array) {
		
		float media=0.0f;
		float suma=0.0f;
		for (int i=0;i<array.length;i++) {
			suma = suma + array[i];
		}
		media = suma / array.length;
		return media;
	}
	
	public static int moda(int [] array) {
		int moda=0;
		int minimo=calcularMinimo(array);
		int maximo=calcularMaximo(array);
		System.out.println();
		
		int [] contadores = new int[101];
		
		for (int i=0;i<array.length;i++) {
			contadores[array[i]]++;
		}
		
		int maximoRepeticiones = calcularMaximo(contadores);
		for (int i=0;i<contadores.length;i++) {
			if (contadores[i]==maximoRepeticiones) {
				moda=i;
			}
		}
		
		
		
		return moda;
		
	}
	
	
	
	
	
	
	
	
	
}
