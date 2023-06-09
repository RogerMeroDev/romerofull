package fin.coop1504.tallerjava.entidades;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DocumentoSRI {
    private String actividadEconomica;
    private Date fechaExpedicion;
    private Date fechaExpiracion;
    private String estado;
    
	public String getActividadEconomica() {
		return actividadEconomica;
	}
	public void setActividadEconomica(String actividadEconomica) {
		this.actividadEconomica = actividadEconomica;
	}
	public Date getFechaExpedicion() {
		return fechaExpedicion;
	}
	public void setFechaExpedicion(Date fechaExpedicion) {
		this.fechaExpedicion = fechaExpedicion;
	}
	public Date getFechaExpiracion() {
		return fechaExpiracion;
	}
	public void setFechaExpiracion(Date fechaExpiracion) {
		this.fechaExpiracion = fechaExpiracion;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
    
    @Override
    public String toString() {    
    	SimpleDateFormat formateador= new SimpleDateFormat("EE - dd/MM/yyyy HH:mm:ss");/*Formateador de codigo*/
    	return "{Actividad:"+actividadEconomica+formateador.format(fechaExpedicion)+formateador.format(fechaExpedicion)+estado+"}";
    }
    
}
