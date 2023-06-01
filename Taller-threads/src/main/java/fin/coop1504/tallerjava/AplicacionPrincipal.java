package fin.coop1504.tallerjava;

import fin.coop1504.tallerjava.servicios.Ciclista;

public class AplicacionPrincipal {
public static void main(String[] args) {
		/*Ciclista ciclista1=new Ciclista("Juanito", "001");
		Ciclista ciclista2=new Ciclista("Alcachofa", "002");
		Ciclista ciclista3=new Ciclista("Peñarrieta", "003");
		Ciclista ciclista4=new Ciclista("Pepin", "004");
		
		ciclista1.start();
		
		ciclista2.start();
		
		ciclista3.start();
		
		ciclista4.start();*/
	
	
	
	Thread hilo1=new Thread(new Runnable() {
		
		@Override
		public void run() {
		for(int i =0;i<1000;i++) {
			System.out.println("I am Thread One");
		}			
		}
	});
	
	Thread hilo2=new Thread(new Runnable() {
		
		@Override
		public void run() {
		System.out.println("Comer");
			
		}
	});
		hilo1.start();
		hilo2.start();
		System.out.println("Ejecucion hilo principal");
}
}
