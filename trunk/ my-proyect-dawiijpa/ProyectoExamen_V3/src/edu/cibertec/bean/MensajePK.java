package edu.cibertec.bean;



public class MensajePK {

	private String strCodMensaje;
	private String strCodigo;

	public MensajePK(String strCodMensaje, String strCodigo) {

		this.strCodigo = strCodigo;
		this.strCodMensaje = strCodMensaje;
	}
	
	public boolean equals(Object object){
		if (object instanceof MensajePK) {
			MensajePK pk = (MensajePK)object;
		
			return 	strCodigo == pk.strCodigo && 
			strCodMensaje == pk.strCodMensaje;
					
		} else {
			return false;
		}
	}

}
