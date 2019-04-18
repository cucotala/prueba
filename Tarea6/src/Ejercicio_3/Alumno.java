package Ejercicio_3;

import java.io.*;


public class Alumno implements Serializable {	
	

	private static final long serialVersionUID = 1L;
	String nombre;
	String dni;
	String direccion;
	int edad;
	
	
	public Alumno(String nombre, String dni, String direccion, int edad) {
		
		this.nombre=nombre;
		this.dni=dni;
		this.direccion=direccion;
		this.edad=edad;
		
	}
		
	
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getDni() {
		return dni;
	}


	public void setDni(String dni) {
		this.dni = dni;
	}


	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	
	public void mostrar() {
		
		System.out.println("Nombre: " + nombre);
		System.out.println("DNI: " + dni);
		System.out.println("Dirección: " + direccion);
		System.out.println("Edad: " + edad);
		System.out.println("--------------------------------");
	}
	
	
	
}
