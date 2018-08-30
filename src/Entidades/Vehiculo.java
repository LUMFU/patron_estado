package Entidades;

import Estados.*;

public class Vehiculo {

	private String nombre;
	private EstadoVehiculo estado;
	private String cliente;
	
	public Vehiculo(String nombre) {
		this.nombre = nombre;
		estado = new Nuevo();
	}

	public void darDeAlta(String cliente) {
		System.out.print(nombre + " - ");
		estado = estado.darDeAlta(cliente);
		this.cliente = cliente;
	}
	
	public void darDeBaja() {
		System.out.print(nombre + " - ");
		estado = estado.darDeBaja(cliente);
	}
	
	public void recibirVehiculo() {
		System.out.print(nombre + " - ");
		estado = estado.recibirVehiculo();
	}
	
	public void asignarMecanico(String mecanico) {
		System.out.print(nombre + " - ");
		estado = estado.asignarMecanico(mecanico);
	}
	
	public void iniciarTrabajos() {
		System.out.print(nombre + " - ");
		estado = estado.iniciarTrabajos();
	}
	
	public void finalizarTrabajos() {
		System.out.print(nombre + " - ");
		estado = estado.finalizarTrabajos();
	}
	
	public void ponerEnEspera(String mensaje) {
		System.out.print(nombre + " - ");
		estado = estado.ponerEnEspera(mensaje);
	}
	
	public void reanudarTrabajos(boolean respuesta) {
		System.out.print(nombre + " - ");
		estado = estado.reanudarTrabajos(respuesta);
	}
	
	public void recogerVehiculo() {
		System.out.print(nombre + " - ");
		estado = estado.recogerVehiculo(cliente);
	}
	
}
