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
public class Ejer02 {
    
    public static void main(String[] args) {
        
        // a
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el valor de x: ");
        int x = teclado.nextInt();
        
        // Procesos 
        String resultado = (x>=135)?"mayor" : "menor";
        
        // Mostramos resultados
        System.out.println("Es " + resultado + " que 135");
        
        
        // b
        String resultado2 = (x<=0)?"menor o igual que 0" : "mayor que cero";
        System.out.println("El numero es: " + resultado2);
        
        // c
        
        
        
    }
}
