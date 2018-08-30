package Estados;

public class EnEspera implements EstadoVehiculo {

	private String mensaje;
	
	public EstadoVehiculo darDeAlta(String cliente) {
		System.out.println("Error: El vehículo ya está dado de alta.");
		return this;
	}
	
	public EstadoVehiculo darDeBaja(String cliente) {
		System.out.println("Error: El vehículo de " + cliente + " no puede darse de baja porque está en "
				+ "el taller: " + mensaje);
		return this;
	}
	
	public EstadoVehiculo recibirVehiculo() {
		System.out.println("Error: El vehículo ya está en el taller: " + mensaje);
		return this;
	}
	
	public EstadoVehiculo asignarMecanico(String mecanico) {
		System.out.println("Error: El vehículo está en espera: " + mensaje);
		return this;
	}
	
	public EstadoVehiculo iniciarTrabajos() {
		System.out.println("Error: El vehículo está en espera: " + mensaje);
		return this;
	}
	
	public EstadoVehiculo finalizarTrabajos() {
		System.out.println("Error: El vehículo está en espera: " + mensaje);
		return this;
	}
	
	public EstadoVehiculo ponerEnEspera(String mensaje) {
		System.out.println("Error: El vehículo ya se encuentra en espera: " + this.mensaje);
		return this;
	}
	
	public EstadoVehiculo recogerVehiculo(String cliente) {
		System.out.println("Error: El vehículo está en espera: " + mensaje);
		return this;
	}
	
	public EstadoVehiculo reanudarTrabajos(boolean respuesta) {
		if (respuesta) {
			System.out.println("Se reanudan los trabajos en el vehículo.");
			return new EnTaller();
		} else {
			System.out.println("Se abandonan los trabajos en el vehículo y es recogido del taller.");
			return new Registrado();
		}
	}

}
