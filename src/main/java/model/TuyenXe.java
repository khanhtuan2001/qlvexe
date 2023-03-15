/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author MSI-VN
 */
public class TuyenXe {
    private int MaTuyen;
    private String TenTuyen;

    public TuyenXe() {
    }

    public TuyenXe(int MaTuyen, String TenTuyen) {
        this.MaTuyen = MaTuyen;
        this.TenTuyen = TenTuyen;
    }

    public int getMaTuyen() {
        return MaTuyen;
    }

    public void setMaTuyen(int MaTuyen) {
        this.MaTuyen = MaTuyen;
    }

    public String getTenTuyen() {
        return TenTuyen;
    }

    public void setTenTuyen(String TenTuyen) {
        this.TenTuyen = TenTuyen;
    }
    
    
}
