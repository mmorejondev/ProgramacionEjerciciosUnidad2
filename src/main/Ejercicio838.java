package main;

public class Ejercicio838 {
	
	public static boolean buscarElemento(int [] matriz, int buscado) {
		boolean encontrado=false;
		//for (int i=0;i<matriz.length && encontrado==false;i++) { --> MÁS EFICIENTE
		for (int i=0;i<matriz.length;i++) {
			if (buscado==matriz[i]) {
				encontrado=true;
			}
		}
		return encontrado;
	}
	
	public static int [] eliminarDuplicados(int [] duplicados) {
		
		int [] unicos = new int[duplicados.length];
	
		boolean encontrado=false;
		
		for (int i=0;i<duplicados.length;i++) {
			encontrado=buscarElemento(unicos,duplicados[i]);
			if (encontrado==false) {
				   unicos[i]=duplicados[i];
			   }else {
				   unicos[i]=Integer.MAX_VALUE;
			   }
		}
		int contadorUnicos=0;
		for (int i=0;i<unicos.length;i++) {
			if (unicos[i]!=Integer.MAX_VALUE) {
				contadorUnicos++;
			}
		}
		
		int [] unicos2 = new int [contadorUnicos];
		int j=0;
		for (int i=0;i<unicos.length;i++) {
			if (unicos[i]!=Integer.MAX_VALUE) {
				unicos2[j]=unicos[i];
				j++;
			}
		}
		
		
		return unicos2;
	}
	


	
	
	public static void main(String[] args) {
		/*Ejercicio propuesto 8.3.8: Eliminar duplicados en un array. 
		 * Escribe un programa en Java que elimine los elementos duplicados en un 
		 * array. Debes crear un método llamado eliminarDuplicados que tome un array 
		 * de números como argumento y devuelva un nuevo array sin elementos duplicados. 
		 * En el método main, crea un array con duplicados, llama al método 
		 * eliminarDuplicados y muestra el array resultante sin duplicados 
		 * en la consola. 
		 * Usar un método similar al creado en el ejercicio anterior 
		 * para determinar si un elemento ya está en el array.
		 */
		int [] conDuplicados = {7,3,6,5,7,1,3,3};
		for (int i=0;i<conDuplicados.length;i++) {
			System.out.print("["+ conDuplicados[i] +"]");
		}
	
		int [] sinDuplicados = eliminarDuplicados(conDuplicados);
		
		System.out.println();
		System.out.println("Sin duplicados: ");
		for (int i=0;i<sinDuplicados.length;i++) {
			System.out.print("["+ sinDuplicados[i] +"]");
		}
	
	
	
	}

}
