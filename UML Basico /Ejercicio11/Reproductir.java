public class Reproductor {
    
    // para la dependencia usa Cancion como parámetro
    public void reproducir(Cancion cancion) {
        System.out.println("Reproduciendo: " + cancion.getTitulo() + 
                           " - " + cancion.getArtista().getNombre());
    }
}
