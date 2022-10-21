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
public class EjemploWhile {
    
    public static void main(String[] args) {
        
        // Inicializacion de la variable de control
        int numero = 0;
        
        // Condicion del bucle
        // Mientras la condicion del bucle sea true se repite el codigo entre { }
        // Imprimir del 0 al 10
        while(numero<=10){
            System.out.println(numero);
            // Siempre dentro del bucle hay que actualizar la variable de control
            numero++;
        }
        System.out.println("El bucle ha terminado");
        System.out.println("--------------------");
        
        // Del 20 al 0
        // Inicializacion
        numero = 20;
        
        // Condicion
        while(numero>=0){
            System.out.println(numero);
            
            // Actualizacion
            numero--;
        }
        System.out.println("El bucle ha terminado");
        System.out.println("----------------");
        
        
        // Del 50 al 70 de tres en tres
        // Inicializacion
        numero = 50;
        
        // Condicion
        while(numero<=70){
            System.out.println(numero);
            
            // Actualizacion
            numero += 3;
        }
        System.out.println("El bucle ha terminado");
        System.out.println("---------------------");
        
        
        // Pedir un numero entre 100 y 200, si el usuario se equivoca volver a 
        // pedir otro numero
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un numero (100 - 200): ");
        
        int num = teclado.nextInt(); // Inicializacion de la variable control
        while (num<100 || num>200){
            System.out.println("Te has equivocado de numero, introduce otro numero");
            num = teclado.nextInt();  // Hay que volver a declarar la variable 
        }
        
    }
    
}
