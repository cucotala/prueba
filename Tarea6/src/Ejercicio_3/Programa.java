package Ejercicio_3;

import java.io.*;
import java.util.Scanner;



public class Programa {

	public static void main(String[] args) {
		 
		
		Alumno alumnoNuevo = new Alumno("Alfonso", "12345678A", "Calle de la Sardina Nº 57", 23);
		
		int opcion;
		
		Scanner entrada = new Scanner(System.in);
		
		do {
			
						
			System.out.println("Qué deseas realizar?");
			System.out.println("(1) Añadir alumno");
			System.out.println("(2) Listar alumno");
			System.out.println("(3) Salir");
			
			opcion = entrada.nextInt();
			
			switch (opcion) {
			
			case 1:
					
					
				try {
						
					
					
					FileOutputStream archivoGuardado = new FileOutputStream("alumno.dat");	
					
					ObjectOutputStream guardar = new ObjectOutputStream (archivoGuardado);
					
					guardar.writeObject(alumnoNuevo);
					
					archivoGuardado.close();
					guardar.close();
					
					
				}catch(Exception e) {
						
						System.out.println("No se ha podido guardar el archivo");
						
					}
					
					
				
			
				break;
			
			case 2:
				
				try {
				
					
				Alumno alumnoRecuperado;	
					
				FileInputStream archivoCargado = new FileInputStream("alumno.dat");	
				
				ObjectInputStream cargar = new ObjectInputStream (archivoCargado);
				
				alumnoRecuperado = (Alumno)cargar.readObject();
				
				
				archivoCargado.close();
				cargar.close();
				
				alumnoRecuperado.mostrar();
				
				}catch(Exception e) {
					
					System.out.println("No se han podido recuperar los datos");
					
				}
				
				
				break;
			
			
				
			case 3:
			
				System.out.println("¡Hasta pronto!");
			}
			
		}while (opcion != 3);
		
		
		
		entrada.close();
		
		

	}

}
