package dao;

import javax.persistence.EntityManagerFactory;

import basicas.GerenteCompras;

public class GerenteComprasDAO extends DAOGenerico<GerenteCompras>{

	public GerenteComprasDAO(EntityManagerFactory emf) {
		super(emf);
	}

}
