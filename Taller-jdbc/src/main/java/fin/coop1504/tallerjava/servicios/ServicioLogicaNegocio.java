package fin.coop1504.tallerjava.servicios;

import java.sql.SQLException;

import fin.coop1504.tallerjava.configuracion.Enumerados;
import fin.coop1504.tallerjava.configuracion.SingletonConexion;
import fin.coop1504.tallerjava.excepciones.ExcepcionValidacion;
import fin.coop1504.tallerjava.repositorio.ROM_EJEMPLORepositorio;

public class ServicioLogicaNegocio {
	
	private static ROM_EJEMPLORepositorio repo=new ROM_EJEMPLORepositorio();
	
	public static String registrarDatos(String dato1,String dato2) throws ExcepcionValidacion{
	/*Validacion_de_datos*/
		if(dato1==null||dato1.isEmpty()) {
			throw new ExcepcionValidacion(Enumerados.COD_ERROR_DATOS,Enumerados.MEN_ERROR_DATOS + " - dato1");	
		}
		if(dato2==null||dato2.isEmpty()) {
			throw new ExcepcionValidacion(Enumerados.COD_ERROR_DATOS,Enumerados.MEN_ERROR_DATOS + "- dato2");	
		}				
		
		try {
			repo.registrar(dato1, dato2);
			SingletonConexion.commit();
		} catch (SQLException e) {		
			e.printStackTrace();
			throw new ExcepcionValidacion(Enumerados.COD_ERROR_TRX,Enumerados.MEN_ERROR_TRX);
		}
		return Enumerados.MEN_SUCESSFULL_TRX;
	}
	
	public static Integer sumarDatos(Integer dato1,Integer dato2) throws ExcepcionValidacion {
		
		if(dato1==null) {
			throw new ExcepcionValidacion(Enumerados.COD_ERROR_DATOS,Enumerados.MEN_ERROR_DATOS + " - dato1");	
		}
		if(dato2==null) {
			throw new ExcepcionValidacion(Enumerados.COD_ERROR_DATOS,Enumerados.MEN_ERROR_DATOS + " - dato2");	
		}
		Integer resultado=0;
		try {
			resultado = repo.inovacionProcedimiento(dato1, dato2);
		} catch (SQLException e) {			
			e.printStackTrace();
			throw new ExcepcionValidacion(Enumerados.COD_ERROR_TRX,Enumerados.MEN_ERROR_TRX + " - dato2");
		}
		return resultado;
	}
	
}
