package Estados;

public interface EstadoVehiculo {
	
	EstadoVehiculo darDeAlta(String cliente);
	
	EstadoVehiculo darDeBaja(String cliente);
	
	EstadoVehiculo recibirVehiculo();
	
	EstadoVehiculo asignarMecanico(String mecanico);
	
	EstadoVehiculo iniciarTrabajos();
	
	EstadoVehiculo finalizarTrabajos();
	
	EstadoVehiculo ponerEnEspera(String mensaje);
	
	EstadoVehiculo reanudarTrabajos(boolean respuesta);
	
	EstadoVehiculo recogerVehiculo(String cliente);
	
}
