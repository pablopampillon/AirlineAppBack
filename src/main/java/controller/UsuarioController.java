package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import model.Usuario;
import service.UsuarioService;

@RestController
public class UsuarioController {
	
	@Autowired
	UsuarioService userService = new UsuarioService();
	
	/// TESTING ONLY
	@GetMapping("/user/{id}")
	Usuario getUser(@PathVariable int id) {
		return userService.getUser(id);
	}
}
