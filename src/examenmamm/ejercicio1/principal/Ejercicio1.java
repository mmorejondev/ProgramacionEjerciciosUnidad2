package examenmamm.ejercicio1.principal;

public class Ejercicio1 {

	public static void main(String[] args) {

		final int TAM = 5;
		String [] libros = {"El Quijote","El Señor de los anillos","Cien años de soledad","1984","La princesa prometida"};
		boolean [] prestamos = new boolean [TAM];
		int opcionUsuario = Funcionalidades.mostrarMenu();
		
		while (opcionUsuario!=5) {
			if (opcionUsuario==1) {
				Funcionalidades.mostrarLibros(libros, prestamos);
							
			}else if (opcionUsuario==2) {
				int indiceLibro =Funcionalidades.pedirIndice();
				if (Funcionalidades.prestarLibro(prestamos, indiceLibro)) {
					System.out.println("Préstamo correcto.");
				}else {
					System.out.println("El libro ya estaba prestado.");
				}
				
			}else if (opcionUsuario==3) {
				int indiceLibro =Funcionalidades.pedirIndice();
				if (Funcionalidades.devolverLibro(prestamos, indiceLibro)) {
					System.out.println("Libro devuelto correctamente.");
				}else {
					System.out.println("El libro NO ESTABA prestado.");
				}
				
				
			}else if (opcionUsuario==4) {
				
				int prestados=Funcionalidades.contarPrestados(prestamos);
				System.out.println("Hay " + prestados + " libros prestados.");
			}
			
			opcionUsuario = Funcionalidades.mostrarMenu();
			
		}
		
		System.out.println("PROGRAMA TERMINADO.");
		
		
	}

}
