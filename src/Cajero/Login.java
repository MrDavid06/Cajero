package Cajero;
import java.util.Scanner;

public class Login {
    
    public static void Login(){
        int holaquehace;
        int bandera = 0;
        int seleccion = 0;
        int password = 5678; 
        
        Scanner account = new Scanner (System.in);
        Scanner pass = new Scanner (System.in);
        
        System.out.println("Ingrese su numero de cuenta");
        String user = account.nextLine();
        System.out.println("");
        System.out.println("Ingrese su contraseña");
        
        

        
        do{
            if(seleccion >= 1 && seleccion <=4){
            bandera = 1;
        
        } else {
            System.out.println("------------------------------------------------");
            System.out.println("Opcion no disponible. Intente de nuevo por favor");
            System.out.println("------------------------------------------------");
        }
        
        }while (bandera == 0);
                
    }
    
}
