package com.ufps.springboot.error.app.controllers;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.ufps.springboot.error.app.errors.UsuarioNoEncontradoException;

@ControllerAdvice
public class ErrorHandlerController {
	
	
	@ExceptionHandler({ArithmeticException.class})
	public String aritmeticaError(ArithmeticException ex,Model model) {
		model.addAttribute("error", "Error de aritmetica");
		model.addAttribute("message", ex.getMessage());
		model.addAttribute("status", HttpStatus.INTERNAL_SERVER_ERROR.value());
		model.addAttribute("timestamp", new Date());
		return "error/aritmetica";
		
	}

	
	@ExceptionHandler({NumberFormatException.class})

		public String formatError(NumberFormatException ex,Model model) {

		model.addAttribute("error", "Error al convertir el String");
		model.addAttribute("message", ex.getMessage());
		model.addAttribute("status", HttpStatus.INTERNAL_SERVER_ERROR.value());
		model.addAttribute("timestamp", new Date());
		return "error/numero";
		
	}
	
	@ExceptionHandler({UsuarioNoEncontradoException.class})
	public String usuarioNoEncontrado(UsuarioNoEncontradoException ex,Model model) {
		model.addAttribute("error", "Usuario no Encontrado!");
		model.addAttribute("message", ex.getMessage());
		model.addAttribute("status", HttpStatus.INTERNAL_SERVER_ERROR.value());
		model.addAttribute("timestamp", new Date());
		return "error/usuario";
		
	}


}
