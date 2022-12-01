package com.pablo.xue.airplaneapp.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import com.pablo.xue.airplaneapp.Data;
import com.pablo.xue.airplaneapp.model.Vuelo;

public class VueloService {
	public void registerVuelo( String company, String fecIn, int aforo, String cOrigen, String cDestino, int precio)  {

		Vuelo vuel= new Vuelo(company, fecIn, aforo, cOrigen, cDestino, precio);
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
													&& i.getFecha().equals(fechaIni)).toList();

		return listAux;
	}
	public List <String> getVuelosOrigen() {
		List<String> vuelOr=new ArrayList<String>();
		
	
		for(Vuelo v:Data.vuelos) {
			vuelOr.add(v.getcOrigen());
		}
		
		Set<String> temp = new HashSet<String>(vuelOr);
		String[] uq = temp.toArray(new String[temp.size()]);
		
		List<String> listResult = Arrays.asList(uq);   
		
		return listResult;
	}
	public List <String> getVuelosDest() {
		List<String> vuelOr2=new ArrayList<String>();
		for(Vuelo v:Data.vuelos) {
			vuelOr2.add(v.getcDestino());
		
		}
		Set<String> temp2=new HashSet<String>(vuelOr2);
		String[] tempAr=temp2.toArray(new String[temp2.size()]);
		
		List<String> listResult2=Arrays.asList(tempAr);
		return listResult2;
	}
}
