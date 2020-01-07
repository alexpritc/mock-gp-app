/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

// Package and imports.
package guis.secretarysystem;

import accounts.doctor;
import accounts.patient;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import other.systemdatabase;
import other.appointment;

/**
 *
 * @author Alex Pritchard
 */
public class secretarynewappointment extends javax.swing.JFrame {

    /**
     * Creates new form secretarynewappointment.
     */
    public secretarynewappointment() {
        initComponents();
        
        // Displays all of the doctors.
        String[] doctorData = new String[systemdatabase.doctors.size()];
        int i = 0;
        
        for (doctor d : systemdatabase.doctors){
            
            doctorData[i] = "Dr. " + d.getName().charAt(0) + " " + d.getSurname();
            i++;
        }
        lstDoctors.setListData(doctorData);
        
        // Displays all of the patients.
        String[] patientData = new String[systemdatabase.patients.size()];
        
        int j = 0;
        
        for (patient p : systemdatabase.patients){
            
            patientData[j] = p.getName() + " " + p.getSurname();
            j++;
        }
        lstPatients.setListData(patientData);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        btnBack = new javax.swing.JButton();
        lblTitle = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblName = new javax.swing.JLabel();
        txtDoctorsName = new javax.swing.JTextField();
        btnCreateAppointment = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstDoctors = new javax.swing.JList<>();
        txtDate = new javax.swing.JTextField();
        lblDate = new javax.swing.JLabel();
        txtTime = new javax.swing.JTextField();
        lblTime = new javax.swing.JLabel();
        datepickerDate = new org.jdesktop.swingx.JXDatePicker();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstTimes = new javax.swing.JList<>();
        lblName1 = new javax.swing.JLabel();
        txtPatientName = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        lstPatients = new javax.swing.JList<>();
        jSeparator1 = new javax.swing.JSeparator();

        jFormattedTextField1.setText("jFormattedTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnBack.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 21)); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        lblTitle.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 36)); // NOI18N
        lblTitle.setText("New appointment request");

        lblName.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 24)); // NOI18N
        lblName.setText("Doctor's Name");

        txtDoctorsName.setEditable(false);
        txtDoctorsName.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 21)); // NOI18N
        txtDoctorsName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtDoctorsName.setMaximumSize(new java.awt.Dimension(40, 249));
        txtDoctorsName.setMinimumSize(new java.awt.Dimension(40, 249));
        txtDoctorsName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDoctorsNameActionPerformed(evt);
            }
        });

        btnCreateAppointment.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 21)); // NOI18N
        btnCreateAppointment.setText("Create appointment");
        btnCreateAppointment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateAppointmentActionPerformed(evt);
            }
        });

        lstDoctors.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 21)); // NOI18N
        lstDoctors.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        lstDoctors.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstDoctorsValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lstDoctors);

        txtDate.setEditable(false);
        txtDate.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 21)); // NOI18N
        txtDate.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtDate.setMaximumSize(new java.awt.Dimension(40, 249));
        txtDate.setMinimumSize(new java.awt.Dimension(40, 249));
        txtDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDateActionPerformed(evt);
            }
        });

        lblDate.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 24)); // NOI18N
        lblDate.setText("Date");

        txtTime.setEditable(false);
        txtTime.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 21)); // NOI18N
        txtTime.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtTime.setMaximumSize(new java.awt.Dimension(40, 249));
        txtTime.setMinimumSize(new java.awt.Dimension(40, 249));
        txtTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTimeActionPerformed(evt);
            }
        });

        lblTime.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 24)); // NOI18N
        lblTime.setText("Time");

        datepickerDate.setEnabled(false);
        datepickerDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                datepickerDateActionPerformed(evt);
            }
        });

        lstTimes.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 21)); // NOI18N
        lstTimes.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        lstTimes.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstTimesValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(lstTimes);

        lblName1.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 24)); // NOI18N
        lblName1.setText("Patient's Name");

        txtPatientName.setEditable(false);
        txtPatientName.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 21)); // NOI18N
        txtPatientName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtPatientName.setMaximumSize(new java.awt.Dimension(40, 249));
        txtPatientName.setMinimumSize(new java.awt.Dimension(40, 249));
        txtPatientName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPatientNameActionPerformed(evt);
            }
        });

        lstPatients.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 21)); // NOI18N
        lstPatients.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        lstPatients.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstPatientsValueChanged(evt);
            }
        });
        jScrollPane3.setViewportView(lstPatients);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(datepickerDate, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(lblDate)
                            .addGap(21, 21, 21)
                            .addComponent(txtDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(lblTime)
                            .addGap(18, 18, 18)
                            .addComponent(txtTime, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtDoctorsName, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnCreateAppointment, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(lblName1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtPatientName, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(datepickerDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDoctorsName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblName))
                        .addGap(13, 13, 13)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPatientName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblName1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDate))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTime))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCreateAppointment, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 3, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTitle)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Takes the user back to their homepage.
    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new secretaryhome().setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed

    private void txtDoctorsNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDoctorsNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDoctorsNameActionPerformed

    // Creates an appointment between a patient and a doctor using the selected
    // date and time, and adds it to the systemdatabase.
    private void btnCreateAppointmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateAppointmentActionPerformed
        // TODO add your handling code here
        
        if (lstDoctors.isSelectionEmpty() || lstPatients.isSelectionEmpty()){
            JOptionPane.showMessageDialog(null, 
                            "Please select both a doctor and a patient.", "" + "", 
                            JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        else{
            if (datepickerDate.getDate() == null){
                JOptionPane.showMessageDialog(null, 
                            "Please select a date.", "" + "", 
                            JOptionPane.INFORMATION_MESSAGE);
            return;
            }
            else{
                if (txtTime.getText().isEmpty()){
                    JOptionPane.showMessageDialog(null, 
                            "Please select an available time.", "" + "", 
                            JOptionPane.INFORMATION_MESSAGE);
                    return;               
                }
                else{
                    // Make appointment.
                    appointment tempAppointment = new appointment(systemdatabase.patients.get(lstPatients.getSelectedIndex()).getId(), 
                            systemdatabase.doctors.get(lstDoctors.getSelectedIndex()).getId(), 
                            "", datepickerDate.getDate().toString(), txtTime.getText());
                    
                    systemdatabase.appointments.add(tempAppointment);
                    
                    try {
                        systemdatabase.saveAppointments();
                    } catch (Exception ex) {
                        Logger.getLogger(secretarynewappointment.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    
                    this.setVisible(false);
                    new secretarymanageappointments().setVisible(true);
                }
            }
        }
        
    }//GEN-LAST:event_btnCreateAppointmentActionPerformed

    // Updates the information based on the selected Doctor.
    private void lstDoctorsValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstDoctorsValueChanged
        // TODO add your handling code here:
        int index = lstDoctors.getSelectedIndex();
        txtDoctorsName.setText("");   
        txtDate.setText("");
        txtTime.setText("");
        
        datepickerDate.setEnabled(false);
        datepickerDate.getEditor().setValue(null);
        
        String[] timesData = new String[1];
        timesData[0] = "";
        lstTimes.setListData(timesData);
        
        lstTimes.setEnabled(false);
        
        if (lstDoctors.isSelectionEmpty() || "No entries.".equals(lstDoctors.getSelectedValue())){
            txtDoctorsName.setText("");   
            txtDate.setText("");
            txtTime.setText("");
            
            datepickerDate.setEnabled(false);
            datepickerDate.getEditor().setValue(null);
            
            lstTimes.setEnabled(false);
        }
        else{
            txtDoctorsName.setText(systemdatabase.doctors.get(index).getName() + " " + systemdatabase.doctors.get(index).getSurname());
            datepickerDate.setEnabled(true);
        }     
    }//GEN-LAST:event_lstDoctorsValueChanged

    private void txtDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDateActionPerformed

    private void txtTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTimeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTimeActionPerformed

    // Updates the time, if the time chosen is one where the doctor is available.
    private void lstTimesValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstTimesValueChanged
        // TODO add your handling code here:
        txtTime.setText("");
        
        if (!lstTimes.getSelectedValue().contains("UNAVAILABLE")){
            txtTime.setText(lstTimes.getSelectedValue().substring(0, 5));
        }
    }//GEN-LAST:event_lstTimesValueChanged

    // Updates a date picked, but that date must be in the future.
    private void datepickerDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_datepickerDateActionPerformed
        // TODO add your handling code here:
        Date currentDate = new Date();
        
        if (datepickerDate.getDate().after(currentDate)){
            txtDate.setText(datepickerDate.getDate().toString().substring(0, 10));

            lstTimes.setEnabled(true);
            
            String[] timeData = new String[43];
            
            for (int i = 0; i < timeData.length; i++){
                timeData[i] = time(i) + " - AVAILABLE";
            }
            
            for (appointment a : systemdatabase.appointments){
                
                if (a.getDoctor().equals(systemdatabase.doctors.get(lstDoctors.getSelectedIndex()).getId())){
                    if (a.getDate().equals(datepickerDate.getDate().toString())){
                        
                        for (int i = 0; i < timeData.length; i++){
                            System.out.println(timeData[i].subSequence(0, 5));
                            System.out.println(a.getTime());
                            if (timeData[i].subSequence(0, 5).equals(a.getTime())){
                                timeData[i] = a.getTime() + " - UNAVAILABLE";
                            }
                        }
                    }
                }
            }
 
            lstTimes.setListData(timeData);
        }
        else{
            String[] timesData = new String[1];
            timesData[0] = "";
            lstTimes.setListData(timesData);
            
            lstTimes.setEnabled(false);
            
            JOptionPane.showMessageDialog(null, 
                            "Please select a valid date.", "" + "", 
                            JOptionPane.INFORMATION_MESSAGE);
            return;
        }
    }//GEN-LAST:event_datepickerDateActionPerformed

    private void txtPatientNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPatientNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPatientNameActionPerformed

    // Updates the information based on the patient selected.
    private void lstPatientsValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstPatientsValueChanged
        // TODO add your handling code here:
        
        int index = lstPatients.getSelectedIndex();
        txtPatientName.setText("");   
        
        if (lstPatients.isSelectionEmpty() || "No entries.".equals(lstPatients.getSelectedValue())){
            txtPatientName.setText("");   
        }
        else{
            txtPatientName.setText(systemdatabase.patients.get(index).getName() + " " + systemdatabase.patients.get(index).getSurname());
        }
    }//GEN-LAST:event_lstPatientsValueChanged

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(secretarynewappointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(secretarynewappointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(secretarynewappointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(secretarynewappointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new secretarynewappointment().setVisible(true);
            }
        });
    }
    
    // Takes in an integer (i) and uses a limited number of 
    // switch cases to turn it into a time between 8am and 6:30pm on a 
    // 24 hour clock. It allos 15 minutes per appointment.
    private static String time(int i){
        String time = "--:--";
        
        String hour = "00";
        String minute = "00";
        
        switch(i) {
            case 0:
                hour = "08";
                minute = "00";      
            break;
            case 1:
                hour = "08";
                minute = "15";  
            break;
            case 2:
                hour = "08";
                minute = "30";  
            break;
            case 3:
                hour = "08";
                minute = "45";  
            break;
            case 4:
                hour = "09";
                minute = "00";      
            break;
            case 5:
                hour = "09";
                minute = "15";  
            break;
            case 6:
                hour = "09";
                minute = "30";  
            break;
            case 7:
                hour = "10";
                minute = "45";  
            break;
            case 8:
                hour = "10";
                minute = "00";      
            break;
            case 9:
                hour = "10";
                minute = "15";  
            break;
            case 10:
                hour = "10";
                minute = "30";  
            break;
            case 11:
                hour = "10";
                minute = "45";  
            break;
            case 12:
                hour = "11";
                minute = "00";      
            break;
            case 13:
                hour = "11";
                minute = "15";  
            break;
            case 14:
                hour = "11";
                minute = "30";  
            break;
            case 15:
                hour = "11";
                minute = "45";  
            break;
            case 16:
                hour = "12";
                minute = "00";      
            break;
            case 17:
                hour = "12";
                minute = "15";  
            break;
            case 18:
                hour = "12";
                minute = "30";  
            break;
            case 19:
                hour = "12";
                minute = "45";  
            break;
            case 20:
                hour = "13";
                minute = "00";      
            break;
            case 21:
                hour = "13";
                minute = "15";  
            break;
            case 22:
                hour = "13";
                minute = "30";  
            break;
            case 23:
                hour = "13";
                minute = "45";  
            break;
            case 24:
                hour = "14";
                minute = "00";      
            break;
            case 25:
                hour = "14";
                minute = "15";  
            break;
            case 26:
                hour = "14";
                minute = "30";  
            break;
            case 27:
                hour = "14";
                minute = "45";  
            break;
            case 28:
                hour = "15";
                minute = "00";      
            break;
            case 29:
                hour = "15";
                minute = "15";  
            break;
            case 30:
                hour = "15";
                minute = "30";  
            break;
            case 31:
                hour = "15";
                minute = "45";  
            break;
            case 32:
                hour = "16";
                minute = "00";      
            break;
            case 33:
                hour = "16";
                minute = "15";  
            break;
            case 34:
                hour = "16";
                minute = "30";  
            break;
            case 35:
                hour = "16";
                minute = "45";  
            break;
            case 36:
                hour = "16";
                minute = "00";      
            break;
            case 37:
                hour = "17";
                minute = "15";  
            break;
            case 38:
                hour = "17";
                minute = "30";  
            break;
            case 39:
                hour = "17";
                minute = "45";  
            break;
            case 40:
                hour = "18";
                minute = "00";      
            break;
            case 41:
                hour = "18";
                minute = "15";  
            break;
            case 42:
                hour = "18";
                minute = "30";  
            break;
            default:
            // code block
                time = "--:--";
        }
        
        time = hour + ":" + minute;
        return time;
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreateAppointment;
    private org.jdesktop.swingx.JXDatePicker datepickerDate;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblName1;
    private javax.swing.JLabel lblTime;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JList<String> lstDoctors;
    private javax.swing.JList<String> lstPatients;
    private javax.swing.JList<String> lstTimes;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtDoctorsName;
    private javax.swing.JTextField txtPatientName;
    private javax.swing.JTextField txtTime;
    // End of variables declaration//GEN-END:variables
}
