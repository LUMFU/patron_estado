package Estados;

public class Asignado implements EstadoVehiculo {

	private String mecanico;
	
	public Asignado(String mecanico) {
		this.mecanico = mecanico;
	}
	
	public EstadoVehiculo darDeAlta(String cliente) {
		System.out.println("Error: El vehículo ya está dado de alta.");
		return this;
	}
	
	public EstadoVehiculo darDeBaja(String cliente) {
		System.out.println("Error: El vehículo de " + cliente + " no puede darse de baja porque está en "
				+ "el taller para ser reparado.");
		return this;
	}
	
	public EstadoVehiculo recibirVehiculo() {
		System.out.println("Error: El vehículo ya está en el taller para ser reparado.");
		return this;
	}
	
	public EstadoVehiculo asignarMecanico(String mecanico) {
		System.out.println("Error: El vehículo ya está asignado al mecánico " + this.mecanico);
		return this;
	}
	
	public EstadoVehiculo iniciarTrabajos() {
		System.out.println(mecanico + " ha comenzado la reparación del vehículo.");
		return new EnReparacion();
	}
	
	public EstadoVehiculo finalizarTrabajos() {
		System.out.println("Error: La reparación del vehículo aún no ha comenzado.");
		return this;
	}
	
	public EstadoVehiculo ponerEnEspera(String mensaje) {
		System.out.println("Error: La reparación del vehículo aún no ha comenzado.");
		return this;
	}
	
	public EstadoVehiculo recogerVehiculo(String cliente) {
		System.out.println("Error: El vehículo no puede ser recogido todavía.");
		return this;
	}
	
	public EstadoVehiculo reanudarTrabajos(boolean respuesta) {
		System.out.println("Error: El vehículo no está en espera de respuesta.");
		return this;
	}
}
