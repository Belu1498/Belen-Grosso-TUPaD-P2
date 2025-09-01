package ejercicio2;

/**
 *
 * @author belen
 */
public class Mascota {
    
    String nombre;
    String especie;
    int edad;
    
    public void mostrarInfo() {
        
        System.out.println("Nombre: " + nombre);
        System.out.println("Especie: " + especie);
        System.out.println("Edad: " + edad);
        
    }
    
    public void cumplirAnios(int numero) {
        
        for (int i = edad; i <= numero; i++) {
            
            edad += 1;
            mostrarInfo();
            
        }
        
        
    
    }
    
    
    
    
 
