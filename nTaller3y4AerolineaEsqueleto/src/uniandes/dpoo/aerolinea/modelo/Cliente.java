package uniandes.dpoo.aerolinea.modelo;

import uniandes.dpoo.aerolinea.tiquetes.Tiquete;

public abstract class Cliente {
	
	
	protected Cliente() {}
	
	
	public abstract String getTipoCliente();
	
	public abstract String getIdentificador();
	
	public void agregarTiquete(Tiquete tiquete){
		
	};
	
	public  int CalcularValorTotalTiquetes(){
		return -1;
	};
	
	public  void UsarTiquetes(Vuelo vuelo){

	
	};
	
	
	
	
	
	

}
