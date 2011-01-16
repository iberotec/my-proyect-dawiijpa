package edu.negocio.Implementacion;

import javax.persistence.EntityManager;

import edu.cibertec.bean.Mensaje;
import edu.cibertec.bean.Usuario;
import edu.util.ConexionJPA;

public class MensajeJPA {
	
	public String AddMensaje(Mensaje  objMensaje , Usuario objusuario){
		String mensaje = "";
		EntityManager em = ConexionJPA.getConexionJPA();
		try {
			
		
		objMensaje.setUsuario(objusuario);
		em.getTransaction().begin();
		em.persist(objMensaje);
		em.flush();
		em.getTransaction().commit();
		
		mensaje ="Este mensaje fue enviado exitosamente";
		
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			mensaje="Se produjo un error al enviar";
		}
		
		return mensaje;
	}

}
