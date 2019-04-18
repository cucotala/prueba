package Ejercicio_2;
import java.io.*;
import java.util.Scanner;

public class FicheroBinario {

	
	public static void copiarFichero() {
		
		try {
			
			FileInputStream archivoLectura = new FileInputStream("imagen.jpg");
			FileOutputStream archivoCopiado = new FileOutputStream("copia imagen.jpg");
			
			int lector = 0;
			
			
			
			while (lector != -1) {
				
				lector = archivoLectura.read();
				
				if (lector != -1) {
					
					
					archivoCopiado.write(lector);
					
					
					
				}
				
				
			}
			
									
			
			archivoCopiado.close();
			archivoLectura.close();
			
		}catch (IOException e) {
			
			System.out.println("Algo no ha ido bien");
			
		}
		
		
		
	}
	
	
	
	public static void borrarFichero() {
		
		File archivo_A_Borrar = new File("imagen.jpg");
		
		archivo_A_Borrar.delete();
		
	}
	
	
	public static void mostrarDatosFichero() {
		
		
		try {
				
		FileInputStream archivoLectura = new FileInputStream("imagen.jpg");
		
		int contador=0;
		int lector=0;
		
		while (lector != -1) {
			
			lector=archivoLectura.read();
			if (lector != -1 ) {
			contador++;
			}
		}
		
		
		
			archivoLectura.close();
			System.out.println("El archivo tiene " + contador + " bytes");
		
		
		}catch (IOException e) {
			
			
			
		}
		
		
	}
	
	
	
	
	public static void realizarOperacion() {
	
		
		Scanner entrada = new Scanner(System.in);
		
		int operacion;
		
		
		
		do {
			
			System.out.println("Qué quieres hacer?");
			System.out.println("(1) Copiar el archivo");
			System.out.println("(2) Eliminar el archivo");
			System.out.println("(3) Comprobar tamaño archivo");
			System.out.println("(4) Salir");
			
			operacion = entrada.nextInt();
			
			
			switch (operacion) {
			
			case 1:
			
				FicheroBinario.copiarFichero();
				
				break;
			
			case 2:
			
				FicheroBinario.borrarFichero();
				
				break;
				
			case 3:
				
				mostrarDatosFichero();
				
				break;
				
			
			case 4:
			
			System.out.println("¡Hasta pronto!");
		
		
		}
			
		}
		
		
		while (operacion!=4);
			
		
		entrada.close();
	
	}
	
}
