package Estados;

public class EnReparacion implements EstadoVehiculo {
	
	public EstadoVehiculo darDeAlta(String cliente) {
		System.out.println("Error: El veh�culo ya est� dado de alta.");
		return this;
	}
	
	public EstadoVehiculo darDeBaja(String cliente) {
		System.out.println("Error: El veh�culo de " + cliente + " no puede darse de baja porque est� en "
				+ "el taller siendo reparado.");
		return this;
	}
	
	public EstadoVehiculo recibirVehiculo() {
		System.out.println("Error: El veh�culo ya est� en el taller siendo reparado.");
		return this;
	}
	
	public EstadoVehiculo asignarMecanico(String mecanico) {
		System.out.println("Error: El veh�culo ya est� siendo reparado.");
		return this;
	}
	
	public EstadoVehiculo iniciarTrabajos() {
		System.out.println("Error: Ya ha comenzado la reparaci�n del veh�culo.");
		return this;
	}
	
	public EstadoVehiculo finalizarTrabajos() {
		System.out.println("La reparaci�n del veh�culo ha finalizado.");
		return new Reparado();
	}
	
	public EstadoVehiculo ponerEnEspera(String mensaje) {
		System.out.println("La reparaci�n del veh�culo queda a la espera: " + mensaje);
		return new EnEspera();
	}

	public EstadoVehiculo recogerVehiculo(String cliente) {
		System.out.println("Error: El veh�culo no puede ser recogido todav�a.");
		return this;
	}	
	public EstadoVehiculo reanudarTrabajos(boolean respuesta) {
		System.err.println("El veh�culo no est� en espera de respuesta, est� siendo reparado.");
		return this;
	}
}
