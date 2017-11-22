import javax.swing.JOptionPane;


public class dataentryform extends javax.swing.JFrame {

    /**
     * Creates new form dataentryform
     */
    public dataentryform() {
        initComponents();
    }
 private void Cmd_addbuttonActionPerformed(java.awt.event.ActionEvent evt) {                                              
      try {
          String sql = "Insert into EMPLOYEE_INFO (SSN,USERNAME,DOB,GENDER,EMAIL,JOBGROUP,SALARY,) VALUE(?,?,?,?,?,?,?)";
pst= conn.preparestatement(sql);
pst.setString();
pst.excute();
}
catch (Exception e)
      {JOptionPane.showMessageDialog(null ,e);
      }
      }
    } 
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
            java.util.logging.Logger.getLogger(dataentryform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dataentryform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dataentryform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dataentryform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new dataentryform().setVisible(true);
            }
        });
    }
