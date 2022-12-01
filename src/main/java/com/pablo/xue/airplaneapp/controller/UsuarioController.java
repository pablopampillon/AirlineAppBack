package com.pablo.xue.airplaneapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pablo.xue.airplaneapp.model.Usuario;
import com.pablo.xue.airplaneapp.service.UsuarioService;

@RestController
@CrossOrigin
public class UsuarioController {
	
	private final UsuarioService userService = new UsuarioService();
	
	/// TESTING ONLY
	@GetMapping("/user/{id}")
	public Usuario getUser(@PathVariable int id) {
		return userService.getUser(id);
	}
	
}
