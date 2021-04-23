 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import Business.GroceryStore.GroceryStoreDirectory;
import java.util.ArrayList;

/**
 *
 * @author visha
 */
public abstract class Enterprise extends Organization{
    
    private EnterpriseType enterpriseType;
    private OrganizationDirectory organizationDirectory;
    private GroceryStoreDirectory storeDirectory;
    private ArrayList<Products> productsList;

    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }
    public GroceryStoreDirectory getStoreDirectory() {
        return storeDirectory;
    }
    public enum EnterpriseType{
        CommunityFridge("CommunityFridge"),
        Volunteer("Volunteer"),
        QualityAssurance("QualityAssurance"),
        GroceryStoreUnit("GroceryStoreUnit");
        
        private String value;
        
        private EnterpriseType(String value){
            this.value=value;
        }
        public String getValue() {
            return value;
        }
        @Override
        public String toString(){
        return value;
    }
    }

    public ArrayList<Products> getProductsList() {
        return productsList;
    }

    public void setProductsList(ArrayList<Products> productsList) {
        this.productsList = productsList;
    }

    public EnterpriseType getEnterpriseType() {
        return enterpriseType;
    }

    public void setEnterpriseType(EnterpriseType enterpriseType) {
        this.enterpriseType = enterpriseType;
    }
    
    public Enterprise(String name, EnterpriseType type){
        super(name);
        this.enterpriseType=type;
        this.productsList =new ArrayList<>();
        organizationDirectory=new OrganizationDirectory();
    }
    public Products createMenuItem(){
        Products item = new Products(); 
        this.productsList.add(item);
        return item;
}  
    
     public void deleteItem(Products item){
        productsList.remove(item); 
    }
      
}
