package uniandes.dpoo.aerolinea.tiquetes;

import uniandes.dpoo.aerolinea.modelo.Vuelo;
import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;

public class Tiquete extends java.lang.Object {
	
	private String codigo;
	private int tarifa;
	
	
	
	private Vuelo vuelo;
	
	private Cliente clienteComprador;
	
	
	
	public Tiquete(String codigo, Vuelo vuelo, Cliente clienteComprador, int tarifa) {
		
		this.codigo =codigo;
		this.tarifa=tarifa;
		this.vuelo=vuelo;
		this.clienteComprador=clienteComprador;
		
		
	}
	
	
	public Cliente getCliente() {
		return clienteComprador;
	}
	
	public Vuelo getVuelo() {
		return vuelo;
	}
	
	public String getCodigo(){
		return codigo;
	}
	
	public int getTarifa() {
		return tarifa;
	}
	
	public void MarcarComoUsado() {
		GeneradorTiquetes.registrarTiquete(GeneradorTiquetes.generarTiquete(vuelo, clienteComprador, tarifa));
		
	}
	
	public boolean esUsado() {
		return GeneradorTiquetes.validarTiquete(codigo);
	}
	
	
	
	
	
	
	
	

}
