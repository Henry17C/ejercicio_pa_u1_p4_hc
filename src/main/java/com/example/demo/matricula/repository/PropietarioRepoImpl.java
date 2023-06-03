package com.example.demo.matricula.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.matricula.repository.modelo.Propietario;
import com.example.demo.matricula.repository.modelo.Vehiculo;

@Repository
public class PropietarioRepoImpl  implements IPropietarioRepo{

	private static List<Propietario> base = new ArrayList<>();

	
	@Override
	public void insertar(Propietario propietario) {
		// TODO Auto-generated method stub
		base.add(propietario);
	}

	@Override
	public Propietario buscar(String idenficacion) {
		// TODO Auto-generated method stub
		
		Propietario propietarioEncon= new Propietario(); 
		for(Propietario propietario: base) {
			if(idenficacion.equals(propietario.getIdentificacion())) {}
			propietarioEncon=propietario;
		}
		
		return propietarioEncon;
		
	
	}

}
