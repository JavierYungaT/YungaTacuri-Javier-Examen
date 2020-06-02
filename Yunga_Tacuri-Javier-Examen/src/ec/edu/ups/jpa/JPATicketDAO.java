package ec.edu.ups.jpa;


import ec.edu.ups.dao.TicketDAO;

import ec.edu.ups.modelo.Ticket;

public class JPATicketDAO extends JPAGenericDAO<Ticket, String> implements TicketDAO{

	public JPATicketDAO(Class<Ticket> persistentClass) {
		super(persistentClass);
		// TODO Auto-generated constructor stub
	}
	
	
	
	

}
