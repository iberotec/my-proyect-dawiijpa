/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.cibertec.bean;

/**
 *
 * @author LENOVO
 */
public class PreguntaPK {
    private String strCodPregunta;
    private String strCodExamen;

    public PreguntaPK(String strCodPregunta, String strCodExamen) {

		this.strCodPregunta = strCodPregunta;
		this.strCodExamen = strCodExamen;
	}

    
    public boolean equals(Object object){
		if (object instanceof PreguntaPK) {
			PreguntaPK pk = (PreguntaPK)object;

			return 	strCodPregunta == pk.strCodPregunta &&
			strCodExamen == pk.strCodExamen;

		} else {
			return false;
		}
	}


}
