package examenmamm;

public class Ejercicio3 {

	public static void main(String[] args) {

		String[][] alumnos = {
				  {"Ana", "7", "6", "4", "8", "5", ""},    
				  {"Luis", "5", "5", "5", "5", "5", ""},    
				  {"María", "3", "8", "2", "4", "1", ""} };
		String[] modulos = { 
				  "Programación", 
				  "Lenguajes de Marcas", 
				  "Entornos de Desarrollo", 
				  "Bases de Datos", 
				  "Sistemas Informáticos" };
		for (int i=0;i<alumnos.length;i++) {
			System.out.println("Nombre: " + alumnos[i][0]);
			double media=0.0;
			double suma = 0.0;
			boolean aprobada=true;
			for (int j=0;j<alumnos[i].length;j++) {
				System.out.println(modulos[j] + " : " + Integer.parseInt(alumnos[i][j+1]));
				suma = suma + Integer.parseInt(alumnos[i][j+1]);
				if (Integer.parseInt(alumnos[i][j+1])<5)
					aprobada=false;
			}
				
			media = suma / 5;
			System.out.println("La media es: " + media);
			if (aprobada)
				System.out.println("PROMOCIONA");
			else
				System.out.println("NO PROMOCIONA");
		}
		
	}

}
