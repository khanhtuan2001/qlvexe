/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import com.mycompany.mavenproject1.NewJFrame;
import dao.nhanviendao;
import helper.databasehelper;
import helper.datavailditor;
import helper.messagedialoghelper;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import javax.print.DocFlavor;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.comboboxnhanvien;
import model.nhanvien;

/**
 *
 * @author ASUS
 */
public class quanlynhanvienpanel extends javax.swing.JPanel {

    private mainform parentform;
    private DefaultTableModel tblmodel;

    public quanlynhanvienpanel() {
        initComponents();
        inittable();
        LoadDataToTable();
       initcombobox();
    }

    private void inittable() {
        tblmodel = new DefaultTableModel();
        tblmodel.setColumnIdentifiers(new String[]{"ma nhan vien","ho ten","sdt","ngay sinh","phan quyen"});
        tblnhanvien.setModel(tblmodel);
    }
    private void initcombobox() {
//      quanlynhanvienpanel mq = new quanlynhanvienpanel();
//      HashMap<String,String> map = mq.init();
//      for(String s : map.keySet()){
//           cbChucVu.addItem(s);
//}


        String sql = " select distinct PhanQuyen from NhanVien ";

        try {
            Connection con = databasehelper.openConnection();
            PreparedStatement pstmt = con.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            cbChucVu.removeAllItems();
            while (rs.next()) {
                cbChucVu.addItem(rs.getString("PhanQuyen"));
               

            }
            rs.close();
            pstmt.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
            messagedialoghelper.showErorDialog(parentform, e.getMessage(), "loi");
        }
    }

    private void LoadDataToTable() {
        try {
            nhanviendao dao = new nhanviendao();
            List<nhanvien> list = dao.findAll();
            tblmodel.setRowCount(0);
            for (nhanvien it : list) {
                tblmodel.addRow(new Object[]{
                    it.getMaNV(), it.getTenNV(),it.getSDT(), it.getNgaysinh(),  it.getPhanQuyenString()
                });

            }
            tblmodel.fireTableDataChanged();

        } catch (Exception e) {
            e.printStackTrace();
            messagedialoghelper.showErorDialog(parentform, e.getMessage(), "loi");
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

            buttonGroup1 = new javax.swing.ButtonGroup();
            jLabel1 = new javax.swing.JLabel();
            jSeparator1 = new javax.swing.JSeparator();
            jLabel2 = new javax.swing.JLabel();
            jLabel3 = new javax.swing.JLabel();
            jLabel4 = new javax.swing.JLabel();
            jLabel5 = new javax.swing.JLabel();
            txtMaNV = new javax.swing.JTextField();
            txtTen = new javax.swing.JTextField();
            txtSDT = new javax.swing.JTextField();
            jLabel7 = new javax.swing.JLabel();
            btndelete = new javax.swing.JButton();
            btnupdate = new javax.swing.JButton();
            btnnew = new javax.swing.JButton();
            btnsave = new javax.swing.JButton();
            jSeparator2 = new javax.swing.JSeparator();
            jScrollPane2 = new javax.swing.JScrollPane();
            tblnhanvien = new javax.swing.JTable();
            txtTImKiem = new javax.swing.JTextField();
            btnTimKiem = new javax.swing.JButton();
            txtNgaySinh = new javax.swing.JTextField();
            cbChucVu = new javax.swing.JComboBox<>();

            setBackground(new java.awt.Color(255, 255, 204));

            jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
            jLabel1.setText("Quản lý nhân viên");

            jLabel2.setText("Mã sinh viên");

            jLabel3.setText("họ tên");

            jLabel4.setText("ngày sinh");

            jLabel5.setText("số điện thoại");

            txtMaNV.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
            txtMaNV.setEnabled(false);

            txtTen.addMouseListener(new java.awt.event.MouseAdapter() {
                  public void mouseClicked(java.awt.event.MouseEvent evt) {
                        txtTenMouseClicked(evt);
                  }
                  public void mouseEntered(java.awt.event.MouseEvent evt) {
                        txtTenMouseEntered(evt);
                  }
            });

            jLabel7.setText("phân quyền");

            btndelete.setBackground(new java.awt.Color(204, 255, 204));
            btndelete.setText("xoá");
            btndelete.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        btndeleteActionPerformed(evt);
                  }
            });

            btnupdate.setBackground(new java.awt.Color(204, 255, 204));
            btnupdate.setText("cập nhật");
            btnupdate.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        btnupdateActionPerformed(evt);
                  }
            });

            btnnew.setBackground(new java.awt.Color(204, 255, 204));
            btnnew.setText("tạo mới");
            btnnew.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        btnnewActionPerformed(evt);
                  }
            });

            btnsave.setBackground(new java.awt.Color(204, 255, 204));
            btnsave.setText("lưu");
            btnsave.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        btnsaveActionPerformed(evt);
                  }
            });

            tblnhanvien.setBackground(new java.awt.Color(255, 255, 204));
            tblnhanvien.setForeground(new java.awt.Color(102, 0, 102));
            tblnhanvien.setModel(new javax.swing.table.DefaultTableModel(
                  new Object [][] {
                        {null, null, null, null, null},
                        {null, null, null, null, null},
                        {null, null, null, null, null},
                        {null, null, null, null, null}
                  },
                  new String [] {
                        "Mã nhân viên", "Tên nhân viên", "Sdt", "Ngày sinh", "phân quyền"
                  }
            ));
            tblnhanvien.addMouseListener(new java.awt.event.MouseAdapter() {
                  public void mouseClicked(java.awt.event.MouseEvent evt) {
                        tblnhanvienMouseClicked(evt);
                  }
            });
            jScrollPane2.setViewportView(tblnhanvien);

            btnTimKiem.setBackground(new java.awt.Color(204, 255, 204));
            btnTimKiem.setText("tìm kiếm");
            btnTimKiem.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        btnTimKiemActionPerformed(evt);
                  }
            });

            cbChucVu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin" }));
            cbChucVu.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        cbChucVuActionPerformed(evt);
                  }
            });

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
            this.setLayout(layout);
            layout.setHorizontalGroup(
                  layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addComponent(jSeparator2)
                              .addComponent(jSeparator1)
                              .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                          .addComponent(jLabel1)
                                          .addComponent(jLabel2)
                                          .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel4)
                                                .addGap(74, 74, 74)
                                                .addComponent(txtNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                                          .addGroup(layout.createSequentialGroup()
                                                .addComponent(btnnew)
                                                .addGap(18, 18, 18)
                                                .addComponent(btnsave, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(22, 22, 22)
                                                .addComponent(btnupdate)
                                                .addGap(18, 18, 18)
                                                .addComponent(btndelete, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                                          .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                      .addGroup(layout.createSequentialGroup()
                                                            .addGap(3, 3, 3)
                                                            .addComponent(jLabel7))
                                                      .addComponent(jLabel3)
                                                      .addComponent(jLabel5))
                                                .addGap(55, 55, 55)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                      .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                      .addGroup(layout.createSequentialGroup()
                                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                  .addComponent(txtMaNV)
                                                                  .addComponent(txtTen)
                                                                  .addComponent(cbChucVu, 0, 189, Short.MAX_VALUE))
                                                            .addGap(10, 10, 10)
                                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                  .addGroup(layout.createSequentialGroup()
                                                                        .addGap(42, 42, 42)
                                                                        .addComponent(btnTimKiem)
                                                                        .addGap(45, 45, 45)
                                                                        .addComponent(txtTImKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                  .addGroup(layout.createSequentialGroup()
                                                                        .addGap(18, 18, 18)
                                                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 609, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                                    .addGap(0, 0, Short.MAX_VALUE))))
            );
            layout.setVerticalGroup(
                  layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                          .addComponent(jLabel2)
                                          .addComponent(txtMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(12, 12, 12)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                          .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                          .addComponent(jLabel3))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                          .addComponent(jLabel4)
                                          .addComponent(txtNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(10, 10, 10)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                          .addComponent(jLabel5)
                                          .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                          .addComponent(jLabel7)
                                          .addComponent(cbChucVu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                              .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                              .addComponent(btnTimKiem)
                              .addComponent(txtTImKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(76, 76, 76)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                              .addComponent(btnnew)
                              .addComponent(btndelete)
                              .addComponent(btnupdate)
                              .addComponent(btnsave))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
            );
      }// </editor-fold>//GEN-END:initComponents

    private void btnnewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnewActionPerformed
        txtMaNV.setText("");
        txtSDT.setText("");
        txtTen.setText("");
        txtNgaySinh.setText("");
         LoadDataToTable();

    }//GEN-LAST:event_btnnewActionPerformed

    private void btnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveActionPerformed
        StringBuilder sb = new StringBuilder();
        //datavailditor.validataEmty(txtMaNV, sb, "ma nhan vien khong duoc trong");
        datavailditor.validataEmty(txtTen, sb, "ten nhan vien khong duoc trong");
        datavailditor.validataEmty(txtNgaySinh, sb, "ngay sinh khong duoc trong");
        datavailditor.validataEmty(txtSDT, sb, "so dien thoai khong duoc trong");
        if (sb.length() > 0) {
            messagedialoghelper.showErorDialog(parentform, sb.toString(), "loi > 0");
            return;
        }

        try {
            nhanvien sv = new nhanvien();
           // sv.setMaNV(txtMaNV.getText());
            sv.setTenNV(txtTen.getText());
            sv.setSDT(txtSDT.getText());
            sv.setNgaysinh(Date.valueOf((txtNgaySinh.getText())));
            sv.setPhanQuyenString(cbChucVu.getSelectedItem().toString());
            nhanviendao dao = new nhanviendao();
            if (dao.insert(sv)) {
                messagedialoghelper.showMessageDialog(parentform, "nhan vien da duoc luu", "thong bao");
                LoadDataToTable();
            } else {
                messagedialoghelper.showConfirmDialog(parentform, "nhan vien khong duoc luu do loi", "canh bao");

            }

        } catch (Exception e) {
            e.printStackTrace();
            messagedialoghelper.showErorDialog(parentform, e.getMessage(), "loi them");
        }
    }//GEN-LAST:event_btnsaveActionPerformed

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed

        StringBuilder sb = new StringBuilder();
        datavailditor.validataEmty(txtMaNV, sb, "ma nhan vien khong duoc trong");
        datavailditor.validataEmty(txtTen, sb, "ten nhan vien khong duoc trong");
        datavailditor.validataEmty(txtNgaySinh, sb, "ngay sinh khong duoc trong");
        datavailditor.validataEmty(txtSDT, sb, "so dien thoai khong duoc trong");
        if (sb.length() > 0) {
            messagedialoghelper.showErorDialog(parentform, sb.toString(), "loi > 0");
            return;
        }
        if (messagedialoghelper.showConfirmDialog(parentform, "ban co muon cap nhat ", "hoi") == JOptionPane.NO_OPTION) {
            return;
        }

        try {
            nhanvien sv = new nhanvien();
            sv.setMaNV(Integer.valueOf(txtMaNV.getText()));
            sv.setTenNV(txtTen.getText());
            sv.setSDT(txtSDT.getText());
            sv.setNgaysinh(Date.valueOf((txtNgaySinh.getText())));
            sv.setPhanQuyenString(cbChucVu.getSelectedItem().toString());
            nhanviendao dao = new nhanviendao();
            if (dao.update(sv)) {
                messagedialoghelper.showMessageDialog(parentform, "nhan vien da duoc cap nhat", "thong bao");
             LoadDataToTable();
            } else {
                messagedialoghelper.showConfirmDialog(parentform, "nhan vien khong duoc cap nhat do loi", "canh bao");

            }

        } catch (Exception e) {
            e.printStackTrace();
            messagedialoghelper.showErorDialog(parentform, e.getMessage(), "loi them");
        }
    }//GEN-LAST:event_btnupdateActionPerformed

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
        StringBuilder sb = new StringBuilder();
        datavailditor.validataEmty(txtMaNV, sb, "ma nhan vien khong duoc trong");

        if (sb.length() > 0) {
            messagedialoghelper.showErorDialog(parentform, sb.toString(), "loi > 0");
            return;
        }
        if (messagedialoghelper.showConfirmDialog(parentform, "ban co muon xoa ", "hoi") == JOptionPane.NO_OPTION) {
            return;
        }

        try {

            nhanviendao dao = new nhanviendao();
            if (dao.delete(txtMaNV.getText())) {
                messagedialoghelper.showMessageDialog(parentform, "nhan vien da duoc xoa", "thong bao");

                btnnewActionPerformed(evt);
             LoadDataToTable();
            } else {
                messagedialoghelper.showConfirmDialog(parentform, "nhan vien khong duoc xoa do loi", "canh bao");

            }

        } catch (Exception e) {
            e.printStackTrace();
            messagedialoghelper.showErorDialog(parentform, e.getMessage(), "loi them");
        }
    }//GEN-LAST:event_btndeleteActionPerformed

    private void tblnhanvienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblnhanvienMouseClicked
        try {
            int row = tblnhanvien.getSelectedRow();
            if (row >= 0) {
                int id =  (int) tblnhanvien.getValueAt(row, 0);
                nhanviendao dao = new nhanviendao();
                nhanvien nv = dao.find(id);
                if (nv != null) {

                    txtMaNV.setText(String.valueOf(nv.getMaNV()));
                    txtTen.setText(nv.getTenNV());
                    txtSDT.setText(nv.getSDT());
                    txtNgaySinh.setText(nv.getNgaysinh().toLocalDate().toString());
                    cbChucVu.setSelectedItem(nv.getPhanQuyenString());

                }

            }
        } catch (Exception e) {
            e.printStackTrace();
            messagedialoghelper.showErorDialog(parentform, e.getMessage(), "loi them");
        }


    }//GEN-LAST:event_tblnhanvienMouseClicked
 public
              boolean isStringInt(String s) {
            try {
                  Integer.parseInt(s);
                  return true;
            } catch (NumberFormatException ex) {
                  return false;
            }
      }
    private void btnTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemActionPerformed
 if (txtTImKiem.getText().equals("")) {
                messagedialoghelper.showMessageDialog(parentform , "Nhập ký tự tìm kiếm" , "thông báo");
                return;
          }
          try {
                nhanviendao dao = new nhanviendao();
                if (!isStringInt(txtTImKiem.getText())) {
                      List<nhanvien> listname = dao.findtableten(txtTImKiem.getText());

                      tblmodel.setRowCount(0);
                      for (nhanvien it : listname) {
                            tblmodel.addRow(new Object[]{
                                  it.getMaNV() , it.getTenNV() , it.getSDT() , it.getNgaysinh() , it.getPhanQuyenString()
                            });
                      }
                      tblmodel.fireTableDataChanged();

                } else {
                      List<nhanvien> list = dao.findtable(Integer.valueOf(txtTImKiem.getText()));
                      tblmodel.setRowCount(0);
                      for (nhanvien it : list) {
                            tblmodel.addRow(new Object[]{
                                  it.getMaNV() , it.getTenNV() , it.getSDT() , it.getNgaysinh() , it.getPhanQuyenString()
                            });
                      }
                      tblmodel.fireTableDataChanged();
                }

          } catch (Exception e) {
                e.printStackTrace();
                messagedialoghelper.showErorDialog(parentform , e.getMessage() , "lỗi");
          }

    }//GEN-LAST:event_btnTimKiemActionPerformed

    private void txtTenMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTenMouseEntered
//       // String emp =  + "";
//        int lenNum = 4;
//        int lenZero = lenNum - emp.length();
//
//        for (int i = 0; i < lenZero; i++) {
//            emp = "0" + emp;
//        }
//
//        emp = "EMP" + emp;


   
    }//GEN-LAST:event_txtTenMouseEntered

    private void txtTenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTenMouseClicked
          
//       int i=1;
//          String sql = " select COUNT(MaNV)+1 as sl "
//           + " from NhanVien ";
//
//        try {
//            Connection con = databasehelper.openConnection();
//            PreparedStatement pstmt = con.prepareStatement(sql);
//            ResultSet rs = pstmt.executeQuery();
//            txtMaNV.removeAll();
//            String a = "sl";
//            int b = Integer.parseInt(a);
//            
//            for (int j = b; j < 1000; j++) {
//                while (rs.next()) {
//                
//                txtMaNV.setText( "NV"+rs.getString(a));
//
//            }
//            }
//            rs.close();
//            pstmt.close();
//            con.close();
//        } catch (Exception e) {
//            e.printStackTrace();
//            messagedialoghelper.showErorDialog(parentform, e.getMessage(), "loi");
//        }
    }//GEN-LAST:event_txtTenMouseClicked

      private void cbChucVuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbChucVuActionPerformed
            
//            try {
//            String ab = (String) cbChucVu.getSelectedItem();
//            txtcb.setText(ab);
//            nhanviendao dao = new nhanviendao();
//            nhanvien nv = dao.findcb(txtcb.getText());
//            if (nv != null) {
//                txtma.setText(String.valueOf(nv.getMaNV()));
//               
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//            messagedialoghelper.showErorDialog(parentform, e.getMessage(), "loi khong tim thấy");
//        }
      }//GEN-LAST:event_cbChucVuActionPerformed


      // Variables declaration - do not modify//GEN-BEGIN:variables
      private javax.swing.JButton btnTimKiem;
      private javax.swing.JButton btndelete;
      private javax.swing.JButton btnnew;
      private javax.swing.JButton btnsave;
      private javax.swing.JButton btnupdate;
      private javax.swing.ButtonGroup buttonGroup1;
      private javax.swing.JComboBox<String> cbChucVu;
      private javax.swing.JLabel jLabel1;
      private javax.swing.JLabel jLabel2;
      private javax.swing.JLabel jLabel3;
      private javax.swing.JLabel jLabel4;
      private javax.swing.JLabel jLabel5;
      private javax.swing.JLabel jLabel7;
      private javax.swing.JScrollPane jScrollPane2;
      private javax.swing.JSeparator jSeparator1;
      private javax.swing.JSeparator jSeparator2;
      private javax.swing.JTable tblnhanvien;
      private javax.swing.JTextField txtMaNV;
      private javax.swing.JTextField txtNgaySinh;
      private javax.swing.JTextField txtSDT;
      private javax.swing.JTextField txtTImKiem;
      private javax.swing.JTextField txtTen;
      // End of variables declaration//GEN-END:variables
}
