package fin.coop1504.tallerjava.entidades;

import fin.coop1504.tallerjava.interfaces.ConsultarDatos;

public class PersonaNatural extends Persona implements ConsultarDatos{
	protected String tipoIdentificacion;

	public PersonaNatural(String nombre,String identificacion,String tipoIdentificacion) {
		super(nombre,identificacion);
		this.tipoIdentificacion=tipoIdentificacion;
	}
	
	@Override
	public String toString() {	
		return super.toString()+ "Tipo Identificacion: "+tipoIdentificacion;
	}
	
	@Override
	public Persona consulta(String iden) {
		System.out.println("Consultando:" + iden);
		return new PersonaNatural(nombre,identificacion,tipoIdentificacion);
	}
}
