package fin.coop1504.tallerjava.entidades;

public class PersonaJuridica extends Persona{
    private DocumentoSRI ruc;
    
    public PersonaJuridica(String nombre, String identificacion,DocumentoSRI documentoSRI) {
    	super(nombre,identificacion);
    	ruc=documentoSRI;
    }

	public DocumentoSRI getRuc() {
		return ruc;
	}
    
	@Override
	public String toString() {
		return super.toString() + "DocumentoSRI: "+ruc;
	}
}
