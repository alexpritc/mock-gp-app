/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guis;

import java.awt.Color;
import accounts.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import other.data;


/**
 *
 * @author Alex Pritchard
 */
public class createaccount extends javax.swing.JFrame {    
    /**
     * Creates new form createaccount
     */
    public createaccount() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        lblAccountType = new javax.swing.JLabel();
        lblSurname = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtSurname = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        lblLogIn = new javax.swing.JLabel();
        btnLogIn = new javax.swing.JButton();
        btnCreateAccount = new javax.swing.JButton();
        lblPassword = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        cmboxAccountType = new javax.swing.JComboBox<>();
        lblAddress = new javax.swing.JLabel();
        lblGender = new javax.swing.JLabel();
        lblAge = new javax.swing.JLabel();
        cmboxGender = new javax.swing.JComboBox<>();
        txtAge = new javax.swing.JTextField();
        txtPassword = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        lblTitle.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 36)); // NOI18N
        lblTitle.setText("New user");

        lblAccountType.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 24)); // NOI18N
        lblAccountType.setText("Account Type");

        lblSurname.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 24)); // NOI18N
        lblSurname.setText("Surname");

        txtName.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 21)); // NOI18N

        txtSurname.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 21)); // NOI18N

        lblLogIn.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 21)); // NOI18N
        lblLogIn.setText("Already have an account?");

        btnLogIn.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 21)); // NOI18N
        btnLogIn.setText("Log in");
        btnLogIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogInActionPerformed(evt);
            }
        });

        btnCreateAccount.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 21)); // NOI18N
        btnCreateAccount.setText("Create account");
        btnCreateAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateAccountActionPerformed(evt);
            }
        });

        lblPassword.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 24)); // NOI18N
        lblPassword.setText("Password");

        lblName.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 24)); // NOI18N
        lblName.setText("Name");

        cmboxAccountType.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 21)); // NOI18N
        cmboxAccountType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Patient", "Administrator" }));
        cmboxAccountType.setSelectedIndex(-1);
        cmboxAccountType.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmboxAccountTypeItemStateChanged(evt);
            }
        });

        lblAddress.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 24)); // NOI18N
        lblAddress.setText("Address");

        lblGender.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 24)); // NOI18N
        lblGender.setText("Gender");

        lblAge.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 24)); // NOI18N
        lblAge.setText("Age");

        cmboxGender.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 21)); // NOI18N
        cmboxGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Female", "Male", "Other", "Prefer not to say" }));
        cmboxGender.setSelectedIndex(-1);
        cmboxGender.setEnabled(false);

        txtAge.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 21)); // NOI18N
        txtAge.setEnabled(false);

        txtPassword.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 21)); // NOI18N

        txtAddress.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 21)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnLogIn)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTitle)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblLogIn, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblSurname)
                            .addComponent(lblPassword)
                            .addComponent(lblAccountType)
                            .addComponent(lblName)
                            .addComponent(lblAddress)
                            .addComponent(lblGender)
                            .addComponent(lblAge))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(cmboxGender, javax.swing.GroupLayout.Alignment.LEADING, 0, 291, Short.MAX_VALUE)
                            .addComponent(cmboxAccountType, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtName, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSurname, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtAge)
                            .addComponent(txtPassword, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtAddress, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCreateAccount)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmboxAccountType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAccountType))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblName))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSurname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblSurname))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblAddress)
                            .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblAge)
                            .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmboxGender, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblGender))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblPassword))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCreateAccount)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblLogIn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLogIn)
                        .addGap(24, 24, 24))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(83, 83, 83))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(89, 89, 89))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogInActionPerformed
        // TODO add your handling code here:
        
        this.setVisible(false);
        new login().setVisible(true);
    }//GEN-LAST:event_btnLogInActionPerformed

    private void cmboxAccountTypeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmboxAccountTypeItemStateChanged
        // TODO add your handling code here:
          
        if (cmboxAccountType.getSelectedItem() == "Patient"){
            // Enables age and gender inputs.
            txtAge.setBackground(Color.white);
            txtAge.enable();
            
            cmboxGender.setBackground(Color.white);
            cmboxGender.enable();
        }
        else{
            // Disables age and gender inputs.
            txtAge.setBackground(Color.gray);
            txtAge.setText("");
            txtAge.enable(false);
            
            cmboxGender.setBackground(Color.gray);
            cmboxGender.setSelectedIndex(-1);
            cmboxGender.enable(false);
        }
    }//GEN-LAST:event_cmboxAccountTypeItemStateChanged

    private void btnCreateAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateAccountActionPerformed
        // TODO add your handling code here:
        
        if (cmboxAccountType.getSelectedItem() == "Patient"){
            // Create a new newPatientRequest.
            String ID = "P****";
            
            patient tempPatient = new patient(txtName.getText(), 
                    txtSurname.getText(), txtAddress.getText(), ID, 
                    txtPassword.getText(), txtAge.getText(), cmboxGender.getSelectedItem().toString());
            
            data.patientRequests.add(tempPatient);
            
            try {
                data.savePatientRequests();
            } catch (Exception ex) {
                Logger.getLogger(createaccount.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            this.setVisible(false);
            new login().setVisible(true);
        }
        else if (cmboxAccountType.getSelectedItem() == "Administrator"){
            // Create a new admin.
           
           String setId;
           
           int length = data.administrators.size();
           String id = data.administrators.get(length-1).getId();
            
           String[] newID = new String [2];
           newID = id.split("A", 2);

           int value = Integer.parseInt(newID[1]);
           value++;
            
           if (value < 10){
           setId = "A000" + value;
           }
           else if (value < 100){
           setId = "A00" + value;
           }
           else if (value < 1000){
           setId = "A0" + value;
           }
           else{
           setId = "A" + value;
           }
            
            administrator tempAdmin = new administrator(txtName.getText(), 
                    txtSurname.getText(), txtAddress.getText(), setId, 
                    txtPassword.getText());
            data.administrators.add(tempAdmin);
            
            try {
                data.saveAdministrators();
            } catch (Exception ex) {
                Logger.getLogger(createaccount.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            adminhome.admin = tempAdmin;
            this.setVisible(false);
            new adminhome().setVisible(true);
        }
    }//GEN-LAST:event_btnCreateAccountActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])throws Exception{
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(createaccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(createaccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(createaccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(createaccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new createaccount().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreateAccount;
    private javax.swing.JButton btnLogIn;
    private javax.swing.JComboBox<String> cmboxAccountType;
    private javax.swing.JComboBox<String> cmboxGender;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblAccountType;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblLogIn;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblSurname;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtSurname;
    // End of variables declaration//GEN-END:variables
}
