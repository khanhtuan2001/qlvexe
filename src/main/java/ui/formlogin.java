/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;
import helper.*;
import helper.datavailditor;
import dao.nguoidungdao;
import model.nguoidung;
/**
 *
 * @author ASUS
 */
public class formlogin extends javax.swing.JFrame {

private mainform main; 
    public formlogin() {
        initComponents();
        setLocationRelativeTo(null);
       // scaleImage();
        
    }

// private void scaleImage(){
//        ImageIcon icon = new ImageIcon("D:\\Do an\\Java\\mavenproject1\\src\\main\\java\\icon");
//        Image img = icon.getImage();
//        Image imgScale = img.getScaledInstance(jLabel3.getWidth(), jLabel3.getHeight(), Image.SCALE_SMOOTH);
//        ImageIcon scaledIcon = new ImageIcon(imgScale);
//        jLabel3.setIcon(scaledIcon);
//
//    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
      // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
      private void initComponents() {

            jPanel1 = new javax.swing.JPanel();
            lblTenDN = new javax.swing.JLabel();
            lblMk = new javax.swing.JLabel();
            txtusername = new javax.swing.JTextField();
            txtpassword = new javax.swing.JPasswordField();
            btndangnhap = new javax.swing.JButton();
            btnexit = new javax.swing.JButton();
            jLabel3 = new javax.swing.JLabel();
            jLabel4 = new javax.swing.JLabel();

            setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
            setBackground(new java.awt.Color(255, 255, 204));

            jPanel1.setBackground(new java.awt.Color(255, 255, 204));

            lblTenDN.setText("Tên đăng nhập");

            lblMk.setText("Mật khẩu");

            txtusername.setText("admin");

            txtpassword.setText("1");

            btndangnhap.setBackground(new java.awt.Color(204, 255, 204));
            btndangnhap.setText("Đăng nhập");
            btndangnhap.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        btndangnhapActionPerformed(evt);
                  }
            });

            btnexit.setBackground(new java.awt.Color(204, 255, 204));
            btnexit.setText("Thoát");
            btnexit.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        btnexitActionPerformed(evt);
                  }
            });

            jLabel3.setBackground(new java.awt.Color(255, 255, 204));
            jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/iconligon.png"))); // NOI18N

            jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
            jLabel4.setText("ĐĂNG NHẬP");

            javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
            jPanel1.setLayout(jPanel1Layout);
            jPanel1Layout.setHorizontalGroup(
                  jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                          .addComponent(lblTenDN)
                                          .addComponent(lblMk))
                                    .addGap(38, 38, 38)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                          .addComponent(txtpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                                          .addComponent(txtusername, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                                          .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(btndangnhap)
                                                .addGap(98, 98, 98)
                                                .addComponent(btnexit))))
                              .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(167, 167, 167)
                                    .addComponent(jLabel4)))
                        .addContainerGap(63, Short.MAX_VALUE))
            );
            jPanel1Layout.setVerticalGroup(
                  jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel4)
                        .addGap(41, 41, 41)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                              .addComponent(lblTenDN)
                              .addComponent(txtusername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                              .addComponent(lblMk)
                              .addComponent(txtpassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                              .addComponent(btndangnhap)
                              .addComponent(btnexit))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                  .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(61, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26))
            );

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                  layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            );
            layout.setVerticalGroup(
                  layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            );

            pack();
      }// </editor-fold>//GEN-END:initComponents

    private void btnexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnexitActionPerformed

    private void btndangnhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndangnhapActionPerformed
        StringBuilder sb = new StringBuilder();
        datavailditor.validataEmty( txtpassword,sb, "password ko dc de trong");
        datavailditor.validataEmty( txtusername, sb,"ten dang nhap ko duoc de trong");
        if (sb.length() > 0) {
            messagedialoghelper.showErorDialog(this, sb.toString(), "loi");
            return;
        }
        nguoidungdao dao = new nguoidungdao();
        try {
            nguoidung nv = dao.checklogin(txtusername.getText(), new String(txtpassword.getPassword()));
            if (nv == null) {
                messagedialoghelper.showErorDialog(this, "ten dang nhap sai hay mat khau sai", "loi");
            } else {
               // this.dispose();
                 messagedialoghelper.showMessageDialog(this, "đăng nhập thành công", "thông báo");
                 ShareData.nguoidangnhap = nv;
                 
                  if (ShareData.nguoidangnhap.getVaitro().equals("admin")) {
                        mainform datve = new mainform();
                        datve.setVisible(true);
                        this.dispose();
                  } else {

                        formdatve form = new formdatve();
                        form.setVisible(true);
                        this.dispose();
                 }
        }
        
      
        
            
        } catch (Exception e) {
            e.printStackTrace();
            messagedialoghelper.showErorDialog(this, e.getMessage(), "loi");
        }


    }//GEN-LAST:event_btndangnhapActionPerformed

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
            java.util.logging.Logger.getLogger(formlogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formlogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formlogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formlogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new formlogin().setVisible(true);
        });
    }

      // Variables declaration - do not modify//GEN-BEGIN:variables
      private javax.swing.JButton btndangnhap;
      private javax.swing.JButton btnexit;
      private javax.swing.JLabel jLabel3;
      private javax.swing.JLabel jLabel4;
      private javax.swing.JPanel jPanel1;
      private javax.swing.JLabel lblMk;
      private javax.swing.JLabel lblTenDN;
      private javax.swing.JPasswordField txtpassword;
      private javax.swing.JTextField txtusername;
      // End of variables declaration//GEN-END:variables
}
