/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import helper.databasehelper;
import helper.messagedialoghelper;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import model.TuyenXe;

/**
 *
 * @author ASUS
 */
public class TuyenXe1Dao {

    public boolean insert(TuyenXe tx)
            throws Exception {

        String sql = "INSERT INTO TuyenXe(TenTuyen)" + " values(?)";
        try (
                 Connection con = databasehelper.openConnection();  PreparedStatement pstmt = con.prepareStatement(sql);) {
            
            pstmt.setString(1, tx.getTenTuyen());
            return pstmt.executeUpdate() > 0;

        }
    }

    public boolean update(TuyenXe tx)
            throws Exception {

        String sql = "UPDATE dbo.TuyenXe" + " SET TenTuyen= ?" + " where MaTuyen= ? ";
        try (
                 Connection con = databasehelper.openConnection();  PreparedStatement pstmt = con.prepareStatement(sql);) {
            pstmt.setInt(2, tx.getMaTuyen());
            pstmt.setString(1, tx.getTenTuyen());
           
            return pstmt.executeUpdate() > 0;

        }
    }

    public boolean Delete(int MaTuyen)
            throws Exception {

        String sql = "DELETE from TuyenXe" + " where MaTuyen= ? ";
        try (
                 Connection con = databasehelper.openConnection();  PreparedStatement pstmt = con.prepareStatement(sql);) {
            pstmt.setInt(1, MaTuyen);
            return pstmt.executeUpdate() > 0;
        }
    }

    public TuyenXe findbyId(int MaTuyen)
            throws Exception {

        String sql = "SELECT * from TuyenXe where MaTuyen= ? ";
        try (
                 Connection con = databasehelper.openConnection();  PreparedStatement pstmt = con.prepareStatement(sql);) {
            pstmt.setInt(1, MaTuyen);
            try ( ResultSet rs = pstmt.executeQuery();) {
                if (rs.next()) {
                    TuyenXe tx = createTx(rs);
                    return tx;
                }
            }

        }
        return null;
    }

    public List<TuyenXe> findAll() throws Exception {

        String sql = "select * from TuyenXe";
        try (
                 Connection con = databasehelper.openConnection();  PreparedStatement pstmt = con.prepareStatement(sql);) {
            try ( ResultSet rs = pstmt.executeQuery();) {
                List<TuyenXe> list = new ArrayList<>();

                while (rs.next()) {
                    TuyenXe tx = createTx(rs);
                    list.add(tx);
                }
                return list;
            }
        }
    }

    private TuyenXe createTx(final ResultSet rs) throws SQLException {
        TuyenXe tx = new TuyenXe();
        tx.setMaTuyen(rs.getInt("MaTuyen"));
        tx.setTenTuyen(rs.getString("TenTuyen"));  
        return tx;
    }

    public List<TuyenXe> findTable(int MaTuyen) throws Exception {

        String sql = "select * from TuyenXe" + " Where [MaTuyen]=?";
        try (
                 Connection con = databasehelper.openConnection();  PreparedStatement pstmt = con.prepareStatement(sql);) {
            pstmt.setInt(1, MaTuyen);
            try ( ResultSet rs = pstmt.executeQuery();) {
                List<TuyenXe> list = new ArrayList<>();

                while (rs.next()) {
                    TuyenXe tx = createTx(rs);
                    list.add(tx);
                }
                return list;
            }
        }
    }
    
    public List<TuyenXe> findTableName2( String tt) throws Exception {
         
        String sql = "select * from TuyenXe where TenTuyen like '%"+tt+"%'";
        try (
                Connection con = databasehelper.openConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);
                 
            ){
           
//            pstmt.setString(1, TenKH);  

            try(ResultSet rs = pstmt.executeQuery();) {
                List<TuyenXe> list= new ArrayList<>();    
                
                while (rs.next()) {
                    TuyenXe tx = createTx(rs);
                    list.add(tx);
                }
                return list;
            } 
            }     
        }
    
    
}

    

    

 
        
            
     

        
