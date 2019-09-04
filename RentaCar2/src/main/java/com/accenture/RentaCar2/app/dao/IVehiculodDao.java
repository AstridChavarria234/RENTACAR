package com.accenture.RentaCar2.app.dao;

import org.springframework.data.repository.CrudRepository;
import com.accenture.RentaCar2.app.entity.*;

public interface IVehiculodDao extends CrudRepository<Vehiculo, Long>{
	
	//en las interfaces solo so ponen las firmas de los metodos
	
}
//comentario