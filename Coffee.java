/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coffee;

import java.util.Scanner;
/**
 *
 * @author rashmi
 */
public class Coffee {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
            
       
       int menu;
       int choice = 0;
       double price = 0;
       Scanner input = new Scanner(System.in);
       String thank = "Thankyou for making the order for ";
       do{
        System.out.println("Please place your order."
                           + "\nEnter 1 for American."
                           + "\nEnter 2 for Espresso."
                           + "\nEnter 3 for Latte." 
                           + "\nEnter 0 to Quit.");
        menu = input.nextInt();
        
        choice ++;
        if (menu == 1)
        {
            price += 1.99;
            System.out.println(thank + "American Java Coffee");
        }    
         
        else if (menu == 2)
        {
            price += 2.50;
            System.out.println(thank + "Espresso Coffee");
        }
        else if (menu == 3)
            
        {
            price = price + 2.15;
            System.out.println(thank + "Latte Coffee");
        }  
        else if (menu == 0)
        { 
         System.out.println("Quit");
        }
        else 
        {
             System.out.println("The menu option is not available.");
        } 
        
        System.out.println("Thankyou. Your total bill is $" + price + ".");
        }
       while(menu != 0);
       
       
       
    }
}


    

