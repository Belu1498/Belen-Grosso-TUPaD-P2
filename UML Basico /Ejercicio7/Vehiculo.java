public class Vehiculo {
    private final String patente;
    private final String modelo;
    private Motor motor;
     private Conductor conductor;

    public Vehiculo(String patente, String modelo, Motor motor) {
        this.patente = patente;
        this.modelo = modelo;
        this.motor = motor;
    }

    public String getPatente() {
        return patente;
    }

    public String getModelo() {
        return modelo;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Conductor getConductor() {
        return conductor;
    }

    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
        if (conductor != null && conductor.getVehiculo() != this) {
            conductor.setVehiculo(this);
        }
    }

    @Override
    public String toString() {
        return "Vehiculo --> Patente=" + patente +
               ", Modelo=" + modelo + ", Motor=" + motor + ", Conductor=" + (conductor != null 
                    ? conductor.getNombre() + " (Licencia: " + conductor.getLicencia() + ")" 
                    : "sin conductor") + "]";
    }
}
