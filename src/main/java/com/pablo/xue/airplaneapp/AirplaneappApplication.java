package com.pablo.xue.airplaneapp;

import java.text.ParseException;
import java.util.*;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.pablo.xue.airplaneapp.controller.ReservaVueloController;
import com.pablo.xue.airplaneapp.controller.UsuarioController;
import com.pablo.xue.airplaneapp.controller.VueloController;
import com.pablo.xue.airplaneapp.model.Usuario;
import com.pablo.xue.airplaneapp.service.ReservaVueloService;
import com.pablo.xue.airplaneapp.service.UsuarioService;
import com.pablo.xue.airplaneapp.service.VueloService;

@SpringBootApplication
public class AirplaneappApplication {

	public static void main(String[] args)  {
		SpringApplication.run(AirplaneappApplication.class, args);
		
		UsuarioService userServ = new UsuarioService();

		
		userServ.registerUser("user1", "last", "asdf", 35, "asdf@sadf.com", "123");
		userServ.registerUser("user2", "last2", "asdf", 36, "asdf@sadf.com", "456");
		
		
		//Creacion de vuelos
		VueloService vuelServ = new VueloService();

		
		
		vuelServ.registerVuelo("Iberia", "2022-12-10", 120, "Madrid", "Paris", 100);
		vuelServ.registerVuelo("Iberia", "2022-12-12", 120, "Paris", "Madrid", 120);
		vuelServ.registerVuelo("Iberia", "2022-12-13", 120, "Pizza", "Berlin", 120);
		vuelServ.registerVuelo("Iberia", "2022-12-14", 120, "Helsinki", "NuevaYork", 120);
		vuelServ.registerVuelo("Iberia", "2022-12-15", 120, "Londres", "Zurich", 120);
		vuelServ.registerVuelo("Iberia", "2022-12-16", 120, "Copenague", "Luxemburgo", 120);
		vuelServ.registerVuelo("Iberia", "2022-12-17", 120, "Oslo", "Moscú", 120);
		vuelServ.registerVuelo("Iberia", "2022-12-18", 120, "Viena", "Venecia", 120);
		vuelServ.registerVuelo("Iberia", "2022-12-19", 120, "Zurich", "Londres", 120);
		vuelServ.registerVuelo("Iberia", "asdf", 120, "Camboya", "Francia", 130);
		
		
		ReservaVueloService reservVueloServ = new ReservaVueloService();
		



	}

}
