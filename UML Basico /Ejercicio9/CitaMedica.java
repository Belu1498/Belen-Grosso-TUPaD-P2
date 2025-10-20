public class CitaMedica {
     private final String fecha;
    private final String hora;
    private final Paciente paciente;
    private final Profesional profesional;

    public CitaMedica(String fecha, String hora, Paciente paciente, Profesional profesional) {
        this.fecha = fecha;
        this.hora = hora;
        this.paciente = paciente;
        this.profesional = profesional;
    }

    @Override
    public String toString() {
        return "CitaMedica [Fecha=" + fecha + ", Hora=" + hora + 
               ", Paciente=" + paciente.getNombre() + 
               ", Profesional=" + profesional.getNombre() + "]";
}
}
