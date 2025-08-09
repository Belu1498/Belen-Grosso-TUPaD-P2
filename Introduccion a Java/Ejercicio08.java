/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio8;

import java.util.Scanner;

/**
 *
 * @author belen
 */
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int num1;
        int num2;
        double resultado;
        
        
        System.out.println("Escriba dos numeros enteros:");
        num1 = input.nextInt();
        num2 = input.nextInt();
        
        resultado = ((double) num1 / num2);
        
        System.out.println(resultado);
   
    }
    
}
