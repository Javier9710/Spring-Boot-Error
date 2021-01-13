package com.ufps.springboot.error.app.services;

import java.util.List;

import com.ufps.springboot.error.app.entities.Usuario;

public interface UsuarioService {
	
	
	public List<Usuario> listar();
	public Usuario obtenerPorId(Integer id);

}
