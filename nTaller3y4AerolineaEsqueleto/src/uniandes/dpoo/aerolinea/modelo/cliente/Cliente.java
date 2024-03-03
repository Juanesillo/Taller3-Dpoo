package uniandes.dpoo.aerolinea.modelo.cliente;

import java.util.ArrayList;
import java.util.Set;

import uniandes.dpoo.aerolinea.modelo.Vuelo;
import uniandes.dpoo.aerolinea.tiquetes.Tiquete;

public abstract class Cliente {
	
	private ArrayList<Tiquete> TiqueteSinUsar = new ArrayList<>();
	private ArrayList<Tiquete> TiquetesUsados = new ArrayList<>();


	protected Cliente() {}
	
	
	public abstract String getTipoCliente();
	
	public abstract String getIdentificador();
	
	public void agregarTiquete(Tiquete tiquete){
		TiqueteSinUsar.add(tiquete);
		
	};
	
	public  int CalcularValorTotalTiquetes(){
		return -1;
	};
	
	public  void UsarTiquetes(Vuelo vuelo){
		Set<String> iterable= vuelo.getTiquetes();
		Object[] p = iterable.toArray();
		for(int i=0; i< p.length;i++){
			TiqueteSinUsar.remove(p[i]);
			TiquetesUsados.add((Tiquete) p[i]);


		}

		

		
		
	
	};
	
	
	
	
	
	

}
