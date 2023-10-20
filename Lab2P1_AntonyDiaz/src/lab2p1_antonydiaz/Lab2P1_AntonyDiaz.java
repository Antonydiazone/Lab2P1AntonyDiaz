/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab2p1_antonydiaz;

import java.util.Scanner;

/**
 *
 * @author antob
 */
public class Lab2P1_AntonyDiaz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;

        while (opcion != 4) {
            System.out.println("*******************************");
            
            System.out.println("ejercicio 1 ");
            System.out.println("ejercicio 2 ");
            System.out.println("ejercicio 3");
            System.out.println("4) Salir");
            System.out.println("*******************************");
            opcion = scanner.nextInt();
            int opccion = 0;

            if (opcion == 1) {
                
     
                // Obtener la elección del jugador 1
                /*try (Scanner scanner = new Scanner(System.in)) {*/
                // Obtener la elección del jugador 1
                System.out.print("Jugador 1, elige (0 para piedra, 1 para papel, 2 para tijera): ");
                int jugador1 = scanner.nextInt();

                // Obtener la elección del jugador 2
                System.out.print("Jugador 2, elige (0 para piedra, 1 para papel, 2 para tijera): ");
                int jugador2 = scanner.nextInt();

                // Determinar el resultado con if y else
                if (jugador1 == jugador2) {
                    System.out.println("¡Empate!");
                } else {
                    if ((jugador1 == 0 && jugador2 == 2) || (jugador1 == 1 && jugador2 == 0) || (jugador1 == 2 && jugador2 == 1)) {
                        System.out.println("Jugador 1 gana");
                    } else {
                        System.out.println("Jugador 2 gana");
                    }
                }
            }
            
            if (opcion == 2){ 
                System.out.println("ingrese el numero");
               int numero = scanner.nextInt(); // Cambia el número que desees verificar
                

        int sumaDivisores = 1; // Iniciamos en 1 para incluir al divisor 1

        int divisor = 2; // Comenzamos con el divisor 2

        while (divisor * divisor <= numero) {
            if (numero % divisor == 0) {
                sumaDivisores += divisor;

                // Si el divisor es distinto del cociente, incluye el cociente
                if (divisor != numero / divisor) {
                    sumaDivisores += numero / divisor;
                }
            }
            divisor++;
        }

        if (sumaDivisores < numero) {
            System.out.println(numero + " es un número deficiente.");
        } else if (sumaDivisores > numero) {
            System.out.println(numero + " es un número abundante.");
        } else {
            System.out.println(numero + " es un número perfecto.");
        }
            }
           if (opcion == 3){
               System.out.println("Digite la base ");    
               int  base=scanner.nextInt();
               System.out.println("Digite la exponenete");    
               int  exponente=scanner.nextInt();
               
           }
           
        } 
        
    }
}

                    

                    

    


    
    

