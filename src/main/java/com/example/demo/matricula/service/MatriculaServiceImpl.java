package com.example.demo.matricula.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.demo.matricula.repository.IMatriculaRepo;
import com.example.demo.matricula.repository.IPropietarioRepo;
import com.example.demo.matricula.repository.IVehiculoRepo;
import com.example.demo.matricula.repository.modelo.Matricula;
import com.example.demo.matricula.repository.modelo.Propietario;
import com.example.demo.matricula.repository.modelo.Vehiculo;

@Service
public class MatriculaServiceImpl implements IMatriculaService{
@Autowired 
private IMatriculaRepo iMatriculaRepo;



@Autowired 
private IPropietarioRepo iPropietarioRepo;

@Autowired 
private IVehiculoRepo iVehiculoRepo;

@Autowired
@Qualifier("automatico")
private CalculoMatricula calculoMatriculaAuto;

@Autowired
@Qualifier("automatico")
private CalculoMatricula calculoMatriculaManu;

	
	
	@Override
	public void insertar(Matricula matricula) {
		// TODO Auto-generated method stub
		iMatriculaRepo.insertar(matricula);
	}

	@Override
	public List<Matricula> buscarTodos() {
		// TODO Auto-generated method stub
		return iMatriculaRepo.buscarTodos();
	}

	@Override
	public void realizarM(String identificacion, String placa) {
		// TODO Auto-generated method stub
		
		Vehiculo vehiculo= this.iVehiculoRepo.buscar(placa);
		Propietario propietario=iPropietarioRepo.buscar(identificacion);
		BigDecimal valorMatricula;
		
		if(vehiculo.getTipo().equals("manual")) {
			valorMatricula=this.calculoMatriculaManu.valorMatricula(vehiculo.getPrecio());
		}else {
			valorMatricula=this.calculoMatriculaAuto.valorMatricula(vehiculo.getPrecio());
		}
			System.out.println(valorMatricula);
		//descuento
		if(valorMatricula.compareTo(new BigDecimal(3000))<=0) {
			
			BigDecimal descuento=valorMatricula.multiply(new BigDecimal(0.09));
			BigDecimal valorMatriculaDescuento=valorMatricula.subtract(descuento);
			 valorMatricula=valorMatriculaDescuento;
		}
		
		Matricula matricula= new Matricula();
		matricula.setFechaMAtricula(LocalDateTime.now());
		matricula.setPropietario(propietario);
		matricula.setValor(valorMatricula);
		matricula.setVehiculo(vehiculo);
		iMatriculaRepo.insertar(matricula);
	}

}
