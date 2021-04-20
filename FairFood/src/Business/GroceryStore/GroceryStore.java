/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.GroceryStore;

import Business.Product.Product;
import java.util.ArrayList;


/**
 *
 * @author ashwin
 */
public class GroceryStore {
    String productName;
    String productType;
    


    public String getItemName() {
        return productName;
    }

    public void setItemName(String ProductName) {
        this.productName = ProductName;
    }

    

    public String getProductType() {
        return productType;
    }

    public void setItemType(String productType) {
        this.productType = productType;
    }
    
    
      @Override
        public String toString(){
        return productName;
    }
}
