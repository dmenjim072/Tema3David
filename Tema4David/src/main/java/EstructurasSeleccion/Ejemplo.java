/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EstructurasSeleccion;

import java.util.Scanner;
/**
 *
 * @author david
 */
public class Ejemplo {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Cual es tu nombre?");
        String nombre = teclado.nextLine();
        
        System.out.println("Introduce letra a buscar: ");
        String letraBuscar = teclado.nextLine();
        
        // Si la letra esta contenida en el nombre
        // mostrar el numero de caracteres que tiene el nombre y la posicion
        // donde esta la letra
        // En otro caso, mostrar si el numero de letras del nombre es par o impar
        
        // boolean letraContenida = nombre.contains(letraBuscar);
        // if (letraContenida){
            //Parte del true
        //}
        
        //Ejemplo
        // if (nombre.contains (letraBuscar) == true){
        //    System.out.println("Hola");
        // }
        if (nombre.contains (letraBuscar)){
            // Tamaño de la cadena de texto
            System.out.println("El numero de caracteres es: " + nombre.length());
            // Posicion donde esta la letra
            int posicion = nombre.indexOf(letraBuscar);
            System.out.println("La posicion es " + posicion);
        }   
            else {
                if (nombre.length()) % 2 == 0 {  // Si el numero de letras del String es par
                System.out.println("El numero de caracteres es par");
            }  
            else {
                System.out.println("El numero de caracteres es impar");
                }            
        System.out.println("Adios");
    }
    }
}
