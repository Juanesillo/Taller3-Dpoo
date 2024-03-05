package uniandes.dpoo.aerolinea.persistencia;

import java.io.IOException;

import uniandes.dpoo.aerolinea.exceptions.InformacionInconsistenteException;
import uniandes.dpoo.aerolinea.modelo.Aerolinea;

public class PersistenciaAerolineaJson implements IPersistenciaAerolinea {

    @Override
    public void cargarAerolinea(String archivo, Aerolinea aerolinea) throws InformacionInconsistenteException {
        
        throw new UnsupportedOperationException("Unimplemented method 'cargarAerolinea'");
    }

    @Override
    public void salvarAerolinea(String archivo, Aerolinea aerolinea) throws IOException {
        
        throw new UnsupportedOperationException("Unimplemented method 'salvarAerolinea'");
    }

}
