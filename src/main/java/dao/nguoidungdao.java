/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import helper.databasehelper;
import helper.messagedialoghelper;
import java.sql.Connection;
import model.nguoidung;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author ASUS
 */
public class nguoidungdao {
    public nguoidung checklogin(String tendangnhap,String password)
            throws Exception {
        String sql = "SELECT MaNV,TenNV,Sdt,PhanQuyen FROM NhanVien "
                + " where TenNV = ? and Sdt = ?";
        try (
                Connection con = databasehelper.openConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);)
             {
            pstmt.setString(1, tendangnhap);
            pstmt.setString(2, password);
            try (ResultSet rs = pstmt.executeQuery();) {
                if (rs.next()) {
                    nguoidung nv = new nguoidung();
                    nv.setTendangnhap(tendangnhap);
                    nv.setMatkhau("password");
                    nv.setVaitro(rs.getString("PhanQuyen"));
                    nv.setManv(rs.getInt("MaNV"));
                    return nv;
                }
            }
        }
        return null;
    }

}
