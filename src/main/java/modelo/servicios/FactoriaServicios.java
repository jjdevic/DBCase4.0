package modelo.servicios;

import controlador.Controlador;

public class FactoriaServicios {
	
	private ServiciosEntidades servicioEntidades;
	private ServiciosAtributos servicioAtributos;
	private ServiciosRelaciones servicioRelaciones;
	private ServiciosDominios servicioDominios;
	private GeneradorEsquema servicioSistema;
	private ServiciosReporte servicioReporte;
	private ServiciosAgregaciones servicioAgregaciones;
	
	public FactoriaServicios(Controlador controlador) {
		servicioEntidades = new ServiciosEntidades();
        servicioAtributos = new ServiciosAtributos();
        servicioRelaciones = new ServiciosRelaciones();
        servicioDominios = new ServiciosDominios();
        servicioAgregaciones = new ServiciosAgregaciones();
        
        servicioSistema = new GeneradorEsquema();
        servicioSistema.reset();
        servicioReporte = new ServiciosReporte();
        
        servicioReporte.setControlador(controlador);
        servicioSistema.setControlador(controlador);
	}
	
	public ServiciosEntidades getServicioEntidades() {
		return servicioEntidades;
	}

	public ServiciosAtributos getServicioAtributos() {
		return servicioAtributos;
	}

	public ServiciosRelaciones getServicioRelaciones() {
		return servicioRelaciones;
	}

	public ServiciosDominios getServicioDominios() {
		return servicioDominios;
	}

	public GeneradorEsquema getServicioSistema() {
		return servicioSistema;
	}

	public ServiciosReporte getServicioReporte() {
		return servicioReporte;
	}

	public ServiciosAgregaciones getServicioAgregaciones() {
		return servicioAgregaciones;
	}
}