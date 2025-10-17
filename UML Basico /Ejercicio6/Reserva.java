public class Reserva {
    private final String fecha;
    private final String hora;
    private final Cliente cliente; // asoc. unidireccional
    private Mesa mesa; // agregacion
    
    public Reserva(String fecha, String hora, Cliente cliente) {
        this.fecha = fecha;
        this.hora = hora;
        this.cliente = cliente;
        
    }
    
    
    public void setMesa(Mesa mesa) {
        this.mesa = mesa;
    }
    
    public Mesa getMesa() {
        return mesa;
    }
    
    @Override
    public String toString() {
        return "Reserva [Fecha = " + fecha + ", Hora = " + hora 
                + " Cliente = " + cliente + " Mesa = " + (mesa != null ? 
                mesa.getNumero() + "Capacidad = " + mesa.getCapacidad() : "sin numero") + "]";
    }
    
  
    
}
