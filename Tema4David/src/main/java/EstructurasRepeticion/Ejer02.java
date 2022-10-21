 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EstructurasRepeticion;

import java.util.Scanner;
/**
 *
 * @author smr1d
 */
public class Ejer02 {
    
    public static void main(String[] args) {
        
        // Declaramos las variables n y x
        int n,x;
        
        // Creamos un objeto teclado que pida el valor de n
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el valor final: ");
        n = teclado.nextInt();
        
        // Le damos a x el valor 1
        x = 1;
        
        // Hacemos un while para que mientras el numero que introducimos sea
        // mayor que x(1), nos muestre los numeros que estan entre ellos de uno
        // en uno (x = x + 1)
        while (x<=n) {
            System.out.print(x);
            System.out.print(" - ");
            x = x + 1;
        }
        
    }
}
