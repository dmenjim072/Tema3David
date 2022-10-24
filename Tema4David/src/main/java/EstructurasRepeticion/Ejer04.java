/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EstructurasRepeticion;

/**
 *
 * @author david
 */
public class Ejer04 {
    
    public static void main(String[] args) {
        
        int numero = 1;
         
        // Primero hace un bucle con una variable int valor 1 hasta que llegue
        // a 11 (de uno en uno)
          while (numero < 11)
          {
               System.out.println("Número: " + numero);
               numero++;
          }
          
          System.out.println("------------------------");
          
          
          // hacemos un do while con el valor anterior (10) hasta que llegue a
          // 1 (de uno en uno)
          do {
               System.out.println("Número: " + --numero);
          } while(numero > 1);
        
    }
}
