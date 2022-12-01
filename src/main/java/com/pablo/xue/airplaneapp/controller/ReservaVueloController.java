package com.pablo.xue.airplaneapp.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pablo.xue.airplaneapp.Data;
import com.pablo.xue.airplaneapp.model.ReservaUsu;
import com.pablo.xue.airplaneapp.service.ReservaVueloService;

@RestController
@CrossOrigin
public class ReservaVueloController {
	
	@Autowired
	ReservaVueloService reservV=new ReservaVueloService();
	
	@GetMapping("/reservas/vuelos/{userId}")
	List<ReservaUsu> getReserUsu(@PathVariable int userId) {
//		reservV.getReserva(user.getDni());
		List<ReservaUsu> lsAux=new ArrayList<ReservaUsu>();
		for(ReservaUsu usu: Data.reservas) {
			if(usu.getUserId()==userId) {
				lsAux.add(usu);
			}
		}
//		lsAux=Data.reservas.stream().filter(i->i.getDni()==userId).findAny().get();
		return lsAux;
		
	}
	

	@PostMapping("/reservas")
	public void save(@RequestBody ReservaUsu reservaUsu) {
		reservV.reservarVuel(reservaUsu.getUserId(), reservaUsu.getVuelId());
	}
	
	
	//Testing
	@GetMapping("/reservas")
	List<ReservaUsu> getAllReserv() {
		return reservV.getAllReservas();
	}

}
