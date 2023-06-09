

import java.io.IOException;
import javax.servlet.DispatcherType;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

/**
 * Servlet Filter implementation class Autorizador
 */
@WebFilter(dispatcherTypes = {
				DispatcherType.REQUEST, 
				DispatcherType.FORWARD, 
				DispatcherType.INCLUDE, 
				DispatcherType.ERROR
		}
					, urlPatterns = { "/Privadas/*" })
public class Autorizador implements Filter {

    /**
     * Default constructor. 
     */
    public Autorizador() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		HttpServletRequest lRequest = (HttpServletRequest) request;
		Usuario usuario= (Usuario)lRequest.getSession().getAttribute("USUARIOdb");
		if(usuario==null) {
			lRequest.setAttribute("codigo", "No se encuentra en sesison");
			lRequest.setAttribute("mensaje", "No se encuentra en sesison");
			lRequest.getRequestDispatcher("/publicas/error.jsp").forward(lRequest, response);;
		}
		chain.doFilter(request, response);
	}

	
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
