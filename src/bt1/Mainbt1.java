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
public class Mainbt1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<CTHD> cthd = new ArrayList<>();
        HoaDon hd = new HoaDon.HoaDonHeader()
                .addMaHD("01")
                .addNgayBan("20/8/2020")
                .addTenKH("Tran Duc Huynh")
                .hoaDonHeader();
        cthd.add(new CTHD("TiVi", "20 Cai", "5000000", "5%"));
        cthd.add(new CTHD("Tu Lanh","30", "7000000", "10%"));
        hd.xuatHD(cthd);
        
    }
    
}
