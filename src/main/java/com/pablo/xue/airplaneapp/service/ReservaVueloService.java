package com.pablo.xue.airplaneapp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.pablo.xue.airplaneapp.Data;
import com.pablo.xue.airplaneapp.model.ReservaUsu;
import com.pablo.xue.airplaneapp.model.Usuario;

@Component
public class ReservaVueloService {
	public void reservarVuel(int userId, int vuelId) {
//		List<Usuario> aux=new ArrayList<Usuario>();
		Usuario aux=new Usuario();
		aux=Data.users.stream().filter(i->i.getUserId()==userId).findAny().get();
		if(aux!=null) {
		ReservaUsu reserv = new ReservaUsu(userId, vuelId);
		Data.reservas.add(reserv);
		int value= Data.vuelos.stream().filter(i->i.getVuelId()==vuelId).findAny().get().getAforo();
		Data.vuelos.stream().filter(i -> i.getVuelId()==vuelId).findAny().get().setAforo(value-1);
		}
	}
	public void hacerReserva(int vuelId) {
	
		
	}
	
	public List<ReservaUsu> getReserva(int userId) {
		List<ReservaUsu> listAux=new ArrayList<ReservaUsu>();
        
        listAux = Data.reservas.stream().filter(i -> i.getDni() == userId).toList();
		return listAux;
	}

}
