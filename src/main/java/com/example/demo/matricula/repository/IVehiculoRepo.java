package com.example.demo.matricula.repository;

import com.example.demo.matricula.repository.modelo.Vehiculo;

public interface IVehiculoRepo {
	
	public void insertar(Vehiculo vehiculo);
	public void actualizar(Vehiculo vehiculo);
	public Vehiculo buscar(String placa);
	public void eliminar (String placa);

}
