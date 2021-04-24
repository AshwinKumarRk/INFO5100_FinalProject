/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Receiver;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.VolunteerEnterprise;
import Business.UserAccount.UserAccount;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Organization.EventOrganization;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import Business.WorkQueue.EventWorkRequest;
import Business.WorkQueue.WorkRequest;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ashwin
 */
public class EventJPanel extends javax.swing.JPanel {

    /**
     * Creates new form EventJPanel
     */
    private JPanel userProcessContainer;
    private EcoSystem system;
    private Network network;
    private UserAccount userAccount;
    Enterprise e;
    EventJPanel(JPanel userProcessContainer, EcoSystem system, Network network, UserAccount userAccount) {
         initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system =system;
        this.network = network;
        this.userAccount = userAccount;
        populateEvent();
    }
    private void populateEvent() {
         DefaultTableModel dtm = (DefaultTableModel) names.getModel();
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
            row[3] = ((EventWorkRequest)request).getEventResult();
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
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Message = new javax.swing.JTextArea();
        req = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        names = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(237, 223, 207));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setBackground(new java.awt.Color(80, 80, 82));
        jLabel6.setFont(new java.awt.Font("PT Serif Caption", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(80, 80, 82));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Participate In Events");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 1160, 40));

        jLabel5.setFont(new java.awt.Font("PT Serif Caption", 1, 14)); // NOI18N
        jLabel5.setText("Enter Your Request:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 170, 80));

        Message.setColumns(20);
        Message.setFont(new java.awt.Font("SansSerif", 1, 10)); // NOI18N
        Message.setRows(5);
        jScrollPane1.setViewportView(Message);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 320, -1));

        req.setBackground(new java.awt.Color(255, 102, 0));
        req.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        req.setText("Request");
        req.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reqActionPerformed(evt);
            }
        });
        add(req, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 180, 48));

        names.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        names.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
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
                "Request ID", "Message", "Manager Name ", "Comments", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(names);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 140, 760, 90));

        jLabel1.setBackground(new java.awt.Color(243, 223, 198));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/eventspart.jpeg"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 60, 500, 440));
    }// </editor-fold>//GEN-END:initComponents

    private void reqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reqActionPerformed
        if(userAccount.getWorkQueue().getWorkRequestList().size()== 0){
            EventWorkRequest req = new EventWorkRequest();
            req.setSender(userAccount);
            req.setMessage(Message.getText());
            req.setStatus("Reply sent");
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
            JOptionPane.showMessageDialog(null,"Reply has been sent","Success",JOptionPane.INFORMATION_MESSAGE);
            populateEvent();
        }else{
            int x = userAccount.getWorkQueue().getWorkRequestList().size()-1;
            WorkRequest r = userAccount.getWorkQueue().getWorkRequestList().get(x);
            if(r.getStatus().toLowerCase().equals("result posted")){
                EventWorkRequest req = new EventWorkRequest();
                req.setSender(userAccount);
                req.setMessage(Message.getText());
                req.setStatus("Reply sent");
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
                JOptionPane.showMessageDialog(null,"Reply has been sent","Success",JOptionPane.INFORMATION_MESSAGE);
                populateEvent();
            }else {
                JOptionPane.showMessageDialog(null,"Complete the previous request first","Alert",JOptionPane.WARNING_MESSAGE);
            }
        } 
        // TODO add your handling code here:
        
    }//GEN-LAST:event_reqActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea Message;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable names;
    private javax.swing.JButton req;
    // End of variables declaration//GEN-END:variables
}
