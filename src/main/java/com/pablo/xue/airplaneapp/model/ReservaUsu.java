package com.pablo.xue.airplaneapp.model;

import com.pablo.xue.airplaneapp.Data;

public class ReservaUsu {
private int dni;
private int vuelId;
private int vueloUsu;
public ReservaUsu() {
	// TODO Auto-generated constructor stub
}
public ReservaUsu(int dni, int vuelId) {
	super();
	this.dni = dni;
	this.vuelId = vuelId;
	this.vueloUsu = Data.reservas.size();
}
public int getDni() {
	return dni;
}
public int getVuelId() {
	return vuelId;
}
public int getVueloUsu() {
	return vueloUsu;
}

}
