package praktek.konversiMataUang;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ROG
 */
public class LogicalProcess {
    public double USDIDR(double usd){
        double idr = usd*14337;
        return idr;
    }
    public double JPYIDR(double jpy){
        double idr = jpy*123;
        return idr;
    }
    public double SGDIDR(double sgd){
        double idr = sgd*10574;
        return idr;
    }
    public double AEDIDR(double aed){
        double idr = aed*3893;
        return idr;
    }
    public double AUDIDR(double aud){
        double idr = aud*10301;
        return idr;
    }
    public String konversi(){
        double usdidr = USDIDR(5);
        double jpyidr = JPYIDR(5);
        double sgdidr = SGDIDR(5);
        double aedidr = AEDIDR(5);
        double audidr = AUDIDR(5);
        
        double tampilkanusdidr = usdidr;
        String tampilusdidr = Double.toString(tampilkanusdidr);
        double tampilkanjpyidr = jpyidr;
        String tampiljpyidr = Double.toString(tampilkanjpyidr);
        double tampilkansgdidr = sgdidr;
        String tampilsgdidr = Double.toString(tampilkansgdidr);
        double tampilkanaedidr = aedidr;
        String tampilaedidr = Double.toString(tampilkanaedidr);
        double tampilkanaudidr = audidr;
        String tampilaudidr = Double.toString(tampilkanaudidr);
        
        String view;
        view = "Hasil Konversi dari 5 Dollar Amerika ke Rupiah = Rp."+tampilusdidr+"</br>"
                + "Hasil Konversi dari 5 Yen ke Rupiah = Rp."+tampiljpyidr+"</br>"
                + "Hasil Konversi dari 5 Dollar Singapore ke Rupiah = Rp."+tampilsgdidr+"</br>"
                + "Hasil Konversi dari 5 Dirham  ke Rupiah = Rp."+tampilaedidr+"</br>"
                + "Hasil Konversi dari 5 Dollar Australia ke Rupiah = Rp."+tampilaudidr;
        return view;
        
    }
     
}
