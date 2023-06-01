package fin.coop1504.tallerjava;

import fin.coop1504.tallerjava.entidades.AireAcondicionado;
import fin.coop1504.tallerjava.entidades.ControlUniversal;
import fin.coop1504.tallerjava.entidades.Televisor;
import fin.coop1504.tallerjava.interfaces.ReferenciaDispositivo;

public class AplicacionTaller {

	public static void main(String[] args) {
		
		Televisor tvSala=new Televisor("TV SALA");
		AireAcondicionado aireacondicionado=new AireAcondicionado("AIRE CUARTO");
		
		ControlUniversal.encenderDispositivo(tvSala);
		ControlUniversal.encenderDispositivo(aireacondicionado);
		
		/*CLASE ANONIMA SIN CREAR OTRA CLASE*/
		ControlUniversal.encenderDispositivo(new ReferenciaDispositivo() {
			
			@Override
			public void encender() {
				System.out.println("Encender Dispositivo DE CLASE ANONIMA");
				
			}
			
			@Override
			public void apagar() {
				System.out.println("Apagar de CLASE ANONIMA");
				
			}
		});
	}

}
