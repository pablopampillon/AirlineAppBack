package com.pablo.xue.airplaneapp.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pablo.xue.airplaneapp.model.Vuelo;
import com.pablo.xue.airplaneapp.service.VueloService;

@RestController
@RequestMapping("/api")
public class VueloController {

	private final VueloService vueloService = new VueloService();
	
//	@GetMapping("/fly/{id}")
//	Vuelo vuelos(@PathVariable int id) {
//		return vueloServ.getVuelos(id);
//	}
	@GetMapping("/reservas/vuelos/{orig}/{dest}/{fec}")
	List<Vuelo> getVuelos(@PathVariable String orig,@PathVariable String dest,@PathVariable String fec) {
//		reservV.getReserva(user.getDni());
		List<Vuelo> vuel=new ArrayList<Vuelo>();
		return  vuel;
		
	}
}
