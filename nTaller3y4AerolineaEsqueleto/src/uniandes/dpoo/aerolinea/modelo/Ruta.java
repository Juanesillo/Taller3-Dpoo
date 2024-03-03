package uniandes.dpoo.aerolinea.modelo;

/**
 * Esta clase tiene la información de una ruta entre dos aeropuertos que cubre una aerolínea.
 */
public class Ruta
{
	
	
	private String HoraSalida;
	private String HoraLlegada;
	private String codigoRuta;
	
	private Aeropuerto origen;
	private Aeropuerto destino;
   
	
	public Ruta(Aeropuerto origen, Aeropuerto destino, String HoraSalida, String HoraLlegada, String codigoRuta) {
		this.origen=origen;
		this.destino=destino;
		this.HoraLlegada=HoraLlegada;
		this.HoraSalida=HoraSalida;
	
	}
	
	
	
	public String getCodigoRuta() {
		return codigoRuta;
	}
	
	public Aeropuerto origen() {
		return origen;
	}
	public Aeropuerto destino() {
		return destino;
	}
	
	public String getHorasalida() {
		return HoraSalida;
	}
	public String getHoraLlegada() {
		return HoraLlegada;
	}
	
	public int getDuracion() {
		return -1;
	}

    /**
     * Dada una cadena con una hora y minutos, retorna los minutos.
     * 
     * Por ejemplo, para la cadena '715' retorna 15.
     * @param horaCompleta Una cadena con una hora, donde los minutos siempre ocupan los dos últimos caracteres
     * @return Una cantidad de minutos entre 0 y 59
     */
    public static int getMinutos( String horaCompleta )
    {
        int minutos = Integer.parseInt( horaCompleta ) % 100;
        return minutos;
    }

    /**
     * Dada una cadena con una hora y minutos, retorna las horas.
     * 
     * Por ejemplo, para la cadena '715' retorna 7.
     * @param horaCompleta Una cadena con una hora, donde los minutos siempre ocupan los dos últimos caracteres
     * @return Una cantidad de horas entre 0 y 23
     */
    public static int getHoras( String horaCompleta )
    {
        int horas = Integer.parseInt( horaCompleta ) / 100;
        return horas;
    }

    
}
