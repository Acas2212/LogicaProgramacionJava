/*
 * Andrés Felipe Castellanos Alvarado
 * 4090-20-23111
 * Programacion 1
 */

package com.mycompany.ejercicio2;

/**
 *
 * @author aandr
 */
import java.util.Scanner;
public class Ejercicio2 {

        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese un número: ");
        int num = scanner.nextInt(); 

        if (num > 0) {
            System.out.println("El número es positivo");
            
            int contador = 0;
            while (contador <= num) {
                System.out.println("Contador: " + contador);
                contador++;
            }
        } else if (num < 0) {
            System.out.println("El número es negativo");
        } else {
            System.out.println("El número es 0");
        }
        
        scanner.close();
    }
}