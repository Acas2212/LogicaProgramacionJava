/*
 * Andrés Felipe Castellanos Alvarado
 * 4090-20-23111
 * Programacion 1
 */

package com.mycompany.ejercicio1;

/**
 *
 * @author aandr
 */
import java.util.Scanner;
public class Ejercicio1 {

public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese un número: ");
        int num = scanner.nextInt(); 

        if ((num % 2) == 0) {
            System.out.println("El número es par");
        } else {
            System.out.println("El número es impar");
        }
  scanner.close();
      }
}