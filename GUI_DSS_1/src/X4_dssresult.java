/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author wulan
 */
public class X4_dssresult extends javax.swing.JFrame {

    /**
     * Creates new form X4_dssresult
     */
    public X4_dssresult() {
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

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jHome_X3 = new javax.swing.JButton();
        jHelp_X3 = new javax.swing.JButton();
        jContact_X3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jTable1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "No.", "Department", "Faculty", "Program", "Total Expense"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(150, 230, 650, 120);

        jHome_X3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/house-black-building-shape.png"))); // NOI18N
        jHome_X3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jHome_X3ActionPerformed(evt);
            }
        });
        jPanel1.add(jHome_X3);
        jHome_X3.setBounds(900, 10, 40, 25);

        jHelp_X3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jHelp_X3.setForeground(new java.awt.Color(255, 153, 0));
        jHelp_X3.setText("Help");
        jPanel1.add(jHelp_X3);
        jHelp_X3.setBounds(240, 10, 80, 23);

        jContact_X3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jContact_X3.setForeground(new java.awt.Color(255, 153, 0));
        jContact_X3.setText("Contact");
        jContact_X3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jContact_X3ActionPerformed(evt);
            }
        });
        jPanel1.add(jContact_X3);
        jContact_X3.setBounds(160, 10, 80, 23);

        jButton1.setText("Insight");
        jPanel1.add(jButton1);
        jButton1.setBounds(810, 280, 65, 23);

        jButton2.setText("Insight");
        jPanel1.add(jButton2);
        jButton2.setBounds(810, 250, 65, 23);

        jButton3.setText("Insight");
        jPanel1.add(jButton3);
        jButton3.setBounds(810, 340, 65, 23);

        jButton4.setText("Insight");
        jPanel1.add(jButton4);
        jButton4.setBounds(810, 310, 65, 23);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/img_dssresult1.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, -10, 960, 550);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 960, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 540, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jHome_X3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jHome_X3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jHome_X3ActionPerformed

    private void jContact_X3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jContact_X3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jContact_X3ActionPerformed

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
            java.util.logging.Logger.getLogger(X4_dssresult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(X4_dssresult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(X4_dssresult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(X4_dssresult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new X4_dssresult().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jContact_X3;
    private javax.swing.JButton jHelp_X3;
    private javax.swing.JButton jHome_X3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}