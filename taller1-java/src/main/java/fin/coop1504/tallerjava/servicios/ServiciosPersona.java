package fin.coop1504.tallerjava.servicios;

import java.util.HashMap;

import fin.coop1504.tallerjava.entidades.DocumentoSRI;
import fin.coop1504.tallerjava.entidades.Persona;
import fin.coop1504.tallerjava.entidades.PersonaJuridica;
import fin.coop1504.tallerjava.entidades.PersonaNatural;

public class ServiciosPersona {

	public static String registrarDatos(String nombre, String identificacion) {
		Persona persona = new Persona();
		Persona persona2 = new Persona(nombre, identificacion);
		PersonaNatural personaNatural=new PersonaNatural(nombre,identificacion,"CED");
		System.out.println(persona2);
		System.out.println(personaNatural);
		return "ok";
	}
	
	public static String registrarDatosJuridicos(String nombre, String identificacion, DocumentoSRI documento) {

		PersonaJuridica personaJuridica = new PersonaJuridica(nombre, identificacion, documento);
		System.out.println(personaJuridica);
		return "ok";
	}

	
	public static String registrarDatosJuridicos(Persona persona, DocumentoSRI documento) {

		PersonaJuridica personaJuridica = new PersonaJuridica(persona.getNombre(), persona.getIdentificacion(), documento);
		System.out.println(personaJuridica);

		return "ok";
	}
	
	public static String registrarDatosJuridcos(HashMap<String,Object> parametros) {
		Persona persona=(Persona)parametros.get("PersonaJuridica");
		DocumentoSRI documento=(DocumentoSRI)parametros.get("Documento");
		PersonaJuridica personaJuridica=new PersonaJuridica(persona.getNombre(),persona.getIdentificacion(),documento);
		System.out.println(personaJuridica);
		return "ok";
	}
	
}
