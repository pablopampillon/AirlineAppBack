package model;

import com.pablo.xue.airplaneapp.Data;

public class Usuario {

private int dni;
private String nombre;
private String apellidos;
private String nacionalidad;
private int edad;
private String correo;
public Usuario() {
	// TODO Auto-generated constructor stub
}
public Usuario(String nombre, String apellidos, String nacionalidad, int edad, String correo) {
	super();
	this.dni = Data.users.size();
	this.nombre = nombre;
	this.apellidos = apellidos;
	this.nacionalidad = nacionalidad;
	this.edad = edad;
	this.correo = correo;
}
public int getDni() {
	return dni;
}
public void setDni(int dni) {
	this.dni = dni;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getApellidos() {
	return apellidos;
}
public void setApellidos(String apellidos) {
	this.apellidos = apellidos;
}
public String getNacionalidad() {
	return nacionalidad;
}
public void setNacionalidad(String nacionalidad) {
	this.nacionalidad = nacionalidad;
}
public int getEdad() {
	return edad;
}
public void setEdad(int edad) {
	this.edad = edad;
}
public String getCorreo() {
	return correo;
}
public void setCorreo(String correo) {
	this.correo = correo;
}


}
