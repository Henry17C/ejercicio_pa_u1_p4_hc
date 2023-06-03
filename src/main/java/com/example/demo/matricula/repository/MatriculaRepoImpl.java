package com.example.demo.matricula.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.matricula.repository.modelo.Matricula;

@Repository
public class MatriculaRepoImpl  implements IMatriculaRepo{

	
	private static List<Matricula> base = new ArrayList<>();

	@Override
	public void insertar(Matricula matricula) {
		// TODO Auto-generated method stub
		base.add(matricula);
	}

	@Override
	public List<Matricula> buscarTodos( ) {
		// TODO Auto-generated method stub
		return base;
	}

}
