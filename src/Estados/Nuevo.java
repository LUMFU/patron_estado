package Estados;

public class Nuevo implements EstadoVehiculo {

	public EstadoVehiculo darDeAlta(String cliente) {
		System.out.println("Alta en el sistema del vehículo de " + cliente);
		return new Registrado();
	}
	
	public EstadoVehiculo darDeBaja(String cliente) {
		System.out.println("Error: El vehículo no está registrado en el sistema, no puede darse de baja.");
		return this;
	}
	
	public EstadoVehiculo recibirVehiculo() {
		System.out.println("Error: El vehículo no está registrado en el sistema, no puede entrar en el taller.");
		return this;
	}
	
	public EstadoVehiculo asignarMecanico(String mecanico) {
		System.out.println("Error: El vehículo no está registrado en el sistema.");
		return this;
	}
	
	public EstadoVehiculo iniciarTrabajos() {
		System.out.println("Error: El vehículo no está registrado en el sistema.");
		return this;
	}
	
	public EstadoVehiculo finalizarTrabajos() {
		System.out.println("Error: El vehículo no está registrado en el sistema.");
		return this;
	}
	
	public EstadoVehiculo ponerEnEspera(String mensaje) {
		System.out.println("Error: El vehículo no está registrado en el sistema.");
		return this;
	}
	
	public EstadoVehiculo recogerVehiculo(String cliente) {
		System.out.println("Error: El vehículo no está registrado en el sistema.");
		return this;
	}
	
	public EstadoVehiculo reanudarTrabajos(boolean respuesta) {
		System.out.println("Error: El vehículo no está registrado en el sistema.");
		return this;
	}
}
