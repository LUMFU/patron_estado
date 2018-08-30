package Estados;

public class EnTaller implements EstadoVehiculo {

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
		System.out.println("La reparación del vehículo se le ha asignado a " + mecanico);
		return new Asignado(mecanico);
	}
	
	public EstadoVehiculo iniciarTrabajos() {
		System.out.println("Error: El vehículo no está asignado a ninún mecánico todavía.");
		return this;
	}
	
	public EstadoVehiculo finalizarTrabajos() {
		System.out.println("Error: El vehículo no está asignado a ninún mecánico todavía y no se han "
				+ "comenzado su reparación.");
		return this;
	}
	
	public EstadoVehiculo ponerEnEspera(String mensaje) {
		System.out.println("Error: El vehículo no está asignado a ninún mecánico todavía y no se han "
				+ "comenzado su reparación.");
		return this;
	}
	
	public EstadoVehiculo recogerVehiculo(String cliente) {
		System.out.println("Error: El vehículo no puede ser recogido todavía.");
		return this;
	}	
	
	public EstadoVehiculo reanudarTrabajos(boolean respuesta) {
		System.out.println("Error: El vehículo no está en espera de respuesta, acaba de entrar en el taller.");
		return this;
	}
}
