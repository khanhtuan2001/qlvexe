/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import helper.databasehelper;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.VeXe;
import model.nhanvien;

/**
 *
 * @author MSI-VN
 */
public class VeXeDao {
     public boolean Insert(VeXe vx)
        throws Exception{
        
        String sql = "INSERT INTO VeXe(MaChuyen,MaKH,MaNV,MaSoGhe,ThoiGianDat,TongTien)"
                + " values(?,?,?,?,?,?)";
        try(
                Connection con = databasehelper.openConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);             
            ){
            pstmt.setInt(1, vx.getMaChuyen());
            pstmt.setInt(2, vx.getMaKH());
            pstmt.setInt(3, vx.getMaNV());
            pstmt.setString(4, vx.getMaSoGhe());
            pstmt.setDate(5, (Date) vx.getThoiGianDat());
            pstmt.setDouble(6, vx.getTongTien());
            return pstmt.executeUpdate()>0;
        }      
      }
     
      public int DemSoGhe(int maChuyen)
        throws Exception{      
        try(
                Connection con = databasehelper.openConnection();
                Statement s = con.createStatement( ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
                ResultSet r = s.executeQuery("Select * from VeXe Where MaChuyen ="+maChuyen);            
            ){
                r.last(); 
                int count =r.getRow();
                return count;
                    
        } 
       }
       public List<VeXe> findAll()
            throws Exception {
        String sql = "select * from VeXe";
        try (
                Connection con = databasehelper.openConnection() ;
                PreparedStatement pstmt = con.prepareStatement(sql);) {

              try (ResultSet rs = pstmt.executeQuery();) {
                    List<VeXe> list = new ArrayList<VeXe>();
                    while (rs.next()) {
                          VeXe nv = new VeXe();
                          nv.setMaVe(rs.getInt("MaVe"));
                          nv.setMaChuyen(rs.getInt("MaChuyen"));
                          nv.setMaKH(rs.getInt("MaKH"));
                          nv.setMaNV(rs.getInt("MaNV"));
                          nv.setMaSoGhe(rs.getString("MaSoGhe"));
                          nv.setThoiGianDat(rs.getDate("ThoiGianDat"));
                          nv.setTongTien(rs.getInt("TongTien"));
                          list.add(nv);

                    }
                    return list;
            }
           

        }

    }
}
