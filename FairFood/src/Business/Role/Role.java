/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author truptiraut
 */
public abstract class Role {
    
    public enum RoleType{
        Admin("Admin"),
        Receiver("Receiver"),
        QualityAssurance("QualityAssurance"), 
        QualityAssuranceAdmin("QualityAssurance Admin"),
        FoodSafetyAdmin("FoodSafety Admin"),
        FoodAdvisorAdmin("FoodAdvisor Admin"),
        Volunteer("Volunteer"),
        EventManager("EventManager"),
         GroceryStoreManager("GroceryStore Manager"),
        DonationManager("DonationManager"),
        DeliveryMan("Delivery Man");
      
       
       private String value;
       
        private RoleType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
    
    public abstract JPanel createWorkArea(JPanel userProcessContainer,  
            Enterprise enterprise, 
            Organization organization,
            UserAccount account, 
            EcoSystem business,
            Network network);

    @Override
    public String toString() {
        return this.getClass().getName();
    }
    
    
}