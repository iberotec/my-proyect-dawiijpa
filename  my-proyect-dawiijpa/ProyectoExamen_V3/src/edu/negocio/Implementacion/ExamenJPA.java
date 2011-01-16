package edu.negocio.Implementacion;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;


import edu.cibertec.bean.Pregunta;

import edu.util.ConexionJPA;

public class ExamenJPA {
	
	
	public List<Pregunta> GetPreguntasExamen(String strcodigo){
		List<Pregunta> lstPregunta = new ArrayList<Pregunta>();
		System.out.println("Enmtro " + strcodigo);
		try {
			EntityManager em = ConexionJPA.getConexionJPA();
			
			Query q = em.createNamedQuery("selecPregunta");
		
			q.setParameter("codigo", strcodigo);
		
			lstPregunta = q.getResultList();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		for (Pregunta pregunta : lstPregunta) {
			System.out.println("Pregunta " + pregunta.getStrPregunta());
		}
		
		
		return lstPregunta;
	}
	

	
	

}
