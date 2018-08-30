package Estados;

public class EnReparacion implements EstadoVehiculo {
	
	public EstadoVehiculo darDeAlta(String cliente) {
		System.out.println("Error: El vehículo ya está dado de alta.");
		return this;
	}
	
	public EstadoVehiculo darDeBaja(String cliente) {
		System.out.println("Error: El vehículo de " + cliente + " no puede darse de baja porque está en "
				+ "el taller siendo reparado.");
		return this;
	}
	
	public EstadoVehiculo recibirVehiculo() {
		System.out.println("Error: El vehículo ya está en el taller siendo reparado.");
		return this;
	}
	
	public EstadoVehiculo asignarMecanico(String mecanico) {
		System.out.println("Error: El vehículo ya está siendo reparado.");
		return this;
	}
	
	public EstadoVehiculo iniciarTrabajos() {
		System.out.println("Error: Ya ha comenzado la reparación del vehículo.");
		return this;
	}
	
	public EstadoVehiculo finalizarTrabajos() {
		System.out.println("La reparación del vehículo ha finalizado.");
		return new Reparado();
	}
	
	public EstadoVehiculo ponerEnEspera(String mensaje) {
		System.out.println("La reparación del vehículo queda a la espera: " + mensaje);
		return new EnEspera();
	}

	public EstadoVehiculo recogerVehiculo(String cliente) {
		System.out.println("Error: El vehículo no puede ser recogido todavía.");
		return this;
	}	
	public EstadoVehiculo reanudarTrabajos(boolean respuesta) {
		System.err.println("El vehículo no está en espera de respuesta, está siendo reparado.");
		return this;
	}
}
