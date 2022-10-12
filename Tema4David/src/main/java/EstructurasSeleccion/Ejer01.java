/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EstructurasSeleccion;

import java.util.Scanner;

/**
 *
 * @author smr1d
 */
public class Ejer01 {
    
    public static void main(String[] args) {

                // Creamos un objeto scanner y que nos pida el valor de edad
                Scanner scanner = new Scanner(System.in);
                System.out.print("Introduce tu edad:");
                int edad = scanner.nextInt();
                
                // Hacemos un if para que si el valor de edad es mayor que 18
                // nos muestre un mensaje, y si es menor nos muestre otro distinto
                if (edad >= 18) {
                        System.out.println("Es mayor de edad");
                } else {
                        System.out.println("No es mayor de edad");
                }
                
                // Mostramos el valor de la variable edad
                System.out.println("mostrar la edad: " + edad);
                
        }

        
        

    
}
