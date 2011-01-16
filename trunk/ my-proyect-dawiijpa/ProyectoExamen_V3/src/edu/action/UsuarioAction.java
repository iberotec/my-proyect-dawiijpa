package edu.action;

import java.util.Map;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import edu.cibertec.bean.Usuario;
import edu.negocio.Implementacion.UsuarioJPA;

public class UsuarioAction extends ActionSupport {

	private static final long serialVersionUID = 1L;

	private String mensaje;
	private String strNombre;
	private String strApepat;
	private String strApemat;
	private int intedad;
	private String strEmail;
	private int intDocuIden;
	private String strgradoInstruccion;
	private String strcelular;
	private String strPassword;

	public String getStrPassword() {
		return strPassword;
	}

	public void setStrPassword(String strPassword) {
		this.strPassword = strPassword;
	}

	public String getStrNombre() {
		return strNombre;
	}

	public void setStrNombre(String strNombre) {
		this.strNombre = strNombre;
	}

	public String getStrApepat() {
		return strApepat;
	}

	public void setStrApepat(String strApepat) {
		this.strApepat = strApepat;
	}

	public String getStrApemat() {
		return strApemat;
	}

	public void setStrApemat(String strApemat) {
		this.strApemat = strApemat;
	}

	public int getIntedad() {
		return intedad;
	}

	public void setIntedad(int intedad) {
		this.intedad = intedad;
	}

	public String getStrEmail() {
		return strEmail;
	}

	public void setStrEmail(String strEmail) {
		this.strEmail = strEmail;
	}

	public int getIntDocuIden() {
		return intDocuIden;
	}

	public void setIntDocuIden(int intDocuIden) {
		this.intDocuIden = intDocuIden;
	}

	public String getStrgradoInstruccion() {
		return strgradoInstruccion;
	}

	public void setStrgradoInstruccion(String strgradoInstruccion) {
		this.strgradoInstruccion = strgradoInstruccion;
	}

	public String getStrcelular() {
		return strcelular;
	}

	public void setStrcelular(String strcelular) {
		this.strcelular = strcelular;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	UsuarioJPA usuarioServicio = new UsuarioJPA();

	public String CargarDatos() throws Exception {
		String vista = "exito";
		Map<String, Object> activeSession = ActionContext.getContext()
				.getSession();

		Usuario userTemp = (Usuario) activeSession.get("usuario"); // (Usuario)session.getAttribute("usuario");
		if (userTemp == null)
			return "error";

		this.strNombre = userTemp.getStrnombreBD();
		this.strApepat = userTemp.getStrapePatBD();
		this.strApemat = userTemp.getStrapeMatBD();
		this.intedad = userTemp.getIntedadBD();
		this.strEmail = userTemp.getStremailBD();
		this.intDocuIden = userTemp.getIntDocIdentBD();
		this.strgradoInstruccion = userTemp.getStrgradoInstrucBD();
		this.strcelular = userTemp.getStrcelularBD();
		this.strPassword = userTemp.getStrpassword();

		System.out.println("entro al usuario " + this.strPassword);

		return vista;
	}

	public String ModificarUsuario() throws Exception {
		String vista = "exito";
		try {
			Map<String, Object> activeSession = ActionContext.getContext()
					.getSession();
			Usuario userTemp = (Usuario) activeSession.get("usuario");
			userTemp.setStrnombreBD(this.strNombre);
			userTemp.setStrapePatBD(this.strApepat);
			userTemp.setStrapeMatBD(this.strApemat);
			userTemp.setIntedadBD(this.intedad);
			userTemp.setStremailBD(this.strEmail);
			userTemp.setIntDocIdentBD(this.intDocuIden);
			userTemp.setStrgradoInstrucBD(this.strgradoInstruccion);
			userTemp.setStrcelularBD(this.strcelular);
			userTemp.setStrpassword(this.strPassword);

			System.out.println("Datos Usuario " + userTemp.getStrpassword());
			mensaje = usuarioServicio.ModificarUsuario(userTemp);

			activeSession.put("usuario", userTemp);

			System.out.println(mensaje);

		} catch (Exception e) {
			vista = "error";
		}
		System.out.println("Retorno " + vista);
		return vista;
	}
}
