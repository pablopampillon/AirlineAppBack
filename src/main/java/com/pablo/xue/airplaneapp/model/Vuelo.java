package com.pablo.xue.airplaneapp.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.pablo.xue.airplaneapp.Data;

public class Vuelo {
	private int vuelId;
	private String company;
//	private Date fecIni;
	private String fecha;
	private int aforo;
	private String cOrigen;
	private String cDestino;
	public Vuelo() {
		// TODO Auto-generated constructor stub
	}
	public Vuelo(String company, String fecIn, int aforo, String cOrigen, String cDestino) {
//		super();

		
		this.vuelId = Data.vuelos.size();
		this.company = company;
		this.fecha = fecIn;
		this.aforo = aforo;
		this.cOrigen = cOrigen;
		this.cDestino = cDestino;
	}
	public int getVuelId() {
		return vuelId;
	}
	public void setVuelId(int vuelId) {
		this.vuelId = vuelId;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public int getAforo() {
		return aforo;
	}
	public void setAforo(int aforo) {
		this.aforo = aforo;
	}
	public String getcOrigen() {
		return cOrigen;
	}
	public void setcOrigen(String cOrigen) {
		this.cOrigen = cOrigen;
	}
	public String getcDestino() {
		return cDestino;
	}
	public void setcDestino(String cDestino) {
		this.cDestino = cDestino;
	}



	

}
