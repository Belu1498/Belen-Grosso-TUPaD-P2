/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio5;

import java.util.Scanner;

/**
 *
 * @author belen
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1;
        int num2;
        int suma;
        int resta;
        int mult;
        double division;
        
        System.out.println("Ingrese dos numeros enteros: ");
        
         num1 = input.nextInt();
         num2 = input.nextInt();
         
         suma = num1 + num2;
         resta = num1 - num2;
         mult = num1 * num2;
         division = ((double) num1 / num2);
         
         System.out.println(suma);
         System.out.println(resta);
         System.out.println(mult);
         System.out.println(division);
         
         
                
    }
    
}
