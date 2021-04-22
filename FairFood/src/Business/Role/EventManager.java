/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.UserAccount.UserAccount;
import Business.Organisation.Organisation;
import UserInterface.EventManager.EventManagerWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author ashwin
 */
public class EventManager  extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, Enterprise enterprise, Organisation organisation, UserAccount account, EcoSystem business, Network network) {
        return new EventManagerWorkAreaJPanel(userProcessContainer, enterprise, organisation, account, business, network);
    }
}
