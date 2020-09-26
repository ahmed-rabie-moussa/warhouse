/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package warehouse;

import javax.swing.JOptionPane;

/**
 *
 * @author gerko
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();
        addCompanyLabel.setVisible(false);
        addItemLabel.setVisible(false);
        searchCompanyLabel.setVisible(false);
        searchItemLabel.setVisible(false);
        updateCompanyLabel.setVisible(false);
        updateItemLabel.setVisible(false);
        removeCompanyLabel.setVisible(false);
        removeItemLabel.setVisible(false);
        selectCompanyLabel.setVisible(false);
        selectItemLabel.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        title = new javax.swing.JLabel();
        companyLabel = new javax.swing.JLabel();
        itemLabel = new javax.swing.JLabel();
        aboutLabel = new javax.swing.JLabel();
        exitLabel = new javax.swing.JLabel();
        addCompanyLabel = new javax.swing.JLabel();
        selectCompanyLabel = new javax.swing.JLabel();
        searchItemLabel = new javax.swing.JLabel();
        searchCompanyLabel = new javax.swing.JLabel();
        updateCompanyLabel = new javax.swing.JLabel();
        removeCompanyLabel = new javax.swing.JLabel();
        addItemLabel = new javax.swing.JLabel();
        selectItemLabel = new javax.swing.JLabel();
        updateItemLabel = new javax.swing.JLabel();
        removeItemLabel = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Warehouse Management System ");
        setPreferredSize(new java.awt.Dimension(1500, 950));
        setResizable(false);
        setSize(new java.awt.Dimension(1500, 1000));
        getContentPane().setLayout(null);

        title.setFont(new java.awt.Font("Comic Sans MS", 1, 48)); // NOI18N
        title.setForeground(new java.awt.Color(0, 0, 204));
        title.setText("Warehouse Managemet System");
        getContentPane().add(title);
        title.setBounds(340, 10, 910, 100);

        companyLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/flats.png"))); // NOI18N
        companyLabel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                companyLabelMouseMoved(evt);
            }
        });
        getContentPane().add(companyLabel);
        companyLabel.setBounds(10, 60, 160, 210);

        itemLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/packing-2.png"))); // NOI18N
        itemLabel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                itemLabelMouseMoved(evt);
            }
        });
        getContentPane().add(itemLabel);
        itemLabel.setBounds(10, 270, 150, 180);

        aboutLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/customer-service-1.png"))); // NOI18N
        aboutLabel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                aboutLabelMouseMoved(evt);
            }
        });
        aboutLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                aboutLabelMouseClicked(evt);
            }
        });
        getContentPane().add(aboutLabel);
        aboutLabel.setBounds(10, 450, 150, 180);

        exitLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/change-power-options.png"))); // NOI18N
        exitLabel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                exitLabelMouseMoved(evt);
            }
        });
        exitLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitLabelMouseClicked(evt);
            }
        });
        getContentPane().add(exitLabel);
        exitLabel.setBounds(10, 640, 150, 180);

        addCompanyLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/school-material.png"))); // NOI18N
        addCompanyLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addCompanyLabelMouseClicked(evt);
            }
        });
        getContentPane().add(addCompanyLabel);
        addCompanyLabel.setBounds(510, 120, 150, 190);

        selectCompanyLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/push-pin.png"))); // NOI18N
        selectCompanyLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                selectCompanyLabelMouseClicked(evt);
            }
        });
        getContentPane().add(selectCompanyLabel);
        selectCompanyLabel.setBounds(940, 130, 150, 170);

        searchItemLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/archive.png"))); // NOI18N
        searchItemLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchItemLabelMouseClicked(evt);
            }
        });
        getContentPane().add(searchItemLabel);
        searchItemLabel.setBounds(730, 320, 150, 170);

        searchCompanyLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/growth.png"))); // NOI18N
        searchCompanyLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchCompanyLabelMouseClicked(evt);
            }
        });
        getContentPane().add(searchCompanyLabel);
        searchCompanyLabel.setBounds(730, 320, 150, 170);

        updateCompanyLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/writer.png"))); // NOI18N
        updateCompanyLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateCompanyLabelMouseClicked(evt);
            }
        });
        getContentPane().add(updateCompanyLabel);
        updateCompanyLabel.setBounds(510, 510, 150, 170);

        removeCompanyLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/eraser.png"))); // NOI18N
        removeCompanyLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                removeCompanyLabelMouseClicked(evt);
            }
        });
        getContentPane().add(removeCompanyLabel);
        removeCompanyLabel.setBounds(940, 510, 150, 170);

        addItemLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/trucking.png"))); // NOI18N
        addItemLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addItemLabelMouseClicked(evt);
            }
        });
        getContentPane().add(addItemLabel);
        addItemLabel.setBounds(730, 130, 150, 170);

        selectItemLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/attachments.png"))); // NOI18N
        selectItemLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                selectItemLabelMouseClicked(evt);
            }
        });
        getContentPane().add(selectItemLabel);
        selectItemLabel.setBounds(510, 320, 150, 170);

        updateItemLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/cloud-backup-up-arrow.png"))); // NOI18N
        updateItemLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateItemLabelMouseClicked(evt);
            }
        });
        getContentPane().add(updateItemLabel);
        updateItemLabel.setBounds(940, 320, 150, 170);

        removeItemLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/rubbish-bin-delete-button.png"))); // NOI18N
        removeItemLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                removeItemLabelMouseClicked(evt);
            }
        });
        getContentPane().add(removeItemLabel);
        removeItemLabel.setBounds(730, 510, 150, 170);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/wallpaper/inkinwater8.jpg"))); // NOI18N
        background.setMaximumSize(new java.awt.Dimension(1500, 1000));
        background.setMinimumSize(new java.awt.Dimension(1500, 1000));
        background.setPreferredSize(new java.awt.Dimension(1500, 1000));
        getContentPane().add(background);
        background.setBounds(0, 0, 1680, 920);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void companyLabelMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_companyLabelMouseMoved
       addCompanyLabel.setVisible(true);
        addItemLabel.setVisible(false);
        searchCompanyLabel.setVisible(true);
        searchItemLabel.setVisible(false);
        updateCompanyLabel.setVisible(true);
        updateItemLabel.setVisible(false);
        removeCompanyLabel.setVisible(true);
        removeItemLabel.setVisible(false);
        selectCompanyLabel.setVisible(true);
        selectItemLabel.setVisible(false);
    }//GEN-LAST:event_companyLabelMouseMoved

    private void itemLabelMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemLabelMouseMoved
        addCompanyLabel.setVisible(false);
        addItemLabel.setVisible(true);
        searchCompanyLabel.setVisible(false);
        searchItemLabel.setVisible(true);
        updateCompanyLabel.setVisible(false);
        updateItemLabel.setVisible(true);
        removeCompanyLabel.setVisible(false);
        removeItemLabel.setVisible(true);
        selectCompanyLabel.setVisible(false);
        selectItemLabel.setVisible(true);
    }//GEN-LAST:event_itemLabelMouseMoved

    private void aboutLabelMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aboutLabelMouseMoved
     addCompanyLabel.setVisible(false);
        addItemLabel.setVisible(false);
        searchCompanyLabel.setVisible(false);
        searchItemLabel.setVisible(false);
        updateCompanyLabel.setVisible(false);
        updateItemLabel.setVisible(false);
        removeCompanyLabel.setVisible(false);
        removeItemLabel.setVisible(false);
        selectCompanyLabel.setVisible(false);
        selectItemLabel.setVisible(false);
    }//GEN-LAST:event_aboutLabelMouseMoved

    private void exitLabelMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitLabelMouseMoved
     addCompanyLabel.setVisible(false);
        addItemLabel.setVisible(false);
        searchCompanyLabel.setVisible(false);
        searchItemLabel.setVisible(false);
        updateCompanyLabel.setVisible(false);
        updateItemLabel.setVisible(false);
        removeCompanyLabel.setVisible(false);
        removeItemLabel.setVisible(false);
        selectCompanyLabel.setVisible(false);
        selectItemLabel.setVisible(false);
    }//GEN-LAST:event_exitLabelMouseMoved

    private void addCompanyLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addCompanyLabelMouseClicked
      AddingCompany ac = new AddingCompany();
      ac.setVisible(true);
      ac.setLocationRelativeTo(null);
    }//GEN-LAST:event_addCompanyLabelMouseClicked

    private void addItemLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addItemLabelMouseClicked
    AddingItems ai = new AddingItems();
    ai.setVisible(true);
      ai.setLocationRelativeTo(null);
    }//GEN-LAST:event_addItemLabelMouseClicked

    private void selectCompanyLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_selectCompanyLabelMouseClicked
        SelectCompany sc = new SelectCompany();
        sc.setVisible(true);
      sc.setLocationRelativeTo(null);
    }//GEN-LAST:event_selectCompanyLabelMouseClicked

    private void selectItemLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_selectItemLabelMouseClicked
     SelectItem si = new SelectItem();
     si.setVisible(true);
      si.setLocationRelativeTo(null);
    }//GEN-LAST:event_selectItemLabelMouseClicked

    private void searchItemLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchItemLabelMouseClicked
     SearchItem si = new SearchItem();
     si.setVisible(true);
      si.setLocationRelativeTo(null);
    }//GEN-LAST:event_searchItemLabelMouseClicked

    private void searchCompanyLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchCompanyLabelMouseClicked
     SearchCompany sc = new SearchCompany();
     sc.setVisible(true);
      sc.setLocationRelativeTo(null);
    }//GEN-LAST:event_searchCompanyLabelMouseClicked

    private void updateItemLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateItemLabelMouseClicked
      UpdateItem ui = new UpdateItem();
      ui.setVisible(true);
      ui.setLocationRelativeTo(null);
    }//GEN-LAST:event_updateItemLabelMouseClicked

    private void updateCompanyLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateCompanyLabelMouseClicked
      UpdateCompany uc = new UpdateCompany();
      uc.setVisible(true);
      uc.setLocationRelativeTo(null);
    }//GEN-LAST:event_updateCompanyLabelMouseClicked

    private void removeItemLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_removeItemLabelMouseClicked
      DeleteItem di = new DeleteItem();
      di.setVisible(true);
      di.setLocationRelativeTo(null);
    }//GEN-LAST:event_removeItemLabelMouseClicked

    private void removeCompanyLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_removeCompanyLabelMouseClicked
       RemoveCompany rc = new RemoveCompany();
       rc.setVisible(true);
       rc.setLocationRelativeTo(null);
    }//GEN-LAST:event_removeCompanyLabelMouseClicked

    private void exitLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitLabelMouseClicked
       System.exit(0);
    }//GEN-LAST:event_exitLabelMouseClicked

    private void aboutLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aboutLabelMouseClicked
    JOptionPane.showMessageDialog(null, "\t Warehouse Management System \n       Created by :\n 1- Ahmed R.Moussa\n 2- Abdo M.Ghareeb\n 3- Mostafa Elnawasany\n 4- Ibraheem Khalifa\n 5- Riham Zakzouk \n 6- Yara Amin\n ","About our project" , JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_aboutLabelMouseClicked

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel aboutLabel;
    private javax.swing.JLabel addCompanyLabel;
    private javax.swing.JLabel addItemLabel;
    private javax.swing.JLabel background;
    private javax.swing.JLabel companyLabel;
    private javax.swing.JLabel exitLabel;
    private javax.swing.JLabel itemLabel;
    private javax.swing.JLabel removeCompanyLabel;
    private javax.swing.JLabel removeItemLabel;
    private javax.swing.JLabel searchCompanyLabel;
    private javax.swing.JLabel searchItemLabel;
    private javax.swing.JLabel selectCompanyLabel;
    private javax.swing.JLabel selectItemLabel;
    private javax.swing.JLabel title;
    private javax.swing.JLabel updateCompanyLabel;
    private javax.swing.JLabel updateItemLabel;
    // End of variables declaration//GEN-END:variables
}
