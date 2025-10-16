package ejercicio2;

/**
 *
 * @author belen
 */
public class Celular {
    
    private final String imei;
    private final String marca;
    private final String modelo;
    private Bateria bateria; // AGREGACIÓN 
    private Usuario usuario; // asociación bidireccional

    public Celular(String imei, String marca, String modelo) {
        this.imei = imei;
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getimei() {
        return imei;
    }

    public String getmarca() {
        return marca;
    }
    
        public String getmodelo() {
        return modelo;
    }

    public Bateria getBateria() {
        return bateria;
    }

    public void setBateria(Bateria bateria) {
        this.bateria = bateria; // solo se asigna, no se crea ni destruye
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
        if (usuario != null && usuario.getCelular() != this) {
            usuario.setCelular(this);
        }
        
    }
    
    @Override
    public String toString() {
        return "Celular imei=" + imei + ", Marca= " + marca +
               ", " + "Modelo= " + modelo + ", Usuario=" + usuario;

    }
}
