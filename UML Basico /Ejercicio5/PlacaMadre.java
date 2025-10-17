public class PlacaMadre {
      private String modelo; // imagen
    private String chipset; // formato

    public PlacaMadre(String modelo, String chipset) {
        this.modelo = modelo;
        this.chipset = chipset;
    }


    public String getModelo() {
        return modelo;
    }

    public String getChipset() {
        return chipset;
    }
    
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    public void setChipset(String chipset) {
        this.chipset = chipset;
    }

    @Override
    public String toString() {
        return "[modelo=" + modelo + ", Chipset =" + chipset + "]";
    }
}
