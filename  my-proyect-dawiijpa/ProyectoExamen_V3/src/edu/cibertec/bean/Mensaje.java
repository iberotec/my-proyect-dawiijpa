package edu.cibertec.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

@Entity(name = "MENSAJE")
@Table(name = "tbmensaje")
@NamedQuery(name = "selectedMensaje", query = "SELECT c FROM MENSAJE c WHERE c.strCodigo = :codigo ")
@IdClass(MensajePK.class)
public class Mensaje implements Serializable {

	@Id
	@Column(name = "codMensaje")
	@TableGenerator(name = "MSJ_SEQ", table = "tbsequence", pkColumnName = "SEQ_NAME", valueColumnName = "SEQ_COUNT", pkColumnValue = "MSJ_IDX", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "MSJ_SEQ")
	private String strCodMensaje;
	@Id
	@Column(name = "codigo")
	private String strCodigo;
	@Column(name = "destinatario")
	private String strDestinatario;
	@Column(name = "asunto")
	private String strAsunto;
	@Column(name = "mensaje")
	private String strMensaje;
	
	
	@ManyToOne(optional = false)
	@JoinColumn(name = "codigo", referencedColumnName = "codigo", insertable = false, updatable = false)
	private Usuario usuario;

	
	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public String getStrCodMensaje() {
		return strCodMensaje;
	}

	public void setStrCodMensaje(String strCodMensaje) {
		this.strCodMensaje = strCodMensaje;
	}

	public String getStrCodigo() {
		return strCodigo;
	}

	public void setStrCodigo(String strCodigo) {
		this.strCodigo = strCodigo;
	}

	public String getStrDestinatario() {
		return strDestinatario;
	}

	public void setStrDestinatario(String strDestinatario) {
		this.strDestinatario = strDestinatario;
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

}
