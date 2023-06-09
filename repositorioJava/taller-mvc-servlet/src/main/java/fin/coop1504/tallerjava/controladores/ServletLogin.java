package fin.coop1504.tallerjava.controladores;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import fin.coop1504.tallerjava.datos.Usuario;
import fin.coop1504.tallerjava.excepciones.ExcepcionValidacion;
import fin.coop1504.tallerjava.servicios.ServicioLogin;

@WebServlet("/login.do")
public class ServletLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@EJB
	private ServicioEJB ServicioEjB();
	public ServletLogin() {
		super();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String usuario = request.getParameter("usuario");
		String clave = request.getParameter("clave");
		String datoEJB=servicioEJB.metodoPruebba(usuario);
		
		usuario = usuario == null ? "" : usuario;
		clave = clave == null ? "" : clave;
		try {
			Usuario resultado = ServicioLogin.login(usuario, clave);	
			//request.setAttribute("usuarioDB", resultado);
			HttpSession session=request.getSession(); //sino existe crera una session existen
			session.setAttribute("usuario",resultado);
			
			request.getRequestDispatcher("privadas/principal.jsp").forward(request, response);
		} catch (ExcepcionValidacion e) {
			e.printStackTrace();
			request.setAttribute("Codigo", e.getCodigo());
			request.setAttribute("mensaje", e.getMensajeTecnico());
			request.getRequestDispatcher("/publicas/error.jsp").forward(request, response);
		}
		

		/*
		 * if (resultado.equals("ok")) { request.setAttribute("usuario", usuario);
		 * request.getRequestDispatcher("/privadas/principal.jsp").forward(request,
		 * response);
		 * response.sendRedirect("/talle-mvc-servlet/privadas/principal.jsp"); } else {
		 * response.sendRedirect("/taller-mvc-servlet/publicas/error.jsp");
		 * 
		 * }
		 */
	}

}
