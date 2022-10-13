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
public class Ejer05 {
        
    public static void main(String[] args) {
 
        Scanner entrada = new Scanner(System.in);
        int opcion;
        
        
        
        System.out.println("Menú de opciones");
        System.out.println("-------------------------");
        System.out.println("1. Calcular el área de un Cuadrado");
        System.out.println("2. Calcular el área de un Triángulo");
        System.out.println("3. Calcular el área de un Círculo");
        System.out.println("4. Finalizar");
 
        System.out.print("Elija una opción: ");
        opcion = entrada.nextInt();
 
        if (opcion == 1) {
            System.out.println("Ha seleccionado calcular el área de un cuadrado...");
            Scanner teclado = new Scanner(System.in);
            System.out.println("Introduce el valor del lado");
            double lado = teclado.nextDouble();
            
            // Procesos
            double areaCuadrado = lado * lado;
            
            // Mostramos el resultado
            System.out.println("El area del cuadrado es: " + areaCuadrado);
        } 
	else {  
                if (opcion == 2) {
                System.out.println("Ha seleccionado calcular el área de un triangulo...");
            	Scanner teclado1 = new Scanner(System.in);
                System.out.printf("Introduce el valor de la base: ");
                double base = teclado1.nextDouble();
            
                Scanner teclado2 = new Scanner(System.in);
                System.out.printf("Introduce el valor de la altura: ");
                double altura = teclado2.nextDouble();
                
                // Procesos 
                double areaTriangulo = (base * altura) / 2;
                
                // Mostramos el resultado
                System.out.println("El area del triangulo es: " + areaTriangulo);
            
        	} else { 
		if (opcion == 3) {
            	System.out.println("Ha seleccionado calcular el área de un círculo...");
                Scanner teclado3 = new Scanner(System.in);
                System.out.printf("Introduce el valor del radio: ");
                double radio = teclado3.nextDouble();
                        
                // Procesos 
                double PI = 3.141592;
                double areaCirculo = Math.pow(radio, 2) * PI;
                        
                // Mostramos los resultados
                System.out.printf("El area del circulo es: %.2f" + areaCirculo);
                } 
                        
		else {
                System.out.println("Ha seleccionado terminar");
       		}     
   		}
                
        }
    }
}