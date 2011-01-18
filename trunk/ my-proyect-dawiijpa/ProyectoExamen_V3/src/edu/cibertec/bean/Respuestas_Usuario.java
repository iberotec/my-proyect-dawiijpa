package edu.cibertec.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity(name = "RESP_USUARIO")
@Table(name = "tb_res_usu")
@NamedQuery(name = "selecPregunta", query = "SELECT c FROM RESP_USUARIO c WHERE c.strCodExamen =:codigo")
@IdClass(Respuestas_UsuarioPK.class)
public class Respuestas_Usuario {

	@Id
	@Column(name = "codExBD")
	private String strcodExBD;
	@Id
	@Column(name = "codigo")
	private String strcodigo;
	@Id
	@Column(name = "codPR")
	private String strcodPR;
	@Column(name = "respuest_1")
	private String strrespuest_1;
	@Column(name = "respuest_2")
	private String strrespuest_2;
	@Column(name = "respuest_3")
	private String strrespuest_3;
	@Column(name = "respuest_4")
	private String strrespuest_4;
	@Column(name = "respuest_5")
	private String strrespuest_5;

	@ManyToOne(optional = false)
	@JoinColumn(name = "codigo", referencedColumnName = "codigo", insertable = false, updatable = false)
	private Usuario usuario;

	@ManyToOne(optional = false)
	@JoinColumn(name = "codPR", referencedColumnName = "codPR", insertable = false, updatable = false)
	private Pregunta pregunta;

	public Pregunta getPregunta() {
		return pregunta;
	}

	public void setPregunta(Pregunta pregunta) {
		this.pregunta = pregunta;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public String getStrcodExBD() {
		return strcodExBD;
	}

	public void setStrcodExBD(String strcodExBD) {
		this.strcodExBD = strcodExBD;
	}

	public String getStrcodigo() {
		return strcodigo;
	}

	public void setStrcodigo(String strcodigo) {
		this.strcodigo = strcodigo;
	}

	public String getStrcodPR() {
		return strcodPR;
	}

	public void setStrcodPR(String strcodPR) {
		this.strcodPR = strcodPR;
	}

	public String getStrrespuest_1() {
		return strrespuest_1;
	}

	public void setStrrespuest_1(String strrespuest_1) {
		this.strrespuest_1 = strrespuest_1;
	}

	public String getStrrespuest_2() {
		return strrespuest_2;
	}

	public void setStrrespuest_2(String strrespuest_2) {
		this.strrespuest_2 = strrespuest_2;
	}

	public String getStrrespuest_3() {
		return strrespuest_3;
	}

	public void setStrrespuest_3(String strrespuest_3) {
		this.strrespuest_3 = strrespuest_3;
	}

	public String getStrrespuest_4() {
		return strrespuest_4;
	}

	public void setStrrespuest_4(String strrespuest_4) {
		this.strrespuest_4 = strrespuest_4;
	}

	public String getStrrespuest_5() {
		return strrespuest_5;
	}

	public void setStrrespuest_5(String strrespuest_5) {
		this.strrespuest_5 = strrespuest_5;
	}

}
