/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organisation.Organisation;
import Business.Product.FoodStock;
import Business.Product.ProductInfoList;
import Business.UserAccount.UserAccount;
import UserInterface.Receiver.FoodOrderJPanel;
import javax.swing.JPanel;

/**
 *
 * @author visha
 */
public class RecieverRole {
    
     public String toString()
    {
        return "Receiver";
    }

    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organisation organisation, Enterprise enterprise, EcoSystem system, ProductInfoList productInfoList, FoodStock foodstock) {
        return new FoodOrderJPanel(userProcessContainer, account, organisation, enterprise, system);
    }
    
}
