package edu.cibertec.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity(name = "TIPOEXAMEN")
@Table(name = "tbtipoexamen")
@NamedQuery(name="selectTipoExamen" , query="SELECT c FROM TIPOEXAMEN c " )
public class TipoExamen implements Serializable {
	@Id
	@Column(name = "codTipoExamen")
	private String strCodTipo;
	@Column(name = "descrip")
	private String strDesTipo;
	public String getStrCodTipo() {
		return strCodTipo;
	}
	public void setStrCodTipo(String strCodTipo) {
		this.strCodTipo = strCodTipo;
	}
	public String getStrDesTipo() {
		return strDesTipo;
	}
	public void setStrDesTipo(String strDesTipo) {
		this.strDesTipo = strDesTipo;
	}
	
	
	
}
