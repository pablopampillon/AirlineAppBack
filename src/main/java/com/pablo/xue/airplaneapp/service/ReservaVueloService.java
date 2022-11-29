package com.pablo.xue.airplaneapp.service;

import org.springframework.stereotype.Component;

import com.pablo.xue.airplaneapp.Data;
import com.pablo.xue.airplaneapp.model.ReservaUsu;
import com.pablo.xue.airplaneapp.model.Usuario;

@Component
public class ReservaVueloService {
	public void reservarVuel(int userId, int vuelId) {
		ReservaUsu reserv = new ReservaUsu(userId, vuelId);
		Data.reservas.add(reserv);
	}
	
	public ReservaUsu getReserva(int userId) {

        
        ReservaUsu reservAux = Data.reservas.stream().filter(i -> i.getDni() == userId).findAny().get();
		return reservAux;
	}

}