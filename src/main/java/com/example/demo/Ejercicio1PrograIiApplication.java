package com.example.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.matricula.repository.IPropietarioRepo;
import com.example.demo.matricula.repository.IVehiculoRepo;
import com.example.demo.matricula.repository.modelo.Matricula;
import com.example.demo.matricula.repository.modelo.Propietario;
import com.example.demo.matricula.repository.modelo.Vehiculo;
import com.example.demo.matricula.service.IMatriculaService;

@SpringBootApplication
public class Ejercicio1PrograIiApplication implements CommandLineRunner {
	
	@Autowired
	private IMatriculaService iMatriculaService;
	
	@Autowired 
	private IPropietarioRepo iPropietarioRepo;
	
	@Autowired 
	private IVehiculoRepo iVehiculoRepo;
	

	public static void main(String[] args) {
		SpringApplication.run(Ejercicio1PrograIiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		//1 Crear vehiculo
		System.out.println("insertar vehiculo");
		Vehiculo vehiculo= new Vehiculo();
		
		vehiculo.setMarca("Totoya");
		vehiculo.setModelo("Corolla");
		vehiculo.setPlaca("h1");
		vehiculo.setPrecio(new BigDecimal(20000));
		vehiculo.setTipo("automatico");
		
		iVehiculoRepo.insertar(vehiculo);
		System.out.println(iVehiculoRepo.buscar("h1"));

		//2 actuazar atributos
		
		System.out.println("actualizar vehiculo");

		vehiculo.setMarca("Honda");
		vehiculo.setModelo("Integra type R");
		iVehiculoRepo.actualizar(vehiculo);
		System.out.println(iVehiculoRepo.buscar("h1"));

		//3 crear unpropietario
		System.out.println("crea propietario");
		Propietario propietario = new Propietario();

		
		propietario.setApellido("Coyago");
		propietario.setFechaNacimiento(LocalDateTime.of(2000, 5, 28, 10, 00));
		propietario.setIdentificacion("12345");
		propietario.setNombre("Henry");
		
		
		iPropietarioRepo.insertar(propietario);
		System.out.println(iPropietarioRepo.buscar("123"));
		
		
		//4 realizar la matricula
		iMatriculaService.realizarM("12345", "h1");
		
		List<Matricula> base=iMatriculaService.buscarTodos();
		
		for(Matricula matricula: base) {
			System.out.println(matricula);
		}
		
		
		
	}

}
