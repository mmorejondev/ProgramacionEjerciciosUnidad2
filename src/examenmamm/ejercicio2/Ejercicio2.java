package examenmamm.ejercicio2;

public class Ejercicio2 {

	public static void main(String[] args) {

		String fraseInicio="             Hola      qué     tal         mundo              ";
		
			String fraseSinEspacioDelanteDetras=fraseInicio.trim();
		System.out.println("Frase sin espacios delante y detrás: " + fraseSinEspacioDelanteDetras);
		String subfrases [] = fraseSinEspacioDelanteDetras.split(" ");
		for (int i=0;i<subfrases.length;i++) {
			System.out.println("["+i+"]" + subfrases[i]);
		}
		int contadorPalabras=0;
		for (int i=0;i<subfrases.length;i++) {
			if (!subfrases[i].equals("") && !subfrases[i].equals(" ")) {
				contadorPalabras++;
			}
		
		}
		
		System.out.println("Hay " + contadorPalabras + " palabras.");
		
		String [] palabrasReales = new String[contadorPalabras];
		int j=0;
		for (int i=0;i<subfrases.length;i++) {
			if (!subfrases[i].equals("") && !subfrases[i].equals(" ")) {
				palabrasReales[j] = subfrases[i];
				j++;
			}
		}
		String [] arrayFinal = new String [contadorPalabras];
		
		for (int i=0;i<palabrasReales.length;i++) {
			System.out.println("["+i+"]" + palabrasReales[i]);
			arrayFinal[i]=palabrasReales[i].substring(0, 1).toUpperCase() + palabrasReales[i].substring(1).toLowerCase();
		
		}
		String fraseFinal="";
		for (int i=0;i<arrayFinal.length;i++) {
			System.out.println("["+i+"]" + arrayFinal[i]);
			fraseFinal=fraseFinal+arrayFinal[i]+" ";
		}
		
		System.out.println("FRASE FINAL: " + fraseFinal);
		
		
		
		
		
	}

}
