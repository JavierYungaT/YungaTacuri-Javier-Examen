package ec.edu.ups.dao;

import java.util.List;

import ec.edu.ups.modelo.Cliente;
import ec.edu.ups.modelo.Vehiculo;



public interface GenericDao <T, ID>{
	
	public void create(T entity);

	public T read(ID id);

	public void update(T entity);

	public void delete(T entity);

	public List<T> find();

	Vehiculo read(Cliente cliente);

	List<Vehiculo> findByUsuario(Cliente cliente);

}
