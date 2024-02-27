package uniandes.dpoo.aerolinea.modelo;

import java.util.Collection;

public class Vuelo {
    
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
    
    public int venderTiquetes(Cliente cliente, CalculadoraTarifas calculadora, int cantidad){
    	return -1;
    }
    
    public boolean equals(Object obj) {
    	return obj.equals(obj);
    }
    
}

