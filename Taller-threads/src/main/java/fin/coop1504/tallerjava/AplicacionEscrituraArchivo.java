package fin.coop1504.tallerjava;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;

public class AplicacionEscrituraArchivo {
public static void main(String[] args) {
	PrintWriter formato=null;
	
		try {
			FileWriter filewriter=new FileWriter("C:/TallerB/Pruebadeescritura.txt",true);
			BufferedWriter writer=new BufferedWriter(filewriter);
			//writer.write("Hello");
			formato=new PrintWriter(writer);
			formato.println("Ingreso con formato");
			formato.flush(); /*Investi*/
			
			/*Log examples*/
			PrintStream salida = new PrintStream("C:/TallerB/Pruebadeescritura2.txt");
			
			System.setOut(salida);
			System.out.println("Consola");
			System.out.println("Escritura 2 ");
			
			FileOutputStream salidaArchivo=new FileOutputStream("C:/TallerB/Pruebadeescritura3.txt",true);
			PrintStream logerror = new PrintStream(salidaArchivo);			
			System.setErr(logerror);
			System.err.println("Esto es un error 2");
			
			
			
			
		} catch (IOException e) {		
			e.printStackTrace();
		}finally {
			if(formato!=null) {
				formato.close();
				System.out.println("Archivo Escrito");
			}
		}
}
}
