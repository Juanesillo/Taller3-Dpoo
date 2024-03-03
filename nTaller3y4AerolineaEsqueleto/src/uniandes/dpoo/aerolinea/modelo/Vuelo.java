package uniandes.dpoo.aerolinea.modelo;
import uniandes.dpoo.aerolinea.tiquetes.Tiquete;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import uniandes.dpoo.aerolinea.exceptions.VueloSobrevendidoException;
import uniandes.dpoo.aerolinea.tiquetes.Tiquete;

public class Vuelo {
    private Set<Tiquete> tiquetes= new HashSet<>();
    private String fecha;
    private Avion avion;
    private Ruta ruta;
   
    
    
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
    
    public Collection<Tiquete> getTiquetes(){
    	
    	return null;
    }
    
    public int venderTiquetes(Cliente cliente, CalculadoraTarifas calculadora, int cantidad)throws VueloSobrevendidoException{
    	return -1;
    }
    
    public boolean equals(Object obj) {
    	return obj.equals(obj);
    }
    
}

