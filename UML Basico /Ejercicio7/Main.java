public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Motor motor = new Motor("Nafta", "MTR-4587");
        Vehiculo vehiculo = new Vehiculo("AA09EE12", "Gol Trend", motor);
        Conductor conductor = new Conductor("Belen Grosso", "LIC-998877");

        vehiculo.setConductor(conductor);

        System.out.println(vehiculo);
        System.out.println(conductor.getVehiculo());
    }
    
}
