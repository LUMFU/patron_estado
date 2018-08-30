package Principal;

import Entidades.*;

public class Main {

	public static void main(String[] args) {
		
		Taller taller = new Taller();
		Vehiculo v1 = new Vehiculo("Veh�culo 1");
		Vehiculo v2 = new Vehiculo("Veh�culo 2");
		Vehiculo v3 = new Vehiculo("Veh�culo 3");
		Vehiculo v4 = new Vehiculo("Veh�culo 4");
		Vehiculo v5 = new Vehiculo("Veh�culo 5");
		
		System.out.println("Intento de recepci�n de un veh�culo no registrado:");
		taller.recibirVehiculo(v1);
		
		System.out.println("Alta de veh�culos:");
		taller.registrarVehiculo(v1, "Cliente 1");
		taller.registrarVehiculo(v2, "Cliente 2");
		taller.registrarVehiculo(v3, "Cliente 3");
		taller.registrarVehiculo(v4, "Cliente 4");
		taller.registrarVehiculo(v5, "Cliente 5");
		
		System.out.println("Recepci�n del veh�culo 1, asignaci�n de mec�nico e inicio de trabajos:");
		taller.recibirVehiculo(v1);
		taller.asignarMecanico(v1, "Mec�nico 1");
		taller.iniciarTrabajos(v1);
		taller.ponerEnEspera(v1, "En espera de piezas");
		
		System.out.println("Recepci�n del veh�culo 2, asignaci�n de mec�nico e inicio de trabajos:");
		taller.recibirVehiculo(v2);
		taller.asignarMecanico(v2, "Mec�nico 1");
		taller.iniciarTrabajos(v2);
		System.out.println("Intento de asignar mec�nico al veh�culo 2 estando en reparaci�n:");
		taller.asignarMecanico(v2, "Mec�nico 2");

		System.out.println("Se han recibido las piezas del veh�culo 1, se reanudan los trabajos y se"
				+ " asigna mec�nico:");
		taller.reanudarTrabajos(v1, true);
		taller.asignarMecanico(v1, "Mec�nico 2");
		
		System.out.println("Finalizaci�n de trabajos del veh�culo 2:");
		taller.finalizarTrabajos(v2);

		System.out.println("Inicio de trabajos del veh�culo 1:");
		taller.iniciarTrabajos(v1);
		
		System.out.println("Intento de recoger veh�culo 3:");
		taller.recogerVehiculo(v3);
		
		System.out.println("Recepci�n del veh�culo 4, asignaci�n de mec�nico y finalizaci�n de trabajos:");
		taller.recibirVehiculo(v4);
		taller.asignarMecanico(v4, "Mec�nico 1");
		taller.finalizarTrabajos(v4);
		
		System.out.println("Recogida del veh�culo 2:");
		taller.recogerVehiculo(v2);
		
		System.out.println("Veh�culo 1 reparado:");
		taller.finalizarTrabajos(v1);
		System.out.println("Recogida del veh�culo 1:");
		taller.recogerVehiculo(v1);
		System.out.println("Inicio de trabajos del veh�culo 4:");
		taller.iniciarTrabajos(v4);
		System.out.println("Veh�culo 4 en espera de aceptaci�n del presupuesto por el cliente:");
		taller.ponerEnEspera(v4, "Pendiente de aprobaci�n del presupuesto");
		System.out.println("Presupuesto del veh�culo 4 rechazado:");
		taller.reanudarTrabajos(v4, false);
		System.out.println("Baja del veh�culo 4:");
		taller.darDeBajaVehiculo(v4);
	}

}
