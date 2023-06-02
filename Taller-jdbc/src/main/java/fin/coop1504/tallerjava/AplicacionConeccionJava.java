package fin.coop1504.tallerjava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AplicacionConeccionJava {

	public static void main(String[] args) throws SQLException {
		Connection conexion=null;
		try {
			
			/*Crea conexion*/
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conexion = DriverManager.getConnection("jdbc:oracle:thin:@srv-desarrollo.coop15abril.fin.ec:1989:desanodo","as_prg","asi_e");
			System.out.println("Conexion exitosa");
			/*Crea Cursor*/
			ResultSet cursor=null;
			Statement sentenciaDML=conexion.createStatement();
			/* Envia Consulta */
			cursor=sentenciaDML.executeQuery("SELECT CLAVE, VALOR FROM AS_TAB.ROM_EJEMPLO");
			while(cursor.next()) {
				/*OnlyColumnas*/
				System.out.println(cursor.getString(1)+" : " +cursor.getString(2));
				//System.out.println("Valor: " +cursor.getString(2));
			}
		} catch (SQLException e) {

			e.printStackTrace();
		}
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}finally {
			if(conexion!=null) {
				conexion.close();
			}
		}

	}

}
