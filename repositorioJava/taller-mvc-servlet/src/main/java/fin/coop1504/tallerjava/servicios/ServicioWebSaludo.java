package fin.coop1504.tallerjava.servicios;

@//agregar el Webservice
public class ServicioWebSaludo {
	@webMethod(operationName="Saludar")
public String saludo (String nombre) {
	return "Hola" + nombre;
}
	@webMethod(operationName="Despedir")
	public String saludo (String nombre) {
		return "Adios" + nombre;
	}
}
