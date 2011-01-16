package edu.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ConexionJPA {
private static EntityManagerFactory entityManagerFactory ;
private static EntityManager em;

public static EntityManager getConexionJPA(){
	entityManagerFactory = Persistence.createEntityManagerFactory("colegio");
	em = entityManagerFactory.createEntityManager();
	return em;
}

}
