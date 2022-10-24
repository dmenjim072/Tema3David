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
        
        // Pedimos con un JOption que el usuario elija una opcion dentro del menu
        String opcionString = JOptionPane.showInputDialog("Elija una opcion: \n"
                + "1.- Traductor numeros romanos \n"
                + "2.- Contador de vocales \n"
                + "3.- Salir");
        
        // Pasamos la variable"opcion de String a int
        opcion = Integer.parseInt(opcionString);
        
        
        if (opcion==1){
            
                int numero;
                String numeroString = JOptionPane.showInputDialog("Introduce el"
                        + "numero a convertir (del 1 al 10):  ");
                
                
                
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
                     
        if (opcion==2){
                
            
        }        
                
             
                JOptionPane.showConfirmDialog(null , 
                        "Vuelve a elegir una de las opciones");
        }
        
    }
    
    
}
