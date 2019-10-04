/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cajero;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Menu {
            public void menu (){
            /*Constructores*/
            Login lg1 = new Login();
            Cuenta cnt1 = new Cuenta();
            /*--------------------------------------------------------------------------------------*/

            /*Variables del Cajero*/
            Scanner option = new Scanner(System.in);
            Scanner option1  = new Scanner(System.in);
            Scanner option2 = new Scanner(System.in);
            int selection;
            String transact;
            int Sign;
            /*--------------------------------------------------------------------------------------*/

            /*Aquí empieza el Cajero en sí*/
            System.out.print("--------");
            System.out.print(" Bienvenido a CajeroATM");
            System.out.println("--------");

            System.out.println("");
            System.out.println("Por favor seleccione una opcion");
            System.out.println("    1.Consulta de Saldo");
            System.out.println("    2.Retiro de efectivo");
            System.out.println("    3.Deposito de efectivo");
            System.out.println("    4.Cambiar contraseña");
            System.out.println("    5.Salir");
            selection = option.nextInt();

            while (selection == 0 || selection >=6){
            System.out.print("--------------------------");
            System.out.print("ERROR");
            System.out.println("--------------------------");
            System.out.println("Por favor seleccione una opción valida");
            System.out.println("    1.Consulta de Saldo");
            System.out.println("    2.Retiro de efectivo");
            System.out.println("    3.Deposito de efectivo");
            System.out.println("    4.Cambiar contraseña");
            System.out.println("    5.Salir");
            selection = option.nextInt();
                }

            switch (selection){
                
            case 1: 
                cnt1.viewBalance();
                
                
                System.out.println("");
                System.out.println("------------------------------");
                System.out.println("¿Desea hacer algo más? S/N");
                transact = option1.next();
                System.out.println("------------------------------");
              if (transact == "S" || transact == "s") {    
                    System.out.println("Por favor seleccione una opcion");
                    System.out.println("    1.Consulta de Saldo");
                    System.out.println("    2.Retiro de efectivo");
                    System.out.println("    3.Deposito de efectivo");
                    System.out.println("    4.Cambiar contraseña");
                    System.out.println("    5.Salir");
                    selection = option.nextInt();
                    }
              else if (transact == "N" || transact == "n") {
                        System.out.println("Gracias por preferirnos! :D");
                        System.exit(0);
                    }
                    else {
                    System.out.println("Opción no válida");
                    }
                break;
            
                case 2:
                cnt1.withdraw();
                
                
                System.out.println("");
                System.out.println("------------------------------");
                System.out.println("¿Desea hacer algo más? S/N");
                transact = option1.next();
                System.out.println("------------------------------");
        
              if (transact == "S" || transact == "s") {    
                    System.out.println("Por favor seleccione una opcion");
                    System.out.println("    1.Consulta de Saldo");
                    System.out.println("    2.Retiro de efectivo");
                    System.out.println("    3.Deposito de efectivo");
                    System.out.println("    4.Cambiar contraseña");
                    System.out.println("    5.Salir");
                    selection = option.nextInt();
                    }
              else if (transact == "N" || transact == "n") {
                        System.out.println("Gracias por preferirnos! :D");
                        System.exit(0);
                    }
                    else {
                    System.out.println("Opción no válida");
                    }
                break;
              
                case 3:
                cnt1.depositMoney();
                
                System.out.println("");
                System.out.println("------------------------------");
                System.out.println("¿Desea hacer algo más? S/N");
                transact = option1.next();
                System.out.println("------------------------------");
        
              if (transact == "S" || transact == "s") {    
                    System.out.println("Por favor seleccione una opcion");
                    System.out.println("    1.Consulta de Saldo");
                    System.out.println("    2.Retiro de efectivo");
                    System.out.println("    3.Deposito de efectivo");
                    System.out.println("    4.Cambiar contraseña");
                    System.out.println("    5.Salir");
                    selection = option.nextInt();
                    }
              else if (transact == "N" || transact == "n") {
                        System.out.println("Gracias por preferirnos! :D");
                        System.exit(0);
                    }
                    else {
                    System.out.println("Opción no válida");
                    }
                break;
            
                case 4:
                cnt1.changePassword();
                
                System.out.println("");
                System.out.println("------------------------------");
                System.out.println("¿Desea hacer algo más? S/N");
                transact = option1.next();
                System.out.println("------------------------------");
        
              if (transact == "S" || transact == "s") {    
                    System.out.println("Por favor seleccione una opcion");
                    System.out.println("    1.Consulta de Saldo");
                    System.out.println("    2.Retiro de efectivo");
                    System.out.println("    3.Deposito de efectivo");
                    System.out.println("    4.Cambiar contraseña");
                    System.out.println("    5.Salir");
                    selection = option.nextInt();
                    }
              else if (transact == "N" || transact == "n") {
                        System.out.println("Gracias por preferirnos! :D");
                        System.exit(0);
                    }
                    else {
                    System.out.println("Opción no válida");
                    }
                break;
                
                case 5:
                System.out.println("Ha salido exitosamente!");
                System.exit(0);
              break;
              
              default:
              System.out.println("Opción incorrecta");
              }
        }
}
