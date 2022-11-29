package com.pablo.xue.airplaneapp;

import java.text.ParseException;
import java.util.*;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.pablo.xue.airplaneapp.controller.ReservaVueloController;
import com.pablo.xue.airplaneapp.controller.UsuarioController;
import com.pablo.xue.airplaneapp.model.Usuario;
import com.pablo.xue.airplaneapp.service.ReservaVueloService;
import com.pablo.xue.airplaneapp.service.UsuarioService;
import com.pablo.xue.airplaneapp.service.VueloService;

@SpringBootApplication
public class AirplaneappApplication {

	public static void main(String[] args)  {
		SpringApplication.run(AirplaneappApplication.class, args);
		
		//Usuario user1 = new Usuario("user1", "last", "asdf", 35, "asdf@sadf.com");
		UsuarioService userServ = new UsuarioService();
		VueloService vuel=new VueloService();
		ReservaVueloService resv=new ReservaVueloService();
		userServ.registerUser("user1", "last", "asdf", 35, "asdf@sadf.com");
		userServ.registerUser("user2", "last2", "asdf", 36, "asdf@sadf.com");
		vuel.registerVuelo("Iberia", "2022-12-01", 120, "Madrid", "Francia");
		vuel.registerVuelo("Iberia", "2022-12-02", 120, "Suecia", "Belgica");
		resv.reservarVuel(0, 0);
		
		UsuarioController userControl = new UsuarioController();
		System.out.println(userControl.getUser(1).getNombre());
	}

}
