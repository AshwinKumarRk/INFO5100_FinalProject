/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.GroceryStore;

import java.util.ArrayList;

/**
 *
 * @author ashwin
 */
public class GroceryStoreDirectory {
    private ArrayList<GroceryStore> grocerystoreList;
    
    public GroceryStoreDirectory() {
        grocerystoreList = new ArrayList();
    }
    
    public ArrayList<GroceryStore> getStoreList() {
        return grocerystoreList;
    }
    
    public GroceryStore createItem(GroceryStore grocerystore){
        grocerystoreList.add(grocerystore);
        return grocerystore;
    }
    
    public GroceryStore updateItem(GroceryStore grocerystore,String productName,String productType){
        grocerystore.setItemName(productName);
        grocerystore.setItemType(productType);

        return grocerystore;
    }
}
