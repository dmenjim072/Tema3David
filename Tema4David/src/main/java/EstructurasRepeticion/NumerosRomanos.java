/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EstructurasRepeticion;


/**
 *
 * @author david
 */
import javax.swing.JOptionPane;
public class NumerosRomanos {
    
    public static void main(String[] args) {
        
        // Declaramos variables
        int opcion;
        
        // Hacemos un do-while 
        do{
        // Pedimos con un JOption que el usuario elija una opcion dentro del menu
        String opcionString = JOptionPane.showInputDialog("Elija una opcion: \n"
                + "1.- Traductor numeros romanos \n"
                + "2.- Contador de vocales \n"
                + "3.- Salir");
        
        // Pasamos la variable opcion de String a int
        opcion = Integer.parseInt(opcionString);
        
        // Hacemos un switch con cada opcion del menu
        // Opcion 1 (Pedimos un numero decimal y lo convertimos en numero romano)
        switch (opcion){
            case 1:
            
                int numero;
                String numeroString = JOptionPane.showInputDialog("Introduce el"
                        + "numero a convertir (del 1 al 10):  ");
                
                
                // Hacemos otro switch para mostrar cada resultado por separado
                // del 1 al 10
                switch (numeroString){
                    case "1":
                        JOptionPane.showConfirmDialog(null,
                                "El numero 1 equivale a: I");                      
                        break;
                    case "2":
                        JOptionPane.showConfirmDialog(null,
                                "El numero 2 equivale a: II");                      
                        break;
                    case "3":
                        JOptionPane.showConfirmDialog(null,
                                "El numero 3 equivale a: III");                      
                        break;
                    case "4":
                        JOptionPane.showConfirmDialog(null,
                                "El numero 4 equivale a: IV");                      
                        break;
                    case "5":
                        JOptionPane.showConfirmDialog(null,
                                "El numero 5 equivale a: V");                      
                        break;
                    case "6":
                        JOptionPane.showConfirmDialog(null,
                                "El numero 6 equivale a: VI");                      
                        break;
                    case "7":
                        JOptionPane.showConfirmDialog(null,
                                "El numero 7 equivale a: VII");                      
                        break;
                    case "8":
                        JOptionPane.showConfirmDialog(null,
                                "El numero 8 equivale a: VIII");                      
                        break;
                    case "9":
                        JOptionPane.showConfirmDialog(null,
                                "El numero 9 equivale a: IX");                      
                        break;
                    case "10":
                        JOptionPane.showConfirmDialog(null,
                                "El numero 10 equivale a: X");                      
                        break;    
                }
                break;  
            // Opcion 2 (Pedimos un nombre y contamos las vocales que tiene)
            case 2:
                //Pedimos un nombre y los pasamos a minuscula
                String nombre = JOptionPane.showInputDialog(
                        "Introduce un nombre: ").toLowerCase();//Minuscula
                // Declaramos las variables necesarias
                // Hacemos un while y dentro un if con las condiciones OR
                char letra;
                int contador = 0;
                int i = 0;
                while (i < nombre.length()){
                letra = nombre.charAt(i);
                i++;
                if (letra == 'a' || letra == 'e' || letra == 'i' 
                        || letra == 'o' || letra == 'u'){
                contador++;
               
                    }
                }
                // Mostramos el resultado con JOption
                JOptionPane.showMessageDialog(null, "El nombre tiene " + contador + " letras");
                break;
                
                
             
            //default:        
                //JOptionPane.showConfirmDialog(null , 
                        //"Vuelve a elegir una de las opciones");
        }
        
        }
        // Hacemos un while para que siga en bucle siempre que marquemos un numero
        // diferente a 3, si marcamos 3 se saldra del bucle
        while(opcion != 3);
    }
    
        
}
