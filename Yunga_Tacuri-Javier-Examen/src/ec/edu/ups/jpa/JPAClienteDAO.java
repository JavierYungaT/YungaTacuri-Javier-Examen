package ec.edu.ups.jpa;

import javax.persistence.Query;

import ec.edu.ups.dao.ClienteDAO;

import ec.edu.ups.modelo.Cliente;

public class JPAClienteDAO extends JPAGenericDAO<Cliente, String> implements ClienteDAO{

	
	public JPAClienteDAO(Class<Cliente> persistentClass) {
		super(persistentClass);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Cliente readByAddress(String id) {
		// TODO Auto-generated method stub
		Query query = em.createNamedQuery("readByAddress");
		
		query.setParameter("correo", id);
		Cliente user = (Cliente) query.getSingleResult();
		return user;
		
	}
}
