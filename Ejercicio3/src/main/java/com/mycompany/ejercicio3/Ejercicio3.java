/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio3;

/**
 *
 * @author aandr
 */

import java.util.Scanner;
import java.util.Random;

public class Ejercicio3 {

 public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int numeroSecreto = random.nextInt(10) + 1; 
        int intento = 0; 

        System.out.println("¡Adivine el numero entre 1 y 10!");

        while (intento != numeroSecreto) {
            System.out.print("Ingrese un numero: ");
            intento = scanner.nextInt();

            if (intento < numeroSecreto) {
                System.out.println("El numero es mayor, intente de nuevo.");
            } else if (intento > numeroSecreto) {
                System.out.println("El numero es menor, intente de nuevo.");
            } else {
                System.out.println("Numero correcto");
            }
        }
        
        scanner.close();
    }
}
