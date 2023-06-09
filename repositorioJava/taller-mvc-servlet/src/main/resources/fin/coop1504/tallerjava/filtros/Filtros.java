package fin.coop1504.tallerjava.filtros;

import java.io.IOException;
import javax.servlet.DispatcherType;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

/**
 * Servlet Filter implementation class Filtros
 */
@WebFilter(dispatcherTypes = {
				DispatcherType.REQUEST, 
				DispatcherType.INCLUDE,
				DispatcherType.ERROR,
				DispatcherType.FORWARD
				
		}
					, urlPatterns = { "/login.do" })
public class Filtros implements Filter {

    /**
     * Default constructor. 
     */
    public Filtros() {
       System.out.println("Construccion de filtro");
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		System.out.println("Destruyendo el filtro");
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here
		System.out.println("Preproceso de la solicitud");
		// pass the request along the filter chain
		chain.doFilter(request, response);
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println("iNICLAIZANDO EL FILTRO");
	}

}
