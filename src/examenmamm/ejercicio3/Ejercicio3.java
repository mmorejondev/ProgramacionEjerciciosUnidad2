package examenmamm.ejercicio3;

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
	
		/*Recorremos el array de alumnos, que en este caso son 3*/
		for (int i=0;i<alumnos.length;i++) {
			/*Mostramos el nombre que sabemos que está en la columna 0*/
			System.out.println("Nombre: " + alumnos[i][0]);
			double media=0.0;
			double suma = 0.0;
			boolean promociona=true; //Con este booleano vamos a saber si promociona o no en una sola pasada
			/*Mostramos las notas de los distintos módulos, cuyos nombres están en el array modulos
			 * y cuyas calificaciones están en las columnas 1 a la 5 del array alumnos*/
			for (int j=1;j<alumnos[i].length-1;j++) {
				/*En la siguiente linea tenemos que deducir la correspondencia entre el indice j 
				 * que está recorriendo las notas de los alumnos, desde 1 hasta 5, y el indice
				 * que recorre el array modulos, que es el que contiene el nombre de los módulos*/
				System.out.println(modulos[j-1] + " : " + Integer.parseInt(alumnos[i][j]));
				suma = suma + Integer.parseInt(alumnos[i][j]); // aprovechamos para ir calculado la suma
				if (Integer.parseInt(alumnos[i][j])<5) //si alguna nota es inferior a 5 ya sabemos que no promociona
					promociona=false;
			}
				
			media = suma / 5; // calculamos la media para cada alumno
			System.out.println("La media es: " + media);
			if (promociona) { //Con este booleano podemos mostrar el mensaje correspondiente
				System.out.println("PROMOCIONA");
				alumnos[i][alumnos[i].length-1]="SI"; // y además actualizamos la ultima columna con el valor "SI"
			}else {
				System.out.println("NO PROMOCIONA");
				alumnos[i][alumnos[i].length-1]="NO"; // análogamente para el caso de que no promocione

			}
			System.out.println();
		}
		
		/*En este punto del programa ya hemos mostrado toda la información que se pedía, pero nos falta comprobar 
		 * que en el la tabla hemos escrito los valores "SI" o "NO" según corresponda*/
		
				
		/*Mostramos la tabla alumnos para comprobar que hemos actualizado el campo PROMOCIONA correctamente*
		 */
		 for (int i=0;i<alumnos.length;i++) {
			 System.out.println("Nombre:" + alumnos[i][0]);
			 System.out.print("Notas: ");
			 for (int j=1;j<alumnos[i].length-1;j++) {
				 System.out.print(alumnos[i][j] + " ");
			 }
			 System.out.println();
			 System.out.println("PROMOCIONA: " + alumnos[i][alumnos[i].length-1]);
		 }
		
	}

}
