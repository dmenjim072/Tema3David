/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EstructurasSeleccion;


import javax.swing.JOptionPane;
/**
 *
 * @author david
 */
public class calculadora {
    
    public static void main(String[] args) {
        
        double resultado = 0;
        
        double operando1 = Double.parseDouble(JOptionPane.showInputDialog
        ("Introduce operando 1"));
        double operando2 = Double.parseDouble(JOptionPane.showInputDialog
        ("Introduce operando 2"));
        
        String menu = """
                      ------------------
                          Calculadora
                      ------------------
                      1.-SUMAR
                      2.-RESTAR
                      3.-MULTIPLICAR
                      4.-DIVIDIR
                      """;
        String opcion = JOptionPane.showInputDialog(menu);
        
        // Logica de la aplicacion
        // Si es opcion 1 --> Sumar
        if (opcion.equals("1")){
            resultado = operando1 + operando2;
            System.out.printf("El resultado es %.2f" + resultado);
        }else {
        
            // Si es opcion 2 restar
            if (opcion.equals("2")){
            resultado = operando1 - operando2;
            System.out.printf("El resultado es %.2f" + resultado);
            } else{
        
                // Si es opcion 3 multiplicar
                if (opcion.equals("3")){
                resultado = operando1 * operando2;
                System.out.printf("El resultado es %.2f" + resultado);
                } else{
        
                    //Si la opcion es 4 dividir
                    if (opcion.equals("4")){
                    resultado = operando1 / operando2;
                    System.out.printf("El resultado es %.2f" + resultado);
                    }
                }
            }
        }   
    }
}