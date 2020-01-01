/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guis.secretarysystem;

import accounts.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import other.data;
import other.medicine;

/**
 *
 * @author Alex Pritchard
 */
public class secretarymedicinestock extends javax.swing.JFrame {

    /**
     * Creates new form patientmedicalhistory
     */
    public secretarymedicinestock() {
        initComponents();
        
        String[] medicineData = new String[data.medicines.size()];
        int i = 0;
        
        for (medicine m : data.medicines){
            medicineData[i] = m.getName();
            i++;
        }
        lstMedicine.setListData(medicineData);
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
        cmboxMedicine = new javax.swing.JComboBox<>();
        lblMedicine = new javax.swing.JLabel();
        txtMedicine = new javax.swing.JTextField();
        lblStock = new javax.swing.JLabel();
        txtDosage = new javax.swing.JTextField();
        lblDosage = new javax.swing.JLabel();
        txtStock = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstMedicine = new javax.swing.JList<>();
        btnOrder = new javax.swing.JButton();
        txtOrder = new javax.swing.JTextField();
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
        lblTitle.setText("Medicine stock");

        cmboxMedicine.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 21)); // NOI18N
        cmboxMedicine.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "View all medicines", "View out of stock medicines" }));
        cmboxMedicine.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmboxMedicineItemStateChanged(evt);
            }
        });

        lblMedicine.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 24)); // NOI18N
        lblMedicine.setText("Medicine");

        txtMedicine.setEditable(false);
        txtMedicine.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 21)); // NOI18N
        txtMedicine.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtMedicine.setMaximumSize(new java.awt.Dimension(40, 249));
        txtMedicine.setMinimumSize(new java.awt.Dimension(40, 249));
        txtMedicine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMedicineActionPerformed(evt);
            }
        });

        lblStock.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 24)); // NOI18N
        lblStock.setText("Stock");

        txtDosage.setEditable(false);
        txtDosage.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 21)); // NOI18N
        txtDosage.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtDosage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDosageActionPerformed(evt);
            }
        });

        lblDosage.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 24)); // NOI18N
        lblDosage.setText("Dosage");

        txtStock.setEditable(false);
        txtStock.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 21)); // NOI18N
        txtStock.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtStock.setMaximumSize(new java.awt.Dimension(40, 249));
        txtStock.setMinimumSize(new java.awt.Dimension(40, 249));
        txtStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStockActionPerformed(evt);
            }
        });

        lstMedicine.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 21)); // NOI18N
        lstMedicine.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        lstMedicine.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstMedicineValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lstMedicine);

        btnOrder.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 21)); // NOI18N
        btnOrder.setText("Order");
        btnOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrderActionPerformed(evt);
            }
        });

        txtOrder.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 21)); // NOI18N
        txtOrder.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtOrder.setMaximumSize(new java.awt.Dimension(40, 249));
        txtOrder.setMinimumSize(new java.awt.Dimension(40, 249));
        txtOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOrderActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 352, Short.MAX_VALUE)
                    .addComponent(cmboxMedicine, 0, 352, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(lblDosage))
                            .addComponent(lblMedicine)
                            .addComponent(lblStock, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtDosage, javax.swing.GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE)
                            .addComponent(txtMedicine, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtStock, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(btnOrder, javax.swing.GroupLayout.DEFAULT_SIZE, 478, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(31, 31, 31))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmboxMedicine, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtMedicine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblMedicine)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDosage, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDosage))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblStock))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 636, Short.MAX_VALUE)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(63, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 600, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(94, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 541, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(188, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:

        this.setVisible(false);
        new secretaryhome().setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed

    private void txtMedicineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMedicineActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMedicineActionPerformed

    private void txtDosageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDosageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDosageActionPerformed

    private void txtStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStockActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStockActionPerformed

    private void btnOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrderActionPerformed
        // TODO add your handling code here
        if (!lstMedicine.isSelectionEmpty()){
            
            if (!txtOrder.getText().isEmpty()){
                
                if (isInteger(txtOrder.getText())){
                    data.medicines.get(lstMedicine.getSelectedIndex()).setStock
                                        (Integer.parseInt(txtOrder.getText()) 
                                        + data.medicines.get(lstMedicine.getSelectedIndex()).getStock());
                    
                    try {
                        data.saveMedicines();
                    } catch (Exception ex) {
                        Logger.getLogger(secretarymedicinestock.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    
                    txtStock.setText(Integer.toString(data.medicines.get(lstMedicine.getSelectedIndex()).getStock()));
                }
                else{
                    JOptionPane.showMessageDialog(null, 
                            "Please enter a valid integer.", "" + "", 
                            JOptionPane.INFORMATION_MESSAGE);
                    return;
                }
            }
            else{
                JOptionPane.showMessageDialog(null, 
                        "Please enter a quantity to restock.", "" + "", 
                        JOptionPane.INFORMATION_MESSAGE);
                return;
            }
        }
        else{
            JOptionPane.showMessageDialog(null, 
                "Select a medicine to restock.", "" + "", 
                 JOptionPane.INFORMATION_MESSAGE);
            return;
        }
    }//GEN-LAST:event_btnOrderActionPerformed

    private void cmboxMedicineItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmboxMedicineItemStateChanged
        // TODO add your handling code here:
        lstMedicine.setSelectedIndex(-1);
        btnOrder.setEnabled(false);
        
        if (cmboxMedicine.getSelectedIndex() == 0){
   
            if (data.medicines.isEmpty()){
                String[] medicineData = new String[1];
                medicineData[0] = "No entries.";
                lstMedicine.setListData(medicineData);
            }
            else{
                String[] medicineData = new String[data.medicines.size()];
                int i = 0;
        
                for (medicine m : data.medicines){
                medicineData[i] = m.getName();
                i++;
                }
                lstMedicine.setListData(medicineData);
            }
        }
        else if (cmboxMedicine.getSelectedIndex() == 1){
            
            String[] medicineData = new String[data.medicines.size()];
            int i = 0;
        
            for (medicine m : data.medicines){
                if (m.getStock() == 0){
                    medicineData[i] = m.getName();
                    i++;
                }
            }
            
            if (medicineData[0] == null){
                medicineData[0] = "No entries.";
            }
            
            lstMedicine.setListData(medicineData);
        }
    }//GEN-LAST:event_cmboxMedicineItemStateChanged

    private void lstMedicineValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstMedicineValueChanged
        // TODO add your handling code here:
        int index = lstMedicine.getSelectedIndex();
        
        if (lstMedicine.isSelectionEmpty() || "No entries.".equals(lstMedicine.getSelectedValue())){
        txtDosage.setText("");
        txtMedicine.setText("");
        txtStock.setText("");

        btnOrder.setEnabled(false);
        }
        else{
        btnOrder.setEnabled(true);
        
        txtDosage.setText(data.medicines.get(index).getDosage());
        txtMedicine.setText(data.medicines.get(index).getName());
        txtStock.setText(Integer.toString(data.medicines.get(index).getStock()));
        }
    }//GEN-LAST:event_lstMedicineValueChanged

    private void txtOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOrderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOrderActionPerformed

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
            java.util.logging.Logger.getLogger(secretarymedicinestock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(secretarymedicinestock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(secretarymedicinestock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(secretarymedicinestock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new secretarymedicinestock().setVisible(true);
            }
        });
    }
    
    public static boolean isInteger(String s) {
    try { 
        Integer.parseInt(s); 
    } catch(NumberFormatException e) { 
        return false; 
    } catch(NullPointerException e) {
        return false;
    }
    // only got here if we didn't return false
    return true;
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnOrder;
    private javax.swing.JComboBox<String> cmboxMedicine;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblDosage;
    private javax.swing.JLabel lblMedicine;
    private javax.swing.JLabel lblStock;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JList<String> lstMedicine;
    private javax.swing.JTextField txtDosage;
    private javax.swing.JTextField txtMedicine;
    private javax.swing.JTextField txtOrder;
    private javax.swing.JTextField txtStock;
    // End of variables declaration//GEN-END:variables
}
