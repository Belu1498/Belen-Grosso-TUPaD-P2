public class Mesa {
    private final String numero;
    private final String capacidad;

    
    
    public Mesa(String numero, String capacidad) {
        this.numero = numero;
        this.capacidad = capacidad;
        
  
    }
    
    public String getNumero() {
        return numero;
        
    }
    
    public  String getCapacidad() {
        return capacidad;
    }
    
    @Override
    public String toString() {
        return "Mesa [Numero = " + numero + " , Capacidad = " + capacidad + " ]";
    }
    
}
