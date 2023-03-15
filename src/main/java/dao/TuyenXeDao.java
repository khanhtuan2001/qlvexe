/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import model.TuyenXe;
import helper.databasehelper;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author MSI-VN
 */
public class TuyenXeDao {
     public TuyenXe findBuyId(String tenTuyen)
        throws Exception{
        
        String sql = "select * from TuyenXe where TenTuyen =?";
        try(
                Connection con = databasehelper.openConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);             
            ){
            pstmt.setString(1, tenTuyen);
            try(ResultSet rs = pstmt.executeQuery();){
                if(rs.next()){
                    TuyenXe cx = new TuyenXe();
                    cx.setMaTuyen(rs.getInt("matuyen"));
                    cx.setTenTuyen(rs.getString("tentuyen"));
                    return cx;               }
            }
            return null;
        } 
       }
     
     
}
 
