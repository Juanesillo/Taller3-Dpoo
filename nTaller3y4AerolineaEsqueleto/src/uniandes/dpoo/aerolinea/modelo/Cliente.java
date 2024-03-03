package uniandes.dpoo.aerolinea.modelo;

import uniandes.dpoo.aerolinea.tiquetes.Tiquete;

public abstract class Cliente {
	
	
	protected Cliente() {}
	
	
	public abstract String getTipoCliente();
	
	public abstract String getIdentificador();
	
	public abstract void agregarTiquete(Tiquete tiquete);
	
	public abstract int CalcularValorTotalTiquetes();
	
	public abstract void UsarTiquetes(Vuelo vuelo);
	
	
	
	
	
	

}
