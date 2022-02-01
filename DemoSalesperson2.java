/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demosalesperson2;
/**
 * @author Rashmi Singh
 * Purpose : Demo Sales2
 * Date : 16th Oct 2021
 * Version : 1.0
 */
public class DemoSalesperson2 {

   public static void main(String[] args) {
        
        SalesPerson2[] sales1 = new SalesPerson2[10];
        int assignId = 111;
        int assignSales = 25000;
        int sales_increase = 5000;
        for(int i = 0; i < sales1.length; ++i)
        {
        sales1[i] = new SalesPerson2(assignId, assignSales);
        ++assignId;
        assignSales += sales_increase;
        }    
         for (int i = 0; i < sales1.length; ++i)
         {
             System.out.println("Sales person " + i + " has id # " + sales1[i].getId()
             + " and has sales amount of " + sales1[i].getSales());
         }    
    }
}
