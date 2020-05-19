/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt1;

import java.util.ArrayList;

/**
 *
 * @author FPT_2-4
 */
public class HoaDon {

    

   
    String MaHD, NgayBan, TenKH;
    ArrayList<CTHD> cthd;
   
    public static class HoaDonHeader{
         String MaHD, NgayBan, TenKH;

        public HoaDonHeader() {
        }
         public HoaDonHeader addMaHD(String MaHD)
         {
             this.MaHD = MaHD;
             return this;
         }
         public HoaDonHeader addNgayBan(String NgayBan)
         {
             this.NgayBan = NgayBan;
             return this;
         }
         public HoaDonHeader addTenKH(String TenKH)
         {
             this.TenKH = TenKH;
             return this;
         }
         public HoaDon hoaDonHeader(){
             return new HoaDon(this);
         }
    }
     public HoaDon(HoaDonHeader hoaDonHeader) {
        this.MaHD = hoaDonHeader.MaHD;
        this.NgayBan = hoaDonHeader.NgayBan;
        this.TenKH = hoaDonHeader.TenKH;
    }
 
    public void xuatHD (ArrayList<CTHD> cthd)
    {
        System.out.println("Thong tin Hoa don:'{'\n"
                + "MaHD: " + MaHD +"\n"
                + "Ngay Ban: " +NgayBan + "\n"
                + "TenKH: " + TenKH + "\n"
                + "'}'\n");
        System.out.println("Chi tiet hoa don: ");
        for (int i = 0; i < cthd.size(); i ++)
            System.out.println( cthd.get(i).display());
    }
    
}
