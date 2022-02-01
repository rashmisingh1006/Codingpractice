/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demosalesperson2;
/*
 * @author rashmi
 */
public class SalesPerson2 {
     private int id;
    private double sales;
    SalesPerson2(int idNum, double amt)
    {
        id = idNum;
        sales = amt;
    }
    
    public int getId()
    {
        return id;
    }      
    
    public double getSales()
    {
        return sales;
    }  
    
    public void setID(int idNum)
    {
        id = idNum;
    }        
    public void setSales(int amt)        
    {
        sales = amt;
    }        
}

    

