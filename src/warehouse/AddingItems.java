
package warehouse;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author gerko
 */
public class AddingItems extends javax.swing.JFrame {
/*------------------DECLARATION--------------------*/

    /*******************************************************-*/
    
    /*----------------------------------------*/
    public AddingItems() {
      
        initComponents();
       prestart();
    }
  void prestart ()
  {
        try {
            Connection conn = ConnectDataBase.connect();
            PreparedStatement ps = conn.prepareStatement("SELECT MAX(productID) from product");
            ResultSet rs = ps.executeQuery();
            rs.next();
            int x = rs.getInt(1)+1;
            txtItemID.setText(""+x);
            txtItemID.setEditable(false);
            
            ps = conn.prepareStatement("select companyID from company");
            rs = ps.executeQuery();
            while (rs.next()){
            companyIDBox.addItem(rs.getInt("companyID"));
            }
           
             ps = conn.prepareStatement("select sectionID from section");
            rs = ps.executeQuery();
           
            while  (rs.next()){
            sectionIDBox.addItem(rs.getInt("sectionID"));
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
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

        jLayeredPane1 = new javax.swing.JLayeredPane();
        MainPanel = new javax.swing.JPanel();
        lblItemID = new javax.swing.JLabel();
        txtItemID = new javax.swing.JTextField();
        txtItemName = new javax.swing.JTextField();
        txtParCode = new javax.swing.JTextField();
        txtType = new javax.swing.JTextField();
        lblItemName = new javax.swing.JLabel();
        lblparCode = new javax.swing.JLabel();
        lblcompanyID = new javax.swing.JLabel();
        lblstorageMethod = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtstorageMethod = new javax.swing.JTextArea();
        lblType = new javax.swing.JLabel();
        lblCost = new javax.swing.JLabel();
        txtCost = new javax.swing.JTextField();
        lblexpireDate = new javax.swing.JLabel();
        yearExpireDateBox = new javax.swing.JComboBox();
        monthExpireDateBox = new javax.swing.JComboBox();
        dayExpireDateBox = new javax.swing.JComboBox();
        lblquantity = new javax.swing.JLabel();
        txtQuantity = new javax.swing.JTextField();
        lblsectionID = new javax.swing.JLabel();
        AddButton = new javax.swing.JButton();
        ClearButton = new javax.swing.JButton();
        BackButton = new javax.swing.JButton();
        companyIDBox = new javax.swing.JComboBox();
        sectionIDBox = new javax.swing.JComboBox();
        selectedCompany = new javax.swing.JTextField();
        selectedSection = new javax.swing.JTextField();

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Adding Item");
        setResizable(false);

        lblItemID.setText("Item ID ");

        txtItemID.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                txtItemIDMouseMoved(evt);
            }
        });
        txtItemID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtItemIDActionPerformed(evt);
            }
        });

        lblItemName.setText("Item name");

        lblparCode.setText("Par code");

        lblcompanyID.setText("Company ID");

        lblstorageMethod.setText("Storage Method");

        txtstorageMethod.setColumns(20);
        txtstorageMethod.setRows(5);
        jScrollPane1.setViewportView(txtstorageMethod);

        lblType.setText("Type");

        lblCost.setText("Cost");

        txtCost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCostActionPerformed(evt);
            }
        });

        lblexpireDate.setText("Expire Date");

        yearExpireDateBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030" }));
        yearExpireDateBox.setSelectedIndex(-1);

        monthExpireDateBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
        monthExpireDateBox.setSelectedIndex(-1);

        dayExpireDateBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        dayExpireDateBox.setSelectedIndex(-1);

        lblquantity.setText("Quantity");

        lblsectionID.setText("Section ID");

        AddButton.setText("Add");
        AddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddButtonActionPerformed(evt);
            }
        });

        ClearButton.setText("Clear");
        ClearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearButtonActionPerformed(evt);
            }
        });

        BackButton.setText("Back");
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });

        companyIDBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                companyIDBoxActionPerformed(evt);
            }
        });

        sectionIDBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sectionIDBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout MainPanelLayout = new javax.swing.GroupLayout(MainPanel);
        MainPanel.setLayout(MainPanelLayout);
        MainPanelLayout.setHorizontalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblsectionID)
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblType)
                            .addComponent(lblItemID)
                            .addComponent(lblItemName)
                            .addComponent(lblparCode)
                            .addComponent(lblcompanyID)
                            .addComponent(lblstorageMethod)
                            .addComponent(lblCost)
                            .addComponent(lblexpireDate)
                            .addComponent(lblquantity))
                        .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(MainPanelLayout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(MainPanelLayout.createSequentialGroup()
                                            .addComponent(yearExpireDateBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(monthExpireDateBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(dayExpireDateBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jScrollPane1)
                                        .addComponent(txtItemName, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                                        .addComponent(txtType, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                                        .addComponent(txtItemID)
                                        .addComponent(txtParCode)
                                        .addComponent(txtCost))
                                    .addGroup(MainPanelLayout.createSequentialGroup()
                                        .addComponent(companyIDBox, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(selectedCompany, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(MainPanelLayout.createSequentialGroup()
                                .addGap(61, 61, 61)
                                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(MainPanelLayout.createSequentialGroup()
                                        .addComponent(sectionIDBox, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(selectedSection, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ClearButton, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                    .addComponent(AddButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BackButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(54, 54, 54))
        );
        MainPanelLayout.setVerticalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(MainPanelLayout.createSequentialGroup()
                                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtItemID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblItemID))
                                .addGap(18, 18, 18)
                                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtItemName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblItemName))
                                .addGap(18, 18, 18)
                                .addComponent(txtParCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblparCode))
                        .addGap(43, 43, 43))
                    .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblcompanyID)
                        .addComponent(companyIDBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(selectedCompany, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblstorageMethod)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblType))
                .addGap(18, 18, 18)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addComponent(AddButton)
                        .addGap(90, 90, 90))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MainPanelLayout.createSequentialGroup()
                        .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCost))
                        .addGap(21, 21, 21)
                        .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(ClearButton)
                            .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblexpireDate)
                                .addComponent(yearExpireDateBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(monthExpireDateBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(dayExpireDateBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(31, 31, 31)))
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addComponent(BackButton)
                        .addGap(33, 33, 33))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MainPanelLayout.createSequentialGroup()
                        .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblquantity))
                        .addGap(18, 18, 18)))
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addComponent(lblsectionID)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MainPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 5, Short.MAX_VALUE)
                        .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sectionIDBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(selectedSection, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCostActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCostActionPerformed

    private void ClearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearButtonActionPerformed
      txtItemID.setText("");
      txtItemName.setText("");
      txtParCode.setText("");
      companyIDBox.setSelectedIndex(0);
      txtstorageMethod.setText("");
      txtType.setText("");
      txtCost.setText("");
      yearExpireDateBox.setSelectedIndex(-1);
      monthExpireDateBox.setSelectedIndex(-1);
      dayExpireDateBox.setSelectedIndex(-1);
      txtQuantity.setText("");
      sectionIDBox.setSelectedIndex(0);
      prestart();
    }//GEN-LAST:event_ClearButtonActionPerformed

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
       this.dispose();
    }//GEN-LAST:event_BackButtonActionPerformed

    private void AddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddButtonActionPerformed
    if (txtItemID.getText().toString().equals("")){
        JOptionPane.showMessageDialog(null, "Enter Items ID");
        return;
    }
    if (!Controller.validateIntegerNumber(txtItemID.getText().toString())){
        JOptionPane.showMessageDialog(null, "Not valid item ID");
        return;
    }
     if (txtItemName.getText().toString().equals("")){
        JOptionPane.showMessageDialog(null, "Enter Items Name");
        return;
    }
     if (!Controller.validateName(txtItemName.getText().toString())){
        JOptionPane.showMessageDialog(null, "Not valid item name");
        return;
    }
      if (txtParCode.getText().toString().equals("")){
        JOptionPane.showMessageDialog(null, "Enter Par Code");
        return;
    }
      if (!Controller.validateIntegerNumber(txtParCode.getText().toString())){
        JOptionPane.showMessageDialog(null, "Not valid par code");
        return;
    }
     
      
        if (txtType.getText().toString().equals("")){
        JOptionPane.showMessageDialog(null, "Enter Type of your item");
        return;
    }
        if (!Controller.validateName(txtType.getText().toString())){
        JOptionPane.showMessageDialog(null, "Not valid type");
        return;
    }
           if (txtCost.getText().toString().equals("")){
        JOptionPane.showMessageDialog(null, "Enter Items Cost");
        return;
    }
           if (!Controller.validateFractionNumber(txtCost.getText().toString())){
        JOptionPane.showMessageDialog(null, "Not valid item cost");
        return;
    }
            if (yearExpireDateBox.getSelectedItem().toString().equals("")){
        JOptionPane.showMessageDialog(null, "Select Year");
        return;
    }
             if (monthExpireDateBox.getSelectedItem().toString().equals("")){
        JOptionPane.showMessageDialog(null, "Select month");
        return;
    }
               if (dayExpireDateBox.getSelectedItem().toString().equals("")){
        JOptionPane.showMessageDialog(null, "Select day");
        return;
    }
                  if (txtQuantity.getText().toString().equals("")){
        JOptionPane.showMessageDialog(null, "Enter Items quantity");
        return;
    }
                  if (!Controller.validateIntegerNumber(txtQuantity.getText().toString())){
        JOptionPane.showMessageDialog(null, "Not valid item quantity");
        return;
    }
          
           
 try{
     Connection conn = ConnectDataBase.connect();
     PreparedStatement stmt = conn.prepareStatement("INSERT INTO `product`(`productID`, `parcode`, `productName`, `companyID`, `storageMethod`, `type`, `cost`, `expireDate`, `quantity`, `sectionID`) VALUES (?,?,?,?,?,?,?,?,?,?)");
     stmt.setString(1, txtItemID.getText());
     stmt.setString(2, txtParCode.getText());
     stmt.setString(3, txtItemName.getText());
     stmt.setString(4, companyIDBox.getSelectedItem().toString());
     stmt.setString(5, txtstorageMethod.getText());
     stmt.setString(6, txtType.getText());
     stmt.setString(7, txtCost.getText());
     stmt.setString(8, yearExpireDateBox.getSelectedItem().toString()+"-"+monthExpireDateBox.getSelectedItem().toString()+"-"+dayExpireDateBox.getSelectedItem().toString());
     stmt.setString(9, txtQuantity.getText());
    stmt.setString(10, sectionIDBox.getSelectedItem().toString());
     stmt.execute();
     JOptionPane.showMessageDialog(null, "1 row Inserted");
 }
 catch (Exception ex) {
                     JOptionPane.showMessageDialog(null, ex.getMessage());
                     }
    }//GEN-LAST:event_AddButtonActionPerformed

    private void txtItemIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtItemIDActionPerformed
       
    }//GEN-LAST:event_txtItemIDActionPerformed

    private void txtItemIDMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtItemIDMouseMoved
      
    }//GEN-LAST:event_txtItemIDMouseMoved

    private void companyIDBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_companyIDBoxActionPerformed
      try {
      Connection conn = ConnectDataBase.connect();
      PreparedStatement ps = conn.prepareStatement("select companyName from company where companyID = ?");
      ps.setString(1, companyIDBox.getSelectedItem().toString());
      ResultSet rs = ps.executeQuery();
      rs.next();
      selectedCompany.setText(rs.getString("companyName"));
      selectedCompany.setEditable(false);
      }
      catch (Exception ex) {
      JOptionPane.showMessageDialog(null, ex.getMessage());
      }
    }//GEN-LAST:event_companyIDBoxActionPerformed

    private void sectionIDBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sectionIDBoxActionPerformed
       try {
      Connection conn = ConnectDataBase.connect();
      PreparedStatement ps = conn.prepareStatement("select sectionName from section where sectionID = ?");
      ps.setString(1, sectionIDBox.getSelectedItem().toString());
      ResultSet rs = ps.executeQuery();
      rs.next();
      selectedSection.setText(rs.getString("sectionName"));
      selectedSection.setEditable(false);
      }
      catch (Exception ex) {
      JOptionPane.showMessageDialog(null, ex.getMessage());
      }
    }//GEN-LAST:event_sectionIDBoxActionPerformed

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
            java.util.logging.Logger.getLogger(AddingItems.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddingItems.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddingItems.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddingItems.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddingItems().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddButton;
    private javax.swing.JButton BackButton;
    private javax.swing.JButton ClearButton;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JComboBox companyIDBox;
    private javax.swing.JComboBox dayExpireDateBox;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCost;
    private javax.swing.JLabel lblItemID;
    private javax.swing.JLabel lblItemName;
    private javax.swing.JLabel lblType;
    private javax.swing.JLabel lblcompanyID;
    private javax.swing.JLabel lblexpireDate;
    private javax.swing.JLabel lblparCode;
    private javax.swing.JLabel lblquantity;
    private javax.swing.JLabel lblsectionID;
    private javax.swing.JLabel lblstorageMethod;
    private javax.swing.JComboBox monthExpireDateBox;
    private javax.swing.JComboBox sectionIDBox;
    private javax.swing.JTextField selectedCompany;
    private javax.swing.JTextField selectedSection;
    private javax.swing.JTextField txtCost;
    private javax.swing.JTextField txtItemID;
    private javax.swing.JTextField txtItemName;
    private javax.swing.JTextField txtParCode;
    private javax.swing.JTextField txtQuantity;
    private javax.swing.JTextField txtType;
    private javax.swing.JTextArea txtstorageMethod;
    private javax.swing.JComboBox yearExpireDateBox;
    // End of variables declaration//GEN-END:variables
}
