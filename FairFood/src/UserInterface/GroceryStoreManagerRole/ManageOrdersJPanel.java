/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.GroceryStoreManagerRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.Products;
import Business.Organisation.Organisation;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.GroceryManagerWorkRequest;
//import Business.WorkQueue.GroceryManagerWorkRequest;
import Business.WorkQueue.WorkRequest;
import UserInterface.GroceryStoreManagerRole.DeliveryPersonAssignJPanel;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author truptiraut
 */
public class ManageOrdersJPanel extends javax.swing.JPanel {
    private Enterprise enterprise;
    private JPanel userProcessContainer;
    private UserAccount userAccount;
     private EcoSystem system;
    
   
    /**
     * Creates new form ManageOrdersJPanel
     */
    public  ManageOrdersJPanel(JPanel userProcessContainer, Organisation organisation, EcoSystem system, Enterprise enterprise, UserAccount userAccount) {
         initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.enterprise=enterprise;
        this.userAccount=userAccount;
        
        this.system=system;
        
        populateTable();
    }
      private void populateTable() {
         DefaultTableModel dtm = (DefaultTableModel) ManageOrderTable.getModel();
        dtm.setRowCount(0);
        
         for(Organisation organisation : enterprise.getOrganisationDirectory().getOrganisationList()){
            for(WorkRequest request : organisation.getWorkQueue().getWorkRequestList()){
            Object[] row = new Object[4];
           int orderID = request.getRequestID();
            row[0] = orderID;
            row[1] = request.getSender().getReceiver().getName();
            row[2] = request;
            row[3] = request.getStatus();
            
            dtm.addRow(row);
        }
        }
      }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ManageOrderTable = new javax.swing.JTable();
        Back = new javax.swing.JButton();
        View = new javax.swing.JButton();
        Take = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        FinalList = new javax.swing.JTable();

        jLabel1.setText("Grocery Store Management");

        ManageOrderTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Receiver Name", "Status"
            }
        ));
        jScrollPane1.setViewportView(ManageOrderTable);

        Back.setText("Back");

        View.setText("View");
        View.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewActionPerformed(evt);
            }
        });

        Take.setText("Take");
        Take.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TakeActionPerformed(evt);
            }
        });

        jButton3.setText("Assign Delivery Man");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel2.setText("Details");

        FinalList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Product Name"
            }
        ));
        jScrollPane2.setViewportView(FinalList);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(310, 310, 310)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(Back)
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(View)
                                .addGap(53, 53, 53)
                                .addComponent(Take)
                                .addGap(55, 55, 55)
                                .addComponent(jButton3))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jLabel2)))
                .addContainerGap(129, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(Back)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(View)
                    .addComponent(Take)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewActionPerformed
        // TODO add your handling code here:
       int selectedRow = ManageOrderTable.getSelectedRow();
       if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select a row.","INFORMATION",JOptionPane.INFORMATION_MESSAGE);
            return;
        }
       
       GroceryManagerWorkRequest request = (GroceryManagerWorkRequest) ManageOrderTable.getValueAt(selectedRow, 2);
            DefaultTableModel dtm = (DefaultTableModel) FinalList.getModel();
        dtm.setRowCount(0);
        
        for(Products i: request.getRecList()) {
            Object row[] = new Object[2];
            row[0] = i;
            dtm.addRow(row);
        }
       
    }//GEN-LAST:event_ViewActionPerformed

    private void TakeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TakeActionPerformed
        // TODO add your handling code here:
         int selectedRow = ManageOrderTable.getSelectedRow();
        
        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select a row.","INFORMATION",JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        
        GroceryManagerWorkRequest request = (GroceryManagerWorkRequest)FinalList.getValueAt(selectedRow, 2);
         if(!(request.getStatus().equals("Order Placed"))){
            JOptionPane.showMessageDialog(null, "Order already Accepted.","INFORMATION",JOptionPane.INFORMATION_MESSAGE);
         return ; }
         
         request.setStatus("Accepted");
         
            JOptionPane.showMessageDialog(null, "Order accepted successfully.","Success",JOptionPane.INFORMATION_MESSAGE);
             populateTable();
    }//GEN-LAST:event_TakeActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
          int selectedRow = ManageOrderTable.getSelectedRow();
        
        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select a row.","INFORMATION",JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        
        GroceryManagerWorkRequest order1 = (GroceryManagerWorkRequest)ManageOrderTable.getValueAt(selectedRow, 2);
         if(order1.getStatus().equalsIgnoreCase("Delivered")){
            JOptionPane.showMessageDialog(null, "Order has been already Delivered.","INFORMATION",JOptionPane.INFORMATION_MESSAGE);
         return ; }
         if(order1.getStatus().equalsIgnoreCase("Out for Delivery")){
            JOptionPane.showMessageDialog(null, "Deliveryman has been already assigned.","INFORMATION",JOptionPane.INFORMATION_MESSAGE);
            return ; 
         }
         if(!order1.getStatus().equalsIgnoreCase("Accepted")){
            JOptionPane.showMessageDialog(null, "Order is not accepted. Kindly accept the order first to proceed.","INFORMATION",JOptionPane.INFORMATION_MESSAGE);
            return ; 
         }
         DeliveryPersonAssignJPanel panel = new DeliveryPersonAssignJPanel(userProcessContainer,system, enterprise, order1);
        userProcessContainer.add("DeliveryPersonAssignJPanel", panel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JTable FinalList;
    private javax.swing.JTable ManageOrderTable;
    private javax.swing.JButton Take;
    private javax.swing.JButton View;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
