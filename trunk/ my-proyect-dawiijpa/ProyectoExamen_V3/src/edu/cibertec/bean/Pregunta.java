/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.cibertec.bean;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author LENOVO
 */
@Entity(name = "PREGUNTA")
@Table(name = "tbpregunta")
@NamedQuery(name = "selecPregunta", query = "SELECT c FROM PREGUNTA c WHERE c.strCodExamen =:codigo")
@IdClass(PreguntaPK.class)
public class Pregunta implements Serializable{

@Id	
@Column(name="codP")
private String strCodPregunta;
@Id
@Column(name="codExBD")
private String strCodExamen;
@Column(name="pregBD")
private String strPregunta;
@Column(name="alter01")
private String strAlter1;
@Column(name="alter02")
private String strAlter2;
@Column(name="alter03")
private String strAlter3;
@Column(name="alter04")
private String strAlter4;
@Column(name="alter05")
private String strAlter5;

@Column(name="estado01")
private String strEstadoAlter1;

@Column(name="estado02")
private String strEstadoAlter2;

@Column(name="estado03")
private String strEstadoAlter3;

@Column(name="estado04")
private String strEstadoAlter4;

@Column(name="estado05")
private String strEstadoAlter5;

@Column(name="Tipopreg")
private String strTipoPregunta;





public String getStrCodPregunta() {
	return strCodPregunta;
}

public void setStrCodPregunta(String strCodPregunta) {
	this.strCodPregunta = strCodPregunta;
}

public String getStrCodExamen() {
	return strCodExamen;
}

public void setStrCodExamen(String strCodExamen) {
	this.strCodExamen = strCodExamen;
}

public String getStrPregunta() {
	return strPregunta;
}

public void setStrPregunta(String strPregunta) {
	this.strPregunta = strPregunta;
}

public String getStrAlter1() {
	return strAlter1;
}

public void setStrAlter1(String strAlter1) {
	this.strAlter1 = strAlter1;
}

public String getStrAlter2() {
	return strAlter2;
}

public void setStrAlter2(String strAlter2) {
	this.strAlter2 = strAlter2;
}

public String getStrAlter3() {
	return strAlter3;
}

public void setStrAlter3(String strAlter3) {
	this.strAlter3 = strAlter3;
}

public String getStrAlter4() {
	return strAlter4;
}

public void setStrAlter4(String strAlter4) {
	this.strAlter4 = strAlter4;
}

public String getStrAlter5() {
	return strAlter5;
}

public void setStrAlter5(String strAlter5) {
	this.strAlter5 = strAlter5;
}

public String getStrEstadoAlter1() {
	return strEstadoAlter1;
}

public void setStrEstadoAlter1(String strEstadoAlter1) {
	this.strEstadoAlter1 = strEstadoAlter1;
}

public String getStrEstadoAlter2() {
	return strEstadoAlter2;
}

public void setStrEstadoAlter2(String strEstadoAlter2) {
	this.strEstadoAlter2 = strEstadoAlter2;
}

public String getStrEstadoAlter3() {
	return strEstadoAlter3;
}

public void setStrEstadoAlter3(String strEstadoAlter3) {
	this.strEstadoAlter3 = strEstadoAlter3;
}

public String getStrEstadoAlter4() {
	return strEstadoAlter4;
}

public void setStrEstadoAlter4(String strEstadoAlter4) {
	this.strEstadoAlter4 = strEstadoAlter4;
}

public String getStrEstadoAlter5() {
	return strEstadoAlter5;
}

public void setStrEstadoAlter5(String strEstadoAlter5) {
	this.strEstadoAlter5 = strEstadoAlter5;
}

public String getStrTipoPregunta() {
	return strTipoPregunta;
}

public void setStrTipoPregunta(String strTipoPregunta) {
	this.strTipoPregunta = strTipoPregunta;
}






	
	
}
