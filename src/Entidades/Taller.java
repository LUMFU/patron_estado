package Entidades;

public class Taller {

	public void registrarVehiculo(Vehiculo vehiculo, String cliente) {
		vehiculo.darDeAlta(cliente);
	}
	
	public void darDeBajaVehiculo(Vehiculo vehiculo) {
		vehiculo.darDeBaja();
	}

	public void recibirVehiculo(Vehiculo vehiculo) {
		vehiculo.recibirVehiculo();
	}
	
	public void asignarMecanico(Vehiculo vehiculo, String mecanico) {
		vehiculo.asignarMecanico(mecanico);
	}
	
	public void iniciarTrabajos(Vehiculo vehiculo) {
		vehiculo.iniciarTrabajos();
	}
	
	public void finalizarTrabajos(Vehiculo vehiculo) {
		vehiculo.finalizarTrabajos();
	}
	
	public void ponerEnEspera(Vehiculo vehiculo, String mensaje) {
		vehiculo.ponerEnEspera(mensaje);
	}
	
	public void reanudarTrabajos(Vehiculo vehiculo, boolean respuesta) {
		vehiculo.reanudarTrabajos(respuesta);
	}
	
	public void recogerVehiculo(Vehiculo vehiculo) {
		vehiculo.recogerVehiculo();
	}
}
