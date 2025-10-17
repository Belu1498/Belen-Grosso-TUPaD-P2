public class Banco {
    private final  String nombre;
    private final  String cuit;
    private TarjetaDeCredito tarjeta; // asociación bidireccional

    public Banco(String nombre, String cuit) {
        this.nombre = nombre;
        this.cuit = cuit;
        
    }

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return cuit;
    }

    public TarjetaDeCredito getTarjetaDeCredito() {
        return tarjeta;
    }

     public void setTarjetaDeCredito(TarjetaDeCredito tarjeta) {
        this.tarjeta = tarjeta;
        
    }

    @Override
    public String toString() {
        return "Cliente [Nombre=" + nombre + ", CUIT=" + cuit + "]";
    }

    
    }
