package Estados;

public class Reparado implements EstadoVehiculo {

	public EstadoVehiculo darDeAlta(String cliente) {
		System.out.println("Error: El vehículo ya está dado de alta.");
		return this;
	}
	
	public EstadoVehiculo darDeBaja(String cliente) {
		System.out.println("Error: El vehículo de " + cliente + " no puede darse de baja porque está en "
				+ "el taller a la espera de ser recogido.");
		return this;
	}
	
	public EstadoVehiculo recibirVehiculo() {
		System.out.println("Error: El vehículo ya está en el taller y ha sido reparado.");
		return this;
	}
	
	public EstadoVehiculo asignarMecanico(String mecanico) {
		System.out.println("Error: Ya ha finalizado la reparación del vehículo.");
		return this;
	}
	
	public EstadoVehiculo iniciarTrabajos() {
		System.out.println("Error: Ya ha finalizado la reparación del vehículo.");
		return this;
	}
	
	public EstadoVehiculo finalizarTrabajos() {
		System.out.println("Error: Ya ha finalizado la reparación del vehículo.");
		return this;
	}
	
	public EstadoVehiculo ponerEnEspera(String mensaje) {
		System.out.println("Error: Ya ha finalizado la reparación del vehículo.");
		return this;
	}
	
	public EstadoVehiculo recogerVehiculo(String cliente) {
		System.out.println(cliente + " ha recogido el vehículo del taller.");
		return new Registrado();
	}
	
	public EstadoVehiculo reanudarTrabajos(boolean respuesta) {
		System.out.println("Error: El vehículo no está en espera de respuesta, ya ha sido reparado.");
		return this;
	}
}
