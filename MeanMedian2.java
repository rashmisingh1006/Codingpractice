/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package meanmedian2;
import javax.swing.JOptionPane;
/**
* @author Rashmi Singh
* Purpose : To find the mean and median of 5 numbers.
* Date : 6th Nov 2021
* Version : 1.0
*/
public class MeanMedian2 {
    public static void main(String[] args) {
        
        int[] nums = new int[20];
        String entry;
        String list = "You entered: ";
        int a, b;
        int temp;
        int midPos;
        int num = 0;
        int comparisonsToMake;
        int total = 0;
        final int QUIT = 9999;
        int size = 0;
        double mean = 0;
        double median;
        
        for(a = 0; num != QUIT && a < nums.length; ++a)
        {
           entry = JOptionPane.showInputDialog(null,  "Enter number"  + (a+1)
            + " or press " + QUIT + " to end the program.");
           num = Integer.parseInt(entry);
           if (num != QUIT)
           {
               nums[a] = num;
            total += nums[a];
           if (a == 0)
           {    
             list += nums[a];
           }  
           
           else
           {
               list += ", " + nums[a];
           }
        }
        }   
            if (num != QUIT)
            {
                size = nums.length;
            }   
            else
            {
                size = a -1;
            }  
             
            
             System.out.println(list);
             comparisonsToMake = size - 1;
             for (a=0; a < size - 1 ; ++a)
             {
               for (b = 0; b < comparisonsToMake ; ++b)
                {
                  if (nums[b] > nums[b+1])
                  {
                    temp = nums[b];
                    nums[b] = nums[b+1];
                    nums[b+1] = temp;
            
                  }
                }
              }
            if (size % 2 == 0)
            {
               median = (nums[(size / 2)] + nums[size/2 - 1])/2.0;
            }
            else 
            {
                median = nums[size / 2]/ 1.0;
            }
            if(size != 0)
            {
               mean = total * 1.0 / size;  
            }  
                
        System.out.println("The mean is  " + mean + " and the median is " + median);
    }
}


