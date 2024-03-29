/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.EventManagerRole;


import Business.Receiver.Receiver;
import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.CommunityFridgeOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.FoodAdvisorWorkRequest;
import Business.WorkQueue.EventWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.io.IOException;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author truptiraut
 */
public class EventWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form EventWorkAreaJPanel
     */   
    JPanel userProcessContainer;
    UserAccount account;
    CommunityFridgeOrganization communityFridgeOrganisation;
    Enterprise enterprise;
    EcoSystem ecosystem;
    Network network;
    public EventWorkAreaJPanel(JPanel userProcessContainer, Enterprise enterprise, Organization organization, UserAccount account, EcoSystem business, Network network) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
         this.account = account;
         this.enterprise = enterprise;
         this.ecosystem = business;
         this.network = network;
         populateRec();
    }

    public void populateRec(){
        DefaultTableModel dtm = (DefaultTableModel) interestedList.getModel();
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
        interestedList = new javax.swing.JTable();
        done = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        NameField = new javax.swing.JTextField();
        view = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        message = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        EventList = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 71, 43));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("PT Serif Caption", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(80, 80, 82));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CUSTOMER DETAILS");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 1200, 39));

        interestedList.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        interestedList.setModel(new javax.swing.table.DefaultTableModel(
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
                "Receiver ID", "Receiver Name", "Message", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(interestedList);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, 675, 91));

        done.setBackground(new java.awt.Color(255, 255, 255));
        done.setFont(new java.awt.Font("PT Serif Caption", 1, 14)); // NOI18N
        done.setText("Process Request");
        done.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doneActionPerformed(evt);
            }
        });
        add(done, new org.netbeans.lib.awtextra.AbsoluteConstraints(438, 610, 340, 40));

        jLabel2.setFont(new java.awt.Font("PT Serif Caption", 1, 26)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Name:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 320, 107, 30));

        NameField.setEditable(false);
        NameField.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        add(NameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 320, 150, 30));

        view.setBackground(new java.awt.Color(255, 255, 255));
        view.setFont(new java.awt.Font("PT Serif Caption", 1, 14)); // NOI18N
        view.setText("View Details");
        view.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewActionPerformed(evt);
            }
        });
        add(view, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 240, 330, 45));

        jLabel3.setFont(new java.awt.Font("PT Serif Caption", 1, 26)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Message:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 400, -1, -1));

        message.setColumns(20);
        message.setRows(5);
        jScrollPane2.setViewportView(message);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 370, 190, -1));

        jLabel4.setFont(new java.awt.Font("PT Serif Caption", 1, 26)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Send Event List:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 480, 240, 50));

        EventList.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        EventList.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Event List" }));
        add(EventList, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 490, 150, 30));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/event.jpeg"))); // NOI18N
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1010, 740));
    }// </editor-fold>//GEN-END:initComponents

    private void doneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doneActionPerformed
        int selectedRow = interestedList.getSelectedRow();
        if(selectedRow >=0){
            EventWorkRequest request = (EventWorkRequest) interestedList.getValueAt(selectedRow, 2);
            if(!"Result Posted".equals(request.getStatus())){
                request.setStatus("Result Sent");
                request.setEventResult(message.getText());
                String email = request.getSender().getUsername();
                populateRec();
                sendEmail(email,(String) EventList.getSelectedItem());
                JOptionPane.showMessageDialog(null,"Email Sent!","Success",JOptionPane.INFORMATION_MESSAGE);
                message.setText("");
            }else{
                JOptionPane.showMessageDialog(null,"Result is been already Processed","INFORMATION",JOptionPane.INFORMATION_MESSAGE);
            }
            
        }else{
            JOptionPane.showMessageDialog(null,"Please Select a row","Error",JOptionPane.ERROR_MESSAGE);
        }
        
        // TODO add your handling code here:
    }//GEN-LAST:event_doneActionPerformed

    private void viewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewActionPerformed
        // TODO add your handling code here:
        int selectedRow = interestedList.getSelectedRow();
        if(selectedRow >=0){
            Receiver customer = (Receiver) interestedList.getValueAt(selectedRow, 1);
            NameField.setText(customer.getName());

        }else{
            JOptionPane.showMessageDialog(null,"Please Select a row","Error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_viewActionPerformed

    
    public void sendEmail(String email, String chart){
		final String password = "147258369tr";
		String fromEmail = "rtrupti1998@gmail.com";
		String toEmail = email;
		Properties properties = new Properties();
		properties.put("mail.smtp.auth", "true");
                properties.put("mail.smtp.ssl.trust", "smtp.gmail.com");
		properties.put("mail.smtp.starttls.enable", "true");
		properties.put("mail.smtp.host", "smtp.gmail.com");
		properties.put("mail.smtp.port", "587");
                Session session = Session.getInstance(properties, new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(fromEmail,password);
			}
		});
		MimeMessage msg = new MimeMessage(session);
		try {
			msg.setFrom(new InternetAddress(fromEmail));
			msg.addRecipient(Message.RecipientType.TO, new InternetAddress(toEmail));
			msg.setSubject("Event List");
			Multipart emailContent = new MimeMultipart();
			MimeBodyPart textBodyPart = new MimeBodyPart();
			textBodyPart.setText("Please find attached Event List");
			MimeBodyPart pdfAttachment = new MimeBodyPart();
			pdfAttachment.attachFile("src/Business/EventList/"+ chart+".pdf");
			emailContent.addBodyPart(textBodyPart);
			emailContent.addBodyPart(pdfAttachment);
			msg.setContent(emailContent);
			Transport.send(msg);
			System.out.println("Sent message");
		} catch (MessagingException e) {
			e.printStackTrace();
		} 
                catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> EventList;
    private javax.swing.JTextField NameField;
    private javax.swing.JButton done;
    private javax.swing.JTable interestedList;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea message;
    private javax.swing.JButton view;
    // End of variables declaration//GEN-END:variables

    
}
