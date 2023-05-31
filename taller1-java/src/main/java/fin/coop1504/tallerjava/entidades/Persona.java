package fin.coop1504.tallerjava.entidades;

public class Persona {
	protected String nombre;
	protected String identificacion;
	//protected String tipoIdentificacion;
	public Persona() {
		super();
		System.out.println("Usando constructor sin parametro");
	}
	public Persona(String nombre, String identificacion) {
		super();			
		this.nombre = nombre;
		this.identificacion = identificacion;		
	}

	@Override
	public String toString() {
		return "Persona nombre=" + nombre + ", identificacion=" + identificacion ;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getIdentificacion() {
		return identificacion;
	}
	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}
	
}
