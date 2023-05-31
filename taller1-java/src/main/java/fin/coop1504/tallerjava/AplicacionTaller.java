package fin.coop1504.tallerjava;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;

import fin.coop1504.tallerjava.entidades.DocumentoSRI;
import fin.coop1504.tallerjava.entidades.Persona;
import fin.coop1504.tallerjava.entidades.PersonaJuridica;
import fin.coop1504.tallerjava.entidades.PersonaNatural;
import fin.coop1504.tallerjava.interfaces.ConsultarDatos;
import fin.coop1504.tallerjava.servicios.ServiciosPersona;

public class AplicacionTaller {

	public static void main(String[] args) {
		ServiciosPersona.registrarDatos("Rogelio Mero", "3434");	
		
		DocumentoSRI ruc=new DocumentoSRI();
		ruc.setActividadEconomica("DESARROLLO DE SOFTWARE");
		ruc.setEstado("A");
		ruc.setFechaExpedicion(new Date());
		
		GregorianCalendar cal=new GregorianCalendar();
		cal.setTime(new Date());
		cal.add(GregorianCalendar.YEAR,1);
		ruc.setFechaExpiracion(cal.getTime());
		//ServiciosPersona.registrarDatosJuridicos(persona, ruc);
		ServiciosPersona.registrarDatosJuridicos(new Persona("XXXX","4332"), ruc);
		System.out.println("---------");
		HashMap<String,Object> parametros =new HashMap<String,Object>();
		parametros.put(ServiciosPersona.PERSONA_JURIDICA, new Persona("Karen","54545"));
		parametros.put(ServiciosPersona.DOCUMENTO2, ruc);		
		ServiciosPersona.registrarDatosJuridcos(parametros);
		System.out.println("Prueba con interfaz");
		/*
		ConsultarDatos personaNatural = new PersonaNatural("Persona","324234","CED");
		System.out.println(personaNatural.consulta("45"));
		ConsultarDatos personaGeneral = new PersonaNatural("Personita","324234","CED");
		System.out.println(personaGeneral.consulta("45"));*/
		
		ConsultarDatos personaGeneral = new PersonaNatural("person2","34534","CED");
		consultar(personaGeneral,"342");
		personaGeneral=new PersonaJuridica("yuasdas","34234",ruc);
		consultar(personaGeneral,"34534");
		
	}
	public static void consultar(ConsultarDatos consulta, String dato) {
		System.out.println(consulta.consulta(dato));
	}

}
