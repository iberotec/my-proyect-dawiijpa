package edu.cibertec.bean;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;

import javax.persistence.Table;

@Entity(name = "USUARIO")
@Table(name = "tbusuario")
@NamedQuery(name="selectUsuario" , query="SELECT c FROM USUARIO c WHERE c.strcodigo = :codigo " )
public class Usuario {
	
	@Id
	@Column(name = "codigo")
	private String strcodigo;
	
	@Column(name = "nombreBD")
	private String strnombreBD;
	
	@Column(name = "apePatBD")
	private String strapePatBD;
	
	@Column(name = "apeMatBD")
	private String strapeMatBD;
	
	@Column(name = "DocIdentBD")
	private int intDocIdentBD;
	
	@Column(name = "edadBD")
	private int intedadBD;
	
	@Column(name = "gradoInstrucBD")
	private String strgradoInstrucBD;
	
	@Column(name = "celularBD")
	private String strcelularBD;
	
	@Column(name = "emailBD")
	private String stremailBD;
	
	@Column(name = "tipoUBD")
	private String strtipoUBD;
	
	@Column(name = "password")
	private String strpassword;
	
	
	@OneToMany(fetch=FetchType.EAGER,mappedBy="usuario",targetEntity=Mensaje.class)
	private Collection<Mensaje> lstMensajes ;

	

	


	public Collection<Mensaje> getLstMensajes() {
		return lstMensajes;
	}

	public void setLstMensajes(Collection<Mensaje> lstMensajes) {
		this.lstMensajes = lstMensajes;
	}

	public String getStrcodigo() {
		return strcodigo;
	}

	public void setStrcodigo(String strcodigo) {
		this.strcodigo = strcodigo;
	}

	public String getStrnombreBD() {
		return strnombreBD;
	}

	public void setStrnombreBD(String strnombreBD) {
		this.strnombreBD = strnombreBD;
	}

	public String getStrapePatBD() {
		return strapePatBD;
	}

	public void setStrapePatBD(String strapePatBD) {
		this.strapePatBD = strapePatBD;
	}

	public String getStrapeMatBD() {
		return strapeMatBD;
	}

	public void setStrapeMatBD(String strapeMatBD) {
		this.strapeMatBD = strapeMatBD;
	}

	public int getIntDocIdentBD() {
		return intDocIdentBD;
	}

	public void setIntDocIdentBD(int intDocIdentBD) {
		this.intDocIdentBD = intDocIdentBD;
	}

	public int getIntedadBD() {
		return intedadBD;
	}

	public void setIntedadBD(int intedadBD) {
		this.intedadBD = intedadBD;
	}

	public String getStrgradoInstrucBD() {
		return strgradoInstrucBD;
	}

	public void setStrgradoInstrucBD(String strgradoInstrucBD) {
		this.strgradoInstrucBD = strgradoInstrucBD;
	}

	public String getStrcelularBD() {
		return strcelularBD;
	}

	public void setStrcelularBD(String strcelularBD) {
		this.strcelularBD = strcelularBD;
	}

	public String getStremailBD() {
		return stremailBD;
	}

	public void setStremailBD(String stremailBD) {
		this.stremailBD = stremailBD;
	}

	public String getStrtipoUBD() {
		return strtipoUBD;
	}

	public void setStrtipoUBD(String strtipoUBD) {
		this.strtipoUBD = strtipoUBD;
	}

	public String getStrpassword() {
		return strpassword;
	}

	public void setStrpassword(String strpassword) {
		this.strpassword = strpassword;
	}

}
