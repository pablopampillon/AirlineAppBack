package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import model.Vuelo;
import service.VueloService;

@RestController
public class VueloController {
	
	@Autowired
	VueloService vueloServ = new VueloService();
	
	@GetMapping("/fly/{id}")
	Vuelo vuelos(@PathVariable int id) {
		return vueloServ.getVuelos(id);
	}
}
