package edu.cibertec.bean;

public class Examens_UsuarioPK {
	private String strCodExa;
	private String strCodUsu;

	public Examens_UsuarioPK(String strCodExa, String strCodUsu) {

		this.strCodUsu = strCodUsu;
		this.strCodExa = strCodExa;
	}
	
	public boolean equals(Object object){
		if (object instanceof MensajePK) {
			Examens_UsuarioPK pk = (Examens_UsuarioPK)object;
		
			return 	strCodUsu == pk.strCodUsu && 
			strCodExa == pk.strCodExa;
					
		} else {
			return false;
		}
	}
	
}
