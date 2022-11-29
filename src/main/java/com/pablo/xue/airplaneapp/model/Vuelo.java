package com.pablo.xue.airplaneapp.model;

import java.util.Date;

import com.pablo.xue.airplaneapp.Data;

public class Vuelo {
	private int vuelId;
	private String company;
	private Date fecIni;
	private int aforo;
	private String cOrigen;
	private String cDestino;
	public Vuelo() {
		// TODO Auto-generated constructor stub
	}
	public Vuelo(String company, Date fecIni, int aforo, String cOrigen, String cDestino) {
//		super();
		this.vuelId = Data.vuelos.size();
		this.company = company;
		this.fecIni = fecIni;
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
	public Date getFecIni() {
		return fecIni;
	}
	public void setFecIni(Date fecIni) {
		this.fecIni = fecIni;
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
