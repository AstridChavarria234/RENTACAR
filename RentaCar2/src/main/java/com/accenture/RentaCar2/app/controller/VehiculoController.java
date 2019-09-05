package com.accenture.RentaCar2.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.accenture.RentaCar2.app.entity.Vehiculo;
import com.accenture.RentaCar2.app.service.IVehiculoService;


@RestController
@RequestMapping("/api")
public class VehiculoController {
	
	@Autowired
	private IVehiculoService vehiculoService;
	
	@GetMapping("/vehiculos")
	public List<Vehiculo> listar(){
		return vehiculoService.ListarTodos();
		
		
	}

	@GetMapping("/vehiculos/{id}")
	
	public Vehiculo buscarPorId(@PathVariable Long id) {
		return vehiculoService.buscarVeiculoPorId(id);
		
		
	}

	
	@PostMapping("/vehiculos")
	public Vehiculo guaradar(@RequestBody Vehiculo vehiculo) {
		return vehiculoService.guardar(vehiculo);
		
	}
	@SuppressWarnings("unused")
	@PostMapping ("/actualizar")	
	public Vehiculo actualizar(@RequestBody Vehiculo vehiculo) {
	

	Vehiculo vehiAActualizar = new Vehiculo();
	Vehiculo vehiActual = vehiculoService.buscarVeiculoPorId(vehiculo.getId());
	vehiAActualizar.setId(vehiculo.getId());
	vehiAActualizar.setColor(vehiculo.getColor());
	vehiAActualizar.setLinea(vehiculo.getLinea());
	vehiAActualizar.setMarca(vehiculo.getMarca());
	vehiAActualizar.setModeloAuto(vehiculo.getModeloAuto());
	vehiAActualizar.setPlaca(vehiculo.getPlaca());
	

	return vehiculoService.guardar(vehiAActualizar);
	}
	
	@DeleteMapping("/vehiculos/{id}")
	public String borrar(@PathVariable Long id) {
		vehiculoService.borrar(id);
		return "El vehiculo se borro correctamente";
		
	}
}
