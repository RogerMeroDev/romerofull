package fin.coop1504.tallerjava.servicios;



@Stateless //descargar dependencias
@LocalBean
public class ServicioEJB {
public String metodoprueba (String dato) {
	return "EJB" + dato;
}
}
