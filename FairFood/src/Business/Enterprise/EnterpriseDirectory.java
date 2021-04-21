/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import java.util.ArrayList;

/**
 *
 * @author truptiraut
 */
public class EnterpriseDirectory {
    
private ArrayList<Enterprise> enterpriseList;

    public EnterpriseDirectory() {
        enterpriseList = new ArrayList<>();
    }

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }
  
   public Enterprise createAndAddEnterprise(String name, Enterprise.EnterpriseType type) {
        Enterprise enterprise = null;
        if (null != type) {
            switch (type) {
                case GroceryStore:
                    enterprise = new GroceryStoreEnterprise(name);
                    enterpriseList.add(enterprise);
                    break;
               case CommunityFridge:
                    enterprise = new CommunityFridgeEnterprise(name);
                    enterpriseList.add(enterprise);
                    break;
                case QualityAssurance:
                    enterprise = new QualityAssuranceEnterprise(name);
                    enterpriseList.add(enterprise);
                    break;
                case Transport:
                    enterprise = new TransportEnterprise(name);
                    enterpriseList.add(enterprise);
                    break;
                default:
                    break;
            }
        }
        return enterprise;
    }
}


