package fin.coop1504.tallerjava.repositorios;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import fin.coop1504.tallerjava.configuracion.SingletonConexion;
import fin.coop1504.tallerjava.datos.Usuario;

public class RepositorioUsuario {
	public Usuario consultar(String usuario) throws SQLException {

		PreparedStatement consulta = SingletonConexion.getConexion()
				.prepareStatement("select * from as_tab.tab_usuario where upper(usuario) = ?");
		consulta.setString(1, usuario);

		ResultSet cursor = consulta.executeQuery();
		Usuario resultado = null;
		while (cursor.next()) {
			resultado = new Usuario();
			resultado.setEstado(cursor.getString("ESTADO"));
			resultado.setFechaCreacion(cursor.getDate("FECHACREACION"));			
			resultado.setNombre(cursor.getString("NOMBRE"));
			resultado.setUsuario(cursor.getString("USUARIO"));
			resultado.setUsuario(cursor.getString("CLAVE"));
			
		}
		
		return resultado;

	}
}
