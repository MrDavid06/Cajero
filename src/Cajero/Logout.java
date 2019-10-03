/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cajero;

/**
 *
 * @author Ariadna Reynoso
 */
import java.util.Scanner;
public class Logout {
    public static void Logout() { 
    Scanner opcion = new Scanner(System.in);
    int elec;
    
    System.out.println("¿Desea cerrar la sesión?");
    String nombre = opcion.nextLine();
    elec = opcion.nextInt();
    
        System.out.println("    1. Si");
        System.out.println("    2. No");
        
     while (elec == 0 || elec >=5){
        System.out.print("--------------------------");
        System.out.print("ERROR");
        System.out.println("--------------------------");
        System.out.println("Por favor, seleccione una opción válida");
        System.out.println("    1. Si");
        System.out.println("    2. No");
        
            }
    if (elec == 1){
        System.out.println("La sesión ha cerrado correctamente");
    }
    
    else if (elec == 2){
        System.out.println("Se ha cancelado cerrar la sesión!");
    }
    }
}
