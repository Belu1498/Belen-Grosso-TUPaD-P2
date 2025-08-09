/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio4;

import java.util.Scanner;

/**
 *
 * @author belen
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        
         String nombre;
         int edad;
         
         System.out.println("Ingrese tu nombre: ");
         nombre = input.nextLine();
         
         System.out.println("Ingrese su edad: ");
         edad = input.nextInt();
         
         System.out.println("Soy " + nombre + " y tengo " + edad + " anios.");
         
         
               
        
    }
    
}
