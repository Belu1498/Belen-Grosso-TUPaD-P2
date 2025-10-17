public class Computadora {
    private final String marca;
    private final String numeroSerie;
    private final PlacaMadre placa; // composición
    private Propietario propiet; // asociación bidireccional

    public Computadora(String marca, String numeroSerie, PlacaMadre placa) {
        this.numeroSerie = numeroSerie;
        this.marca = marca;
        this.placa = placa;
    }


    public void setPropietario(Propietario propiet) {
        this.propiet = propiet;
        if (propiet != null && propiet.getComputadora() != this) {
            propiet.setComputadora(this);
        }
    }
    
    public Propietario getPropietario() {
        return propiet;
    }

    @Override
    public String toString() {
        return "Computadora [Marca=" + marca + ", Serie=" + numeroSerie +
               ", Placa Madre=" + placa + ", Propietario=" + (propiet != null ? propiet.getNombre() : "sin propietario") + "]";
    }

}
