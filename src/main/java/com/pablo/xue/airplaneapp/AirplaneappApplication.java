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

		
		
		vuelServ.registerVuelo("Iberia", "asdf", 120, "Madrid", "Francia", 100);
		vuelServ.registerVuelo("Iberia", "asdf", 120, "Madrid", "Francia", 120);
		vuelServ.registerVuelo("Iberia", "asdf", 120, "Camboya", "Francia", 130);
		
		
		ReservaVueloService reservVueloServ = new ReservaVueloService();
		
		reservVueloServ.reservarVuel(1, 1);
		reservVueloServ.reservarVuel(2, 2);
		reservVueloServ.reservarVuel(3, 3);


	}

}
