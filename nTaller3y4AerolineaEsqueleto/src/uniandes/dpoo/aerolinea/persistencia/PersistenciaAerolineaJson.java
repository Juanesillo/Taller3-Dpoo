package uniandes.dpoo.aerolinea.persistencia;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

import org.json.JSONObject;

import uniandes.dpoo.aerolinea.exceptions.InformacionInconsistenteException;
import uniandes.dpoo.aerolinea.modelo.Aerolinea;

public class PersistenciaAerolineaJson implements IPersistenciaAerolinea {

    @Override
    public void cargarAerolinea(String archivo, Aerolinea aerolinea) throws InformacionInconsistenteException, IOException {
        
        String jsonCompleto = new String( Files.readAllBytes( new File( archivo ).toPath( ) ) );
        JSONObject raiz = new JSONObject( jsonCompleto );

       
        throw new UnsupportedOperationException("Unimplemented method 'cargarAerolinea'");
    }

    @Override
    public void salvarAerolinea(String archivo, Aerolinea aerolinea) throws IOException {
        
        throw new UnsupportedOperationException("Unimplemented method 'salvarAerolinea'");
    }

}
