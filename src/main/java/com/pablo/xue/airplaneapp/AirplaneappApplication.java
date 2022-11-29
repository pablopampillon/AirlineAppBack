package com.pablo.xue.airplaneapp;

import java.util.*;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.pablo.xue.airplaneapp.controller.UsuarioController;
import com.pablo.xue.airplaneapp.model.Usuario;
import com.pablo.xue.airplaneapp.service.UsuarioService;

@SpringBootApplication
public class AirplaneappApplication {

	public static void main(String[] args) {
		SpringApplication.run(AirplaneappApplication.class, args);
		
		//Usuario user1 = new Usuario("user1", "last", "asdf", 35, "asdf@sadf.com");
		UsuarioService userServ = new UsuarioService();
		
		userServ.registerUser("user1", "last", "asdf", 35, "asdf@sadf.com");
		userServ.registerUser("user2", "last2", "asdf", 36, "asdf@sadf.com");
		
		UsuarioController userControl = new UsuarioController();
		System.out.println(userControl.getUser("1").getNombre());
	}

}
