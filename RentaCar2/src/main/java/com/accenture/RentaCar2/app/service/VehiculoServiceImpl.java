package com.accenture.RentaCar2.app.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accenture.RentaCar2.app.dao.IVehiculodDao;
import com.accenture.RentaCar2.app.entity.Vehiculo;

@Service
class VehiculoServiceImpl implements IVehiculoService {

	@Autowired
	private IVehiculodDao vehiculoDao;
	
	
	@Override
	public Vehiculo guardar(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		return vehiculoDao.save(vehiculo);
	}

	@Override
	public void borrar(Long id) {
		// TODO Auto-generated method stub
		vehiculoDao.deleteById(id);
		// TODO Auto-generated method stub
	}

	@Override
	public Vehiculo buscarVeiculoPorId(Long id) {
		// TODO Auto-generated method stub
		return vehiculoDao.findById(id).orElse(null);
	}

	@Override
	public List<Vehiculo> ListarTodos() {
		// TODO Auto-generated method stub
		return (List<Vehiculo>) vehiculoDao.findAll();
	}

}
