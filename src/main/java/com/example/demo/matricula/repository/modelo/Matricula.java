package com.example.demo.matricula.repository.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Matricula {
	
	private LocalDateTime fechaMAtricula;
	 private BigDecimal valor;
	 private Propietario propietario;
	 private Vehiculo vehiculo  ;
	 
	 
	@Override
	public String toString() {
		return "Matricula [fechaMAtricula=" + fechaMAtricula + ", valor=" + valor + ", propietario=" + propietario
				+ ", vehiculo=" + vehiculo + "]";
	}
	public LocalDateTime getFechaMAtricula() {
		return fechaMAtricula;
	}
	public void setFechaMAtricula(LocalDateTime fechaMAtricula) {
		this.fechaMAtricula = fechaMAtricula;
	}
	public BigDecimal getValor() {
		return valor;
	}
	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}
	public Propietario getPropietario() {
		return propietario;
	}
	public void setPropietario(Propietario propietario) {
		this.propietario = propietario;
	}
	public Vehiculo getVehiculo() {
		return vehiculo;
	}
	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}
	 
	
}
