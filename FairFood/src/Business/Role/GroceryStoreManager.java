/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.GroceryStoreOrganisation;
import Business.Organisation.Organisation;
import Business.UserAccount.UserAccount;
import UserInterface.DeliveryPerson.DeliveryManWorkAreaJPanel;
import UserInterface.GroceryStore.GroceryStoreJPanel;
import javax.swing.JPanel;

/**
 *
 * @author ashwin
 */
public class GroceryStoreManager extends Role{
    @Override
    public String toString()
    {
        return "Donor";
    }
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organisation organisation, Enterprise enterprise, EcoSystem system, ProductInfoList productInfolist, FoodStock foodstock) {
        return new GroceryStoreJPanel(userProcessContainer, account, (GroceryStoreOrganisation) organisation, enterprise, system, productInfolist);
    }
}
