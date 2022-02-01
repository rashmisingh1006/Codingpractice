/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condosales2;

import java.util.Scanner;

/**
 *
 * @author rashmi
 */
public class CondoSales2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         final int Parkviewprice = 150000;
        final int Golfviewprice = 170000;
        final int Lakeviewprice = 210000;
        int Garageprice = 5000;
        int choice, price, parking;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the select view option \n 1.Park View "
                + "\n 2.Golf Course View \n 3.Lake View");
        choice = input.nextInt();
        if (choice == 1)
        {
         price =  Parkviewprice;  
         System.out.println("Parkview condo price is $" + price);
            
        }    
        
        else if (choice == 2)
        {
            price = Golfviewprice;
            System.out.println("Golfview condo price is $" + price);
        }    
        
        else if (choice == 3)
        {
            price = Lakeviewprice;
            System.out.println("Lakeview price is $" + price);
        }    
        
        else
        {
            price = 0;
            System.out.println("View Selection is invalid. Please put valid entry.");
        }
        
        if (price!= 0 && (choice ==1 || choice == 2 || choice == 3))
        {
        System.out.println("Please select parking option.\n1.Garage\n2.Parking Space");
        parking = input.nextInt();
        if(choice == 1 && parking ==1) 
        {
         System.out.println("The total cost of park view condo and garage is: $" + (price + Garageprice));
        }    
        else if (choice == 1 && parking == 2)
        {
         System.out.println("The total cost of park view condo with parking space is $" + price);
         }    
        else if (choice == 2 && parking == 1 )
        { 
            System.out.println("The total cost of Golf course view condo with garage is $" + (price +
                    Garageprice));
        }  
        else if (choice == 2 && parking == 2)
        {    
            System.out.println("The total cost of Golf course view condo with parking space is $" + Golfviewprice);
        }    
        else if (choice == 3 && parking == 1 )
        { 
            System.out.println("The total cost of Lake view condo with garage is $" + (price +
                    Garageprice));
        }  
        else if (choice == 3 && parking == 2)
        {    
            System.out.println("The total cost of Lake view condo with parking space is $" + Lakeviewprice);
        } 
        
        else
        {
            System.out.println("Parking Selection invalid and the price of condo will be $" + price);
        }    
        // TODO code application logic here
    }
    }
}

        
        // TODO code application logic here
    
    

