package com.pablo.xue.airplaneapp.model;

import com.pablo.xue.airplaneapp.Data;

public class ReservaUsu {
private int userId;
private int vuelId;
private int vueloUsu;
public ReservaUsu() {
	// TODO Auto-generated constructor stub
}
public ReservaUsu(int userId, int vuelId) {
	super();
	this.userId = userId;
	this.vuelId = vuelId;
	this.vueloUsu = Data.reservas.size();
}
public int getUserId() {
	return this.userId;
}
public int getVuelId() {
	return this.vuelId;
}
public int getVueloUsu() {
	return this.vueloUsu;
}

}
