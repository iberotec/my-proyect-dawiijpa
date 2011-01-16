package edu.negocio.Implementacion;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import edu.cibertec.bean.Usuario;

import edu.util.ConexionJPA;

public class UsuarioJPA {
	
	public Usuario getUsuario(String strUsuario) {
		Usuario usuario = null;
		EntityManager em   ;
		System.out.println("LLEGo el usuario " + strUsuario);
		try {
			 em = ConexionJPA.getConexionJPA();
			Query q = em.createNamedQuery("selectUsuario");
			q.setParameter("codigo", strUsuario);

			usuario = (Usuario) q.getSingleResult();
System.out.println("USUARIO QUE LLEGO " + usuario.getStrnombreBD());
		} catch (Exception e) {
			// TODO: handle exception
e.printStackTrace();
		}

		return usuario;
	}

	public String ModificarUsuario(Usuario objUsuario) {
			
		String result ="";
		
		try {
			System.out.println("Usuario que llego " + objUsuario.getStrcodigo());
			EntityManager em = ConexionJPA.getConexionJPA();
			em.getTransaction().begin();
			Usuario userTemp = em.find(Usuario.class, objUsuario.getStrcodigo());
			System.out.println("usuario obtenido x jpa " + userTemp.getStrpassword());
			userTemp = objUsuario;
			em.merge(userTemp);
			em.flush();
			em.getTransaction().commit();
			result ="Se Modifico con exito";
			
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Entro al error");
			result  ="Se Produjo algun Error";
		}

			return result;
	}

}
