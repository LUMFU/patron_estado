package Estados;

public class Reparado implements EstadoVehiculo {

	public EstadoVehiculo darDeAlta(String cliente) {
		System.out.println("Error: El veh�culo ya est� dado de alta.");
		return this;
	}
	
	public EstadoVehiculo darDeBaja(String cliente) {
		System.out.println("Error: El veh�culo de " + cliente + " no puede darse de baja porque est� en "
				+ "el taller a la espera de ser recogido.");
		return this;
	}
	
	public EstadoVehiculo recibirVehiculo() {
		System.out.println("Error: El veh�culo ya est� en el taller y ha sido reparado.");
		return this;
	}
	
	public EstadoVehiculo asignarMecanico(String mecanico) {
		System.out.println("Error: Ya ha finalizado la reparaci�n del veh�culo.");
		return this;
	}
	
	public EstadoVehiculo iniciarTrabajos() {
		System.out.println("Error: Ya ha finalizado la reparaci�n del veh�culo.");
		return this;
	}
	
	public EstadoVehiculo finalizarTrabajos() {
		System.out.println("Error: Ya ha finalizado la reparaci�n del veh�culo.");
		return this;
	}
	
	public EstadoVehiculo ponerEnEspera(String mensaje) {
		System.out.println("Error: Ya ha finalizado la reparaci�n del veh�culo.");
		return this;
	}
	
	public EstadoVehiculo recogerVehiculo(String cliente) {
		System.out.println(cliente + " ha recogido el veh�culo del taller.");
		return new Registrado();
	}
	
	public EstadoVehiculo reanudarTrabajos(boolean respuesta) {
		System.out.println("Error: El veh�culo no est� en espera de respuesta, ya ha sido reparado.");
		return this;
	}
}
