package fin.coop1504.tallerjava;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class AplicacionArchivo {
	public static void main(String[] args) throws IOException {
	File archivo = new File("C:/TallerB/archivoprueba.txt");
	System.out.println("Se puede leer: " + archivo.canRead());
	System.out.println("Se puede Escribir: " + archivo.canWrite());
	System.out.println("Existe: " + archivo.exists());
	System.out.println("Directorio? : " + archivo.isDirectory());
	System.out.println("Ruta Absluta : " + archivo.getAbsolutePath());
	System.out.println("Nombre : " + archivo.getName());
	System.out.println("Size : " + archivo.getTotalSpace());
	BufferedReader recorreArchivo=null;
	try {
		FileReader lector = new FileReader(archivo);
		recorreArchivo =new BufferedReader(lector);
		String linea = recorreArchivo.readLine();
		while(linea!=null) {
			System.out.println(linea);
			linea=recorreArchivo.readLine();
		}
		
		//System.out.println("Linea 1 del archivo: "+linea);
		//linea=recorreArchivo.readLine();
		//System.out.println("Linea 2 del archivo: "+linea);
		
	} catch (FileNotFoundException e) {
		System.err.println("Error al abrir el archivo");
		e.printStackTrace();
	} catch (IOException e) {
		System.err.println("Error al recorrer el archivo");
		e.printStackTrace();
	}finally {
		if(recorreArchivo!=null) {
			recorreArchivo.close();
		}
	}
	
	}
}
