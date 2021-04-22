/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.QualityAssurance;

import Business.EcoSystem;
import Business.Network.Network;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author visha
 */
public class QualityAssuranceJPanel extends javax.swing.JPanel {
    private JPanel userProcessContainer;
    private EcoSystem system;
    private Network network;
    private UserAccount userAccount;

    /**
     * Creates new form QualityAssuranceJPanel
     */
   
    public QualityAssuranceJPanel(JPanel userProcessContainer, EcoSystem system, Network network, UserAccount userAccount) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system =system;
        this.network = network;
        this.userAccount = userAccount;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        Panel1 = new javax.swing.JPanel();
        BackBtn = new javax.swing.JButton();
        FoodInspector = new javax.swing.JButton();
        FoodAdvisor = new javax.swing.JButton();
        Panel2 = new javax.swing.JPanel();

        BackBtn.setText("BACK");
        BackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackBtnActionPerformed(evt);
            }
        });

        FoodInspector.setText("Food Inspector");
        FoodInspector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FoodInspectorActionPerformed(evt);
            }
        });

        FoodAdvisor.setText("Food Advisor");
        FoodAdvisor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FoodAdvisorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Panel1Layout = new javax.swing.GroupLayout(Panel1);
        Panel1.setLayout(Panel1Layout);
        Panel1Layout.setHorizontalGroup(
            Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(FoodAdvisor)
                    .addComponent(FoodInspector)
                    .addComponent(BackBtn))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Panel1Layout.setVerticalGroup(
            Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(BackBtn)
                .addGap(62, 62, 62)
                .addComponent(FoodInspector)
                .addGap(50, 50, 50)
                .addComponent(FoodAdvisor)
                .addContainerGap(287, Short.MAX_VALUE))
        );

        jSplitPane1.setLeftComponent(Panel1);

        javax.swing.GroupLayout Panel2Layout = new javax.swing.GroupLayout(Panel2);
        Panel2.setLayout(Panel2Layout);
        Panel2Layout.setHorizontalGroup(
            Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 589, Short.MAX_VALUE)
        );
        Panel2Layout.setVerticalGroup(
            Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 524, Short.MAX_VALUE)
        );

        jSplitPane1.setRightComponent(Panel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 702, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackBtnActionPerformed
        // TODO add your handling code here:
         userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_BackBtnActionPerformed

    private void FoodInspectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FoodInspectorActionPerformed
        // TODO add your handling code here:
        InspectorJPanel panel = new InspectorJPanel(userProcessContainer, system, network, userAccount);
        Panel2.add("ManageReceiverJPanel", panel);
        CardLayout layout = (CardLayout) Panel2.getLayout();
        layout.next(Panel2);
    }//GEN-LAST:event_FoodInspectorActionPerformed

    private void FoodAdvisorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FoodAdvisorActionPerformed
        // TODO add your handling code here:
        FoodAdvisorJPanel panel = new FoodAdvisorJPanel(userProcessContainer, system, network, userAccount);
        Panel2.add("ManageReceiverJPanel", panel);
        CardLayout layout = (CardLayout) Panel2.getLayout();
        layout.next(Panel2);
    }//GEN-LAST:event_FoodAdvisorActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackBtn;
    private javax.swing.JButton FoodAdvisor;
    private javax.swing.JButton FoodInspector;
    private javax.swing.JPanel Panel1;
    private javax.swing.JPanel Panel2;
    private javax.swing.JSplitPane jSplitPane1;
    // End of variables declaration//GEN-END:variables
}