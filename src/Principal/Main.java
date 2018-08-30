package Principal;

import Entidades.*;

public class Main {

	public static void main(String[] args) {
		
		Taller taller = new Taller();
		Vehiculo v1 = new Vehiculo("Vehículo 1");
		Vehiculo v2 = new Vehiculo("Vehículo 2");
		Vehiculo v3 = new Vehiculo("Vehículo 3");
		Vehiculo v4 = new Vehiculo("Vehículo 4");
		Vehiculo v5 = new Vehiculo("Vehículo 5");
		
		System.out.println("Intento de recepción de un vehículo no registrado:");
		taller.recibirVehiculo(v1);
		
		System.out.println("Alta de vehículos:");
		taller.registrarVehiculo(v1, "Cliente 1");
		taller.registrarVehiculo(v2, "Cliente 2");
		taller.registrarVehiculo(v3, "Cliente 3");
		taller.registrarVehiculo(v4, "Cliente 4");
		taller.registrarVehiculo(v5, "Cliente 5");
		
		System.out.println("Recepción del vehículo 1, asignación de mecánico e inicio de trabajos:");
		taller.recibirVehiculo(v1);
		taller.asignarMecanico(v1, "Mecánico 1");
		taller.iniciarTrabajos(v1);
		taller.ponerEnEspera(v1, "En espera de piezas");
		
		System.out.println("Recepción del vehículo 2, asignación de mecánico e inicio de trabajos:");
		taller.recibirVehiculo(v2);
		taller.asignarMecanico(v2, "Mecánico 1");
		taller.iniciarTrabajos(v2);
		System.out.println("Intento de asignar mecánico al vehículo 2 estando en reparación:");
		taller.asignarMecanico(v2, "Mecánico 2");

		System.out.println("Se han recibido las piezas del vehículo 1, se reanudan los trabajos y se"
				+ " asigna mecánico:");
		taller.reanudarTrabajos(v1, true);
		taller.asignarMecanico(v1, "Mecánico 2");
		
		System.out.println("Finalización de trabajos del vehículo 2:");
		taller.finalizarTrabajos(v2);

		System.out.println("Inicio de trabajos del vehículo 1:");
		taller.iniciarTrabajos(v1);
		
		System.out.println("Intento de recoger vehículo 3:");
		taller.recogerVehiculo(v3);
		
		System.out.println("Recepción del vehículo 4, asignación de mecánico y finalización de trabajos:");
		taller.recibirVehiculo(v4);
		taller.asignarMecanico(v4, "Mecánico 1");
		taller.finalizarTrabajos(v4);
		
		System.out.println("Recogida del vehículo 2:");
		taller.recogerVehiculo(v2);
		
		System.out.println("Vehículo 1 reparado:");
		taller.finalizarTrabajos(v1);
		System.out.println("Recogida del vehículo 1:");
		taller.recogerVehiculo(v1);
		System.out.println("Inicio de trabajos del vehículo 4:");
		taller.iniciarTrabajos(v4);
		System.out.println("Vehículo 4 en espera de aceptación del presupuesto por el cliente:");
		taller.ponerEnEspera(v4, "Pendiente de aprobación del presupuesto");
		System.out.println("Presupuesto del vehículo 4 rechazado:");
		taller.reanudarTrabajos(v4, false);
		System.out.println("Baja del vehículo 4:");
		taller.darDeBajaVehiculo(v4);
	}

}
