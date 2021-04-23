/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Receiver;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.VolunteerEnterprise;
import Business.Network.Network;
import Business.Organization.EventOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.DonationWorkRequest;
import Business.WorkQueue.WorkRequest;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author visha
 */
public class DonationRequestJPanel extends javax.swing.JPanel {

    /**
     * Creates new form DonationRequestJPanel
     */
    private JPanel userProcessContainer;
    private EcoSystem system;
    private Network network;
    private UserAccount userAccount;
    Enterprise e;
    DonationRequestJPanel(JPanel userProcessContainer, EcoSystem system, Network network, UserAccount userAccount) {
       initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system =system;
        this.network = network;
        this.userAccount = userAccount;
        populateStatus();
    }
    private void populateStatus() {
         DefaultTableModel dtm = (DefaultTableModel) ReqTable.getModel();
        dtm.setRowCount(0);
        Organization org = null;
        for(Enterprise enter : network.getEnterpriseDirectory().getEnterpriseList()){
            if(enter instanceof VolunteerEnterprise){
                e = enter;
            }
        }
        for (Organization organization : e.getOrganizationDirectory().getOrganizationList()){
            if (organization instanceof EventOrganization){
                org = organization;
                break;
            }
        }
        if (org!=null){
            for(WorkRequest request: org.getWorkQueue().getWorkRequestList()) {
            if(request.getSender().equals(userAccount)){
            Object row[] = new Object[5];
            row[0] = request.getRequestID();
            row[1] = request.getMessage();
            row[2] = request.getReceiver();
            row[3] = ((DonationWorkRequest)request).getDonationResult();
            row[4] = request.getStatus();
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

        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Requests = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        req = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        ReqTable = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setBackground(new java.awt.Color(80, 80, 82));
        jLabel6.setFont(new java.awt.Font("PT Serif Caption", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(80, 80, 82));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Request To Donate");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(-80, 10, 1200, 40));

        Requests.setColumns(20);
        Requests.setRows(5);
        jScrollPane1.setViewportView(Requests);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 320, -1));

        jLabel5.setFont(new java.awt.Font("PT Serif Caption", 1, 14)); // NOI18N
        jLabel5.setText("Enter You Request:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 170, 80));

        req.setBackground(new java.awt.Color(255, 255, 255));
        req.setFont(new java.awt.Font("PT Serif Caption", 1, 14)); // NOI18N
        req.setText("Request ");
        req.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reqActionPerformed(evt);
            }
        });
        add(req, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, 155, 48));

        ReqTable.setFont(new java.awt.Font("PT Serif Caption", 1, 14)); // NOI18N
        ReqTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Request ID", "Message", "Volunteer Name ", "Reply", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(ReqTable);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 160, 750, 90));
    }// </editor-fold>//GEN-END:initComponents

    private void reqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reqActionPerformed
    if(userAccount.getWorkQueue().getWorkRequestList().size()== 0){
        DonationWorkRequest req = new DonationWorkRequest();
        req.setSender(userAccount);
        req.setMessage(Requests.getText());
        req.setStatus("Request Sucessfully Sent");
        Organization org = null;
        
        for(Enterprise enter : network.getEnterpriseDirectory().getEnterpriseList()){
            if(enter instanceof VolunteerEnterprise){
                e = enter;
            }
        }
        for (Organization organization : e.getOrganizationDirectory().getOrganizationList()){
            if (organization instanceof EventOrganization){
                org = organization;
                break;
            }
        }
        if (org!=null){
            org.getWorkQueue().getWorkRequestList().add(req);
            userAccount.getWorkQueue().getWorkRequestList().add(req);
        }
        JOptionPane.showMessageDialog(null,"Request has been sent, you will receive confirmation once accepted!!","Success",JOptionPane.INFORMATION_MESSAGE);
        populateStatus();
    } else{
            int x = userAccount.getWorkQueue().getWorkRequestList().size()-1;
            WorkRequest r = userAccount.getWorkQueue().getWorkRequestList().get(x);
            if(r.getStatus().toLowerCase().equals("result posted")){
                DonationWorkRequest req = new DonationWorkRequest();
                req.setSender(userAccount);
                req.setMessage(Requests.getText());
                req.setStatus("Sent");
                Organization org = null;

                for(Enterprise enter : network.getEnterpriseDirectory().getEnterpriseList()){
                    if(enter instanceof VolunteerEnterprise){
                        e = enter;
                    }
                }
                for (Organization organization : e.getOrganizationDirectory().getOrganizationList()){
                    if (organization instanceof EventOrganization){
                        org = organization;
                        break;
                    }
                }
                if (org!=null){
                    org.getWorkQueue().getWorkRequestList().add(req);
                    userAccount.getWorkQueue().getWorkRequestList().add(req);
                }
                JOptionPane.showMessageDialog(null,"Request has been sent. A request will be sent if your donation is requested.","Success",JOptionPane.INFORMATION_MESSAGE);
                populateStatus();
            }else {
                JOptionPane.showMessageDialog(null,"Please wait, the previous is still pending!!","Alert",JOptionPane.WARNING_MESSAGE);
            }
        } 
        // TODO add your handling code here:
       
    }//GEN-LAST:event_reqActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable ReqTable;
    private javax.swing.JTextArea Requests;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton req;
    // End of variables declaration//GEN-END:variables
}
