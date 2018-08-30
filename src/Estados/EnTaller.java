package Estados;

public class EnTaller implements EstadoVehiculo {

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
		System.out.println("La reparaci�n del veh�culo se le ha asignado a " + mecanico);
		return new Asignado(mecanico);
	}
	
	public EstadoVehiculo iniciarTrabajos() {
		System.out.println("Error: El veh�culo no est� asignado a nin�n mec�nico todav�a.");
		return this;
	}
	
	public EstadoVehiculo finalizarTrabajos() {
		System.out.println("Error: El veh�culo no est� asignado a nin�n mec�nico todav�a y no se han "
				+ "comenzado su reparaci�n.");
		return this;
	}
	
	public EstadoVehiculo ponerEnEspera(String mensaje) {
		System.out.println("Error: El veh�culo no est� asignado a nin�n mec�nico todav�a y no se han "
				+ "comenzado su reparaci�n.");
		return this;
	}
	
	public EstadoVehiculo recogerVehiculo(String cliente) {
		System.out.println("Error: El veh�culo no puede ser recogido todav�a.");
		return this;
	}	
	
	public EstadoVehiculo reanudarTrabajos(boolean respuesta) {
		System.out.println("Error: El veh�culo no est� en espera de respuesta, acaba de entrar en el taller.");
		return this;
	}
}
