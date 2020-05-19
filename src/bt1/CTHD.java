/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt1;

/**
 *
 * @author FPT_2-4
 */
public class CTHD {
    String  SanPham, SoLuong, DonGia, ChietKhau;
    public CTHD(String SanPham, String SoLuong, String DonGia, String ChietKhau) {
        this.SanPham = SanPham;
        this.SoLuong = SoLuong;
        this.DonGia = DonGia;
        this.ChietKhau = ChietKhau;
    }
    public String display()
    {
        return "San Pham: " + SanPham + "\n"
                +"So Luong:" + SoLuong + "\n"
                +"Don Gia:" + DonGia + "\n"
                + "Chieu Khau:" + ChietKhau + "\n";
    }
    
}
