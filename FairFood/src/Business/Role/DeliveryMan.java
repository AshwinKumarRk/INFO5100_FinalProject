/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organisation.Organisation;
import Business.UserAccount.UserAccount;
import UserInterface.DeliveryPerson.DeliveryManagerJPanel;
import UserInterface.DeliveryPerson.DeliveryManWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author ashwin
 */
public class DeliveryMan extends Role{
       @Override
     public String toString()
    {
        return "DeliveryManager";
    }

    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organisation organisation, Enterprise enterprise, EcoSystem system, ProductInfoList productInfoList, FoodStock foodstock) {
        return new DeliveryManagerJPanel(userProcessContainer,account, organisation,enterprise);
    }
}