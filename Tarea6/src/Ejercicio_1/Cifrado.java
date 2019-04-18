package Ejercicio_1;
import java.io.*;


public class Cifrado {

	
	
	
	
	public static void encriptarFichero() {
				
		
		String abecedario = "abcdefghijklmnñopqrstuvwxyzabc";
		char [] almacenLetras = new char [abecedario.length()];
		
		
		for (int i=0; i<abecedario.length(); i++) {
			 
			
			almacenLetras[i] = abecedario.charAt(i);
			
		}
		
		
		try {
		
		FileReader lectura = new FileReader("C:\\Users\\Juanma\\Desktop\\PruebaStreamReader\\Texto_Original.txt");
		
		FileWriter escritura = new FileWriter("C:\\Users\\Juanma\\Desktop\\PruebaStreamReader\\Texto_Cifrado.txt");
		
			int lector=0;
		
			while(lector != -1) {
		
				lector=lectura.read();
		
				char letra = (char)lector;
		
				for (int i=0; i<almacenLetras.length; i++) {
					
					if (letra == almacenLetras[i]) {
						
						
												
						escritura.write(almacenLetras[i+3]);
						
						break;
						
					}
					
				}
						
			}
					
			escritura.close();
			lectura.close();
		
		}catch (IOException e){
			
			System.out.println("Algo no ha ido bien");
			
		}
	
	
	}
	
	
	public static void desencriptarFichero() {
		
				
		String abecedario = "zyxwvutsrqpoñnmlkjihgfedcbazyx";
		
		char [] almacenLetras = new char [abecedario.length()];
		
		for (int i=0; i<abecedario.length(); i++) {	 
			
			almacenLetras[i] = abecedario.charAt(i);		
		
		}
		
		
		try {
			
		FileReader lectura = new FileReader("C:\\Users\\Juanma\\Desktop\\PruebaStreamReader\\Texto_Cifrado.txt");	
		
		FileWriter escritura = new FileWriter("C:\\Users\\Juanma\\Desktop\\PruebaStreamReader\\Texto_Descifrado.txt");
			
			int lector=0;
			
			while (lector != -1) {
				
				lector=lectura.read();
				
				char letra = (char)lector; 
				
				for (int i=0; i<almacenLetras.length; i++) {
					
					if (letra == almacenLetras[i]) {
												
						escritura.write(almacenLetras[i+3]);
						
						break;
						
					}
				}
			}
		
		lectura.close();
		escritura.close();
		
			
		}catch (IOException e) {
			
			System.out.println("Algo no ha ido bien");
		}
		
		
		
	}	
	
}
