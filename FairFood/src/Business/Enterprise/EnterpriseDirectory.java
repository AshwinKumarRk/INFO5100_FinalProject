/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Organization.OrganizationDirectory;
import java.util.ArrayList;

/**
 *
 * @author truptiraut
 */
public class EnterpriseDirectory {
    private ArrayList<Enterprise> enterpriseList;
   

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }

    public void setEnterpriseList(ArrayList<Enterprise> enterpriseList) {
        this.enterpriseList = enterpriseList;
    }
    
    public EnterpriseDirectory(){
        enterpriseList=new ArrayList<Enterprise>();
    }
    
    public void removeEnterprise(Enterprise e){
        enterpriseList.remove(e);
    }
    
    //Create enterprise
    public Enterprise createAndAddEnterprise(String name,Enterprise.EnterpriseType type){
        Enterprise enterprise=null;
        if(type==Enterprise.EnterpriseType.CommunityFridge){
            enterprise=new CommunityFridge(name);
            enterpriseList.add(enterprise);
        }
        if(type==Enterprise.EnterpriseType.Volunteer){
            enterprise=new VolunteerEnterprise(name);
            enterpriseList.add(enterprise);
        }
        if(type==Enterprise.EnterpriseType.QualityAssurance){
            enterprise=new QualityAssuranceEnterprise(name);
            enterpriseList.add(enterprise);
        }
        if(type==Enterprise.EnterpriseType.GroceryStoreUnit){
            enterprise=new GroceryStoreEnterprise(name);
            enterpriseList.add(enterprise);
        }
        return enterprise;
    }
}
