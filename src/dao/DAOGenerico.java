package dao;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.Collection;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;

public abstract class DAOGenerico<Entity> {

	private EntityManagerFactory entityManagerFactory;
	private Class<Entity> persistentClass;

	@SuppressWarnings("unchecked")	
	public DAOGenerico(EntityManagerFactory emf){
		this.setEntityManagerFactory(emf);
		this.entityManagerFactory = emf;
		ParameterizedType parameterizedType = (ParameterizedType) getClass().getGenericSuperclass();  
	    persistentClass = (Class<Entity>) parameterizedType.getActualTypeArguments()[0];  
	}
	
	public Entity update(Entity objeto) {		
		EntityManager em = this.entityManagerFactory.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();	
		objeto = em.merge(objeto);
		em.flush();
		tx.commit();	
		em.close();	
		return objeto;
	}
	
	public final List<Entity> getAll() {
		List<Entity> instance = null;
		EntityManager em = this.entityManagerFactory.createEntityManager();
		try {
			instance = ((List<Entity>) em.createQuery(
					"from " + getPersistentClass().getName()).getResultList());
		} catch (RuntimeException re) {
			re.printStackTrace();
		}
		em.close();
		return instance;
	}
	

	public void insert(Entity objeto) {
		EntityManager em = this.entityManagerFactory.createEntityManager();
		EntityTransaction tx = em.getTransaction();		
		try {
			tx.begin();
			em.persist(objeto);
			em.flush();
			tx.commit();
			em.close();
		} catch (PersistenceException e) {
			tx.rollback();
		}
	}

	public final void insertCollection(Collection<Entity> colecao) {
		EntityManager em = this.entityManagerFactory.createEntityManager();
		try {
			EntityTransaction tx = em.getTransaction();
			tx.begin();

			for (Entity entidade : colecao) {
				em.persist(entidade);	
			}
			
			tx.commit();
			
			em.close();
		} catch (PersistenceException e) {
			e.printStackTrace();
		}
	}

	public final void remove(Entity objeto) {
		EntityManager em = this.entityManagerFactory.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		objeto = em.merge(objeto);	
		em.remove(objeto);		
		tx.commit();		
		em.close();
	}


	public final Entity searchByKey(Serializable chave) {
		Entity instance = null;
		EntityManager em = this.entityManagerFactory.createEntityManager();
		try {
			instance = (Entity) em.find(getPersistentClass(), chave);
		} catch (RuntimeException re) {
			re.printStackTrace();
		}
		em.close();
		return instance;
	}

	public final void refresh(Entity object) {
		EntityManager em = this.entityManagerFactory.createEntityManager();
		em.refresh(object);
		em.close();
	}
	
	public void setEntityManagerFactory(EntityManagerFactory entityManagerFactory) {
		this.entityManagerFactory = entityManagerFactory;
	}

	public EntityManagerFactory getEntityManagerFactory() {		
		return entityManagerFactory;
	}

	protected final Class<Entity> getPersistentClass() {
		return persistentClass;
	}
}
