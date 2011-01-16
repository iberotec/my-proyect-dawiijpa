package edu.util;

import java.util.List;

import edu.cibertec.bean.Examen;

public class XMLTool {
	public final static String XML_VERSION = "<?xml version=\"1.0\" encoding=\"iso-8859-1\"?>";

	public static String ListaExamenes(List<Examen> lstExamens) {
		StringBuilder sbout = new StringBuilder();
		sbout.append(XML_VERSION);
		sbout.append("<AJAX>");

		for (Examen e : lstExamens) {

			sbout.append("<OPCION>");

			sbout.append("<CODIGO>");
			sbout.append(e.getStrCodigo());
			sbout.append("</CODIGO>");

			sbout.append("<NOMBRE>");
			sbout.append(e.getStrNombre());
			sbout.append("</NOMBRE>");

			sbout.append("<FECHA>");
			sbout.append(e.getStrFechaElab());
			sbout.append("</FECHA>");

			sbout.append("<AUTOR>");
			sbout.append(e.getStrAutor());
			sbout.append("</AUTOR>");

			sbout.append("</OPCION>");

		}
		sbout.append("</AJAX>");
		return sbout.toString();

	}

}
