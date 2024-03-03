package uniandes.dpoo.aerolinea.modelo.tarifas;


import uniandes.dpoo.aerolinea.modelo.Aeropuerto;
import uniandes.dpoo.aerolinea.modelo.Cliente;
import uniandes.dpoo.aerolinea.modelo.Ruta;
import uniandes.dpoo.aerolinea.modelo.Vuelo;


public abstract class CalculadoraTarifas {

    public int impuesto =28;

    public CalculadoraTarifas(){}

    public int calcularTarifa​(Vuelo vuelo,Cliente cliente){

        if(CalcularPorcentajeDescuento(cliente)==1){
            return 0;
        }

        else{
            return calcularCostoBase(vuelo, cliente);


        }

        
    }

    protected abstract int calcularCostoBase(Vuelo vuelo, Cliente cliente);
    

    protected abstract double CalcularPorcentajeDescuento(Cliente cliente);
    /** retorno un valor entre 0 y 1, 0 no hay descuento y 1 tiene un 100% de descuento  
     * 
    */


    protected  int calcularDistanciaVuelo(Ruta ruta){

        Aeropuerto a1= ruta.origen();
        Aeropuerto a2= ruta.destino();

        
        int distancia= Aeropuerto.calcularDistancia(a1, a2);
        return distancia;



    }

    protected int calcularValorImpuestos(int costoBase){
        int retorno= costoBase*(impuesto/100);
        return  retorno;

        
    }



}
