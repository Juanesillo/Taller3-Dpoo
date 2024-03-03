package uniandes.dpoo.aerolinea.modelo;

import uniandes.dpoo.aerolinea.tiquetes.Tiquete;


import java.util.HashMap;

import java.util.Set;

import uniandes.dpoo.aerolinea.exceptions.VueloSobrevendidoException;


public class Vuelo {
    private Avion avion;
    private String fecha;
    private Ruta ruta;
    private HashMap<String,Tiquete> codigos = new HashMap<>();    
   
   
    
    
    public Vuelo(String fecha, Avion avion, Ruta ruta) {
        this.fecha = fecha;
        this.avion = avion;
        this.ruta = ruta;
        
     
        
        
    }

    public Ruta getRuta() {
        return ruta;
    }
    
    public String getFecha() {
    	return fecha;
    }
    
    public Avion getAvion() {
    	return avion;
    }
    
    public Set<String> getTiquetes(){
    	Set<String> keySet=codigos.keySet();
    	return keySet;
    }
    
    public int venderTiquetes(Cliente cliente, CalculadoraTarifas calculadora, int cantidad)throws VueloSobrevendidoException{
        

        
    	return -1;
    }





    
    public boolean equals(Object obj) {
    	return obj.equals(obj);
    }
}
    


