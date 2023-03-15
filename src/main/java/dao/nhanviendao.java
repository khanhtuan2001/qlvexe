/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import helper.databasehelper;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import model.nguoidung;
import model.nhanvien;

/**
 *
 * @author ASUS
 */
public class nhanviendao {

    public boolean insert(nhanvien sv)
            throws Exception {
        String sql = "INSERT INTO [dbo].[NhanVien]"
                + "           ([TenNV]"
                + "           ,[Sdt]"
                + "           ,[NgaySinh]"
                + "           ,[PhanQuyen])"
                + "     VALUES(?,?,?,?)";
        try (
                Connection con = databasehelper.openConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);) {
            //pstmt.setInt(1, sv.getMaNV());
            pstmt.setString(1, sv.getTenNV());
            pstmt.setString(2, sv.getSDT());
            pstmt.setDate(3, sv.getNgaysinh());
            pstmt.setString(4, sv.getPhanQuyenString());

            return pstmt.executeUpdate() > 0;
        }

    }

    public boolean update(nhanvien sv)
            throws Exception {
        String sql = "UPDATE [dbo].[NhanVien]"
                + "   SET [TenNV] = ?"
                + "      ,[Sdt] = ?"
                + "      ,[NgaySinh] = ?"
                + "      ,[PhanQuyen] = ?"
                + "  Where [MaNV] = ?";
        try (
                Connection con = databasehelper.openConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);) {
            pstmt.setInt(5, sv.getMaNV());
            pstmt.setString(1, sv.getTenNV());
            pstmt.setString(2, sv.getSDT());
            pstmt.setDate(3, sv.getNgaysinh());
            pstmt.setString(4, sv.getPhanQuyenString());

            return pstmt.executeUpdate() > 0;
        }

    }
    public boolean delete(String manhanvien)
            throws Exception {
        String sql = "delete from nhanvien"
                + "  Where [MaNV] = ?";
        try (
                Connection con = databasehelper.openConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);) {
            pstmt.setString(1, manhanvien);
           

            return pstmt.executeUpdate() > 0;
        }

    }
     public nhanvien find(int manhanvien)
            throws Exception {
        String sql = "select * from nhanvien"
                + "  Where [MaNV] = ?";
        try (
                Connection con = databasehelper.openConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);) {
            pstmt.setInt(1, manhanvien);
            try (ResultSet rs = pstmt.executeQuery();) {
                if (rs.next()) {
                    nhanvien nv = new nhanvien();
                    nv.setMaNV(rs.getInt("MaNV"));
                    nv.setTenNV(rs.getString("TenNV"));
                    nv.setSDT(rs.getString("Sdt"));
                    nv.setNgaysinh(rs.getDate("NgaySinh"));
                    nv.setPhanQuyenString(rs.getString("phanquyen"));
                    return nv;

                }

            }
            return null;

        }

    }
    
    public nhanvien findcb(String manhanvien)
            throws Exception {
        String sql = "select MaNV from nhanvien"
                + "  Where [PhanQuyen] = ?";
        try (
                Connection con = databasehelper.openConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);) {
            pstmt.setString(1, manhanvien);
            try (ResultSet rs = pstmt.executeQuery();) {
                if (rs.next()) {
                    nhanvien nv = new nhanvien();
                    nv.setMaNV(rs.getInt("MaNV"));
                    
                    return nv;

                }

            }
            return null;

        }

    }
 public List<nhanvien> findAll()
            throws Exception {
        String sql = "select * from nhanvien";
        try (
                Connection con = databasehelper.openConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);) {
          
            try (ResultSet rs = pstmt.executeQuery();) {
               List<nhanvien> list = new ArrayList<nhanvien>();
                while (rs.next()) {
                    nhanvien nv = new nhanvien();
                    nv.setMaNV(rs.getInt("MaNV"));
                    nv.setTenNV(rs.getString("TenNV"));
                    nv.setSDT(rs.getString("Sdt"));
                    nv.setNgaysinh(rs.getDate("NgaySinh"));
                    nv.setPhanQuyenString(rs.getString("phanquyen"));
                    list.add(nv);

                }
             return list;
            }
           

        }

    }
    public List<nhanvien> findtable(int manhanvien)
            throws Exception {
        String sql = "select * from nhanvien"
                + "  Where [MaNV] = ?";
        try (
                Connection con = databasehelper.openConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);) {
            pstmt.setInt(1, manhanvien);
            try (ResultSet rs = pstmt.executeQuery();) {
                List<nhanvien> list = new ArrayList<nhanvien>();
                while (rs.next()) {
                    nhanvien nv = new nhanvien();
                    nv.setMaNV(rs.getInt("MaNV"));
                    nv.setTenNV(rs.getString("TenNV"));
                    nv.setSDT(rs.getString("Sdt"));
                    nv.setNgaysinh(rs.getDate("NgaySinh"));
                    nv.setPhanQuyenString(rs.getString("phanquyen"));
                    list.add(nv);

                }
                return list;
            }

        }

    }
     public List<nhanvien> findtableten(String manhanvien)
            throws Exception {
        String sql = "select * from NhanVien where TenNV like '%"+manhanvien+"%'";
        try (
                Connection con = databasehelper.openConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);
                 
            ){
           
//            pstmt.setString(1, TenKH);  

            try(ResultSet rs = pstmt.executeQuery();) {
                List<nhanvien> list= new ArrayList<>();    
                
                while (rs.next()) {
                    nhanvien nv = new nhanvien();
                    nv.setMaNV(rs.getInt("MaNV"));
                    nv.setTenNV(rs.getString("TenNV"));
                    nv.setSDT(rs.getString("Sdt"));
                    nv.setNgaysinh(rs.getDate("NgaySinh"));
                    nv.setPhanQuyenString(rs.getString("phanquyen"));
                    list.add(nv);
                    
                }
                return list;
            } 
            }     

    }

  




}
