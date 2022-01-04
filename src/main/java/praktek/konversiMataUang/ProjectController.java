/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktek.konversiMataUang;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author ROG
 */
@Controller
@ResponseBody
public class ProjectController {
    LogicalProcess money = new LogicalProcess();
    
    @RequestMapping("/dolar_rupiah")
    public String DolarRupiah(){
        double idr = money.USDIDR(5);
        String tampil ="Konversi 5 USD ke IDR = "+idr+" Rupiah";
        return tampil;
    }
    @RequestMapping("/yen_rupiah")
    public String YenRupiah(){
        double idr = money.JPYIDR(5);
        String tampil ="Konversi 5 JPY ke IDR = "+idr+" Rupiah";
        return tampil;
    }
    @RequestMapping("/dolars_rupiah")
    public String DolarSRupiah(){
        double idr = money.SGDIDR(5);
        String tampil ="Konversi 5 SGD ke IDR = "+idr+" Rupiah";
        return tampil;
    }
    @RequestMapping("/dirham_rupiah")
    public String DirhamRupiah(){
        double idr = money.AEDIDR(5);
        String tampil ="Konversi 5 AED ke IDR = "+idr+" Rupiah";
        return tampil;
    }
    @RequestMapping("/dolarAu_rupiah")
    public String DolarAuRupiah(){
        double idr = money.AUDIDR(5);
        String tampil ="Konversi 5 AUD ke IDR = "+idr+" Rupiah";
        return tampil;
    }
    @RequestMapping("/convert")
    public String konversiUang(){
        String tampilkan;
        tampilkan = money.konversi();
        return tampilkan;
    }
    
}
