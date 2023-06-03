package com.example.demo.matricula.service;

import java.util.List;

import com.example.demo.matricula.repository.modelo.Matricula;

public interface IMatriculaService {
	

	public void insertar(Matricula matricula);
	public List<Matricula> buscarTodos();
	public void realizarM(String identificacion, String placa);

}
