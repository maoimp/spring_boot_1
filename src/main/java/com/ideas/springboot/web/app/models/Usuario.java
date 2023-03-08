package com.ideas.springboot.web.app.models;

public class Usuario {

	private String nombre;
	private String apellido;
	private String Email;
	private int edad;
	

	

	public Usuario() {
		
	}

 
	public Usuario(String nombre, String apellido, String email, int edad) {

		this.nombre = nombre;
		this.apellido = apellido;
		Email = email;
		this.edad = edad;
	}


	

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String Email) {
		this.Email = Email;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

}
