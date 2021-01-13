package com.ufps.springboot.error.app.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.ufps.springboot.error.app.entities.Usuario;

@Service
public class UsuarioServiceImpl implements UsuarioService {

	private List<Usuario> lista;

	public UsuarioServiceImpl() {
		this.lista = new ArrayList<>();
		lista.add(new Usuario(1, "javier", "Moncada"));
		lista.add(new Usuario(2, "camilo", "Delgado"));
		lista.add(new Usuario(3, "jean", "Boada"));
		lista.add(new Usuario(4, "Carlo", "Moncada"));
		lista.add(new Usuario(5, "cesar", "Moncada"));
		lista.add(new Usuario(6, "Stewart", "Moncada"));
		lista.add(new Usuario(7, "Andres", "Moncada"));
	}

	@Override
	public List<Usuario> listar() {

		return null;
	}

	@Override
	public Usuario obtenerPorId(Integer id) {
		Usuario resultado = null;
		for (Usuario usuario : lista) {
			if (usuario.getId().equals(id)) {
				resultado = usuario;
				break;

			}

		}
		return resultado;
	}

}
