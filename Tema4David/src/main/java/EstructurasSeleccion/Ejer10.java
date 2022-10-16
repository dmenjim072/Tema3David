/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EstructurasSeleccion;

/**
 *
 * @author smr1d
 */
public class Ejer10 {
    
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
                break;             //añadimos el break para que no salte a los 
                                   //demas casos
	case 4:
		variable2=10;
                break;
	default:
		variable2=100;
		break; 
        }
        System.out.println(variable2);
    }
}
