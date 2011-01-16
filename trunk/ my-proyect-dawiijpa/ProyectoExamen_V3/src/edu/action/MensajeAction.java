package edu.action;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import edu.cibertec.bean.Mensaje;
import edu.cibertec.bean.Usuario;
import edu.negocio.Implementacion.MensajeJPA;
import edu.util.Constantes;

public class MensajeAction extends ActionSupport {

	private String strAsunto;
	private String strMensaje;
	private String strMsjConfirm;

	public String getStrMsjConfirm() {
		return strMsjConfirm;
	}

	public void setStrMsjConfirm(String strMsjConfirm) {
		this.strMsjConfirm = strMsjConfirm;
	}

	public String getStrAsunto() {
		return strAsunto;
	}

	public void setStrAsunto(String strAsunto) {
		this.strAsunto = strAsunto;
	}

	public String getStrMensaje() {
		return strMensaje;
	}

	public void setStrMensaje(String strMensaje) {
		this.strMensaje = strMensaje;
	}

	MensajeJPA serviceMensaje = new MensajeJPA();

	public String Enviar() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Asunto " + strAsunto);
		System.out.println("Mensaje " + strMensaje);
		String vista = "exito";

		try {

			Map<String, Object> activeSession = ActionContext.getContext()
					.getSession();
			Usuario usuario = (Usuario) activeSession.get("usuario");
			Mensaje objmensaje = new Mensaje();
			objmensaje.setStrDestinatario(Constantes.EMAILADMINISTRADOR);
			objmensaje.setStrCodigo(usuario.getStrcodigo());
			objmensaje.setStrAsunto(strAsunto);
			objmensaje.setStrMensaje(strMensaje);

			strMsjConfirm = serviceMensaje.AddMensaje(objmensaje, usuario);
			
			System.out.println("MEnsaje LLegado " + strMsjConfirm);

		} catch (Exception e) {
			vista = "error";
		}

		return vista;
	}

}
