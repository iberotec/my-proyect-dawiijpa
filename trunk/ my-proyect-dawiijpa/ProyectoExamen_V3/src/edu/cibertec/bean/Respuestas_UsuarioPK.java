package edu.cibertec.bean;


public class Respuestas_UsuarioPK {

	private String strcodExBD;
	private String strcodigo;
	private String strcodPR;

    public Respuestas_UsuarioPK(String strcodExBD, String strcodigo,String strcodPR) {

		this.strcodExBD = strcodExBD;
		this.strcodigo = strcodigo;
		this.strcodPR = strcodPR;
	}

    
    public boolean equals(Object object){
		if (object instanceof PreguntaPK) {
			Respuestas_UsuarioPK pk = (Respuestas_UsuarioPK)object;

			return 	strcodExBD == pk.strcodExBD &&
			strcodigo == pk.strcodigo && strcodPR == pk.strcodPR ;

		} else {
			return false;
		}
	}
}
