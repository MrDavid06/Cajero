package Cajero;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DELL
 */
public class Cajero {
    
    public static void main(String[] args) {
            Login lg1 = new Login();
            Cuenta cnt1 = new Cuenta();
            Menu menuC= new Menu();
            
            lg1.Login();
            menuC.menu();
        }
    

}
              
 