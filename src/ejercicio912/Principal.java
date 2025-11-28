package ejercicio912;

public class Principal {

	public static void main(String[] args) {

		int [] matriz = new int [100];
		
		OpArrays.insertarAleatorios(matriz, 1, 101);
		
		OpArrays.imprimirArray(matriz);
		
		System.out.println("\nEl minimo es: " + OpArrays.calcularMinimo(matriz));
		OpArrays.ordenarArray(matriz);
		
		System.out.println("\nArray ordenado: ");
		OpArrays.imprimirArray(matriz);
		
				
		System.out.println("La moda es: " + OpArrays.moda(matriz));
		
	}

}
