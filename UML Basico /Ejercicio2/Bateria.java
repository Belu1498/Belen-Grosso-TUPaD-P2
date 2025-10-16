package ejercicio2;

/**
 *
 * @author belen
 */
public class Bateria {
        private String modelo;
    private String capacidad;

    public Bateria(String modelo, String capacidad) {
        this.modelo = modelo;
        this.capacidad = capacidad;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String imagen) {
        this.modelo = imagen;
    }

    public String getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(String capacidad) {
        this.capacidad = capacidad;
    }

    @Override
    public String toString() {
        return "Modelo: " + modelo + ", Capacidad =" + capacidad;
    }

}
