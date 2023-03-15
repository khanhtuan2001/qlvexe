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
import java.util.List;
import model.KhachHang;

/**
 *
 * @author ASUS
 */
public class KhachHangDao {
     public boolean insert(KhachHang kh)
            throws Exception {
         
        String sql = "INSERT INTO [dbo].[KhachHang]([TenKH],[Sdt],[NgaySinh])" + " values(?,?,?)";
        try (
                Connection con = databasehelper.openConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);
            ){
            
            pstmt.setString(1, kh.getTenKH());
            pstmt.setString(2, kh.getSdt());
            pstmt.setDate(3, kh.getNgaySinh()); 
            
           return pstmt.executeUpdate()>0;
           
            }
        }
    public boolean update(KhachHang kh)
            throws Exception {
         
        String sql = "UPDATE dbo.KhachHang" + " SET TenKH= ?, Sdt=? , NgaySinh= ?" + " where MaKH= ? ";
        try (
                Connection con = databasehelper.openConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);
            ){
            pstmt.setInt(4, kh.getMaKH());
            pstmt.setString(1, kh.getTenKH());
            pstmt.setString(2, kh.getSdt());
            pstmt.setDate(3, kh.getNgaySinh()); 
            
           return pstmt.executeUpdate()>0;
           
            }
        }
     public boolean Delete(int MaKH)
            throws Exception {
         
        String sql = "DELETE from KhachHang" + " where MaKH= ? ";
        try (
                Connection con = databasehelper.openConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);
            ){
            pstmt.setInt(1, MaKH);  
           return pstmt.executeUpdate()>0;         
            }
        }
    public KhachHang findbyId(int MaKH)
            throws Exception {
         
        String sql = "SELECT * from KhachHang where MaKH= ? ";
        try (
                Connection con = databasehelper.openConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);
            ){
            pstmt.setInt(1, MaKH);  
            try(ResultSet rs = pstmt.executeQuery();) {
                if (rs.next()) {
                    KhachHang kh = createKH(rs);
                    return kh;
                }
                
            } 
            
            } 
            return null;
        }
    
     public KhachHang findbySDT(String Sdt)
            throws Exception {
         
        String sql = "SELECT * from KhachHang where Sdt= ? ";
        try (
                Connection con = databasehelper.openConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);
            ){
            pstmt.setString(1, Sdt);  
            try(ResultSet rs = pstmt.executeQuery();) {
                if (rs.next()) {
                    KhachHang kh = createKH(rs);
                    return kh;
                }              
            } 
            
            } 
            return null;
        }
    
  
    public List<KhachHang> findAll() throws Exception {
         
        String sql = "select * from KhachHang";
        try (
                Connection con = databasehelper.openConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);
            ){
            try(ResultSet rs = pstmt.executeQuery();) {
                List<KhachHang> list= new ArrayList<>();    
                
                while (rs.next()) {
                    KhachHang kh = createKH(rs);
                    list.add(kh);
                }
                return list;
            } 
            }     
        }

    private KhachHang createKH(final ResultSet rs) throws SQLException {
        KhachHang kh = new KhachHang();
        kh.setMaKH(rs.getInt("MaKH"));
        kh.setTenKH(rs.getString("TenKH"));
        kh.setSdt(rs.getString("Sdt"));
        kh.setNgaySinh(rs.getDate("NgaySinh"));
        return kh;
    }
    
    
    public List<KhachHang> findTable(int MaKH) throws Exception {
         
        String sql = "select * from KhachHang" + " Where [MaKH]=? ";
        try (
                Connection con = databasehelper.openConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);
                 
            ){
            pstmt.setInt(1, MaKH);
            

            try(ResultSet rs = pstmt.executeQuery();) {
                List<KhachHang> list= new ArrayList<>();    
                
                while (rs.next()) {
                    KhachHang kh = createKH(rs);
                    list.add(kh);
                }
                return list;
            } 
            }     
        }
    public List<KhachHang> findTableName( String TenKH) throws Exception {
         
        String sql = "select * from KhachHang where TenKH like '%"+TenKH+"%'";
        try (
                Connection con = databasehelper.openConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);
                 
            ){
           
//            pstmt.setString(1, TenKH);  

            try(ResultSet rs = pstmt.executeQuery();) {
                List<KhachHang> list= new ArrayList<>();    
                
                while (rs.next()) {
                    KhachHang kh = createKH(rs);
                    list.add(kh);
                }
                return list;
            } 
            }     
        }
   
}
