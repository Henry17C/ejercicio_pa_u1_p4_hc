package com.example.demo.matricula.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.matricula.repository.modelo.Vehiculo;

@Repository
public class VehiculoRepoImpl implements IVehiculoRepo {

	private static List<Vehiculo> base = new ArrayList<>();
	@Override
	public void insertar(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		base.add(vehiculo);
	}

	@Override
	public void actualizar(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		this.eliminar(vehiculo.getPlaca());
		this.base.add(vehiculo);
		
	}

	@Override
	public Vehiculo buscar(String placa) {
		// TODO Auto-generated method stub
		Vehiculo vehiculoEncon= new Vehiculo();
		for(Vehiculo vehiculo: base) {
			if(placa.equals(vehiculo.getPlaca())) {}
			vehiculoEncon=vehiculo;
		}
		
		return vehiculoEncon;
	}

	@Override
	public void eliminar(String placa) {
		// TODO Auto-generated method stub
		
		this.base.remove(this.buscar(placa));
		
	}
	
	

}
