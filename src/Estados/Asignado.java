package Estados;

public class Asignado implements EstadoVehiculo {

	private String mecanico;
	
	public Asignado(String mecanico) {
		this.mecanico = mecanico;
	}
	
	public EstadoVehiculo darDeAlta(String cliente) {
		System.out.println("Error: El veh�culo ya est� dado de alta.");
		return this;
	}
	
	public EstadoVehiculo darDeBaja(String cliente) {
		System.out.println("Error: El veh�culo de " + cliente + " no puede darse de baja porque est� en "
				+ "el taller para ser reparado.");
		return this;
	}
	
	public EstadoVehiculo recibirVehiculo() {
		System.out.println("Error: El veh�culo ya est� en el taller para ser reparado.");
		return this;
	}
	
	public EstadoVehiculo asignarMecanico(String mecanico) {
		System.out.println("Error: El veh�culo ya est� asignado al mec�nico " + this.mecanico);
		return this;
	}
	
	public EstadoVehiculo iniciarTrabajos() {
		System.out.println(mecanico + " ha comenzado la reparaci�n del veh�culo.");
		return new EnReparacion();
	}
	
	public EstadoVehiculo finalizarTrabajos() {
		System.out.println("Error: La reparaci�n del veh�culo a�n no ha comenzado.");
		return this;
	}
	
	public EstadoVehiculo ponerEnEspera(String mensaje) {
		System.out.println("Error: La reparaci�n del veh�culo a�n no ha comenzado.");
		return this;
	}
	
	public EstadoVehiculo recogerVehiculo(String cliente) {
		System.out.println("Error: El veh�culo no puede ser recogido todav�a.");
		return this;
	}
	
	public EstadoVehiculo reanudarTrabajos(boolean respuesta) {
		System.out.println("Error: El veh�culo no est� en espera de respuesta.");
		return this;
	}
}
