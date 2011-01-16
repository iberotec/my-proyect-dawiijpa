package edu.negocio.Implementacion;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import edu.cibertec.bean.Examen;
import edu.cibertec.bean.TipoExamen;
import edu.util.ConexionJPA;

public class OpcionesJPA {
 
	public List<TipoExamen> getTipoExamen() {
		List<TipoExamen> lstTipoExamen = null;
		try {

			lstTipoExamen = new ArrayList<TipoExamen>();
			EntityManager em = ConexionJPA.getConexionJPA();
			Query q = em.createNamedQuery("selectTipoExamen");
			lstTipoExamen = q.getResultList();
			
			TipoExamen objSeleccione = new TipoExamen();
			objSeleccione.setStrCodTipo("0");
			objSeleccione.setStrDesTipo("[Seleccione]");
			lstTipoExamen.add(0, objSeleccione);

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		
		}
		
		
		for (TipoExamen tipoExamen : lstTipoExamen) {
			System.out.println("DES " + tipoExamen.getStrDesTipo());
		}

		return lstTipoExamen;
	}
	
	public List<Examen> getListExamens(String strTipo) {
		List<Examen>  lstExamen = null;
		try {
System.out.println("Codigo que llego " + strTipo);
			lstExamen = new ArrayList<Examen>();
			EntityManager em = ConexionJPA.getConexionJPA();
			Query q = em.createNamedQuery("selectExamen");
			q.setParameter("codigoTipo", strTipo);
			lstExamen = q.getResultList();
			Examen objSeleccione = new Examen();
			objSeleccione.setStrCodigo("0");
			objSeleccione.setStrNombre("[Seleccione]");
			lstExamen.add(0, objSeleccione);

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		
		}
		
		
		for (Examen e : lstExamen) {
			System.out.println("DES " + e.getStrNombre());
		}

		return lstExamen;
	}

}
