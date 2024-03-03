package uniandes.dpoo.aerolinea.modelo.tarifas;

import uniandes.dpoo.aerolinea.modelo.Cliente;

import uniandes.dpoo.aerolinea.modelo.Vuelo;

public class CalculadoraTarifasTemporadaBaja extends CalculadoraTarifas{
    protected final int CostoPorKMNatural =600;
    protected final int CostoPorKMCorporativo= 900;
    protected final double DescuentoPEQ=0.02;
    protected final double descuetnoMedianas=0.1;
    protected final double descuentoGrandes=0.2;

    
    public CalculadoraTarifasTemporadaBaja(){
        super();
    }


    @Override
    protected int calcularCostoBase(Vuelo vuelo, Cliente cliente) {
        if(cliente.getTipoCliente() ==  "Natural"){
            return CostoPorKMNatural*calcularDistanciaVuelo(vuelo.getRuta());


        }
        else{
            return CostoPorKMCorporativo*calcularDistanciaVuelo(vuelo.getRuta());

        }
        
        
    }

    @Override
    protected double CalcularPorcentajeDescuento(Cliente cliente) {
        if(cliente.getTipoCliente() ==  "Natural"){
            return 0;
        }
        else{
            return 1;
        }
    }

   






}
