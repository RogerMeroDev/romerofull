package fin.coop1504.tallerjava.entidades;

public class PersonaNatural extends Persona{
	protected String tipoIdentificacion;

	public PersonaNatural(String nombre,String identificacion,String tipoIdentificacion) {
		super(nombre,identificacion);
		this.tipoIdentificacion=tipoIdentificacion;
	}
	
	@Override
	public String toString() {	
		return super.toString()+ "Tipo Identificacion: "+tipoIdentificacion;
	}
}
