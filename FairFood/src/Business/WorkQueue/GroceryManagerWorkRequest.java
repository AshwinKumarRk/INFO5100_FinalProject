/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Enterprise.Products;
import java.util.ArrayList;

/**
 *
 * @author ashwin
 */
public class GroceryManagerWorkRequest extends WorkRequest {
    
    private ArrayList<Products> recList;
    private String recMessage;
   
    public GroceryManagerWorkRequest() {
        
    
    } 
    public ArrayList<Products> getRecList() {
        return recList;
    }

    public void setRecList(ArrayList<Products> recList) {
        this.recList = recList;
    }

    public String getRecMessage() {
        return recMessage;
    }

    public void setRecMessage(String cusMessage) {
        this.recMessage = cusMessage;
    }
   
    
    
    
}

