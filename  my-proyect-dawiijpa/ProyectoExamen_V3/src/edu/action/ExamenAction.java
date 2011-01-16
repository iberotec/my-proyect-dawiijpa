/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;


import edu.cibertec.bean.Pregunta;

import edu.cibertec.bean.Usuario;
import edu.negocio.Implementacion.ExamenJPA;
import edu.util.Constantes;

/**
 * 
 * @author LENOVO
 */
public class ExamenAction extends ActionSupport {
	private String strExamen;
	private List<Pregunta> lstPregunta;
	private int Buenas;
	private double PesoPregunta;
	private int malas;
	private double nota;
	private String Stado;

	public int getBuenas() {
		return Buenas;
	}

	public void setBuenas(int buenas) {
		Buenas = buenas;
	}

	public double getPesoPregunta() {
		return PesoPregunta;
	}

	public void setPesoPregunta(double pesoPregunta) {
		PesoPregunta = pesoPregunta;
	}

	public int getMalas() {
		return malas;
	}

	public void setMalas(int malas) {
		this.malas = malas;
	}

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}

	public String getStado() {
		return Stado;
	}

	public void setStado(String stado) {
		Stado = stado;
	}

	public List<Pregunta> getLstPregunta() {
		return lstPregunta;
	}

	public void setLstPregunta(List<Pregunta> lstPregunta) {
		this.lstPregunta = lstPregunta;
	}

	public String getStrExamen() {
		return strExamen;
	}

	public void setStrExamen(String strExamen) {
		this.strExamen = strExamen;
	}

	ExamenJPA serviceExamen = new ExamenJPA();

	public String CargarPreguntasExamen() throws Exception {
		String vista = "exito";
		System.out.println("La pregunta es " + strExamen);
		this.lstPregunta = serviceExamen.GetPreguntasExamen(strExamen);
		Map<String, Object> activeSession = ActionContext.getContext()
				.getSession();
		activeSession.put("lstPregunta", lstPregunta);
		if (lstPregunta.size() == 0 || lstPregunta == null)
			vista = "error";

		return vista;
	}

	public String GrabarPreguntasExamen() {
		System.out.println("Entro !! ");
		String vista = "exito";
		try {

			Map<String, Object> activeSession = ActionContext.getContext()
					.getSession();

			List<Pregunta> lstPregRes = (List<Pregunta>) activeSession
					.get("lstPregunta");
			String examen = lstPregRes.get(0).getStrCodExamen();
			this.lstPregunta = serviceExamen.GetPreguntasExamen(examen);

			System.out.println("Tamaño " + lstPregRes.size() + "  BD "
					+ lstPregunta.size());
			for (int i = 0; i < lstPregunta.size(); i++) {
				Pregunta p = lstPregunta.get(i);
				Pregunta r = lstPregRes.get(i);

				if (CvBollean(r.getStrEstadoAlter1())
						&& CvBollean(p.getStrEstadoAlter1())) {
					Buenas++;
				}

				if (CvBollean(r.getStrEstadoAlter2())
						&& CvBollean(p.getStrEstadoAlter2())) {
					Buenas++;
				}

				if (CvBollean(r.getStrEstadoAlter3())
						&& CvBollean(p.getStrEstadoAlter3())) {
					Buenas++;
				}

				if (CvBollean(r.getStrEstadoAlter4())
						&& CvBollean(p.getStrEstadoAlter4())) {
					Buenas++;
				}

				if (CvBollean(r.getStrEstadoAlter5())
						&& CvBollean(p.getStrEstadoAlter5())) {
					Buenas++;
				}

			}
			int cantidadPreguntas = lstPregRes.size();
			PesoPregunta = Constantes.PUNTAJETOTAL / cantidadPreguntas;
			malas = cantidadPreguntas - Buenas;
			nota = PesoPregunta * Buenas;
			Stado = Condicion(nota);
			Usuario usuario = (Usuario) activeSession.get("usuario");
//			Examens_Usuario ex = new Examens_Usuario();
//			ex.setStrCodExa(examen);
//			ex.setStrCodUsu(usuario.getStrcodigo());
//			ex.setStrEstado(Stado);
//			ex.setDblNota(nota);
//			ex.setIntbuenas(Buenas);
//			ex.setIntmalas(malas);
			
			
//			List<Respuestas_Usuario> respuestas = new ArrayList<Respuestas_Usuario>();
//			for (Pregunta p : lstPregRes) {
//				Respuestas_Usuario r = new Respuestas_Usuario();
//				r.setStrcodExBD(p.getStrCodExamen());
//				r.setStrcodigo(usuario.getStrcodigo());
//				r.setStrcodPR(p.getStrCodPregunta());
//				r.setStrrespuest_1(p.getStrAlter1());
//				r.setStrrespuest_2(p.getStrAlter2());
//				r.setStrrespuest_3(p.getStrAlter3());
//				r.setStrrespuest_4(p.getStrAlter4());
//				r.setStrrespuest_5(p.getStrAlter5());
//				
//				respuestas.add(r);
//			}
//			
//			String mensaje = serviceExamen.GuardarPreguntasExamen(respuestas, ex);
//			
			
			
		} catch (Exception e) {
			e.printStackTrace();
			vista = "error";
		}
		return vista;
	}

	public String Condicion(double str) {
		return (str > Constantes.APROBADO) ? "Aprobado" : "Desaprobado";
	}

	public boolean CvBollean(String str) {
		return (str.equals("true")) ? true : false;
	}

}
