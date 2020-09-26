/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package warehouse;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author magic
 */
public class UpdateCompany extends javax.swing.JFrame {

    /**
     * Creates new form Update
     */
    public UpdateCompany() {
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

        mainPanel = new javax.swing.JPanel();
        lblSearchWith = new javax.swing.JLabel();
        columnBox = new javax.swing.JComboBox();
        lblValue = new javax.swing.JLabel();
        txtData = new javax.swing.JTextField();
        searchButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Updateing Company");

        lblSearchWith.setText("Search with");

        columnBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "companyID", "companyName", "location", "fax", "phoneNumber", "CEOName" }));
        columnBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                columnBoxActionPerformed(evt);
            }
        });

        lblValue.setText("Value");

        searchButton.setText("Search");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        updateButton.setText("Update Selected Item");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        clearButton.setText("Clear Table");
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "companyID", "companyName", "location", "fax", "phoneNumber", "CEOName"
            }
        ));
        jScrollPane2.setViewportView(table);

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(lblSearchWith)
                        .addGap(28, 28, 28)
                        .addComponent(columnBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(lblValue, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(searchButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(backButton))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(updateButton)
                        .addGap(18, 18, 18)
                        .addComponent(clearButton)))
                .addContainerGap(199, Short.MAX_VALUE))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSearchWith, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(columnBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblValue, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchButton)
                    .addComponent(backButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updateButton)
                    .addComponent(clearButton))
                .addGap(192, 192, 192))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void columnBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_columnBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_columnBoxActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
     this.dispose();
    }//GEN-LAST:event_backButtonActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
     if (columnBox.getSelectedItem().toString().equals("companyID")){
      if (txtData.getText().toString().equals(""))
      {
          JOptionPane.showMessageDialog(null, "Enter company ID");
       return;
      }
      if (!Controller.validateIntegerNumber(txtData.getText().toString()))
      {
      JOptionPane.showMessageDialog(null, "Company ID not valid");
        return; 
      }
      try {
      Connection conn = ConnectDataBase.connect();
          PreparedStatement ps = conn.prepareStatement("select * from company where companyID = ?");
          ps.setString(1, txtData.getText().toString());
          ResultSet rs = ps.executeQuery();
          table.setModel(DbUtils.resultSetToTableModel(rs));
      
      }
      catch (Exception ex){JOptionPane.showMessageDialog(null, ex.getMessage());}
      
      
      
      } else  if (columnBox.getSelectedItem().toString().equals("companyName")){
      if (txtData.getText().toString().equals(""))
      {
          JOptionPane.showMessageDialog(null, "Enter company name");
       return;
      }
      if (!Controller.validateName(txtData.getText().toString()))
      {
      JOptionPane.showMessageDialog(null, "Company name not valid");
        return; 
      }
      try {
      Connection conn = ConnectDataBase.connect();
          PreparedStatement ps = conn.prepareStatement("select * from company where companyName = ?");
          ps.setString(1, txtData.getText().toString());
          ResultSet rs = ps.executeQuery();
          table.setModel(DbUtils.resultSetToTableModel(rs));
      
      } 
      catch (Exception ex){JOptionPane.showMessageDialog(null, ex.getMessage());}
      }
      else  if (columnBox.getSelectedItem().toString().equals("location")){
      if (txtData.getText().toString().equals(""))
      {
          JOptionPane.showMessageDialog(null, "Enter company location");
       return;
      }
      try {
      Connection conn = ConnectDataBase.connect();
          PreparedStatement ps = conn.prepareStatement("select * from company where location = ?");
          ps.setString(1, txtData.getText().toString());
          ResultSet rs = ps.executeQuery();
          table.setModel(DbUtils.resultSetToTableModel(rs));
      
      } 
      catch (Exception ex){JOptionPane.showMessageDialog(null, ex.getMessage());}
      }
      else  if (columnBox.getSelectedItem().toString().equals("fax")){
      if (txtData.getText().toString().equals(""))
      {
          JOptionPane.showMessageDialog(null, "Enter company fax");
       return;
      }
      if (!Controller.validateIntegerNumber(txtData.getText().toString()))
      {
      JOptionPane.showMessageDialog(null, "Company fax not valid");
        return; 
      }
      try {
      Connection conn = ConnectDataBase.connect();
          PreparedStatement ps = conn.prepareStatement("select * from company where fax = ?");
          ps.setString(1, txtData.getText().toString());
          ResultSet rs = ps.executeQuery();
          table.setModel(DbUtils.resultSetToTableModel(rs));
      
      } 
      catch (Exception ex){JOptionPane.showMessageDialog(null, ex.getMessage());}
      }
      else  if (columnBox.getSelectedItem().toString().equals("phoneNumber")){
      if (txtData.getText().toString().equals(""))
      {
          JOptionPane.showMessageDialog(null, "Enter company phone number");
       return;
      }
      if (!Controller.validateIntegerNumber(txtData.getText().toString()))
      {
      JOptionPane.showMessageDialog(null, "Company phone number not valid");
        return; 
      }
      try {
      Connection conn = ConnectDataBase.connect();
          PreparedStatement ps = conn.prepareStatement("select * from company where phoneNumber = ?");
          ps.setString(1, txtData.getText().toString());
          ResultSet rs = ps.executeQuery();
          table.setModel(DbUtils.resultSetToTableModel(rs));
      
      } 
   
      catch (Exception ex){JOptionPane.showMessageDialog(null, ex.getMessage());}
      }
      else  if (columnBox.getSelectedItem().toString().equals("CEOName")){
      if (txtData.getText().toString().equals(""))
      {
          JOptionPane.showMessageDialog(null, "Enter CEO name");
       return;
      }
      if (!Controller.validateName(txtData.getText().toString()))
      {
      JOptionPane.showMessageDialog(null, "CEO name not valid");
        return; 
      }
      try {
      Connection conn = ConnectDataBase.connect();
          PreparedStatement ps = conn.prepareStatement("select * from company where CEOName = ?");
          ps.setString(1, txtData.getText().toString());
          ResultSet rs = ps.executeQuery();
          table.setModel(DbUtils.resultSetToTableModel(rs));
      
      } 
      catch (Exception ex){JOptionPane.showMessageDialog(null, ex.getMessage());}
      }
    }//GEN-LAST:event_searchButtonActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
       
        int x;
        String ID ;
        try {
            x = table.getSelectedRow();
            ID = table.getValueAt(x, 0).toString();
        }
        catch (Exception ex){
            JOptionPane.showMessageDialog(null, "No Selected item");
            return;
        }
         int modelIndex = table.convertRowIndexToModel(x);
                DefaultTableModel model = (DefaultTableModel)table.getModel();
                for (int i=1 ; i<model.getRowCount() ; i++)
                    if (i != modelIndex)
                      model.removeRow(i);
        
        int check = JOptionPane.showConfirmDialog(null, "Do you really want to Update this item ?");
        if (check == 0){
            try {
                Connection conn = ConnectDataBase.connect();
                PreparedStatement ps = conn.prepareStatement("update company set companyID = ? , companyName = ? , location = ? , fax = ? , phoneNumber = ? ,  CEOName= ? where companyID = ?  ");
                String companyID = table.getValueAt(x, 0).toString();
                if (Controller.validateIntegerNumber(companyID))
                {
                    ps.setString(1, companyID);
                }
                String companyName = table.getValueAt(x, 1).toString();
                  if (Controller.validateName(companyName))
                  {
                      ps.setString(2, companyName);
                  }
                String location = table.getValueAt(x, 2).toString();
                 ps.setString(3, location);
                
                String fax = table.getValueAt(x, 3).toString();
                 if (Controller.validateIntegerNumber(fax))
                  {
                      ps.setString(4, fax);
                  }
                String phoneNumber = table.getValueAt(x, 4).toString();
                if (Controller.validateIntegerNumber(phoneNumber))
                {
                ps.setString(5, phoneNumber);
                }
                String CEOName = table.getValueAt(x, 5).toString();
                 if (Controller.validateName(CEOName))
                {
                    ps.setString(6, CEOName);
                }
                 ps.setString(7, ID);
                ps.execute();
               
            }
            catch (Exception ex){
                JOptionPane.showMessageDialog(null, ex.getMessage());

            }
        }
        else {
            return;
        }
    }//GEN-LAST:event_updateButtonActionPerformed

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
       table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "companyID", "companyName", "location", "fax", "phoneNumber", "CEOName"
            }
        ));
    }//GEN-LAST:event_clearButtonActionPerformed

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
            java.util.logging.Logger.getLogger(UpdateCompany.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateCompany.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateCompany.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateCompany.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateCompany().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JButton clearButton;
    private javax.swing.JComboBox columnBox;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblSearchWith;
    private javax.swing.JLabel lblValue;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JButton searchButton;
    private javax.swing.JTable table;
    private javax.swing.JTextField txtData;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables
}
