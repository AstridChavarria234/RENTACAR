package com.accenture.RentaCar2.app.service;

import java.util.List;

import com.accenture.RentaCar2.app.entity.Vehiculo;

public interface IVehiculoSevice {
	public Vehiculo guardar(Vehiculo vehiculo);
	
	public void borrar (Long id);
	
	public Vehiculo buscarVeiculoPorId(Long id);
	
	public List<Vehiculo> ListarTodos();
	
	

}
