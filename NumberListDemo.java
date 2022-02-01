/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numberlistdemo;
/**
 * @author Rashmi Singh
 * Purpose : For Number list display
 * Date : 16th Oct 2021
 * Version : 1.0
 */
public class NumberListDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        int [] integrs = {3,8,6,2,1,4,3,10};
        int num = 8;
        double sum = 0;
        int smallest = integrs[0];
        int highest = integrs[7];
        double avg;
        System.out.println("The number of integers in the array are as follows.");
        for (int i=0; i < integrs.length; i++)
        {  
         System.out.print(integrs[i] + " ");
        }  
        System.out.println();
        System.out.println("The number of integers in the array are displayed in reverse order.");
        for(int i = integrs.length - 1; i>=0; i--) 
        {
             System.out.print(integrs[i] + " ");
            
        }  
        System.out.println();
        for (int i=0; i < integrs.length; i++)
        {
            sum = sum + integrs[i];
        }  
        System.out.println("The sum of 8 integers are " + sum);
        System.out.println("The values less than 5 are as below.");
        for(int i=0; i<integrs.length ; i++)
        {
            if (integrs[i] < 5)
           {
              System.out.print(integrs[i] + " ");
           }  
        }
        for (int i=0; i < integrs.length; i++)
        {
             if(integrs[i] < smallest) 
             {
                 smallest = integrs[i];
             }
        }
        System.out.println("\nThe lowest number in the array is " + smallest);
        
        for(int i = integrs.length - 1; i>=0; i--) 
        {
            if(integrs[i] > highest)
             {
                highest = integrs[i];
            }
        }
        System.out.println("The highest number in the array is " + highest);
        avg = sum/num;
        System.out.println("The average of the number is " + avg);
        System.out.println("The numbers greater than average are as follows.");
        for (int i = 0; i < integrs.length; i++)
        {
            if (integrs[i] > avg)
            {
                System.out.print(integrs[i] + " ");
            }
        }
    }
}
