package com.pablo.xue.airplaneapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pablo.xue.airplaneapp.model.Vuelo;
import com.pablo.xue.airplaneapp.service.UsuarioService;
import com.pablo.xue.airplaneapp.service.VueloService;

@RestController
@RequestMapping("/api")
public class VueloController {

	private final VueloService vueloService = new VueloService();
	
//	@GetMapping("/fly/{id}")
//	Vuelo vuelos(@PathVariable int id) {
//		return vueloServ.getVuelos(id);
//	}
}
