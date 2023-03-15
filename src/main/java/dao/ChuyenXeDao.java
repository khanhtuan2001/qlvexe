/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import helper.databasehelper;
import model.ChuyenXe;
import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
/**
 *
 * @author MSI-VN
 */
public class ChuyenXeDao {
      public boolean insert(ChuyenXe cx)
        throws Exception{
        
        String sql = "INSERT INTO ChuyenXe(MaTuyen,NgayDi,GioDi,GiaVe,TrangThai)"
                + " values(?,?,?,?,?)";
        try(
                Connection con = databasehelper.openConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);             
            ){
            pstmt.setInt(1, cx.getMaTuyen());
            pstmt.setDate(2, cx.getNgayDi());
            pstmt.setTime(3, cx.getGioDi());
            pstmt.setDouble(4, cx.getGiaVe());
            pstmt.setString(5, cx.getTrangThai());
            return pstmt.executeUpdate()>0;
        }      
      }   
      
      public boolean UpdateChuyeXe(ChuyenXe cx)
        throws Exception{
        
        String sql = "UPDATE dbo.ChuyenXe" +
        " SET  MaTuyen = ?,NgayDi = ?,GioDi = ?, GiaVe = ?, TrangThai = ?"+ 
        " where MaChuyen = ? ";
        try(
                Connection con = databasehelper.openConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);             
            ){
            pstmt.setInt(6, cx.getMaChuyen());
            pstmt.setInt(1, cx.getMaTuyen());
            pstmt.setDate(2, cx.getNgayDi());
            pstmt.setTime(3, cx.getGioDi());
            pstmt.setDouble(4, cx.getGiaVe());
            pstmt.setString(5, cx.getTrangThai());
            return pstmt.executeUpdate()>0;
        }      
      }   
      public boolean CapNhatTrangThai(ChuyenXe cx)
        throws Exception{
        
        String sql = "UPDATE dbo.ChuyenXe" +
        " SET  MaTuyen = ?,NgayDi = ?,GioDi = ?, GiaVe = ?, TrangThai = ?"+ 
        " where MaChuyen = ? ";
        try(
                Connection con = databasehelper.openConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);             
            ){
            pstmt.setInt(6, cx.getMaChuyen());
            pstmt.setInt(1, cx.getMaTuyen());
            pstmt.setDate(2, cx.getNgayDi());
            pstmt.setTime(3, cx.getGioDi());
            pstmt.setDouble(4, cx.getGiaVe());
            pstmt.setString(5, cx.getTrangThai());
            return pstmt.executeUpdate()>0;
        }      
      }   
      
       public boolean DeleteChuyeXe(int maChuyen)
        throws Exception{    
        String sql = "DELETE FROM dbo.ChuyenXe" +      
        " where MaChuyen = ? ";
        try(
                Connection con = databasehelper.openConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);             
            ){
            pstmt.setInt(1, maChuyen);          
            return pstmt.executeUpdate()>0;
        }      
      }   
      
       public ChuyenXe finBuyId(int maChuyen)
        throws Exception{
        
        String sql = "select * from chuyenxe where maChuyen =?";
        try(
                Connection con = databasehelper.openConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);             
            ){
            pstmt.setInt(1, maChuyen);
            try(ResultSet rs = pstmt.executeQuery();){
                if(rs.next()){
                    ChuyenXe cx = createChuyenXe(rs);
                    return cx;
                }
            }
            return null;
        }  
        
      } 
        public ChuyenXe findBymaTuyen(int maTuyen)
        throws Exception{
        
        String sql = "select * from chuyenxe where MaTuyen =?";
        try(
                Connection con = databasehelper.openConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);             
            ){
            pstmt.setInt(1, maTuyen);
            try(ResultSet rs = pstmt.executeQuery();){
                if(rs.next()){
                    ChuyenXe cx = createChuyenXe(rs);
                    return cx;
                }
            }
            return null;
        }  
        
      } 
       
         
       public ChuyenXe findBuyId(String tenTuyen)
        throws Exception{
        
        String sql = "select MaTuyen from TuyenXe where tenTuyen =?";
        try(
                Connection con = databasehelper.openConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);             
            ){
            pstmt.setString(1, tenTuyen);
            try(ResultSet rs = pstmt.executeQuery();){
                if(rs.next()){
                    ChuyenXe cx = createChuyenXe(rs);
                    return cx;
                }
            }
            return null;
        } 
       }
    private ChuyenXe createChuyenXe(final ResultSet rs) throws SQLException {
        ChuyenXe cx = new ChuyenXe();
        cx.setMaChuyen(rs.getInt("machuyen"));
        cx.setMaTuyen(rs.getInt("matuyen"));
        cx.setNgayDi(rs.getDate("ngaydi"));
        cx.setGioDi(rs.getTime("giodi"));
        cx.setGiaVe(rs.getDouble("giave"));
        cx.setTrangThai(rs.getString("trangthai"));
        return cx;
    }
       
       public List<ChuyenXe> findAll()throws Exception{        
        String sql = "select * from chuyenxe";
        try(
                Connection con = databasehelper.openConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);             
            ){     
            try(ResultSet rs = pstmt.executeQuery();){
                List<ChuyenXe> list = new ArrayList<>();
                while (rs.next()){
                    ChuyenXe cx = createChuyenXe(rs);
                    list.add(cx);
                }          
            return  list;
            }         
        }     
    }
       public List<ChuyenXe> findBuyName(int maTuyen){
        ResultSet rs = null;
        Statement sttm = null;
        List<ChuyenXe> lcx = new ArrayList<>();
        try{
            String sql = "select * from ChuyenXe where MaTuyen ="+maTuyen;
             Connection con = databasehelper.openConnection();           
             PreparedStatement pstmt = con.prepareStatement(sql); 
             rs = pstmt.executeQuery();
             while (rs.next()) {
                ChuyenXe cx = new ChuyenXe();
                cx.setMaChuyen(rs.getInt(1));
                cx.setMaTuyen(rs.getInt(2));
                cx.setNgayDi(rs.getDate(3));
                cx.setGioDi(rs.getTime(4));
                cx.setGiaVe(rs.getDouble(5));
                cx.setTrangThai(rs.getString(6));
                lcx.add(cx);
            }                      
        }catch (Exception e)
        {
            System.out.println("Loi" + e.toString());
        } finally{
            try {
                rs.close();
            } catch (Exception e){
                
            }
        }
        return lcx;
    }
       
    public List<ChuyenXe> findChuyenXeHetVe()throws Exception{        
    String sql = "select * from ChuyenXe inner join VeXe on ChuyenXe.MaChuyen = VeXe.MaChuyen";
    try(
            Connection con = databasehelper.openConnection();
            PreparedStatement pstmt = con.prepareStatement(sql);             
        ){     
        try(ResultSet rs = pstmt.executeQuery();){
            List<ChuyenXe> list = new ArrayList<>();
            while (rs.next()){
                ChuyenXe cx = createChuyenXe(rs);
                list.add(cx);
            }          
        return  list;
        }            
        }               
    }
    
    public int DemSoGhe()
        throws Exception{      
        try(
                Connection con = databasehelper.openConnection();
                java.sql.Statement s = con.createStatement( ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
                ResultSet r = s.executeQuery("select * from ChuyenXe inner join VeXe on ChuyenXe.MaChuyen = VeXe.MaChuyen =");            
            ){
                r.last(); 
                int count =r.getRow();
                return count;
                    
        } 
       }
        
}

