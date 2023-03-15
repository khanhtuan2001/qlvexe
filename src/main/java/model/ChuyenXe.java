/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Date;
import java.sql.Time;

/**
 *
 * @author MSI-VN
 */
public class ChuyenXe {
     private int MaChuyen,MaTuyen;
     private  Time GioDi;
     private Date NgayDi;
     private Double GiaVe;
     private String TrangThai;

    public ChuyenXe() {
    }

    public ChuyenXe(int MaChuyen, int MaTuyen, Time GioDi, Date NgayDi, Double GiaVe, String TrangThai) {
        this.MaChuyen = MaChuyen;
        this.MaTuyen = MaTuyen;
        this.GioDi = GioDi;
        this.NgayDi = NgayDi;
        this.GiaVe = GiaVe;
        this.TrangThai = TrangThai;
    }

    public int getMaChuyen() {
        return MaChuyen;
    }

    public void setMaChuyen(int MaChuyen) {
        this.MaChuyen = MaChuyen;
    }

    public int getMaTuyen() {
        return MaTuyen;
    }

    public void setMaTuyen(int MaTuyen) {
        this.MaTuyen = MaTuyen;
    }

    public Time getGioDi() {
        return GioDi;
    }

    public void setGioDi(Time GioDi) {
        this.GioDi = GioDi;
    }

    public Date getNgayDi() {
        return NgayDi;
    }

    public void setNgayDi(Date NgayDi) {
        this.NgayDi = NgayDi;
    }

    public Double getGiaVe() {
        return GiaVe;
    }

    public void setGiaVe(Double GiaVe) {
        this.GiaVe = GiaVe;
    }

    public String getTrangThai() {
        return TrangThai;
    }

    public void setTrangThai(String TrangThai) {
        this.TrangThai = TrangThai;
    }

    
}
