package edu.action;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import edu.cibertec.bean.Usuario;
import edu.negocio.Implementacion.UsuarioJPA;


public class LoginAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String strUsuario;
	private String strPassword;
	private Usuario usuario;
	private String strMensaje;

	public Usuario getUsuario() {
		return usuario;
	}

	public String getStrMensaje() {
		return strMensaje;
	}

	public void setStrMensaje(String strMensaje) {
		this.strMensaje = strMensaje;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public String getStrUsuario() {
		return strUsuario;
	}

	public void setStrUsuario(String strUsuario) {
		this.strUsuario = strUsuario;
	}

	public String getStrPassword() {
		return strPassword;
	}

	public void setStrPassword(String strPassword) {
		this.strPassword = strPassword;
	}

	UsuarioJPA usuarioServicio = new UsuarioJPA();

	@Override
	public String execute() throws Exception {
		String vista = "exito";
		System.out.println("USUARIO " + strUsuario);
		this.usuario = usuarioServicio.getUsuario(strUsuario);
	
		if (this.usuario != null) {
			if(this.usuario.getStrpassword().equals(strPassword)){
				Map<String,Object> activeSession = ActionContext.getContext().getSession();//Sesión de usuario
				activeSession.put("usuario", usuario);
				System.out.println("Password " + usuario.getStrpassword());
				
			}else{
				vista="error";
				strMensaje = "label.mensaje.passincorrecto";
				System.out.println("Error pass incoreecto");
			}
			

		}else{
			vista = "error";
			strMensaje = "label.mensaje.usuarioincorrecto";
		}
System.out.println("salio "  + vista);

		return vista;
	}

}
