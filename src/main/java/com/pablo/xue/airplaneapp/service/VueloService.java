package com.pablo.xue.airplaneapp.service;

import java.util.*;

import com.pablo.xue.airplaneapp.Data;
import com.pablo.xue.airplaneapp.model.Vuelo;

public class VueloService {
	public void registerVuelo( String company, Date fecIni, int aforo, String cOrigen, String cDestino) {

		Vuelo vuel= new Vuelo(company, fecIni, aforo, cOrigen, cDestino);
		Data.vuelos.add(vuel);
		// TODO Auto-generated constructor stub
	}
	public Vuelo getVuelos(int id) {
		Vuelo vuel1=Data.vuelos.stream().filter(i -> i.getVuelId()==id).findAny().get();
		return vuel1;
	}
	
	public List<Vuelo> getVuelosByParams(String cOrigen, String cDest, String fechaIni) {
		List<Vuelo> listAux = new ArrayList<Vuelo>();
		listAux=Data.vuelos.stream().filter(i -> i.getcOrigen().equals(cOrigen) 
													&& i.getcDestino().equals(cDest)
													&& i.getFecIni().toString().equals(fechaIni)).toList();
		return listAux;
	}
}
