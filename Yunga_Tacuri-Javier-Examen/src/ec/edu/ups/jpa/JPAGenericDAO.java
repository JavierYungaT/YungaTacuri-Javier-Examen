package ec.edu.ups.jpa;

import java.util.List;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.ParameterExpression;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import ec.edu.ups.dao.GenericDao;
import ec.edu.ups.modelo.Cliente;
import ec.edu.ups.modelo.Vehiculo;



public class JPAGenericDAO <T, ID> implements GenericDao<T, ID> {

	private Class<T> persistentClass;
	protected EntityManager em;



	public JPAGenericDAO(Class<T> persistentClass) {
		this.persistentClass = persistentClass;
		this.em = Persistence.createEntityManagerFactory("jpa_new").createEntityManager();

	}

	@Override
	public void create(T entity) {
		em.getTransaction().begin();
		try {
			em.persist(entity);
			em.getTransaction().commit();
		}catch(Exception e) {
			System.out.println(">>>> ERROR:JPAGenericDAO:create " + e);
			if (em.getTransaction().isActive())
				em.getTransaction().rollback();
		}
	}

	@Override
	public T read(ID id) {
		// TODO Auto-generated method stub
		return em.find(persistentClass, id);
	}

	@Override
	public void update(T entity) {
		// TODO Auto-generated method stub
		em.getTransaction().begin();
		try {
			em.merge(entity);
			em.getTransaction().commit();
		} catch (Exception e) {
			System.out.println(">>>> ERROR:JPAGenericDAO:update " + e);
			if(em.getTransaction().isActive())
				em.getTransaction().rollback();
		}	
	}

	@Override
	public void delete(T entity) {
		// TODO Auto-generated method stub
		em.getTransaction().begin();
		try {
			em.remove(entity);
			em.getTransaction().commit();
		} catch (Exception e) {
			System.out.println(">>>> ERROR:JPAGenericDAO:delete " + e);
			if (em.getTransaction().isActive())
				em.getTransaction().rollback();
		}
	}
	///metodo nuevo

	@Override
	public List<T> find() {
		// TODO Auto-generated method stub
		CriteriaBuilder criteriaBuilder = em.getCriteriaBuilder();
		CriteriaQuery<T> criteriaQuery = criteriaBuilder.createQuery(this.persistentClass);
		
		Root<T> root = criteriaQuery.from(this.persistentClass);
		
		criteriaQuery.select(root); 
		if(em.createQuery(criteriaQuery).getResultList()!= null) {

			return em.createQuery(criteriaQuery).getResultList();
		}else {
			return null;
		}

	}

	@Override
	public Vehiculo read(Cliente cliente) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Vehiculo> findByUsuario(Cliente cliente) {
		// TODO Auto-generated method stub
		return null;
	}

	


}
