package ec.edu.ups.dao;

import ec.edu.ups.modelo.Cliente;

public interface ClienteDAO extends GenericDao <Cliente, String> {
	
	public abstract Cliente readByAddress(String id);

}
