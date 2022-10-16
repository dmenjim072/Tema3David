/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EstructurasSeleccion;

/**
 *
 * @author smr1d
 */
public class Ejer09 {
         
    public static void main(String[] args) {
        
    
    
        int variable=3, variable2;
        switch(variable){

	case 1:
		variable2=5;
		break;
	case 2:
		variable2=20;
		break;
	case 3:
		variable2=30;
	case 4:
		variable2=10;
	default:
		variable2=100;
		break; 
        }
        System.out.println(variable2);
        
        // variable2 vale 100 porque se ejecuta el caso default, porque no tienen
        // break el caso 3 y 4, entonces sigue ejecutando las demas hasta llegar 
        // a default
    
    }   

}