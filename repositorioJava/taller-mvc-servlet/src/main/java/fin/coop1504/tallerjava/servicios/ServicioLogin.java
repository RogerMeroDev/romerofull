package fin.coop1504.tallerjava.servicios;
import fin.coop1504.tallerjava.datos.Usuario;
import fin.coop1504.tallerjava.excepciones.ExcepcionValidacion;
import fin.coop1504.tallerjava.repositorios.RepositorioUsuario;

public class ServicioLogin {

	private static RepositorioUsuario repositoriousuario = new RepositorioUsuario();

	public static Usuario login(String usuario, String clave) throws ExcepcionValidacion {

		usuario = usuario == null ? "" : usuario;

		if (usuario.isEmpty())
			throw new ExcepcionValidacion("001", "Credenciales invalidas");
		
		clave = clave == null ? "" : clave;
		if (clave.isEmpty())
			throw new ExcepcionValidacion("002", "Credenciales invalidas");
		
		try {
			Usuario usuarioDB = repositoriousuario.consultar(usuario);
			if (usuarioDB == null)
				throw new ExcepcionValidacion("004", "Credenciales Invalidas");
			if (usuarioDB.getClave().equals(clave))
				throw new ExcepcionValidacion("005", "Credenciales Invalidas");			
			if (usuarioDB.getEstado().equals("B"))
				
		return usuarioDB;
			
		} catch (Exception e) {
			e.printStackTrace();
			throw new ExcepcionValidacion("006", "Error al consultar el usuario");
		}
		//return null;
		return null;

	}

}
