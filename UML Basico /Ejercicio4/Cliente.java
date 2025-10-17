public class Cliente {
    private final String nombre;
    private final String dni;
    private TarjetaDeCredito tarjeta;


    public Cliente(String nombre, String dni) {
        this.nombre= nombre;
        this.dni = dni;
    }

    public TarjetaDeCredito getTarjetaDeCredito() {
        return tarjeta;
    }


    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    
    public void setTarjetaDeCredito(TarjetaDeCredito tarjeta) {
        this.tarjeta = tarjeta;
        
    }
    
    
    @Override
public String toString() {
    return "Cliente [Nombre=" + nombre + 
           ", DNI=" + dni + 
           ", Tarjeta=" + (tarjeta != null ? tarjeta.getNumero() : "sin tarjeta") + 
           ", Banco=" + (tarjeta != null && tarjeta.getBanco() != null ? tarjeta.getBanco().getNombre() : "sin banco") + " ]";
    
    
    
}
}
