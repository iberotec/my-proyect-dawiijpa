package edu.cibertec.bean;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity(name = "EXAMEN")
@Table(name = "tbexamen")
@NamedQuery(name = "selectExamen", query = "SELECT c FROM EXAMEN c WHERE c.strCodTipo = :codigoTipo ")
public class Examen implements Serializable {


	@Id
	@Column(name="codExBD")
	private String strCodigo;
	@Column(name="nombreBD")
	private String strNombre;
	@Column(name="fechaElabBD")
	private String strFechaElab;
	@Column(name="codTipoExamen")
	private String strCodTipo;
	@Column(name="autorBD")
	private String strAutor;
	@Column(name="codigo")
	private String strCodigoAutor;
	

	public String getStrCodTipo() {
		return strCodTipo;
	}
	public void setStrCodTipo(String strCodTipo) {
		this.strCodTipo = strCodTipo;
	}
	public String getStrCodigo() {
		return strCodigo;
	}
	public void setStrCodigo(String strCodigo) {
		this.strCodigo = strCodigo;
	}
	public String getStrNombre() {
		return strNombre;
	}
	public void setStrNombre(String strNombre) {
		this.strNombre = strNombre;
	}
	
	public String getStrFechaElab() {
		return strFechaElab;
	}
	public void setStrFechaElab(String strFechaElab) {
		this.strFechaElab = strFechaElab;
	}
	public String getStrAutor() {
		return strAutor;
	}
	public void setStrAutor(String strAutor) {
		this.strAutor = strAutor;
	}
	public String getStrCodigoAutor() {
		return strCodigoAutor;
	}
	public void setStrCodigoAutor(String strCodigoAutor) {
		this.strCodigoAutor = strCodigoAutor;
	}
	


	
	
}
