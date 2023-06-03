package com.example.demo.matricula.service;

import java.math.BigDecimal;

import org.springframework.stereotype.Service;

@Service("automatico")
public class MatriculaAutomaticoServiceImpl  implements CalculoMatricula {

	@Override
	public BigDecimal valorMatricula(BigDecimal precioVehi) {
		// TODO Auto-generated method stub
		BigDecimal valorP= precioVehi.multiply(new BigDecimal(0.15));
		
		return valorP;
	}

}
