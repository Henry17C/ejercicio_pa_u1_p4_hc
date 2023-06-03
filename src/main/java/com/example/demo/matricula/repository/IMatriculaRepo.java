package com.example.demo.matricula.repository;

import java.util.List;

import com.example.demo.matricula.repository.modelo.Matricula;

public interface IMatriculaRepo {
	
	
	public void insertar(Matricula matricula);
	public List<Matricula> buscarTodos();


}
