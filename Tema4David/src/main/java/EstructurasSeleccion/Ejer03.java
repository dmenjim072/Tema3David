/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EstructurasSeleccion;

/**
 *
 * @author smr1d
 */
public class Ejer03 {
    
    public static void main(String[] args) {
        
        // a
        int valor1=2;
        int valor2=4;
        
        boolean unaCondicion = true;
        int resultado = (valor1>valor2) ? valor1 : valor2;// Tiene que declararse con int porque las otra variables son int
        // Nos dice que si la condicion se cumple nos da el resultado de la 
        // variable valor1 y sino la de valor2
        
        System.out.println("a)" + unaCondicion);
        
        
        // b
        int x = 10;
        int y = (x > 9) ? 100 : 200;
        // Nos dice que la variable "x" vale 10 y que si "y" vale 100 porque se cumple la condicion (x>9)
        System.out.println("b)" + y); 
        
        // c
        int publico = 19500;
    	int vendidas = 19000;
	int aforo = 2000;
  	String status = (publico < aforo) ? "Cabe mas gente": 
            (vendidas < aforo) ? "Aun no hemos vendido todo" : "Esta todo vendido";
        //Se hace un operador ternario dentro de otro en su caso negativo, y se muestra el resultado 
        System.out.println("c)" + status);
        
        
        // otro ejemplo
        int n1=1;
        int n2=2;
        int n3=3;
        String hola=(n1>n2) ? "se llama pedro" : (n2<n3) ? "se llama juan" : "se llama pepe";
        System.out.println(hola);
    }
}
