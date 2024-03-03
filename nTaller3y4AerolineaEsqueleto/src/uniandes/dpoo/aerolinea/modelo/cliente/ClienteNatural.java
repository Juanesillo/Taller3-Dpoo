package uniandes.dpoo.aerolinea.modelo.cliente;

public class ClienteNatural extends Cliente{
	
	public static final String Natural = "Natural";
	private String Nombre;
	
	
	
	public ClienteNatural(String Nombre) {
		this.Nombre=Nombre;
	}

	
	
	
	
	
	
	
	@Override
	public String getTipoCliente() {
		
		return Natural;
	}

	@Override
	public String getIdentificador() {

		return Nombre;
	}

	
	

}
