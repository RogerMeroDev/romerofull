package fin.coop1504.tallerjava;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;

import fin.coop1504.tallerjava.entidades.DocumentoSRI;
import fin.coop1504.tallerjava.entidades.Persona;

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
		parametros.put("PersonaJuridica", new Persona("Karen","54545"));
		parametros.put("Documento", ruc);
		
		ServiciosPersona.registrarDatosJuridcos(parametros);
	}

}
