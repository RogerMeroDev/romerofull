package fin.coop1504.tallerjava.entidades;

import fin.coop1504.tallerjava.interfaces.ReferenciaDispositivo;

public class Televisor implements ReferenciaDispositivo{
	private String nombre;

	public Televisor(String nom) {
		nombre=nom;
	}
	
	@Override
	public void encender() {
		System.out.println("Encendiendo TV: "+nombre);
		
	}

	@Override
	public void apagar() {
		System.out.println("Apagando TV: "+nombre);
		
	}
	
}
