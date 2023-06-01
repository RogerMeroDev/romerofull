package fin.coop1504.tallerjava.servicios;

public class Ciclista extends Thread{
private String numero;
private String nombre;

public Ciclista(String num, String nom) {
	numero=num;
	nombre=nom;
}

public String getNumero() {
	return numero;
}

public String getNombre() {
	return nombre;
}

@Override
	public void run() {
		for(int i=0;i<1000;i++) {
			System.out.println("El ciclista "+nombre +"numero "+numero);
		}
	}
}
