package edu.cibertec.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity(name = "EXA_USU")
@Table(name = "tb_examenes_usu")
@IdClass(Examens_UsuarioPK.class)
public class Examens_Usuario {

	@Id
	@Column(name = "codExBD")
	private String strCodExa;

	@Id
	@Column(name = "codigo")
	private String strCodUsu;

	@Column(name = "nota")
	private double dblNota;

	@Column(name = "buenas")
	private int intbuenas;

	@Column(name = "malas")
	private int intmalas;

	@Column(name = "estado")
	private String strEstado;

	
	@ManyToOne(optional = false)
	@JoinColumn(name = "codigo", referencedColumnName = "codigo", insertable = false, updatable = false)
	private Usuario usuario;

	@ManyToOne(optional = false)
	@JoinColumn(name = "codExBD", referencedColumnName = "codExBD", insertable = false, updatable = false)
	private Examen examen;

	
	
	public Examen getExamen() {
		return examen;
	}

	public void setExamen(Examen examen) {
		this.examen = examen;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public String getStrCodExa() {
		return strCodExa;
	}

	public void setStrCodExa(String strCodExa) {
		this.strCodExa = strCodExa;
	}

	public String getStrCodUsu() {
		return strCodUsu;
	}

	public void setStrCodUsu(String strCodUsu) {
		this.strCodUsu = strCodUsu;
	}

	public double getDblNota() {
		return dblNota;
	}

	public void setDblNota(double dblNota) {
		this.dblNota = dblNota;
	}

	public int getIntbuenas() {
		return intbuenas;
	}

	public void setIntbuenas(int intbuenas) {
		this.intbuenas = intbuenas;
	}

	public int getIntmalas() {
		return intmalas;
	}

	public void setIntmalas(int intmalas) {
		this.intmalas = intmalas;
	}

	public String getStrEstado() {
		return strEstado;
	}

	public void setStrEstado(String strEstado) {
		this.strEstado = strEstado;
	}

}
