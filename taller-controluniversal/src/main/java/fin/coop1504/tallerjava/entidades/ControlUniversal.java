package fin.coop1504.tallerjava.entidades;

import fin.coop1504.tallerjava.interfaces.ReferenciaDispositivo;

public class ControlUniversal {

	public static void encenderDispositivo (
			ReferenciaDispositivo referencia ) {
		
	referencia.encender();
	}
	
	public static void apagarDispositivo(
			ReferenciaDispositivo referencia) {
		referencia.apagar();
	}
}
