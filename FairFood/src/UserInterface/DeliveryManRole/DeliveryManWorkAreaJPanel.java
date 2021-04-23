/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.DeliveryManRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.GroceryStoreWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.util.Date;
import java.util.Objects;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ashwin
 */
public class DeliveryManWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private UserAccount userAccount;
    private EcoSystem system;
    private EcoSystem business;
    private Enterprise enterprise;
    
    
    /**
     * Creates new form DeliveryManWorkAreaJPanel
     */

    public DeliveryManWorkAreaJPanel(JPanel userProcessContainer, Enterprise enterprise, Organization organization, UserAccount account, EcoSystem business, Network network) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.business = business;
        this.enterprise = enterprise; 
        populateDelivery();
    }
    
    public void populateDelivery(){
        DefaultTableModel dtm = (DefaultTableModel) Deliveries.getModel();
        dtm.setRowCount(0);
        for(Organization o : enterprise.getOrganizationDirectory().getOrganizationList()){
            for(WorkRequest request: o.getWorkQueue().getWorkRequestList() ) {
            if(request.getReceiver() != null && request.getReceiver().getEmployee().getName().equals(userAccount.getEmployee().getName())){
            Object row[] = new Object[4];
            row[0] = request.getRequestID();
            row[1] = request.getSender().getReceiver().getName();
            row[2] = request;
            row[3] = request.getStatus();
            dtm.addRow(row);
        }
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

        jScrollPane1 = new javax.swing.JScrollPane();
        Deliveries = new javax.swing.JTable();
        Deliver = new javax.swing.JButton();
        refresh = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Deliveries.setFont(new java.awt.Font("PT Serif Caption", 1, 14)); // NOI18N
        Deliveries.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Order ID", "Receiver Name", "Message", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(Deliveries);
        if (Deliveries.getColumnModel().getColumnCount() > 0) {
            Deliveries.getColumnModel().getColumn(0).setResizable(false);
            Deliveries.getColumnModel().getColumn(1).setResizable(false);
            Deliveries.getColumnModel().getColumn(2).setResizable(false);
            Deliveries.getColumnModel().getColumn(3).setResizable(false);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, 730, 96));

        Deliver.setBackground(new java.awt.Color(102, 153, 0));
        Deliver.setFont(new java.awt.Font("PT Serif Caption", 1, 14)); // NOI18N
        Deliver.setText("Delivered");
        Deliver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeliverActionPerformed(evt);
            }
        });
        add(Deliver, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 170, 150, 50));

        refresh.setFont(new java.awt.Font("PT Serif Caption", 1, 14)); // NOI18N
        refresh.setText("Refresh");
        refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshActionPerformed(evt);
            }
        });
        add(refresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 230, 120, 50));
    }// </editor-fold>//GEN-END:initComponents

    private void DeliverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeliverActionPerformed
        
        int selectedRow = Deliveries.getSelectedRow();
        
        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select a row.","Error",JOptionPane.ERROR_MESSAGE);
            return;
        }
        GroceryStoreWorkRequest request = (GroceryStoreWorkRequest) Deliveries.getValueAt(selectedRow, 2);
        if(request.getStatus() == "Delivered"){
            JOptionPane.showMessageDialog(null, "The order has been already Delivered.","Error",JOptionPane.ERROR_MESSAGE);
            populateDelivery();
        }else{
             request.setStatus("Delivered");
            JOptionPane.showMessageDialog(null, "The order is delivered successfully.","Success",JOptionPane.INFORMATION_MESSAGE);
            populateDelivery();
        }
        
    }//GEN-LAST:event_DeliverActionPerformed

    private void refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshActionPerformed
        populateDelivery();
    }//GEN-LAST:event_refreshActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Deliver;
    private javax.swing.JTable Deliveries;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton refresh;
    // End of variables declaration//GEN-END:variables
}
