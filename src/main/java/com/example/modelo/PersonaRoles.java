package com.example.modelo;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

public class PersonaRoles implements Serializable{
	
	/*
	@ManyToOne
	@JoinColumn(name="id_persona", referencedColumnName = "id")
	private Persona persona;
	
	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	public Roles getRol() {
		return rol;
	}

	public void setRol(Roles rol) {
		this.rol = rol;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	@ManyToOne
	@JoinColumn(name="id_role", referencedColumnName = "id")
	private Roles rol;
	
	@Column
	private  String estado;*/

}
