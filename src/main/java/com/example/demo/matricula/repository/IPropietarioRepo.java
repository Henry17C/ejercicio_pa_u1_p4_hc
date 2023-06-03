package com.example.demo.matricula.repository;

import com.example.demo.matricula.repository.modelo.Propietario;

public interface IPropietarioRepo {
	
	public void insertar(Propietario propietario);
	public Propietario buscar(String idenficacion);



}
