package uniandes.dpoo.aerolinea.modelo.tarifas;

import uniandes.dpoo.aerolinea.modelo.Cliente;
import uniandes.dpoo.aerolinea.modelo.Vuelo;

public class CalculadoraTarifasTemporadaAlta extends CalculadoraTarifas{
    protected final int CostoPorKmTemporadaAlta=1000;


    @Override
    protected int calcularCostoBase(Vuelo vuelo, Cliente cliente) {
        
        return CostoPorKmTemporadaAlta*calcularDistanciaVuelo(vuelo.getRuta());
    }

    @Override
    protected double CalcularPorcentajeDescuento(Cliente cliente) {
        
        return 0;
    }


}
