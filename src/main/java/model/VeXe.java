/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Time;
import java.util.Date;

/**
 *
 * @author MSI-VN
 */
public class VeXe {
    private int MaVe, MaChuyen, MaKH, MaNV;
    private String MaSoGhe;
    private Date ThoiGianDat;
    private int TongTien;

    public VeXe() {
    }

    public VeXe(int MaVe, int MaChuyen, int MaKH, int MaNV, String MaSoGhe, Date ThoiGianDat, int TongTien) {
        this.MaVe = MaVe;
        this.MaChuyen = MaChuyen;
        this.MaKH = MaKH;
        this.MaNV = MaNV;
        this.MaSoGhe = MaSoGhe;
        this.ThoiGianDat = ThoiGianDat;
        this.TongTien = TongTien;
    }

    public int getMaVe() {
        return MaVe;
    }

    public void setMaVe(int MaVe) {
        this.MaVe = MaVe;
    }

    public int getMaChuyen() {
        return MaChuyen;
    }

    public void setMaChuyen(int MaChuyen) {
        this.MaChuyen = MaChuyen;
    }

    public int getMaKH() {
        return MaKH;
    }

    public void setMaKH(int MaKH) {
        this.MaKH = MaKH;
    }

    public int getMaNV() {
        return MaNV;
    }

    public void setMaNV(int MaNV) {
        this.MaNV = MaNV;
    }

    public String getMaSoGhe() {
        return MaSoGhe;
    }

    public void setMaSoGhe(String MaSoGhe) {
        this.MaSoGhe = MaSoGhe;
    }

    public Date getThoiGianDat() {
        return ThoiGianDat;
    }

    public void setThoiGianDat(Date ThoiGianDat) {
        this.ThoiGianDat = ThoiGianDat;
    }

    public int getTongTien() {
        return TongTien;
    }

    public void setTongTien(int TongTien) {
        this.TongTien = TongTien;
    }

    public void setMaTuyen(int parseInt) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void setNgayDi(java.sql.Date valueOf) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void setGioDi(Time valueOf) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
