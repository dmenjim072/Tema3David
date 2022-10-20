/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EstructurasSeleccion;

import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author david
 */
public class EjemploSwitchRandom {
    
    public static void main(String[] args) {
        
        // Si el usuario introduce A, B, o C se debe guardar un aleatorio entre
        // 1 y 10
        
        // Si introduce D, guardar aleatorio entre 11 y 25
        
        // Si introduce E, aleatorio entre 26 y 33
        
        // En otro caso aleatorio entre 34 y 100
        
        
        // Creo un objeto de tipo Random llamado generador con el constructor de
        // la clase 
        Random generador = new Random();
        
        Scanner teclado = new Scanner(System.in);
        int numAleatorio;
        
        // Genera un numero aleatorio dentro del rango de los enteros
        numAleatorio = generador.nextInt();
        System.out.println("El numero es: " + numAleatorio);
        
        //Genera un numero aleatorio entre 0 y 9
        numAleatorio = generador.nextInt(10);
        System.out.println("El numero es: " + numAleatorio);
        
        // Genera un numero aleatorio entre 1 y 19
        numAleatorio = generador.nextInt(19)+1;
        System.out.println("El numero es: " + numAleatorio);
        
        // Genera un rango dado entre 12 y 18
        // nextInt(mayor - menor +1)
        numAleatorio = generador.nextInt(7)+12;
        System.out.println("El numero es: " + numAleatorio);
        
        System.out.println("Introduce una letra (A, B, C, D, E): ");
        String letraString = teclado.nextLine();
        
        switch (letraString) {
            case "A", "B", "C":
                // Entre 1 y 10
                numAleatorio = generador.nextInt(10-1+1)+1;
                break;
            case "D":
                // Entre 11 y 25
                numAleatorio = generador.nextInt(25-11+1)+11;
                break;
            case "E":
                //26 y 33
                numAleatorio = generador.nextInt(33-26+1)+33;
                break;
            default:
                numAleatorio = generador.nextInt(100-34+1)+100;
               
        }
        
        System.out.println("El numero generado es..."+numAleatorio);
    }
    
}
