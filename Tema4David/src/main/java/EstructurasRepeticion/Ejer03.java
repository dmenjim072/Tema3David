/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EstructurasRepeticion;

/**
 *
 * @author david
 */
public class Ejer03 {
    
    public static void main(String[] args) {
        
        // Declaramos las variables para el numero a mostrar y otra para el contador
        int i = 0;
        int numero = 15;
        
        // Ponemos el while con la condicion
        while(i<25){
            System.out.println(numero);
            
            // Sumamos +1 a i para controlar el numero de repeticiones y
            // multiplicamos el numero * 2 para seguir la secuencia
            i++;
            numero *= 2;
        }
        
    }
    
}
