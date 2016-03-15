/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author guest-Js778L
 */
public class cetakan {
    
    private long jml;
    private String kue;
      static long jumlah;
    
    cetakan(){
    kue = "brownis";
    jml = 100;
    jumlah = jumlah +jml;
    }
    
    cetakan(long banyak, String roti){
    jml = banyak;
    kue = roti;
    jumlah = jumlah +jml;
    }
    
    public void setJenisKue(String jenis){
        kue = jenis;
    }
    
    public void setBanyakKue(long jum){
    jml = jum;
    jumlah=100;
    jumlah = jumlah +jml;
    }
    
    public String getKue(){
    return kue;
    }
    
    public long getJumlah(){
    return jml;    
    }
    
    
    public void display(){
        System.out.println("jumlah penjualan "+kue+" hari ini : "+jml);
    }
}
