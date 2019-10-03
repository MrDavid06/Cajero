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
    Scanner sc = new Scanner(System.in);
    
    public void withdraw(){
        System.out.println("¿Cuánto dinero desea retirar?");
        
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
        balance = sc.nextInt();
    }
}
