package fin.coop1504.tallerjava.configuracion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public final class SingletonConexion{

	private static Connection conexion = null;
		public static Connection getConexion() throws SQLException{
			System.out.println("Solicitud de conexion...");
			if(conexion==null || conexion.isClosed()) {
				crearConexion();
				System.out.println("Creacion de conexion Nueva");
			}
			return conexion;
		}
		
		private static void crearConexion() throws SQLException {
			conexion=DriverManager.getConnection("jdbc:oracle:thin:@srv-desarrollo.coop15abril.fin.ec:1989:desanodo","as_prg","asi_e");
			conexion.setAutoCommit(false);
			
		}
		
		public static void commit() throws SQLException {
			System.out.println("Confirmando Transaccion");
			conexion.commit();
		}
		
		public static void rollback() throws SQLException {
			System.out.println("Cancelando transaccion");
			conexion.rollback();
		}
		
		public static void cerrarConexion() throws SQLException{
			System.out.println("Cerrando la conexion");
			conexion.close();
		}
}
