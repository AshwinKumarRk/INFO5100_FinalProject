/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.GroceryStore.GroceryStore;
import Business.GroceryStore.GroceryStoreDirectory;
import Business.Organisation.Organisation;
import Business.Organisation.OrganisationDirectory;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author visha
 */
public abstract class Enterprise extends Organisation{
    private EnterpriseType enterpriseType;
     private OrganisationDirectory organisationDirectory;
    private GroceryStoreDirectory storeDirectory;
    private ArrayList<Products> productList;
    
      public OrganisationDirectory getOrganisationDirectory() {
        return organisationDirectory;
    }

    
    public enum EnterpriseType{
        GroceryStore("Grocery Store"),
        CommunityFridge("CoomunityFridge"),
        QualityAssurance("Quality Assurance"),
        Transport("Transport");
        
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
        return productList;
    }

    public void setProductsList(ArrayList<Products> itemsList) {
        this.productList = productList;
    }

    public EnterpriseType getEnterpriseType() {
        return enterpriseType;
    }

    public void setEnterpriseType(EnterpriseType enterpriseType) {
        this.enterpriseType = enterpriseType;
    }
    
    public Enterprise(String name,EnterpriseType type){
        super(name);
        this.enterpriseType=type;
        this.productList =new ArrayList<>();
        organisationDirectory=new OrganisationDirectory();
    }
    public Products createMenuItem(){
        Products p = new Products(); 
        this.productList.add(p);
        return p;
}
      
    
     public void deleteItem(Products p){
        productList.remove(p); 
    }
    
}
