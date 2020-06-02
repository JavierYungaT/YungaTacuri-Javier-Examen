package ec.edu.ups.dao;

import ec.edu.ups.modelo.Vehiculo;

public interface VehiculoDAO extends GenericDao<Vehiculo, Integer>{
	
	public abstract Vehiculo read (String placa);

}
