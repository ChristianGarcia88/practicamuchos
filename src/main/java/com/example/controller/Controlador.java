package com.example.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.modelo.Persona;
import com.example.modelo.Roles;
import com.example.repository.Repository;
import com.example.repository.RepositoryRole;

@Controller
public class Controlador {

	
	@Autowired
	private RepositoryRole role;
	
	@Autowired
	private Repository perso;
	
	@GetMapping({"/index", "/"})
	public String  inicio (Model m) {
		
		List<Roles> lista= (List<Roles>) role.findAll();
		
		for(Roles r: lista) {
			
			System.out.println(r.getRole());
			
		}
		Persona p = new Persona();
		m.addAttribute("personas", p);
		m.addAttribute("valor", lista);
		return "index";
		
		
	}
	
	
	@PostMapping("/procesar")
	
	public String  procesar( Persona persona,  Model m) {
		
		//System.out.println(persona.getNombre()  + persona.getApellido() +persona.getEdad() + persona.getRoles().get(0).getRole() +  persona.getRoles().get(1).getRole());
		
		perso.save(persona);
		return "procesado";
		
	}
	
	
	
}
