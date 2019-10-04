package Cajero;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author David
 */

public class Cuenta {
    private String creditCard;
    private int password;
    public int balance;
    int retiro;
    int total;
    Scanner sc = new Scanner(System.in);
    
    public void withdraw(){
        System.out.println("¿Cuánto dinero desea retirar?");
        retiro = sc.nextInt();
        System.out.println("------------------------------");
        System.out.println("Su balance actual es igual a "+balance);     
        System.out.println("------------------------------");
      }
    
    public void viewBalance(){
      balance = 0;
      if (balance == 0){
          System.out.println("------------------------------");
          System.out.println("Su balance actual es igual a "+balance);
          System.out.println("------------------------------");
      }
      
          else{
            System.out.println("------------------------------");
            System.out.println("Su balance actual es igual a "+balance);     
            System.out.println("------------------------------");
            }
        }
    
    public void depositMoney(){
        System.out.println("¿Cuánto dinero quiere depositar?");
        retiro = sc.nextInt();
        System.out.println("------------------------------");
        System.out.println("Su balance actual es igual a "+total);     
        System.out.println("------------------------------");
        
    }
    
    public void changePassword(){
        Scanner pw = new Scanner (System.in);
        Scanner np = new Scanner(System.in);
        int password = 5678;
        int userpwd;
        int newpass;
        int newpass1;
        
        System.out.println("Escriba su contraseña anterior:");
            userpwd = pw.nextInt();
            
            while (userpwd != password) {
                System.out.println("Contraseña incorrecta");
                System.out.println("-----------------------------------------------");
                System.out.println("Escriba su contraseña anterior:");
                userpwd = pw.nextInt();
            }
                
        System.out.println("");
        
        System.out.println("Escriba su contraseña nueva");
            newpass = np.nextInt();
        System.out.println("");
        
        System.out.println("Confirme su contraseña");
            newpass1 = np.nextInt();
            
            while (newpass1 != newpass) {
                System.out.println("Contraseñas no coinciden");
                System.out.println("-----------------------------------------------");
                System.out.println("Confirme su contraseña");
                newpass1 = np.nextInt();
            }
            System.out.println("------------------------------");
            System.out.println("Contraseña cambiada exitosamente!");
    }
    
    public void setTotal(int Total){
        this.total = balance-retiro;
    }
}
