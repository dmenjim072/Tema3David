/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EstructurasRepeticion;

import java.util.Scanner;

/**
 *
 * @author david
 */
public class EjemploDoWhile {
    
    public static void main(String[] args) {
        
        // El bucle do while siempre hace al menos una iteracion
        // El bucle do while ejecuta entre 1 y N
        
        
        // Imprimir del 0 al 100
        int numero = 0;
        
        do {
            System.out.println(numero);
            numero++;
        } 
        while (numero<=10);{
        System.out.println("sale del bucle");
        System.out.println("----------------");
    }
        
        // Del 10 al 0
        numero = 10;
        
        do {
            System.out.println(numero);
            numero--;                      
        }
        while (numero>=0);{
        System.out.println("sale del bucle");
    }
                
        
        
        Scanner teclado = new Scanner(System.in);
        int valor = 0;
        do{
            System.out.println("Introduce un numero (100 - 200): ");
            valor = teclado.nextInt();
        }
        while (valor<100 || valor>200);{
        
    }
        
        
    }
    
}
