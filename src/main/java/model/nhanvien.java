/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Date;
import java.util.HashMap;

/**
 *
 * @author ASUS
 */
public class nhanvien {
   private String TenNV,SDT,PhanQuyenString;
   private  Date Ngaysinh;
   private int MaNV;

    public nhanvien() {
    }

    public nhanvien(int MaNV, String TenNV, String SDT, String PhanQuyenString, Date Ngaysinh) {
        this.MaNV = MaNV;
        this.TenNV = TenNV;
        this.SDT = SDT;
        this.PhanQuyenString = PhanQuyenString;
        this.Ngaysinh = Ngaysinh;
    }

    public int getMaNV() {
        return MaNV;
    }

    public void setMaNV(int MaNV) {
        this.MaNV = MaNV;
    }

    public String getTenNV() {
        return TenNV;
    }

    public void setTenNV(String TenNV) {
        this.TenNV = TenNV;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public String getPhanQuyenString() {
        return PhanQuyenString;
    }

    public void setPhanQuyenString(String PhanQuyenString) {
        this.PhanQuyenString = PhanQuyenString;
    }

    public Date getNgaysinh() {
        return Ngaysinh;
    }

    public void setNgaysinh(Date Ngaysinh) {
        this.Ngaysinh = Ngaysinh;
    }
   

}
