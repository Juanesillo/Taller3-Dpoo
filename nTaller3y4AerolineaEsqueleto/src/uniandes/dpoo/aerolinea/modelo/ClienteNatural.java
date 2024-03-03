package uniandes.dpoo.aerolinea.modelo;

import uniandes.dpoo.aerolinea.tiquetes.Tiquete;

public class ClienteNatural extends Cliente{
	
	public String Natural = "Natural";
	private String Nombre;
	
	
	
	public ClienteNatural(String Nombre) {
		this.Nombre=Nombre;
	}

	
	
	
	
	
	
	
	@Override
	public String getTipoCliente() {
		
		return Nombre;
	}

	@Override
	public String getIdentificador() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void agregarTiquete(Tiquete tiquete) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int CalcularValorTotalTiquetes() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void UsarTiquetes(Vuelo vuelo) {
		// TODO Auto-generated method stub
		
	}
	

}
