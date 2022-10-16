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
public class Ejer04 {
    
    public static void main(String[] args) {
        
        
        // Pedimos la edad por scanner y la declaramos
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce tu edad:");
        int edad = scanner.nextInt();

        // Procesos 
        String resultado = (edad>18)?"mayor de edad" : "menor de edad";
        
        // Mostramos resultados
        System.out.println("Resultado: " + resultado);
                
        }

        
    
    
}
