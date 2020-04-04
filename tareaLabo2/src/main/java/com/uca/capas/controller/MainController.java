package com.uca.capas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.uca.capas.domain.Usuario;

//El usuario es: Juls26 y contraseña: 1234

@Controller
public class MainController {
	
	@GetMapping("Login")
	public String enviarForm(Usuario usuario) {
		return "Login";
	}
	
	@PostMapping("/Validacion")
	public String procesarForm(Usuario usuario, Usuario contrasenia) {
		
		if(usuario.getUsuario().equals("Juls26")  && contrasenia.getContrasenia().equals("1234"))
			return "MostrarMensajeV";
		else
			return "MostrarMensajeF";
	}

}
