/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.AdminRole;

import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author visha
 */
public class ManageEmployeeJPanel extends javax.swing.JPanel {

    private OrganizationDirectory organizationDir;
    private JPanel userProcessContainer;
    private Organization org;
    private EcoSystem system;
    private boolean ValidEmail;
    private boolean NameValid;
    private boolean  ValidPass;
    
    /**
     * Creates new form ManageOrganizationJPanel
     */
    public ManageEmployeeJPanel(JPanel userProcessContainer,OrganizationDirectory organizationDir,EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.organizationDir = organizationDir;
        this.system = system;
        ClearVals();
        populateOrgComboBox();
        populateOrgEmpComboBox();

    }
    
    public void ClearVals(){
        
        passlabel.setVisible(false);
        emailexist.setVisible(false);
        emailabel.setVisible(false);
       
        
    }
    public void populateOrgComboBox(){
        OrgJCB.removeAllItems();
        
        for (Organization organization : organizationDir.getOrganizationList()){
            OrgJCB.addItem(organization);
        }
    }
    
    
    public void populateOrgEmpComboBox(){
        OrgCB.removeAllItems();
        
        for (Organization organization : organizationDir.getOrganizationList()){
            OrgCB.addItem(organization);
        }
    }
    
    private void populateRoleComboBox(Organization organization){
        RolesCB.removeAllItems();
        for (Role role : organization.getSupportedRole()){

            String r = role.toString();
            RolesCB.addItem(role);
        }
    }

    private void populateTable(Organization organization){
        DefaultTableModel model = (DefaultTableModel) orgTable.getModel();
        model.setRowCount(0);
        for (UserAccount acc : organization.getUserAccountDirectory().getUserAccountList()){
            Employee employee = acc.getEmployee();
            Object[] row = new Object[3];
            row[0] = employee.getId();
            row[1] = employee;
            row[2] = acc;
            model.addRow(row);
        
        }
    }
    private boolean usernamePatternCorrect(String val){
        Pattern p=Pattern.compile("^[a-zA-Z0-9]+@[a-zA-Z0-9]+.[a-zA-Z0-9]+$");
        Matcher m=p.matcher(val);
        boolean b=m.matches();
        return b;
    }
   
    private boolean passwordPatternCorrect(String val4){
        Pattern p1;
        p1 = Pattern.compile("^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{6,}$");
        Matcher m1=p1.matcher(String.valueOf(val4));
        boolean b1=m1.matches();
        return b1;
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
        orgTable = new javax.swing.JTable();
        OrgJCB = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        backJButton = new javax.swing.JButton();
        OrgCB = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        RolesCB = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        UserNameF = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        create = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        remove = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        Namef = new javax.swing.JTextField();
        emailexist = new javax.swing.JLabel();
        emailabel = new javax.swing.JLabel();
        passlabel = new javax.swing.JLabel();
        PassField = new javax.swing.JPasswordField();

        setBackground(new java.awt.Color(216, 201, 174));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        orgTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Name", "User Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(orgTable);
        if (orgTable.getColumnModel().getColumnCount() > 0) {
            orgTable.getColumnModel().getColumn(0).setResizable(false);
            orgTable.getColumnModel().getColumn(1).setResizable(false);
            orgTable.getColumnModel().getColumn(2).setResizable(false);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 410, 480, 170));

        OrgJCB.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        OrgJCB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        OrgJCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OrgJCBActionPerformed(evt);
            }
        });
        add(OrgJCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 330, 190, 30));

        jLabel1.setFont(new java.awt.Font("PT Serif Caption", 1, 14)); // NOI18N
        jLabel1.setText("Organization:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 330, 120, 25));

        backJButton.setBackground(new java.awt.Color(255, 255, 255));
        backJButton.setFont(new java.awt.Font("PT Serif Caption", 1, 18)); // NOI18N
        backJButton.setText("Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, 31));

        OrgCB.setFont(new java.awt.Font("PT Serif Caption", 1, 14)); // NOI18N
        OrgCB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        OrgCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OrgCBActionPerformed(evt);
            }
        });
        add(OrgCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 60, 190, 30));

        jLabel3.setFont(new java.awt.Font("PT Serif Caption", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Organization:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, -1, 40));

        jLabel4.setFont(new java.awt.Font("PT Serif Caption", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Role:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 72, 40));

        RolesCB.setFont(new java.awt.Font("PT Serif Caption", 1, 14)); // NOI18N
        RolesCB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        RolesCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RolesCBActionPerformed(evt);
            }
        });
        add(RolesCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 100, 190, 30));

        jLabel5.setFont(new java.awt.Font("PT Serif Caption", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("User Name:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 60, 90, 30));

        UserNameF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserNameFActionPerformed(evt);
            }
        });
        UserNameF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                UserNameFKeyReleased(evt);
            }
        });
        add(UserNameF, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 60, 190, 30));

        jLabel6.setFont(new java.awt.Font("PT Serif Caption", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Password:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 120, 80, 20));

        create.setBackground(new java.awt.Color(255, 255, 255));
        create.setFont(new java.awt.Font("PT Serif Caption", 1, 18)); // NOI18N
        create.setText("Create");
        create.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createActionPerformed(evt);
            }
        });
        add(create, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 200, 87, 44));

        jLabel2.setFont(new java.awt.Font("PT Serif Caption", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(80, 80, 82));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Add Employees");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 20, 302, 30));

        jLabel7.setFont(new java.awt.Font("PT Serif Caption", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(80, 80, 82));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("View Employees");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 270, 480, 31));

        remove.setBackground(new java.awt.Color(255, 255, 255));
        remove.setFont(new java.awt.Font("PT Serif Caption", 1, 18)); // NOI18N
        remove.setText("Remove");
        remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeActionPerformed(evt);
            }
        });
        add(remove, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 460, 113, 44));

        jLabel8.setFont(new java.awt.Font("PT Serif Caption", 1, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Name:");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 72, 30));

        Namef.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NamefActionPerformed(evt);
            }
        });
        Namef.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                NamefKeyReleased(evt);
            }
        });
        add(Namef, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 140, 190, 30));

        emailexist.setFont(new java.awt.Font("PT Serif Caption", 1, 12)); // NOI18N
        emailexist.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        emailexist.setText("EmailID already Exists");
        add(emailexist, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 150, 160, 20));

        emailabel.setFont(new java.awt.Font("PT Serif Caption", 1, 12)); // NOI18N
        emailabel.setText("'aa@aa.com'");
        add(emailabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 60, 150, 20));

        passlabel.setFont(new java.awt.Font("PT Serif Caption", 1, 12)); // NOI18N
        passlabel.setText("Trgs@1");
        add(passlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 120, 160, 20));

        PassField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                PassFieldKeyReleased(evt);
            }
        });
        add(PassField, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 110, 190, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void OrgJCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OrgJCBActionPerformed
        org = (Organization) OrgJCB.getSelectedItem();
        if (org != null){
            populateTable(org);
        }
    }//GEN-LAST:event_OrgJCBActionPerformed

    private void createActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createActionPerformed
        String userName = UserNameF.getText();
        String password = PassField.getText();
        String name = Namef.getText();
        
        Organization organization = (Organization) OrgCB.getSelectedItem();
        Employee employee = new Employee();
        employee.setName(Namef.getText());
        Role role = (Role) RolesCB.getSelectedItem();
        

        if(!UserNameF.getText().isEmpty() && !PassField.getText().isEmpty() && !Namef.getText().isEmpty()){
            if(organization.getEmployeeDirectory().checkIfUsernameIsUnique(userName)){
                if(usernamePatternCorrect(userName)){
                    if(organization.getUserAccountDirectory().checkIfUsernameIsUnique(userName)){
                        organization.getEmployeeDirectory().createEmployee(Namef.getText());
                         organization.getUserAccountDirectory().createUserAccount(userName, password, employee, role);
                         JOptionPane.showMessageDialog(null,"Employee created successfully");
                         populateTable(organization);
                         UserNameF.setText("");
                         PassField.setText("");
                         Namef.setText("");
                         }
                    else{
                        JOptionPane.showMessageDialog(null, "Username  exists", "Warning", JOptionPane.WARNING_MESSAGE);
                        UserNameF.setText("");
                        return;
                    }
                }
                else{
                    JOptionPane.showMessageDialog(null, "Email format aaa@aaaa.com", "Warning", JOptionPane.WARNING_MESSAGE);
                    UserNameF.setText("");
                    return;
                }
            }
            else{
                    JOptionPane.showMessageDialog(null, "Employee  exists", "Warning", JOptionPane.WARNING_MESSAGE);
                    Namef.setText("");
                    return;
            } 
        }
        else{
                JOptionPane.showMessageDialog(null, "All fields must be entered", "Warning", JOptionPane.WARNING_MESSAGE);
                Namef.setText("");
        if(UserNameF.getText().isEmpty() && PassField.getText().isEmpty() && Namef.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "All fields must be entered", "Warning", JOptionPane.WARNING_MESSAGE);

                return;
        }
            if(NameValid  && ValidPass){
                organization.getEmployeeDirectory().createEmployee(UserNameF.getText());
                 organization.getUserAccountDirectory().createUserAccount(userName, password, employee, role);
                 JOptionPane.showMessageDialog(null,"Employee created","Success",JOptionPane.INFORMATION_MESSAGE);
                 populateTable(organization);
                 UserNameF.setText("");
                 PassField.setText("");
                 Namef.setText("");
                 ClearVals();
            }
        }   
    }//GEN-LAST:event_createActionPerformed

    private void OrgCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OrgCBActionPerformed
        Organization organization = (Organization) OrgCB.getSelectedItem();
        if (organization != null){
            populateRoleComboBox(organization);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_OrgCBActionPerformed

    private void UserNameFKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_UserNameFKeyReleased

        // TODO add your handling code here:
        Organization organization = (Organization) OrgCB.getSelectedItem();
        if(!usernamePatternCorrect(UserNameF.getText()) && !(UserNameF.getText().isEmpty())){
            emailabel.setVisible(true);
            NameValid = false;
        }else if(!organization.getUserAccountDirectory().checkIfUsernameIsUnique(UserNameF.getText())){
           emailabel.setVisible(false);
            NameValid = false;

        }else if(UserNameF.getText().isEmpty()){
           emailabel.setVisible(false);
            NameValid = false;
        }else {
            emailabel.setVisible(false);
            NameValid = true;
        }
    }//GEN-LAST:event_UserNameFKeyReleased

    private void UserNameFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserNameFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UserNameFActionPerformed

    private void removeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeActionPerformed
        int row = orgTable.getSelectedRow();

        if(row<0) {
            JOptionPane.showMessageDialog(null, "Please select a row first", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        Employee e1 = (Employee)orgTable.getValueAt(row, 1);
        UserAccount ua = (UserAccount)orgTable.getValueAt(row, 2);
        org.getEmployeeDirectory().removeEmployee(e1);
        org.getUserAccountDirectory().removeUserAccount(ua);
        populateTable(org);
        // TODO add your handling code here:
    }//GEN-LAST:event_removeActionPerformed

    private void NamefKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NamefKeyReleased
        // TODO add your handling code here:
       
    }//GEN-LAST:event_NamefKeyReleased

    private void NamefActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NamefActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NamefActionPerformed

    private void PassFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PassFieldKeyReleased
        // TODO add your handling code here:
         if(!passwordPatternCorrect(PassField.getText()) && !(PassField.getText().isEmpty())){
           passlabel.setVisible(true);
        }else if(PassField.getText().isEmpty()){
            passlabel.setVisible(false);
        }else{
            passlabel.setVisible(false);
           
        }
    }//GEN-LAST:event_PassFieldKeyReleased

    private void RolesCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RolesCBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RolesCBActionPerformed
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Namef;
    private javax.swing.JComboBox OrgCB;
    private javax.swing.JComboBox OrgJCB;
    private javax.swing.JPasswordField PassField;
    private javax.swing.JComboBox RolesCB;
    private javax.swing.JTextField UserNameF;
    private javax.swing.JButton backJButton;
    private javax.swing.JButton create;
    private javax.swing.JLabel emailabel;
    private javax.swing.JLabel emailexist;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable orgTable;
    private javax.swing.JLabel passlabel;
    private javax.swing.JButton remove;
    // End of variables declaration//GEN-END:variables
}
