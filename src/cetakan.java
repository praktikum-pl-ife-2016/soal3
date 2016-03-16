/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author AcerAsp4750
 */
public class cetakan {
    private String jenis;
    private int jumlah;
    private static int total;
    
    public cetakan(){
        this.jenis="brownies";
        this.jumlah=100;
        total += jumlah;
    }
    public cetakan(String j,int jumlah){
        this.jenis=j;
        this.jumlah=jumlah;
        total += jumlah;
    }
    public void setJenis(String j){
        jenis=j;
    }
    public void setJumlah(int j){
        jumlah=j;
    }
    public String getJenis() {
        return jenis;
    }
    public int getJumlah() {
        return jumlah;
    }

     public void penjualan(cetakan C) {
        System.out.println("Jumlah penjualan  " + jenis +" hari ini : "+jumlah);
        System.out.println("Jumlah penjualan  " + C.jenis +" hari ini : "+C.jumlah);
        System.out.println("Jumlah total penjualan hari ini : "+total);

     }
}
