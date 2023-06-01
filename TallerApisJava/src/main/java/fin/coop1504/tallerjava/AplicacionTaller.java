package fin.coop1504.tallerjava;

import java.util.ArrayList;
import java.util.Vector;

import fin.coop1504.tallerjava.excepciones.ExcepcionValidacion;

public class AplicacionTaller {

	public static void main(String[] args) {
		String cadena="Hola Mundo";
		System.out.println(cadena.concat("Tierra"));
		System.out.println(cadena);
		StringBuffer cadenaEspecial=new StringBuffer("Hola MUNDO");
		cadenaEspecial.append("Tierra");
		System.out.println(cadenaEspecial.toString());
		
		for(int i=cadena.length()-1;i>=0;i--) {
			System.out.print(cadena.charAt(i));
			
		}
		/*for resumido*/
		
		for(char a:cadena.toCharArray()) {
			System.out.println(a);
		}
		
		System.out.println(cadenaEspecial.reverse());
		
		/*Arreglos*/		
		String[] cadenas=new String[4];
		cadenas[0]="Karen";
		cadenas[1]="Pepito";
		cadenas[2]="Maria";
		cadenas[3]="Juanito";
		/*Recorrer el arreglo anterior*/
		for(String cad:cadenas) {
			System.out.println(cad);
		}
		
		/*Metodo2*/
		String[] cadenas2 = {"1","2","3","4"};
		for(String cad:cadenas2) {
			System.out.println(cad);
		}
		
		/*Vector*/
		
		Vector<String> vector =new Vector();
		vector.add("Cad1");
		vector.add("Cad2");
		vector.add("Cad3");
		
		System.out.println(vector.size());
		
		/*ArrayList*/
		
		ArrayList<Integer> lista= new ArrayList<Integer>();
		lista.add(10);
		lista.add(20);
		lista.add(30);
		lista.add(40);
		
		System.out.println(lista.size());
		
		lista.forEach(elemento->{
			if(elemento.equals(20))
				System.out.println(elemento + 20);
			else
				System.out.println(elemento);
		});
		/*Imprimer dato de un vector se crea nuevo objeto*/
		
		String cadenaVector =vector.get(0);
		//System.out.println(cadenaVector);
		
		/*Se envia el mismo objeto sin crearlo*/
		Integer numeroArrayList= lista.get(0);
		//System.out.println(numeroArrayList);
		validarDatos("41");
		try {
			validarDatosEspecificos("");
		} catch (ExcepcionValidacion e) {
			System.err.println("Codigo Error: "+e.getCodigo()+"Mensaje:"+e.getMensajeTecnico());
			e.printStackTrace();
		}finally { /*Exije que se ejcuten las sentencias siguiente haya o no error*/
			
		}
		
	}
	/*Validadndo con clase exceptionValidacion*/
	public static void validarDatos(String anios) {
		Integer edad=Integer.parseInt(anios);
		System.out.println(edad);
	}

	public static void validarDatosEspecificos(String dato)throws ExcepcionValidacion {
		if(dato==null || dato.isEmpty()) {
			 //ExcepcionValidacion error = new ExcepcionValidacion("001","Error al validar el dato");
			// throw error;
			throw new ExcepcionValidacion("001","Error al validar el dato"); /*Reemplaza las 97 y 98*/
		}
	}
}
