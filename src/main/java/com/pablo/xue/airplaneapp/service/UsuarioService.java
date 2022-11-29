package com.pablo.xue.airplaneapp.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.pablo.xue.airplaneapp.Data;
import com.pablo.xue.airplaneapp.model.Usuario;

@Service
public class UsuarioService {
	public UsuarioService() {
		// TODO Auto-generated constructor stub
	}

	public void registerUser(String nombre, String apellidos, String nacionalidad, int edad, String correo) {

		Usuario user = new Usuario(nombre, apellidos, nacionalidad, edad, correo);
		Data.users.add(user);
		// TODO Auto-generated constructor stub
	}
	public Usuario getUser(int id) {

        
        Usuario userAux = Data.users.stream().filter(i -> i.getDni()==id).findAny().get();
		return userAux;
	}
	

	
}
