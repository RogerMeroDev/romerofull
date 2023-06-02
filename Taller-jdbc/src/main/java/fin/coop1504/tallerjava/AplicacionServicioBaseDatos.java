package fin.coop1504.tallerjava;

import fin.coop1504.tallerjava.excepciones.ExcepcionValidacion;
import fin.coop1504.tallerjava.servicios.ServicioLogicaNegocio;

public class AplicacionServicioBaseDatos {

	public static void main(String[] args) {
		/*Procedimiento_almacenado*/
		try {
			Integer resultado = ServicioLogicaNegocio.sumarDatos(10,10);
			System.out.println("Resultado: " + resultado);
		} catch (ExcepcionValidacion e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("************");
			System.out.println(e.getMensajeTecnico());
			System.out.println("************");
		}
		
		/*try {
			String resultado=ServicioLogicaNegocio.registrarDatos("Roger", "Mero");
			System.out.println(resultado);
		} catch (ExcepcionValidacion e) {
			// 
			e.printStackTrace();
			System.out.println("************");
			System.out.println(e.getMensajeTecnico());
			System.out.println("************");
		}
		try {
			ServicioLogicaNegocio.registrarDatos("Profesion", "Programador");
		} catch (ExcepcionValidacion e) {
			// 
			e.printStackTrace();
			System.out.println("************");
			System.out.println(e.getMensajeTecnico());
			System.out.println("************");
		}*/

		
	}

}
