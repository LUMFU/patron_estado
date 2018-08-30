package Estados;

public class Registrado implements EstadoVehiculo {

	public EstadoVehiculo darDeAlta(String cliente) {
		System.out.println("Error: El veh�culo ya est� dado de alta.");
		return this;
	}
	
	public EstadoVehiculo darDeBaja(String cliente) {
		System.out.println("El veh�culo de " + cliente + " se ha dado de baja.");
		return new Nuevo();
	}
	
	public EstadoVehiculo recibirVehiculo() {
		System.out.println("El veh�culo ha entrado en el taller para ser reparado.");
		return new EnTaller();
	}
	
	public EstadoVehiculo asignarMecanico(String mecanico) {
		System.out.println("Error: El veh�culo no est� en el taller.");
		return this;
	}
	
	public EstadoVehiculo iniciarTrabajos() {
		System.out.println("Error: El veh�culo no est� en el taller.");
		return this;
	}
	
	public EstadoVehiculo finalizarTrabajos() {
		System.out.println("Error: El veh�culo no est� en el taller.");
		return this;
	}
	
	public EstadoVehiculo ponerEnEspera(String mensaje) {
		System.out.println("Error: El veh�culo no est� en el taller.");
		return this;
	}
	
	public EstadoVehiculo recogerVehiculo(String cliente) {
		System.out.println("Error: El veh�culo no est� en el taller.");
		return this;
	}	
	
	public EstadoVehiculo reanudarTrabajos(boolean respuesta) {
		System.out.println("Error: El veh�culo no est� en el taller.");
		return this;
	}
}
