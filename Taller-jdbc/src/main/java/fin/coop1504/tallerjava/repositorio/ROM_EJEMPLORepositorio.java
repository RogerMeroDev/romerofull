package fin.coop1504.tallerjava.repositorio;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;

import fin.coop1504.tallerjava.configuracion.SingletonConexion;

public class ROM_EJEMPLORepositorio {

	public Integer registrar(String dato1,String dato2) throws SQLException{
	PreparedStatement sentencia=SingletonConexion.getConexion().prepareStatement("INSERT INTO AS_TAB.ROM_EJEMPLO(CLAVE, VALOR)VALUES(?, ?)");
	
	sentencia.setString(1, dato1);
	sentencia.setString(2, dato2);
	
	return sentencia.executeUpdate();
	
	}
	
	public ResultSet consultar() throws SQLException{
		PreparedStatement sentencia = SingletonConexion.getConexion().prepareStatement("SELECT * FROM AS_TAB.ROM_EJEMPLO");
		return sentencia.executeQuery();
	}
	
	public ResultSet consultarPorClave(String dato) throws SQLException{
		PreparedStatement sentencia = SingletonConexion.getConexion().prepareStatement("SELECT * FROM AS_TAB.ROM_EJEMPLO where=CLAVE=?");
		sentencia.setString(1, dato);
		return sentencia.executeQuery();
	}
	
	public HashMap<String, String> consultarPorClaves(String dato) throws SQLException{
		PreparedStatement sentencia = SingletonConexion.getConexion().prepareStatement("SELECT * FROM AS_TAB.ROM_EJEMPLO where=CLAVE=?");
		sentencia.setString(1, dato);
		HashMap<String, String> resultado= new HashMap<String,String>();
		ResultSet cursor = sentencia.executeQuery();
		while(cursor.next()) {
			resultado.put(cursor.getString(1), cursor.getString(2));
		}
		return resultado;
		//return sentencia.executeQuery();
	}
	
	public Integer inovacionProcedimiento(Integer sum1,Integer sum2) throws SQLException {
		CallableStatement sentencia=SingletonConexion.getConexion().prepareCall("{call AS_TAB.TEST_SUMA(?,?,?) }");
		sentencia.setInt(1, sum1);
		sentencia.setInt(2, sum2);
		sentencia.registerOutParameter(3, java.sql.Types.NUMERIC);
		sentencia.execute();
		return sentencia.getInt(3);
	}
	
}
