package edu.action;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.sun.xml.internal.messaging.saaj.packaging.mime.util.QEncoderStream;

import edu.cibertec.bean.Examen;
import edu.cibertec.bean.Pregunta;
import edu.cibertec.bean.TipoExamen;
import edu.negocio.Implementacion.OpcionesJPA;
import edu.util.ConexionJPA;
import edu.util.XMLTool;

public class AjaxAction extends ActionSupport implements ServletRequestAware,
		ServletResponseAware {
	private HttpServletRequest request;
	private HttpServletResponse response;

	private List<TipoExamen> lstTipoExamen;

	public List<TipoExamen> getLstTipoExamen() {
		return lstTipoExamen;
	}

	public void setLstTipoExamen(List<TipoExamen> lstTipoExamen) {
		this.lstTipoExamen = lstTipoExamen;
	}

	OpcionesJPA servicioOpciones = new OpcionesJPA();

	public String CargarComboTipoExamen() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Entro");
		String vista = "exito";
		this.lstTipoExamen = servicioOpciones.getTipoExamen();

		return vista;
	}

	public String CargarComboTipo() {

		String strTipo = request.getParameter("var");
		System.out.println("Codgio Q llego " + strTipo);
		try {

			List<Examen> examenes;

			examenes = servicioOpciones.getListExamens(strTipo);

			if (examenes != null || examenes.size() > 0) {
				PrintWriter imp = response.getWriter();
				response.setContentType("text/xml");
				String sbout = XMLTool.ListaExamenes(examenes);
				imp.print(sbout);

			}

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		return null;
	}

	public String SetAlternativaPregunta() {
		System.out.println("Entro a setear alternativas");
		Map<String, Object> activeSession = ActionContext.getContext()
				.getSession();
		String[] var = request.getParameter("var").split("_");

		List<Pregunta> lstPregunta = (List<Pregunta>) activeSession
				.get("lstPregunta");
		for (Pregunta pregunta : lstPregunta) {
			System.out.println(CvNumero(pregunta.getStrCodPregunta()) + " "
					+ CvNumero(var[0]));
			if (CvNumero(pregunta.getStrCodPregunta()) == CvNumero(var[0])) {
				switch (CvNumero(var[1])) {
				case 1:
					pregunta.setStrEstadoAlter1("true");
					pregunta.setStrEstadoAlter2("false");
					pregunta.setStrEstadoAlter3("false");
					pregunta.setStrEstadoAlter4("false");
					pregunta.setStrEstadoAlter5("false");
					System.out.println("Priemra");

					break;
				case 2:
					pregunta.setStrEstadoAlter1("false");
					pregunta.setStrEstadoAlter2("true");
					pregunta.setStrEstadoAlter3("false");
					pregunta.setStrEstadoAlter4("false");
					pregunta.setStrEstadoAlter5("false");
					System.out.println("segunda");
					break;

				case 3:
					pregunta.setStrEstadoAlter2("false");
					pregunta.setStrEstadoAlter2("false");
					pregunta.setStrEstadoAlter2("true");
					pregunta.setStrEstadoAlter2("false");
					pregunta.setStrEstadoAlter2("false");
					System.out.println("tercera");
					break;

				case 4:
					pregunta.setStrEstadoAlter1("false");
					pregunta.setStrEstadoAlter2("false");
					pregunta.setStrEstadoAlter3("false");
					pregunta.setStrEstadoAlter4("true");
					pregunta.setStrEstadoAlter5("false");
					System.out.println("cuarta");
					break;

				case 5:
					pregunta.setStrEstadoAlter1("false");
					pregunta.setStrEstadoAlter2("false");
					pregunta.setStrEstadoAlter3("false");
					pregunta.setStrEstadoAlter4("false");
					pregunta.setStrEstadoAlter5("true");
					System.out.println("quinta");
					break;
				}

				break;

			}

		}

		activeSession.put("lstPregunta", lstPregunta);

		return null;
	}

	private int CvNumero(String str) {
		return Integer.parseInt(str);
	}

	public HttpServletRequest getRequest() {
		return request;
	}

	public HttpServletResponse getResponse() {
		return response;
	}

	@Override
	public void setServletResponse(HttpServletResponse response) {
		// TODO Auto-generated method stub
		this.response = response;
	}

	@Override
	public void setServletRequest(HttpServletRequest request) {
		// TODO Auto-generated method stub
		this.request = request;
	}

}
