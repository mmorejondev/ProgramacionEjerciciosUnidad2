package ejercicio912;

public class Principal {

	public static void main(String[] args) {

		int [] array = new int [10];
		OpArrays.insertarAleatorios(array, 10, 50);
		OpArrays.imprimirArray(array);
		System.out.println("\nEl minimo es: " + OpArrays.calcularMinimo(array));
		OpArrays.ordenarArray(array);
		System.out.println("\nArray ordenado: ");
		OpArrays.imprimirArray(array);
		
	}

}
