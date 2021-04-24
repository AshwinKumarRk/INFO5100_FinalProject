/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.FoodSafetyOfficer;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Receiver.Receiver;
import Business.Employee.Employee;
import Business.Organization.Organization;
import Business.Organization.FoodAdvisorOrganisation;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.FoodSafetyOfficerWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.io.IOException;
import java.util.Properties;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author visha
 */
public class FoodSafetyOfficerWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form FoodSafetyOfficerWorkAreaJPanel
     */
    JPanel userProcessContainer;
    UserAccount account;
    Enterprise enterprise;
    EcoSystem ecosystem;
    Network network;

    public FoodSafetyOfficerWorkAreaJPanel(JPanel userProcessContainer, Enterprise enterprise, Organization organization, UserAccount account, EcoSystem business, Network network) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
         this.account = account;
         this.enterprise = enterprise;
         this.ecosystem = business;
         this.network = network;
         populateRecr();
        
    }
    
    public void populateRecr(){
        DefaultTableModel dtm = (DefaultTableModel) table.getModel();
        dtm.setRowCount(0);
        
        for(Organization org: enterprise.getOrganizationDirectory().getOrganizationList()){
        for(Employee emp : org.getEmployeeDirectory().getEmployeeList()){
            if(emp.toString().equals(account.getEmployee().toString())){
                for( WorkRequest request: account.getWorkQueue().getWorkRequestList()){
                Receiver cust = request.getSender().getReceiver();
            
            Object[] row = new Object[4];
            row[0] = cust.getId();
            row[1] = cust;
            row[2] = request;
            row[3] = request.getStatus();
            dtm.addRow(row);
           }
            }
        }
        }
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        Send = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        Name = new javax.swing.JTextField();
        View = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Reply = new javax.swing.JTextArea();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        table.setFont(new java.awt.Font("PT Serif Caption", 1, 14)); // NOI18N
        table.setModel(new javax.swing.table.DefaultTableModel(
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
                {null, null, null, null}
            },
            new String [] {
                " ID", " Name", "Reply", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(table);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(235, 112, 675, 91));

        Send.setBackground(new java.awt.Color(255, 255, 255));
        Send.setFont(new java.awt.Font("PT Serif Caption", 1, 14)); // NOI18N
        Send.setText("Process Request");
        Send.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SendActionPerformed(evt);
            }
        });
        add(Send, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 460, -1, 40));

        jLabel2.setFont(new java.awt.Font("PT Serif Caption", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Name:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 290, 107, 30));

        Name.setEditable(false);
        Name.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        add(Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 290, 190, 30));

        View.setBackground(new java.awt.Color(255, 255, 255));
        View.setFont(new java.awt.Font("PT Serif Caption", 1, 14)); // NOI18N
        View.setText("View Details");
        View.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewActionPerformed(evt);
            }
        });
        add(View, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 220, 138, 45));

        jLabel1.setFont(new java.awt.Font("PT Serif Caption", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(80, 80, 82));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Receiver Details");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 1209, 39));

        jLabel3.setFont(new java.awt.Font("PT Serif Caption", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Message:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 350, 100, -1));

        Reply.setColumns(20);
        Reply.setRows(5);
        jScrollPane2.setViewportView(Reply);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 350, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void ViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewActionPerformed
        // TODO add your handling code here:
        int selectedRow = table.getSelectedRow();
        if(selectedRow >=0){
            Receiver customer = (Receiver) table.getValueAt(selectedRow, 1);
            Name.setText(customer.getName());
            
        }else{
            JOptionPane.showMessageDialog(null,"Please Select a row","Error",JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_ViewActionPerformed

   

    
    
    private void SendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SendActionPerformed
        int selectedRow = table.getSelectedRow();
        if(selectedRow >=0){
            FoodSafetyOfficerWorkRequest request = (FoodSafetyOfficerWorkRequest) table.getValueAt(selectedRow, 2);
            if(!"Result Posted".equals(request.getStatus())){
                request.setStatus("Booked");
                request.setSafetResult(Reply.getText());
                populateRecr();
                JOptionPane.showMessageDialog(null,"Appointment Booked!","Success",JOptionPane.INFORMATION_MESSAGE);
                Reply.setText("");
            }else{
                JOptionPane.showMessageDialog(null,"Result has been already Processed","INFORMATION",JOptionPane.INFORMATION_MESSAGE);
            }
            
        }else{
            JOptionPane.showMessageDialog(null,"Please Select a row","Error",JOptionPane.ERROR_MESSAGE);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_SendActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Name;
    private javax.swing.JTextArea Reply;
    private javax.swing.JButton Send;
    private javax.swing.JButton View;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
